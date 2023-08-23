/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layerd.service.custom.impl;

import pos.layerd.dao.DaoFactory;
import pos.layerd.dao.custom.ItemDao;
import pos.layerd.dao.custom.OrderDao;
import pos.layerd.dao.custom.OrderDetailsDao;
import pos.layerd.db.DBConnection;
import pos.layerd.dto.OrderDto;
import pos.layerd.service.custom.OrderServise;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import pos.layerd.dto.OrderDetailsDto;
import pos.layerd.entity.OrderEntity;
import pos.layerd.dto.OrderDto;
import pos.layerd.entity.ItemEntity;
import pos.layerd.entity.orderDetailsEntity;

/**
 *
 * @author Hiran
 */
public class OrderServiceImpl implements OrderServise {

    private OrderDao OrderDao = (OrderDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.ORDER);
    private OrderDetailsDao OrderDetailsDao = (OrderDetailsDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.ORDER_DETAILS);
    private ItemDao ItemDao = (ItemDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.ITEM);

    @Override
    public String placeOrder(OrderDto orderDto) throws Exception {

        Connection connection = DBConnection.getInstance().getConnection();
        connection.setAutoCommit(false);

        try {
             SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

          if(OrderDao.add(new OrderEntity(orderDto.getId(), sdf.format(new Date()), orderDto.getCustId()))) {

                boolean isOrderSaved = true;

                for (OrderDetailsDto orderDetailsDto : orderDto.getDetailDtos()) {

                    if (!OrderDetailsDao.add(new orderDetailsEntity(orderDto.getId(),
                            orderDetailsDto.getItemCode(),
                            orderDetailsDto.getQty(),
                            orderDetailsDto.getDiscount()))) {

                        isOrderSaved = false;

                    }

                }

                if (isOrderSaved) {
                    boolean isItemUpdate = true;
                    for (OrderDetailsDto orderDetailsDto : orderDto.getDetailDtos()) {
                        ItemEntity itemEntity = ItemDao.get(orderDetailsDto.getItemCode());
                        itemEntity.setQty(itemEntity.getQty() - orderDetailsDto.getQty());

                        if (!ItemDao.update(itemEntity)) {

                            isItemUpdate = false;

                        }
                    }

                    if (isItemUpdate) {

                        return "Success";
                    } else {

                        connection.rollback();
                        return "Item Update Error";
                    }

                } else {

                    connection.rollback();
                    return "Order Details save Error";

                }

            } else {

                connection.rollback();
                return "Order save Eroor";

            }

        } catch (Exception e) {
            e.printStackTrace();
            connection.rollback();
            throw e;

        } finally {
            connection.setAutoCommit(true);
        }
    }
}

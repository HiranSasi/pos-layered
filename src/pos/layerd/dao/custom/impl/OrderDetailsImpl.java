/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layerd.dao.custom.impl;

import java.util.ArrayList;
import pos.layerd.dao.custom.OrderDetailsDao;
import pos.layerd.dao.CrudUtil;
import pos.layerd.entity.orderDetailsEntity;

/**
 *
 * @author Hiran
 */
public class OrderDetailsImpl  implements OrderDetailsDao{

    @Override
    public boolean add(orderDetailsEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO orderdetail VALUES (?,?,?,?)", t.getOrderId(), t.getItemId(), t.getQty(), t.getDiscount());
    }

    @Override
    public boolean update(orderDetailsEntity t) throws Exception {
      return false;
    }

    @Override
    public boolean delet(Object id) throws Exception {
    
    return false;
    }

    @Override
    public orderDetailsEntity get(Object id) throws Exception {
       return null;
    }

    @Override
    public ArrayList<orderDetailsEntity> getAll() throws Exception {
       return null;
    }

   
}

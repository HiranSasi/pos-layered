/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layerd.dao.custom.impl;

import java.util.ArrayList;
import pos.layerd.dao.CrudUtil;
import pos.layerd.dao.custom.OrderDao;
import pos.layerd.entity.OrderEntity;

/**
 *
 * @author Hiran
 */
public class OrderDaoIpml implements OrderDao{

    @Override
    public boolean add(OrderEntity t) throws Exception {
       return CrudUtil.executeUpdate("INSERT INTO orders VALUES(?,?,?)", t.getOrderId(),t.getDate(), t.getCustId());
    }

    @Override
    public boolean update(OrderEntity t) throws Exception {
        return false;
    }

    @Override
    public boolean delet(String id) throws Exception {
   return false;
    }

    @Override
    public OrderEntity get(String id) throws Exception {
       return null;
    }

    @Override
    public ArrayList<OrderEntity> getAll() throws Exception {
       return null;
        
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layerd.controller;

import pos.layerd.dto.OrderDto;
import pos.layerd.service.custom.OrderServise;
import pos.layerd.service.ServiceFactory;
/**
 *
 * @author Hiran
 */
public class OrderController {
private OrderServise orderServise = (OrderServise) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ORDER);
    public String placeOrder(OrderDto orderDto) throws Exception{
   
    return orderServise.placeOrder(orderDto);
    }
    
}

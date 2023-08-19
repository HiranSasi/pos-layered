/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layerd.controller;

import pos.layerd.dto.CustomerDto;

import pos.layerd.service.custom.CustomerService;
import pos.layerd.service.ServiceFactory;

/**
 *
 * @author Hiran
 */
public class CustomerController {
    CustomerService  customerService = (CustomerService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CUSTOMER);
    public String addCustomer(CustomerDto customerDto) throws Exception {
       return customerService.addCustomer(customerDto);
    }
    
}

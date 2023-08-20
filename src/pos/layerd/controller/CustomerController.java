/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layerd.controller;

import java.util.ArrayList;
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

    public ArrayList<CustomerDto> getAllCustomers() throws Exception {
    
        return customerService.getAllCustomer();
    
    }

    public CustomerDto searchCustomer(String custId) throws Exception {
        return customerService.searchCustomer(custId);
    }

    public String updateCustomer(CustomerDto customerDto) throws Exception {
   
    return customerService.updateCustomer(customerDto);
    
    }

    public String delectCustomer(String custId) throws Exception {
  return customerService.deleteCustomer(custId);
    
    }
    
}

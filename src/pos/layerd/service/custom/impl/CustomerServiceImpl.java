/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layerd.service.custom.impl;

import java.util.ArrayList;
import pos.layerd.dao.custom.CustomerDao;
import pos.layerd.dto.CustomerDto;
import pos.layerd.dao.*;
import pos.layerd.entity.CustomerEntity;
import pos.layerd.service.custom.CustomerService;
import pos.layerd.dao.DaoFactory;

/**
 *
 * @author Hiran
 */
public class CustomerServiceImpl implements CustomerService {

    CustomerDao customerDao = (CustomerDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.CuSTOMER);

    @Override
    public String addCustomer(CustomerDto dto) throws Exception {
        CustomerEntity ce = new CustomerEntity(dto.getCustId(),
                dto.getTitle(),
                dto.getNames(),
                dto.getDob(),
                dto.getSalary(),
                dto.getAddress(),
                dto.getCity(),
                dto.getProvince(),
                dto.getZip());
        
        if (customerDao.add(ce)) {
            
            return "Successfully Added";
            
        } else {
            return "Fail";
        }
        
    }

    @Override
    public String updateCustomer(CustomerDto dto) throws Exception {
         CustomerEntity entity = new CustomerEntity(dto.getCustId(),
                dto.getTitle(), dto.getNames(), dto.getDob(),
                dto.getSalary(), dto.getAddress(), dto.getCity(),
                dto.getProvince(), dto.getZip());
        
        
        
        return customerDao.update(entity)? "Success" : "Fail";
    }

    @Override
    public String deleteCustomer(String id) throws Exception {
    return customerDao.delet(id)? "Success" : "Fail";
    
    }

    @Override
    public ArrayList<CustomerDto> getAllCustomer() throws Exception {
     ArrayList<CustomerEntity> customerEntitys = customerDao.getAll();
        ArrayList<CustomerDto> customerDtos = new ArrayList<>();
        
        for (CustomerEntity entity : customerEntitys) {
            customerDtos.add(new CustomerDto(entity.getCustId(), 
                    entity.getTitle(), entity.getNames(),
                    entity.getDob(),
                    entity.getSalary(), entity.getAddress(), 
                    entity.getCity(), entity.getProvince(), entity.getZip()));
        }
        
        return customerDtos;
    
    }

    @Override
    public CustomerDto searchCustomer(String custId) throws Exception {
  CustomerEntity entity = customerDao.get(custId);
        
  if(customerDao.get(custId) != null){
        CustomerDto dto = new CustomerDto(entity.getCustId(), 
                    entity.getTitle(), entity.getNames(),
                    entity.getDob(),
                    entity.getSalary(), entity.getAddress(), 
                    entity.getCity(), entity.getProvince(), entity.getZip());
        
        return dto;
  }
  return null;
    
    }
    
}

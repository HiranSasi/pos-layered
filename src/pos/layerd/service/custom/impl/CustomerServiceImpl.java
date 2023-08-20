/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layerd.service.custom.impl;

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

    CustomerDao CustomerDao = (CustomerDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.CuSTOMER);

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
        
        if (CustomerDao.addcustomer(ce)) {
            
            return "Successfully Added";
            
        } else {
            return "Fail";
        }
        
    }
    
}

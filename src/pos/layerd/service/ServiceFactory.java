/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layerd.service;

/**
 *
 * @author Hiran
 */
public class ServiceFactory {
    private static ServiceFactory serviceFactory;
    private ServiceFactory(){}
    
    public static ServiceFactory getInstance(){
    
        if(serviceFactory == null){
        
        serviceFactory = new ServiceFactory();
        
        }
    
    return serviceFactory;
    
    
    }
}

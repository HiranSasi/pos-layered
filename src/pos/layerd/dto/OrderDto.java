/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layerd.dto;

/**
 *
 * @author Hiran
 */

import java.util.ArrayList;
public class OrderDto {
     
    private String id;
    private String custId;
    
    private  ArrayList<OrderDetailsDto> detailDtos;

    public OrderDto() {
    }

    public OrderDto(String id, String custId, ArrayList<OrderDetailsDto> detailDtos) {
        this.id = id;
        this.custId = custId;
        this.detailDtos = detailDtos;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the custId
     */
    public String getCustId() {
        return custId;
    }

    /**
     * @param custId the custId to set
     */
    public void setCustId(String custId) {
        this.custId = custId;
    }

    /**
     * @return the detailDtos
     */
    public ArrayList<OrderDetailsDto> getDetailDtos() {
        return detailDtos;
    }

    /**
     * @param detailDtos the detailDtos to set
     */
    public void setDetailDtos(ArrayList<OrderDetailsDto> detailDtos) {
        this.detailDtos = detailDtos;
    }

    @Override
    public String toString() {
        return "OrderDto{" + "id=" + id + ", custId=" + custId + ", detailDtos=" + detailDtos + '}';
    }
    
    
    
    
    
}

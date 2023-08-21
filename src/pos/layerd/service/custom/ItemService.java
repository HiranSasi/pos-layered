/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pos.layerd.service.custom;

import pos.layerd.service.SuperService;
import java.util.ArrayList;
import pos.layerd.dto.ItemDto;
/**
 *
 * @author Hiran
 */
public interface ItemService extends  SuperService{
String addItem(ItemDto dto) throws Exception;
    String updateItem(ItemDto dto) throws Exception;
    String deleteItem(String id) throws Exception;
    ItemDto getItem(String id) throws Exception;
    ArrayList<ItemDto> getAllItem() throws Exception;
    
}

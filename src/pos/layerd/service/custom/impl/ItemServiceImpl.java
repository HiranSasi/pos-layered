/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layerd.service.custom.impl;

import java.util.ArrayList;
import pos.layerd.dto.ItemDto;
import pos.layerd.service.custom.ItemService;
import pos.layerd.dao.DaoFactory;
import pos.layerd.entity.ItemEntity;
import pos.layerd.dao.custom.ItemDao;
import java.util.ArrayList;
/**
 *
 * @author Hiran
 */
public class ItemServiceImpl implements ItemService {

    ItemDao itemDao = (ItemDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.ITEM);
    @Override
    public String addItem(ItemDto dto) throws Exception {
       Boolean resp = itemDao.add(new ItemEntity(dto.getId(), dto.getDescription(), dto.getPackSize(), dto.getUnitPrice(), dto.getQty()));
        return resp ? "Success" : "Fail";
    }

    @Override
    public String updateItem(ItemDto dto) throws Exception {
       Boolean resp = itemDao.update(new ItemEntity(dto.getId(), dto.getDescription(), dto.getPackSize(), dto.getUnitPrice(), dto.getQty()));
        return resp ? "Success" : "Fail";
    }

    @Override
    public String deleteItem(String id) throws Exception {
        Boolean resp = itemDao.delet(id);
        return resp ? "Success" : "Fail";
    }

    @Override
    public ItemDto getItem(String id) throws Exception {
      ItemEntity entity = itemDao.get(id);
      if(itemDao.get(id) != null){
      return new ItemDto(entity.getId(),
                entity.getDescription(), entity.getPackSize(),
                entity.getUnitPrice(), entity.getQty());
      }
      return null;
    }

    @Override
    public ArrayList<ItemDto> getAllItem() throws Exception {
        
        ArrayList<ItemDto> dtos = new ArrayList<>();
     ArrayList<ItemEntity> itemEntitys = itemDao.getAll();
     
        for (ItemEntity itemEntity : itemEntitys) {
            
           ItemDto itemDto = new ItemDto(itemEntity.getId(), 
                   itemEntity.getDescription(),
                   itemEntity.getPackSize(),
                itemEntity.getUnitPrice(),
                   itemEntity.getQty());
           dtos.add(itemDto);
        }
        
        return dtos;
    }
}

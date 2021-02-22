package com.miaoshaproject.service;

import com.miaoshaproject.error.BuinessException;
import com.miaoshaproject.service.model.ItemModel;

import java.util.List;

public interface ItemService {
    //创建商品
    ItemModel createItem(ItemModel itemModel) throws BuinessException;

    //商品列表浏览
    List<ItemModel> listItem();

    //商品详情浏览
    ItemModel getItemById(Integer id);

    //库存扣减
    boolean decreaseStock(Integer itemId, Integer amount) throws BuinessException;

    //商品销量增加
    void increaseSales(Integer itemId, Integer amount) throws BuinessException;

}

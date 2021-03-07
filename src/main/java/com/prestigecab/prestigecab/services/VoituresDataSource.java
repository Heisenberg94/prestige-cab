package com.prestigecab.prestigecab.services;

import com.google.common.collect.Lists;
import com.prestigecab.prestigecab.Model.Categories;
import com.prestigecab.prestigecab.Model.Items;
import com.prestigecab.prestigecab.dao.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class VoituresDataSource {
ItemRepository itemRepository;


@Autowired
public VoituresDataSource(ItemRepository itemRepository){

    this.itemRepository=itemRepository;
}

public List <Items> getItems(){
    return Lists.newArrayList(itemRepository.findAll());
}

public Items getItem(Long id){
    return itemRepository.findById(id).orElse(new Items());
}
public void deleteItem(long id){itemRepository.deleteById(id);}

}

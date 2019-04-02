package com.fonix.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fonix.demo.Entity.Items;
import com.fonix.demo.model.Frequencie;
import com.fonix.demo.repository.ItemRepository;
import com.fonix.demo.service.ItemsService;

@Service
public class ItemsServiceImpl implements ItemsService{

	private static final Logger logger = LoggerFactory.getLogger(ItemsServiceImpl.class);
	
	@Autowired
	ItemRepository itemRepositorio;

	@Override
	public List<Frequencie> getFindAll() {
		List<Frequencie> listFrequencies =new ArrayList<>();
		List<Items> listItems = new ArrayList<>();
		
		listItems = (List<Items>) itemRepositorio.findAll();
		
		for (Items item: listItems) {
			listFrequencies.add(new Frequencie(item.getId().toString(), item.getDescrption()));
		}
		
		return listFrequencies;
	}
	
	 
}

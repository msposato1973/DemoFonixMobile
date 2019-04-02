package com.fonix.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.fonix.demo.Entity.Items;

 
public interface  ItemRepository extends CrudRepository<Items, Long> {

 

}

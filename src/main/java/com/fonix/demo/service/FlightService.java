package com.fonix.demo.service;

import java.util.List;

import com.fonix.demo.model.AllowsUser;
import com.fonix.demo.model.FrequenciesItem;

public interface FlightService {
	
  List<FrequenciesItem> getListflght(AllowsUser allowsUser);
  
 
 
}
 
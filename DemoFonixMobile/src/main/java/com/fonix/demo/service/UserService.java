package com.fonix.demo.service;

import java.util.List;

import com.fonix.demo.model.FrequenciesItem;

public interface UserService {

	void save (List<FrequenciesItem> list,String emailAddress);
	
	List<FrequenciesItem> getListFlightByEmail();
}

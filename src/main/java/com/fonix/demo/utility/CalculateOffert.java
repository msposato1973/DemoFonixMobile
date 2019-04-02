package com.fonix.demo.utility;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fonix.demo.model.FrequenciesItem;

public class CalculateOffert {
	
	private static final Logger logger = LoggerFactory.getLogger(CalculateOffert.class);
	
	public CalculateOffert() {}

	private  Generate gen = new Generate();
	
	public List<FrequenciesItem>  allOffert(String origin, String destination) {
		List<FrequenciesItem> list = new ArrayList<>();
		
		for(int i=0;i<15; i++) {
			list.add(gen.getFlightNumber(origin, destination));
		}
		 
		return list;
		 
	} 
	 
	 
	public List<FrequenciesItem> maximumTowOfferDaily(int day ,String origin, String destination){
		List<FrequenciesItem> list = new ArrayList<>();
		list.add(gen.getFlightNumber(origin, destination));
		list.add(gen.getFlightNumber(origin, destination));
		return list;
	}
	
	public List<FrequenciesItem> maximumOneOfferDaily(String origin, String destination){
		List<FrequenciesItem> list = new ArrayList<>();
		list.add(gen.getFlightNumber(origin, destination));
		return list;
	}
	
	public List<FrequenciesItem> maximumTowOfferDaily(String origin, String destination){
		List<FrequenciesItem> list = new ArrayList<>();
		list.add(gen.getFlightNumber(origin, destination));
		list.add(gen.getFlightNumber(origin, destination));
		return list;
	}
	
	public List<FrequenciesItem> maximumOneOfferWeekly(String origin, String destination){
		List<FrequenciesItem> list = new ArrayList<>();
		list.add(gen.getOneWeekOffert(origin, destination));
		
		return list;
	}
	
	public List<FrequenciesItem> maximumOneOfferMont(String origin, String destination){
		List<FrequenciesItem> list = new ArrayList<>();
		list.add(gen.getOneMontOffert(origin, destination));
		
		return list;
	}
	
	 

 
}
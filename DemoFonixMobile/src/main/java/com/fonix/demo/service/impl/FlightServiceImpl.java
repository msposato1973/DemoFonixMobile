package com.fonix.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.fonix.demo.model.AllowsUser;
import com.fonix.demo.model.FrequenciesItem;
import com.fonix.demo.service.FlightService;
import com.fonix.demo.utility.CalculateOffert;

@Service
public class FlightServiceImpl implements FlightService{

	private static final Logger logger = LoggerFactory.getLogger(FlightServiceImpl.class);
	
	CalculateOffert calculateOffert = new CalculateOffert();
	
	@Override
	public List<FrequenciesItem> getListflght(AllowsUser allowsUser) {
		
		List<FrequenciesItem> listFlight=new ArrayList();
		 
		int keyOffer = Integer.parseInt(allowsUser.getFrequencies()); 
		int numOffer = 0;
		
		 
		switch (keyOffer) {
		case 1:
			listFlight= calculateOffert.maximumOneOfferDaily(allowsUser.getFlightDestination(), allowsUser.getfOrigine());
		break;
		case 2:
			// Maximum 2 offer daily
			listFlight= calculateOffert.maximumTowOfferDaily(allowsUser.getFlightDestination(), allowsUser.getfOrigine());
			break;
		case 3:
			//Maximum 1 offer weekly; 
			listFlight = calculateOffert.maximumOneOfferWeekly(allowsUser.getFlightDestination(), allowsUser.getfOrigine());
			break;
		case 4:
			// Maximum 1 offer monthly; 
			listFlight = calculateOffert.maximumOneOfferMont(allowsUser.getFlightDestination(), allowsUser.getfOrigine());
			break;
		case 5:
			// Uncapped (Always send the best available deal when available); 
			listFlight= calculateOffert.allOffert(allowsUser.getFlightDestination(), allowsUser.getfOrigine());
			break;

		default:
			break;
		}
		
		
		return listFlight;
	}

	
	
	 
}

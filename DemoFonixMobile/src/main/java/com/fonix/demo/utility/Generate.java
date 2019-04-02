package com.fonix.demo.utility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fonix.demo.model.FrequenciesItem;

 
public class Generate {
	private static final Logger logger = LoggerFactory.getLogger(Generate.class);

	private static final String[] CHAR_LIST = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N",
			"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
	private static final String[] CHAR_LIST_INT = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
	private static final String[] RANDOM_NUM_DAY = { "1", "2", "3", "4", "5", "6", "7"};
	private static final int RANDOM_NUM_LENGTH = 3;
	private static final String DATEFORMAT =  "dd-MM-YYYY HH:MM:ss";
	private static final SimpleDateFormat formatter = new SimpleDateFormat(DATEFORMAT);  
	
	private static final Random random = new Random();
	private static final String CHARS = "abcdefghijkmnopqrstuvwxyzABCDEFGHJKLMNOPQRSTUVWXYZ234567890!@#$";
	 

	public  FrequenciesItem  getFlightNumber(String origin, String destination) {
		 
		 
		FrequenciesItem fItem = new FrequenciesItem();
		fItem.setOrigin(origin);
		fItem.setDestination(destination);
		fItem.setFlightDate(getFlightDate());
		fItem.setPrice(generatePrice());
		fItem.setFlightNumber(getFlightNumber());
		 
		 
		return fItem;
	}
	
	public FrequenciesItem getAllBestOffert(String origin, String destination) {
		Random random = new Random();
		int day = random.nextInt(RANDOM_NUM_DAY.length);
		
		FrequenciesItem fItem = new FrequenciesItem();
		fItem.setOrigin(origin);
		fItem.setDestination(destination);
		fItem.setFlightDate(getFlightDate(day));
		fItem.setPrice(generatePrice());
		fItem.setFlightNumber(getFlightNumber());
		
		return fItem;
		 
	}
	
	public FrequenciesItem getOneWeekOffert(String origin, String destination) {
		Random random = new Random();
		int day = random.nextInt(RANDOM_NUM_DAY.length);
		
		FrequenciesItem fItem = new FrequenciesItem();
		fItem.setOrigin(origin);
		fItem.setDestination(destination);
		fItem.setFlightDate(getFlightDate(day));
		fItem.setPrice(generatePrice());
		fItem.setFlightNumber(getFlightNumber());
		
		return fItem;
		 
	}
	
	public FrequenciesItem getOneMontOffert(String origin, String destination) {
		Random random = new Random();
		int day = random.nextInt(30);
		
		FrequenciesItem fItem = new FrequenciesItem();
		fItem.setOrigin(origin);
		fItem.setDestination(destination);
		fItem.setFlightDate(getFlightDate(day));
		fItem.setPrice(generatePrice());
		fItem.setFlightNumber(getFlightNumber());
		
		return fItem;
		 
	}
	/**
	 * This method generates random numbers flight
	 * 
	 * @return int
	 */
	private  String getFlightNumber() {

		Random random = new Random();
		StringBuffer randStr = new StringBuffer();
		for (int i = 0; i < RANDOM_NUM_LENGTH; i++) {
			randStr.append(CHAR_LIST[random.nextInt(CHAR_LIST.length)]);
		}

		for (int i = 0; i < RANDOM_NUM_LENGTH; i++) {
			randStr.append(CHAR_LIST_INT[random.nextInt(CHAR_LIST_INT.length)]);
		}

		return randStr.toString();
	}

	private  String generatePrice() {
		float min = 12.99f;
		float max = 999.99f;

		if (min >= max)
			throw new IllegalArgumentException("max must be greater than min");
		float result = ThreadLocalRandom.current().nextFloat() * (max - min) + min;
		if (result >= max)
			result = Float.intBitsToFloat(Float.floatToIntBits(max) - 1);

		return fmt(result);
	}

	private  String fmt(float pi) {
		String str = String.format("%.02f", pi);
		return str;
	}

	private  String getFlightDate(int daysAdd) {
		
        Calendar calendar = Calendar.getInstance(); 
       
        
        calendar.add(Calendar.DATE, daysAdd);
        calendar.add(Calendar.HOUR, 3);
        calendar.add(Calendar.MINUTE, 50);


         System.out.println(calendar.getTime());
        
        
       
       
        String strDate= formatter.format(calendar.getTime()); 
        
        System.out.println("getFlightDate :"+ strDate);
        return strDate;
	}
	
     private  String getFlightDate() {
		
        Calendar calendar = Calendar.getInstance(); 
       
        
        calendar.add(Calendar.DATE, 1);
        calendar.add(Calendar.HOUR, 3);
        calendar.add(Calendar.MINUTE, 50);


         System.out.println(calendar.getTime());
        
        
       
       
        String strDate= formatter.format(calendar.getTime()); 
        
        System.out.println("getFlightDate :"+ strDate);
        return strDate;
	}
	

	public static String getToken() {
		int length = 50;
		StringBuilder token = new StringBuilder(length);
	    for (int i = 0; i < length; i++) {
	        token.append(CHARS.charAt(random.nextInt(CHARS.length())));
	    }
	    return token.toString();
	}
}

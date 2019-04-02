package com.fonix.demo.utility;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class UtilityDate {

	public static Date getDateFromString(String source) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("MM-dd-yyyy");
		java.util.Date date = sdf1.parse(source);
		java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());
		
		return sqlStartDate;
	}
	
	public static String getDateFromat() throws ParseException {
		 SimpleDateFormat dateFormat = new SimpleDateFormat("MMM d yyyy : HH:mm:ss:SSS z");
	        Date now = new Date(System.currentTimeMillis());
	        String dateStr = dateFormat.format( now );
        return dateStr;
   }
}

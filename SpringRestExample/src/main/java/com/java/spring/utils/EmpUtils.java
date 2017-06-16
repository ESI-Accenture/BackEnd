package com.java.spring.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.activity.InvalidActivityException;

public class EmpUtils {

	public static String convertDateToString(Date date){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		if (null != date) {
			return sdf.format(date);
		}
		return null;
	}

	public static Date convertDateToString(String date) throws InvalidActivityException{
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Date returndate=null;
		try {
			returndate = sdf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
			throw new InvalidActivityException("Invalid date format");
		}
		return returndate;
	}
	public static Date convertStringToDate(String date) throws InvalidActivityException{
		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd");
		Date returndate=null;
		try {
			returndate = sdf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
			throw new InvalidActivityException("Invalid date format");
		}
		return returndate;
		
	}
}

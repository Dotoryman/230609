package com.yedam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today.getTime()); // 1970년 1월 1일 0시 기준으로

		long curr = 1686283308990L / (24 * 60 * 60 * 1000);
		System.out.println(curr);

		System.out.println(today.toString());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String result = sdf.format(today);
		System.out.println(result);
		result = "2016/08/23";
		try {
			Date resultDate = sdf.parse(result);
			System.out.println(resultDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		result = dateToStr(today, "yyyy/MM/dd");
		System.out.println(result);
	}
	
	
	public static String dateToStr(Date date, String pattern) {
		
		return null;
	}
}

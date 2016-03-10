package com.gbdex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateFmt {

	public static final String date_long = "yyyy-MM-dd HH:mm:ss";
	public static final String date_short = "yyyy-MM-dd";

	public static String getCountDate(String date, String patton) {
		SimpleDateFormat sdf = new SimpleDateFormat(patton);
		Calendar cal = Calendar.getInstance();
		if (date != null) {
			try {
				cal.setTime(sdf.parse(date));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return sdf.format(cal.getTime());
	}

	public static void main(String[] args) {

		System.out.println(DateFmt.getCountDate("2014-03-01 12:13:14", DateFmt.date_short));
	}

}

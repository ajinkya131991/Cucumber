package framework.utility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import cucumber.api.cli.Main;

public class DateTimeHelper 
{
	public static String getCurrentDateTime() {

		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");   //Making object of SimpleDateFormat
		Calendar cal = Calendar.getInstance();   //object of Calendar and function getInstance
		String time = "" + dateFormat.format(cal.getTime());
		//System.out.println(time); 
		return time;
	}

	public static String getCurrentDate() {
		
		return getCurrentDateTime().substring(0, 11);
	}
	
	public static void main(String[] args) {
		
		System.out.println(getCurrentDate());
		 
		
	}

}

package corejava;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateSmaple {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);// Mon Oct 26 16:51:11 GMT 2020

		// ddMMyyyyHHmmss
		DateFormat df = new SimpleDateFormat("ddMMMyyyy_HHmmss");
		System.out.println(df.format(d));
		
		
		//Mon Oct 26 16:55:07 GMT 2020
		//26Oct2020_165507

		
	}
}


package com.teamsankya.calculator;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class Addition {

	static final Logger logger=Logger.getLogger(Addition.class); 
	/*String path ="C:\\tools\\my.txt";*/
	static {
		
		Layout layout =new SimpleLayout();
		Appender appender;
		Appender a=new ConsoleAppender(layout);
		logger.addAppender(a);
		try {
			appender = new FileAppender(layout, "my.txt", true);

			// 3rd parameter is true by default
			// true = Appends the data into my.txt
			// false = delete previous data and re-write
			logger.addAppender(appender);
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
	}
	
	public static int add(int a, int b) { 
    logger.info("additin of two number :"+ a + " "+ b);
    logger.error("something went wrong....");
    logger.warn("we are giving some warning  msg");
	return a+b;	

	} 

	public static double add(double a, double b) {
	    logger.info("additin of two number :"+a + "" +b);

		return a + b;

	}
}

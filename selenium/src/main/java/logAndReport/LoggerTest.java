package logAndReport;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoggerTest {
	
	static String projectLocation = System.getProperty("user.dir");//to get the project location till user directory

	static String configFilename=projectLocation+"/Log4j.properties";//using the above location with log4j
	
	public static final Logger logger = Logger.getLogger(LoggerTest.class.getName());//logger method to get class name
	
	@BeforeClass
	public static void getlogger() {
		System.out.println(configFilename);
		
		PropertyConfigurator.configure(configFilename);//to check the location of the file
	}
	
	@Test
	public void testLogger() {
		//get logger();
		logger.info("Log test1");//printing the value in log
		logger.info("Log test2");
		logger.info("Log test3");
		logger.info("Log test4");
		
		logger.info("Log testA");
		logger.info("Log testB");
		logger.info("Log testC");
		logger.info("Log testD");
	}
}

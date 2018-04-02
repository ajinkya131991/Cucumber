package framework.configreader;

import java.util.Properties;
import org.apache.log4j.Level;

import framework.Configuration.browser.BrowserType;
import framework.utility.ResourceHelper;


public class PropertyFileReader implements configReader {

	private Properties prop = null;   //class properties //private used as want to use setter and getter

	public PropertyFileReader()   //constructor
	{
		prop = new Properties();
		try {
			prop.load(ResourceHelper.getResourcePathInputStream("/src/main/resources/config/config.properties"));  //"load" will load ur inputstream
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getUserName() {
		return prop.getProperty("Username");
	}

	public String getPassword() {
		return prop.getProperty("Password");
	}

	public String getWebsite() {
		return prop.getProperty("Website");
	}

	public int getPageLoadTimeOut() {
		return Integer.parseInt(prop.getProperty("PageLoadTimeOut"));   //Load should be in integer
	}

	public int getImplicitWait() {
		return Integer.parseInt(prop.getProperty("ImplcitWait"));
	}

	public int getExplicitWait() {
		return Integer.parseInt(prop.getProperty("ExplicitWait"));
	}

	public String getDbType() {
		return prop.getProperty("DataBase.Type");
	}

	public String getDbConnStr() {
		return prop.getProperty("DtaBase.ConnectionStr");
	}

	public BrowserType getBrowser() {
		return BrowserType.valueOf(prop.getProperty("Browser"));
	}

	public Level getLoggerLevel() {          // In class config.properties we can change our logger level  --> Logger.Level=INFO    

		switch (prop.getProperty("Logger.Level")) {

		case "DEBUG":
			return Level.DEBUG;
		case "INFO":
			return Level.INFO;
		case "WARN":
			return Level.WARN;
		case "ERROR":
			return Level.ERROR;
		case "FATAL":
			return Level.FATAL;
		}
		return Level.ALL;
	}

	
	}



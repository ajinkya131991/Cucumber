package framework.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ResourceHelper {  //will help to read any resource

	public static String getResourcePath(String resource) {   // will read resouce path 
		String path = getBaseResourcePath() + resource;
	
		return path;
	}
	
	public static String getBaseResourcePath() {
		//System.out.println(ResourceHelper.class.getClass().getResource("resource"));
		//String path= ResourceHelper.class.getClass().getResource("/").getPath();   //output - /C:/Users/ajinkya.bh/workspace/cucumber2/target/classes/
		String path = System.getProperty("user.dir");
		System.out.println(path);
		return path;
	}
	
	public static InputStream getResourcePathInputStream(String path) throws FileNotFoundException{   //"load" in resoucehelper will load ur inputstream
	
		return new FileInputStream(ResourceHelper.getResourcePath(path));
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		//System.out.println(ResourceHelper.getResourcePath("config/"+ "config.properties"));	 //output - /C:/Users/ajinkya.bh/workspace/cucumber2/target/classes/config/config.properties
		getBaseResourcePath();
	}
	
}

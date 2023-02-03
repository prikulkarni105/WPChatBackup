package Backup;


import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Resources {

	public static String fetchResource(String key) throws IOException
	{
	
		
		FileReader reader=new FileReader("db.properties");  
		Properties p=new Properties();  
	    p.load(reader);
		return p.getProperty(key);  
	}
	

	
}

package utilities;


import java.io.FileInputStream;
import java.util.Properties;


public class ReadConfigFile {

	public static Properties prop;
	public static FileInputStream filePath;
	String PROPERTIES_FILE_PATH ="\\src\\main\\java\\propertiesFile\\CONFIG.properties";
	
	
	public Properties configFileReader() {
		
		prop = new Properties();
		
		try {
			filePath= new FileInputStream(System.getProperty("user.dir") + PROPERTIES_FILE_PATH );
			prop.load(filePath);
			
		} 
		catch (Exception e) {
			
			System.out.println("Exception Message" +e.getMessage());
			
		}
	return prop;	
	}
	
	
	
	
	
	
	
	public String getBrowser() {
		
		String  getBrowserName =(prop.getProperty("browser"));
		return getBrowserName;
		
		
	}
	
	public String  getURL() {
	String URL=	(prop.getProperty("url"));
	return URL;
		
	}
	

}

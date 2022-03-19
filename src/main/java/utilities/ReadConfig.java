package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	private Properties pro;
	
	public ReadConfig()
	{
		File src= new File("./Configurations/config.properties");
		FileInputStream fis;
		try {
			fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	public String getApplicationURL() {
		return pro.getProperty("BASE_URL");
	
	}
	
	public String getChromePath() {
		return pro.getProperty("CHROME_PATH");
		
	}
	public String getUsername() {
		return pro.getProperty("username");
	}
	public String getPassword() {
		return pro.getProperty("password");
	}
	
	
}


package UI_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LocaterManager {
	
	static Properties p = new Properties();
	static {
		FileInputStream f= null;
		
		try {
			f = new FileInputStream("E:\\CODING\\Stream Api\\CRC-DevOps\\Xpath.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			p.load(f);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getXpath(String google_Url) {
		return p.getProperty(google_Url);
	}
	
	
	
}

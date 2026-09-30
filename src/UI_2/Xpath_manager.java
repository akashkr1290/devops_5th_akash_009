package UI_2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_manager {
	
	
	public static void main(String args[]) throws IOException, InterruptedException {
		Properties pr = new Properties();
		FileInputStream fs = new FileInputStream("E:\\CODING\\Stream Api\\CRC-DevOps\\Xpath.properties");
		pr.load(fs);
		
		Thread.sleep(1000);
		
		System.out.println(pr.getProperty("key"));
		
		ChromeDriver dr = new ChromeDriver();
		
		dr.get(pr.getProperty("googl_Url"));
		dr.navigate().to(pr.getProperty("wikipedia_Url"));
		
		dr.findElement(By.xpath(pr.getProperty("SearchXpath"))).sendKeys("Youtube");
		dr.findElement(By.xpath(pr.getProperty("SearchButtonXpath"))).click();
		
	}
	
}

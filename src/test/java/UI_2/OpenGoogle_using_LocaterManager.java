package UI_2;

import org.openqa.selenium.edge.EdgeDriver;

public class OpenGoogle_using_LocaterManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocaterManager Lm = new LocaterManager();
		
		EdgeDriver eg= new EdgeDriver();
		
		eg.get(Lm.getXpath("google_Url"));
		
		System.out.println("Google open");
		eg.quit();

	}

}

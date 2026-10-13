package UI_1;

import org.openqa.selenium.chrome.ChromeDriver;
public class Local_File_Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeDriver  dr = new ChromeDriver();
		
		// Local file testing 
		
		dr.get("E:\\PROJECT\\Bookmark Organizer\\index.html");
		
		//here "E:\\PROJECT\\Bookmark Organizer\\index.html" this is the location of the file
	}

}

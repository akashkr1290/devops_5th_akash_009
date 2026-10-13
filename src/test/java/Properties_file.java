import java.io.FileInputStream;
import java.util.Properties;

public class Properties_file {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		Properties pr = new Properties();
		
		FileInputStream fs = new FileInputStream("E:\\CODING\\Stream Api\\CRC-DevOps\\Xpath.properties");
		
		pr.load(fs);
		
		System.out.println(pr.getProperty("Akash"));
		

	}

}

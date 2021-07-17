package Adactin.Hotel;

import org.openqa.selenium.WebDriver;

import com.adactin.base.BaseClass_Method;

public class SearchHotel extends BaseClass_Method {
	
	public static WebDriver driver;
	
	
	public static void main(String[] args) {
		
		
		driver = browserLaunch("Chrome");
		
		openURL("http://adactinhotelapp.com/SearchHotel.php");
		
		
		
		
		
		
	}
	
	

}

package Adactin.Hotel;

import org.openqa.selenium.WebDriver;

import com.adactin.base.BaseClass_Method;
import com.adactin.pom.Adactin_Search_POM;
import com.adactin.pom.BookHotel_POM;
import com.adactin.pom.SelectHotel_POM;
import com.adactin.pom.loginPage;

public class login extends BaseClass_Method {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = browserLaunch("chrome");

		openURL("http://adactinhotelapp.com/");

		loginPage loginPOM = new loginPage(driver);

		Thread.sleep(2000);

		methodToSendkeys(loginPOM.getUsername(), "testnggit");

		methodToSendkeys(loginPOM.getPassword(), "testng");

		Thread.sleep(2000);

		methodToClick(loginPOM.getLogin());

		// SearchPage

		// openURL("http://adactinhotelapp.com/SearchHotel.php");
		
		Thread.sleep(2000);

		Adactin_Search_POM searchPOM = new Adactin_Search_POM(driver);

		boolean methodIsMultiple = methodIsMultiple(searchPOM.getLocation());

		if (methodIsMultiple == false) {
			methodToSelectByIndex(searchPOM.getLocation(), 3);
		}

		Thread.sleep(1000);

		boolean IsMultipleHotel = methodIsMultiple(searchPOM.getHotels());

		if (IsMultipleHotel == false) {
			methodToSelectByIndex(searchPOM.getHotels(), 4);
		}
		Thread.sleep(2000);

		boolean isMultipleRoomType = methodIsMultiple(searchPOM.getRoom_type());

		if (isMultipleRoomType == false) {
			methodToSelectByIndex(searchPOM.getRoom_type(), 2);
		}
		
		Thread.sleep(2000);
		
		boolean isMultipleRoomNos = methodIsMultiple(searchPOM.getRoom_nos());

		if (isMultipleRoomNos == false) {
			methodToSelectByIndex(searchPOM.getRoom_nos(), 2);
		}
		Thread.sleep(2000);
		
//		methodToSendkeys(searchPOM.getDatepick_in(), null);
//		
//		
//		methodToSendkeys(searchPOM.getDatepick_in(), "21/07/2021");
//		
//		methodToSendkeys(searchPOM.getDatepick_out(), null);
//		
//		
//		methodToSendkeys(searchPOM.getDatepick_out(), "23/07/2021");
//		
		boolean isMultipleAdult = methodIsMultiple(searchPOM.getAdult_room());

		if (isMultipleAdult == false) {
			methodToSelectByIndex(searchPOM.getAdult_room(), 2);
		}
		
		
		boolean isMultipleChild = methodIsMultiple(searchPOM.getChild_room());

		if (isMultipleChild == false) {
			methodToSelectByIndex(searchPOM.getChild_room(), 1);
		}
		
		methodToClick(searchPOM.getSubmit());
		
		// Select a Hotel
		
		SelectHotel_POM selectHotel= new SelectHotel_POM(driver);
		
		methodToClick(selectHotel.getRadiobutton());
		
		Thread.sleep(2000);
		
		methodToClick(selectHotel.getContinueClick());
		
		// Book Now
		
		BookHotel_POM book= new BookHotel_POM(driver);
		Thread.sleep(2000);
		
		methodToSendkeys(book.getFirstname(), "Judit");
		Thread.sleep(2000);
		
		methodToSendkeys(book.getLastname(), "Polgar");
		
		Thread.sleep(2000);
		methodToSendkeys(book.getAddress(), "First main road, Chennai");	
		Thread.sleep(2000);
		
		methodToSendkeys(book.getCc_num(), "1234567891234567");
		
		Thread.sleep(2000);
		
		boolean isMultipleCardType = methodIsMultiple(book.getCardType());

		if (isMultipleCardType == false) {
			methodToSelectByIndex(book.getCardType(), 1);
		}
		
		Thread.sleep(2000);
		
		boolean isMultipleMonth = methodIsMultiple(book.getMonth());

		if (isMultipleMonth == false) {
			methodToSelectByIndex(book.getMonth(), 6);
		}
		Thread.sleep(2000);
		boolean isMultipleYear = methodIsMultiple(book.getYear());

		if (isMultipleYear == false) {
			methodToSelectByIndex(book.getYear(),10);
		}
		Thread.sleep(2000);
		methodToSendkeys(book.getCVVNumber(), "1232");
		
		Thread.sleep(2000);
		methodToClick(book.getBook_now());
		
		Thread.sleep(2000);
		methodToClick(book.getMy_itinerary());
		
	}

}

package IPS.Dasman;

import java.awt.List;

import javax.swing.text.html.CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.helger.css.decl.CSSSelector;

public class HomePage extends PageBase{

	public HomePage(WebDriver driver) {
		super(driver);

	}
	
	public void selectAuctionType () {
		for(int i=1;i<=8;i++) {
			WebElement mainmenu= driver.findElement(By.cssSelector("#unifyMenu > li:nth-child("+i+") > a > span.nav-title"));
		mainmenu.getText();	
		}
		
		}}
		/*AuctionClick.click();
		switch (type) {
		case "Products":
			clickButton(Products);
			break;
		case "CompanyAuction":
			clickButton(CompanyAuction);
			break;
		case "LiveAuction":
			clickButton(LiveAuction);
			break;

		case "ClientAuction":
			clickButton(ClientAuction);
			break;
		default:
			clickButton(Unconfirmedpayments);
			break;
		}}
}
*/
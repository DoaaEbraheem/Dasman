package IPS.Dasman;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VendorLoginPage extends PageBase{

	public VendorLoginPage(WebDriver driver) {
		super(driver);
	}
	

	@FindBy(xpath = "/html/body/header/div[1]/div/a[1]")
	WebElement HomeLoginbutton;
	
	@FindBy(xpath = "//*[@id=\"inputs-form\"]/div[1]/input")
	WebElement UserEmail;
	
	@FindBy(name = "password")
	WebElement UserPassword;
	
	@FindBy(xpath = "//*[@id=\"inputs-form\"]/div[4]/button")
	WebElement Clicklogin;
	
	public void LoginbyVendor(String email, String password) {
		clickButton(HomeLoginbutton);
		//setTextElementText(UserEmail, email);
		UserEmail.sendKeys(email);
		setTextElementText(UserPassword, password);
		clickButton(Clicklogin);

	}
}

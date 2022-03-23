package IPS.Dasman;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminLogin extends PageBase {

	public AdminLogin(WebDriver driver) {
		super(driver);

	}
	@FindBy(id = "Email")
	WebElement Email;

	@FindBy(id = "Password")
	WebElement Password;

	@FindBy(css = "#inputs-form > button")
	WebElement loginButton;

	public void LoginwithAdmin(String mail , String pass) {
		setTextElementText(Email, mail);
		setTextElementText(Password, pass);
		clickButton(loginButton);
	}


}

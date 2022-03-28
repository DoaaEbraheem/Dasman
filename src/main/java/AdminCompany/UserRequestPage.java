package AdminCompany;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import IPS.Dasman.PageBase;

public class UserRequestPage extends PageBase{

	public UserRequestPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(name="keyword")
	WebElement Searchinput;

	@FindBy(css = "#form_filter > div > div:nth-child(5) > div > button")
	WebElement searchbutton;

	@FindBy(xpath = "/html/body/div[1]/div/div/div/div/div/div[2]/div/div/div/div/table/tbody/tr/td[2]")
	WebElement tablecontent;

	@FindBy(xpath = "/html/body/div[1]/div/div/div/div/div/div[2]/div/div/div/div/table/tbody/tr/td[8]/div/a[2]")
	WebElement approvebutton;

	@FindBy(xpath = "/html/body/div[1]/div/div/div/div/div/div[2]/div/div/div/div/table/tbody/tr/td[8]/div/a[3]")
	WebElement Rejectbutton;

	private void SearchForName(String Vendorname) {
		setTextElementText(Searchinput, Vendorname);
		clickButton(searchbutton);
		tablecontent.getText().toString().equals(Vendorname);

	}

	private void Approvemethod(String Vendorname) {
		SearchForName(Vendorname);
		clickButton(approvebutton);

	}

	private void Rejectmethod(String Vendorname) {
		SearchForName(Vendorname);
		clickButton(Rejectbutton);
	}
}

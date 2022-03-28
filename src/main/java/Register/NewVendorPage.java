package Register;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import IPS.Dasman.PageBase;

public class NewVendorPage extends PageBase{

	public NewVendorPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "/html/body/header/div[1]/div/a[1]")
	WebElement HomeLoginbutton;
	
	@FindBy(xpath = "//*[@id=\"inputs-form\"]/div[6]/a")
	WebElement LoginRegisterbutton;
	
	@FindBy(name = "company_id")
	WebElement Selectcompany;
	
	@FindBy(id="Name")
	WebElement Vendorname;
	
	@FindBy(id="Email")
	WebElement VendorEmail;
	
	@FindBy(id="Password")
	WebElement Password;
	
	@FindBy(id="confirmNewPass")
	WebElement RePassword;
	
	@FindBy(id = "phone")
	WebElement VendorPhone;
	 
	@FindBy(name = "job_title_id")
	WebElement Jobtitle;
	
	@FindBy(name="vendor_category_ids[]")
	WebElement Vendorcategory;
	
	@FindBy(xpath = "//*[@id=\"inputs-form\"]/div[9]/button")
	WebElement clickRegister;
	
	public void VendorRegistration(String comp,String Name,String mail, String pass,String Repass,String mobile,String job, String category) {
		clickButton(HomeLoginbutton);
		clickButton(LoginRegisterbutton);
		Select dropdown = new Select(driver.findElement(By.name( "company_id")));
		dropdown.selectByVisibleText(comp);
		//selectDropdownmenubyvalue(Selectcompany,comp);
		setTextElementText(VendorEmail, mail);
		setTextElementText(Vendorname, Name);
		setTextElementText(Password, pass);
		setTextElementText(RePassword, Repass);
		setTextElementText(VendorPhone, mobile);
		selectDropdownmenu(Jobtitle, job);
		selectDropdownmenu(Vendorcategory, category);
		clickButton(clickRegister);
	}

}

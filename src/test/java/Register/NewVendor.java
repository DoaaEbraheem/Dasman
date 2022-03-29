package Register;

import org.testng.annotations.Test;



import IPS.Dasman.TestBase;

public class NewVendor extends TestBase{
	NewVendorPage NewVendorobject;
	String company="company 3";
	String name=faker .name().firstName();
	String mail=name+"@gmail.com";
	String pass="123456";
	String Repass="123456";
	String phone=faker .phoneNumber().subscriberNumber()+faker .phoneNumber().subscriberNumber()+faker .phoneNumber().subscriberNumber();
	String job="manager";
	String category="vendor Category 2";
	
	@Test
	private void RegisternewVendor() {
		NewVendorobject = new NewVendorPage(driver);
		NewVendorobject.VendorRegistration(company,name,mail,pass, Repass,phone,job,category);

	}
	

}

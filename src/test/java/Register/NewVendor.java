package Register;

import org.testng.annotations.Test;



import IPS.Dasman.TestBase;

public class NewVendor extends TestBase{
	NewVendorPage NewVendorobject;
	String company="company 3";
	String name=faker .name().fullName();
	String mail=faker .internet().emailAddress();
	String pass= "123456";
	String Repass="123456";
	String phone=faker .phoneNumber().cellPhone();
	String job="manager";
	String category="vendor Category 2";
	
	@Test
	private void RegisternewVendor() {
		NewVendorobject = new NewVendorPage(driver);
		NewVendorobject.VendorRegistration(name,mail,pass, Repass,phone,job,category);

	}
	

}

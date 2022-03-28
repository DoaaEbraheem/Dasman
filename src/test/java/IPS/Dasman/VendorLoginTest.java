package IPS.Dasman;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class VendorLoginTest extends TestBase{
	VendorLoginPage VendorLoginobject;

	@Test
	private void loginAsVendor() throws IOException, InterruptedException {
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream("resources\\test.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		String email = prop.getProperty("vendor");
		String password = prop.getProperty("VendorPassword");
		VendorLoginobject = new VendorLoginPage(driver);
		VendorLoginobject.LoginbyVendor(email, password);


	}


}



package IPS.Dasman;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class AdminloginTest extends TestBase{
	AdminLogin Loginpage;
	@Test(priority = 1)
	public void loginAsAdmin() throws IOException, InterruptedException {
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream("resources\\test.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		String email = prop.getProperty("admin");
		String password = prop.getProperty("password");
		Loginpage = new AdminLogin(driver);
		Loginpage.LoginwithAdmin(email, password);

	}

}

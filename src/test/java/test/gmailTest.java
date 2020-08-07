package test;

import org.testng.annotations.Test;

import pages.homePage;
import pages.loginPage;

public class gmailTest {
	
@Test	
public void gmailrun(){	

	
homePage Home =new homePage();
Home.OpenBrowser();
Home.VerifyTitle();
Home.verifyUrl();
Home.signin();

loginPage login =new loginPage();
login.loginchracter();
login.BrowserClose();



	   
	   
	   
	 
	 	
}

}

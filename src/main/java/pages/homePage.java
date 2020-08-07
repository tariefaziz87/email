package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class homePage {
    ChromeDriver dr;

    String expectedTitle="Sign in - Google Accounts";

    String expectedURL="https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin";

	public void OpenBrowser() {
		 try {

             System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe\\");

             dr= new ChromeDriver();

             dr.get("https://accounts.google.com/signin");

             Reporter.log("Chrome Browser Successfully Open");

             }

             catch(Exception e) {

              Assert.fail("Chrome Browser failed to open");

             }

}
	 public void VerifyTitle() {
		 
		 String actualTitle=dr.getTitle();

         Assert.assertEquals(actualTitle, expectedTitle);

         Reporter.log("Title Matched");

         System.out.println(dr.getTitle());
	
}
	
		 public void verifyUrl() {
				String actualURL = dr.getCurrentUrl();	
				Assert.assertEquals(actualURL,expectedURL);
				Reporter.log("URL matches");
	            

		 
}
	        public void signin() {

             WebElement google=dr.findElement(By.xpath("//input[@id='identifierId']"));

             google.sendKeys("tariefaziz@gmail.com");

             dr.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]")).click();                                

  }
}
	 
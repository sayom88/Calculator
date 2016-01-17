package pack_cal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Calculator {
	
	WebDriver driver = new FirefoxDriver();
	
	
	  @Test
	   public void app_launch() throws Exception{
		
		   
		   //System.setProperty("webdriver.ie.driver","C://ECLIPSE_WORKSPACE//IEDriverServer.exe");
		  // driver=new InternetExplorerDriver();
		   
		   System.out.println("The WebDriver IS SHOWN HERE::"+driver);
	  
	    driver.manage().timeouts().implicitlyWait(20000,TimeUnit.SECONDS);
	    
	   
 	
  //Launch websitess
  //driver.navigate().to();
	
	//    C:\ECLIPSE_WORKSPACE\Java_Maven
	
	    String html_path="C:\\";
driver.get(html_path+"Calculator1.html");

	   // driver.get("Calculator1.html");
  // https://swarnasetu-beta.mybluemix.net/
  //Maximize the browser
  driver.manage().window().maximize();
  
  Thread.sleep(2000);
  
  driver.quit();
	  }

}

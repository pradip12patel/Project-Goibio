package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass3 {
	
	protected WebDriver driver;
	Properties prop;
	
	public void driverinitilize() throws IOException   {
		
		FileInputStream src=new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\Project7\\src\\main\\java\\Resources\\data3.properties");
		
	    prop=new Properties();
		prop.load(src);
		
		String key=prop.getProperty("browser");
		
		if(key.equalsIgnoreCase("chrome"))   {
			
			 ChromeOptions op=new ChromeOptions();
		      op.addArguments("--remote-allow-origins=*"); 
	    	  
	    	 driver=new ChromeDriver(op); 
			
		}
		else if(key.equalsIgnoreCase("firefox"))  {
			
			driver=new FirefoxDriver();
		}
		else {
			
			System.out.println("write the properties");
		}
	}
	
	@BeforeMethod
	public void openurl() throws IOException    {
		
		driverinitilize();
		
		String key1=prop.getProperty("url");
		 driver.get(key1);
		
	}
	@AfterMethod
		public void closebrowser()  {
			
			driver.manage().window().maximize();
		}
	
	
		
	}



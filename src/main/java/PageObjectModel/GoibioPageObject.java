package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoibioPageObject {
	
	WebDriver driver;
	
	public By from=By.xpath("//span[normalize-space()='From']");
	public By fromcity=By.xpath("//input[@type='text']");
	public By tocity=By.xpath("//input[@type='text']");
	public By city=By.xpath("(//div[@class='sc-jObWnj bRMwkb'])[1]");
    public By citis=By.xpath("(//p[@class='sc-AjmGg iraeWI'])[1]");
	public By month=By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']");
	public By mnth=By.xpath("(//div[@class='DayPicker-Caption'])[2]");
	public By date=By.xpath("(//div[@class='DayPicker-Body'])[2]//div//p");
	public By done=By.xpath("//span[@class='fswTrvl__done']");
	public By plus=By.xpath("//div[@class='sc-clIzBv hWaYfP']//div[1]//span[3]");
	public By plus1=By.xpath("(//div[@class='sc-fWCJzd eRvjBC'])[2]//span[3]");
	public By plus2=By.xpath("(//div[@class='sc-fWCJzd eRvjBC'])[3]//span[3]");
	public By classes=By.xpath("(//li[@class='sc-gGCDDS nVLLt'])[2]");
	public By ok=By.xpath("//a[@class='sc-jQrDum gMuQGX']");
	public By button=By.xpath("//span[@class='sc-XxNYO hiLeUc']");
	public By newdate=By.xpath("//span[@class='complete']");
	public By cancal=By.xpath("//span[@class='logSprite icClose']");
	
	public GoibioPageObject(WebDriver driver2) {

      this.driver=driver2;
	}
	
	public WebElement clickfrom()  {
		
		return driver.findElement(from);
	}

	public WebElement enterfromcity()   {
		
		return driver.findElement(fromcity);
	}
	
	public WebElement entertocity()   {
		
		return driver.findElement(tocity);
		
	}
	public WebElement entercity()  {
		
		return driver.findElement(city);
	}
	public WebElement entercitis()  {
		
		return driver.findElement(citis);
	}
	public WebElement matchmonth() {
		
		return driver.findElement(month);
	}
	public WebElement sepmonth()  {
		
		return driver.findElement(mnth);
	}
	public List<WebElement> selectdate()  {
		
		return driver.findElements(date);
	}
	public WebElement clickdone()  {
		
		return driver.findElement(done);
	}
	public WebElement clickplus()  {
		
		return driver.findElement(plus);
	}
   public WebElement clickplus1()  {
		
		return driver.findElement(plus1);
	}
   public WebElement clickplus2()  {
		
		return driver.findElement(plus2);
	}
   public WebElement selectclass()   {
	   
	   return driver.findElement(classes);
   }
   public WebElement clickok()  {
	   
	   return driver.findElement(ok);  
   }   
   public WebElement clickbutton()  {
	   
	   return driver.findElement(button);  
   } 
  public WebElement clicknewdate()  {
	   
	   return driver.findElement(newdate);  
   } 
  public WebElement clickcancal()  {
	   
	   return driver.findElement(cancal);  
  }
}

package TestCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObjectModel.GoibioPageObject;
import Resources.BaseClass3;
import Resources.CommanMethodGoibio;
import Resources.constantsGoibo;

public class VerifyGoibio extends BaseClass3{
	
	@Test
	public void goibio()   {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		GoibioPageObject obj=new GoibioPageObject(driver);
		
		obj.clickcancal().click();
		obj.clickfrom().click();
		obj.enterfromcity().sendKeys(constantsGoibo.from);
		obj.entercity().click();
		
		obj.entertocity().sendKeys(constantsGoibo.to);
		obj.entercitis().click();
		
		String a="";
		while(!(a.equals("September 2023")))   {
			
			obj.matchmonth().click();
			obj.sepmonth();
			a=obj.sepmonth().getText();
		}	
		/* List<WebElement> b=obj.selectdate();
			
			for(WebElement c:b)  {
				
				if(c.getText().equalsIgnoreCase("8"))  {
					
					c.click();
					break;
				}        
			}     */
		CommanMethodGoibio.selectdates(obj.selectdate(), "8");
		
			obj.clickdone().click();
			
	/*	for(int i=0;i<4;i++)  {
			
		  obj.clickplus().click();
		}  */
		CommanMethodGoibio.selectpassenger(obj.clickplus(), 4);
		
		/*for(int i=0;i<2;i++)  {
			
			  obj.clickplus1().click();
			}*/
		CommanMethodGoibio.selectpassenger(obj.clickplus1(), 2);
		
		/*for(int i=0;i<2;i++)  {
			
			  obj.clickplus2().click();
			}  */
		CommanMethodGoibio.selectpassenger(obj.clickplus2(), 2);
		
		obj.selectclass().click();
		
		obj.clickok().click();
		
		obj.clickbutton().click();
		
		obj.clicknewdate().click();
		
	}
}


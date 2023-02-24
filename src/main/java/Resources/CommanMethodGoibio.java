package Resources;

import java.util.List;

import org.openqa.selenium.WebElement;

public class CommanMethodGoibio {
	
	public static void selectpassenger(WebElement a,int index)  {
		
		for(int i=0;i<index;i++)   {
			
			a.click();
		}
		
	}	
	public static void selectdates(List<WebElement> az,String idx)  {
		
		List<WebElement> as=az;
		
	  for(WebElement v1:as)    {
		  
		  
    if(v1.getText().equalsIgnoreCase(idx))		{	
    	 
			  v1.click();
			  break;
		  }
	  }
		
	}
	
		
		
	}
		
		
	



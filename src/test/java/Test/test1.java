package Test;

//import java.time.Duration;
import java.util.Set;

//import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Base.Basepkg;
import Page.Page1;

public class test1 extends Basepkg
{
	@Test
	public void test() throws Exception
	{
	//Actions act=new Actions(driver);
	Page1 ob=new Page1(driver);
	driver.manage().window().maximize();
	ob.womenslct();
	ob.bagctgry(); 
	ob.bagchoos();
	ob.bagpick();
	ob.clkcart();
	driver.navigate().back();
	driver.navigate().back();
	ob.footwearpick();
	ob.footslct();
	ob.footwearslct();
	ob.clrslct();
	ob.sizefoot();
	ob.footcart();
	//ob.logoclk();
	driver.navigate().back();
	driver.navigate().back();
	driver.navigate().back(); 
	
	String parentWindow=driver.getWindowHandle();
	ob.dcrhome();
    Set<String> allWindowHandles=driver.getWindowHandles();
    for (String handle : allWindowHandles)
    {
     if (!handle.equalsIgnoreCase(parentWindow)) 
     {
         driver.switchTo().window(handle);
         ob.pricelow();
         ob.choosclr();
         ob.clrmalti();
         ob.slctprdct();
         ob.decorcart();
         driver.navigate().back();
         driver.close();
         driver.switchTo().window(parentWindow);
         driver.navigate().refresh();
         ob.lastcart();
        // ob.nowbuy();
         
         
     }
//driver.quit();
     
     
     
    }}
	
	
}
	
	

	
	
	
	

 
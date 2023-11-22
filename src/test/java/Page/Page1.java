package Page;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page1 {
	 WebDriver driver;
	 @FindBy(xpath="//*[@id=\"shopWomen\"]/span")
	 WebElement womencotegory;
	 @FindBy(xpath="//*[@id=\"bags\"]/div/div")
	 WebElement slctbag;
	 @FindBy(xpath="//*[@id=\"views\"]/div/div/div[2]/div[4]/a/div")
	 WebElement choosbag;
	 @FindBy(xpath="//*[@id=\"19088813\"]")
	 WebElement pickbag;
	 @FindBy(xpath="/html/body/div[1]/main/div/div/div[3]/div[1]/div[4]/div[4]/div[2]/div[2]")
	 WebElement cartclk;
	 @FindBy(xpath="//*[@id=\"DeskLogo\"]/a/div/svg/use")
	 WebElement clklogo;
	 @FindBy(xpath="//*[@id=\"footwear\"]/div/div")
	 WebElement pickfootwear;
	 @FindBy(xpath="//*[@id=\"views\"]/div/div/div[2]/div[4]/a/div")
	 WebElement slctfoot;
	 @FindBy(xpath="//*[@id=\"20127243\"]")
	 WebElement slctfootwear;
	 @FindBy(xpath="//*[@id=\"views\"]/div/div/div[3]/div[1]/div[4]/div[3]/div[1]/img")
	 WebElement slctclr;
	 @FindBy(xpath="//*[@id=\"size_34245670\"]")
	 WebElement footsize;
	 @FindBy(xpath="//*[@id=\"views\"]/div/div/div[3]/div[1]/div[4]/div[6]/div[2]/div[2]")
	 WebElement cartfoot;
	 @FindBy(xpath="//*[@id=\"home_category\"]/div") 
	 WebElement homedcr; 
	 @FindBy(xpath="//*[@id=\"filtrD\"]/div/div[4]/div[5]/label/div")
	 WebElement lowprice;
	 @FindBy(xpath="//*[@id=\"filtrD\"]/div/div[7]/div[1]")
	 WebElement clrchoos;
	 @FindBy(xpath="//*[@id=\"filtrD\"]/div/div[7]/div[2]/div[1]/label/div[2]")
	 WebElement malticlr;
	 @FindBy(xpath="//*[@id=\"18580027\"]")
	 WebElement prdctslct;
	 @FindBy(xpath="//*[@id=\"views\"]/div/div/div[3]/div[1]/div[4]/div[4]/div[2]/div[2]")
	 WebElement cartdecor;
     @FindBy(xpath="//*[@id=\"views\"]/div/div/div[2]/div[2]/div/div[3]/div[1]/svg")
	 WebElement rmvdcr;
	 @FindBy(xpath="//*[@id=\"cartB\"]/div[2]/div[2]")
	 WebElement cartlast;
	 @FindBy(xpath="//*[@id=\"views\"]/div/div/div[3]/div[2]/a")
	 WebElement buynow;
	 
	 
	 public Page1 (WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		
		}
	 public void womenslct()
	 {
		 womencotegory.click();
	 }
	 public void  bagctgry() throws Exception
	 {
		 Thread.sleep(1000);
		 slctbag.click();
	 }
	 public void bagchoos() throws Exception
	 {
		 Thread.sleep(1000);
		 choosbag.click();
	 }
	 public void bagpick() throws Exception
	 {
		Thread.sleep(1000);
		 pickbag.click();
	 }
	 public void clkcart() throws Exception
	 {
		 Thread.sleep(1000);
		 cartclk.click();
	 }
	 public void logoclk() throws Exception
	 {
		 Thread.sleep(2000);
		 clklogo.click();
	 }
	 public void footwearpick() throws Exception
	 {
		 Thread.sleep(1500);
		 pickfootwear.click();
	 }
	 public void footslct() throws Exception
	 {
		 Thread.sleep(1000);
		 slctfoot.click();
	 }
	 public  void footwearslct() throws Exception 
	 {
		 Thread.sleep(1500);
		 slctfootwear.click();
		 
	 }
	 public void clrslct() throws Exception
	 {
		 Thread.sleep(1000);
		 slctclr.click();
	 }

     public void sizefoot() throws Exception
	 {
		 Thread.sleep(1500);
		 footsize.click();
	 }
     public void footcart() throws Exception
     {
    	 Thread.sleep(1000);
    	 cartfoot.click();
     }
     public void dcrhome() throws Exception
     {
    	 Thread.sleep(1000);
    	 homedcr.click();
     }
     public void pricelow() throws Exception
     {
    	 Thread.sleep(1000);
    	 lowprice.click();
     }
     public void choosclr() throws Exception 
     {
    	 Thread.sleep(1000);
    	 clrchoos.click();
    	 
	 }
     public void clrmalti() throws Exception 
     {
    	 Thread.sleep(2000);
    	 malticlr.click();
	 }
     public void slctprdct() throws Exception
     {
    	 Thread.sleep(2000);
    	 prdctslct.click();
     }
     public void  decorcart() throws Exception
     {
    	 Thread.sleep(1000);
    	 cartdecor.click();
     }
   
     public void dcrrmv() throws Exception
     {
    	 Thread.sleep(1000);
    	 rmvdcr.click();
     }
     public void lastcart() throws Exception
     {
    	 Thread.sleep(1000);
    	 cartlast.click();
     }
     public void nowbuy() throws Exception
     {
    	 Thread.sleep(1000);
    	 buynow.click();
     }
     
    
     
		 
	 }

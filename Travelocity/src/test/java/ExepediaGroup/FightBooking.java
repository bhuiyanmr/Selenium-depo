package ExepediaGroup;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class FightBooking {
	WebDriver driver=null;
  @Test(dataProvider = "dp")
  public void f(String n,String s,String a,String b,String c, String d, String e, String f) throws InterruptedException{
	  
	driver.findElement(By.xpath("(//span[@class='tab-label'])[1]")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("flight-type-roundtrip-label-hp-flight")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("flight-origin-hp-flight")).sendKeys(n);
	Thread.sleep(3000);
	driver.findElement(By.id("flight-destination-hp-flight")).sendKeys(s);
	Thread.sleep(3000);
	driver.findElement(By.id("flight-departing-hp-flight")).sendKeys(a);
	Thread.sleep(3000);
	driver.findElement(By.id("flight-returning-hp-flight")).sendKeys(b);
	Thread.sleep(3000);
	driver.findElement(By.id("flight-adults-hp-flight")).sendKeys(c);
	Thread.sleep(3000);
	driver.findElement(By.id("flight-children-hp-flight")).sendKeys(d);
	Thread.sleep(3000);
	driver.findElement(By.id("flight-age-select-1-hp-flight")).sendKeys(e);
	Thread.sleep(3000);
	driver.findElement(By.id("flight-age-select-2-hp-flight")).sendKeys(f);
	Thread.sleep(3000);
	
	
	
	  
	  
  }
  @Test
  public void shoppingcart() throws InterruptedException{
	driver.findElement(By.xpath("(//button[@type='submit'])[11]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//button[@class='btn-secondary btn-action t-select-btn'])[1]")).click();
	driver.findElement(By.id("bookButton")).click();  
	  
  }
  
  
  //@Test
  //public void bookflt(){
	 //.findElement(By.xpath("(//button[@class='btn-secondary btn-action t-select-btn'])[1]")).click();
	 //driver.findElement(By.id("bookButton")).click();
  //}
  
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "IAD","SFO","12/15/2019","12/25/2019","2","2","7","11"},
      /*new Object[] { "SFO"},
      new Object[] { "12/15/2019"},
      new Object[] { "12/25/2019"},
      new Object[] { "2"},
      new Object[] { "2"},*/
    };
  }
  @BeforeClass
  //@Parameters({"browser", "url"})
 public void beforeClass() {
 
//if(br.equalsIgnoreCase("chrome")){
	

System.setProperty("webdriver.chrome.driver", "C:\\Users\\mbhuiyan4\\Downloads\\chromedriver.exe");
 driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://www.travelocity.com/");
  //}else if(br.equalsIgnoreCase("firefox")){
	//  System.out.println("Firefox Browser is not available");
  //}
  }
  
  @AfterClass
  public void afterClass() {
	  //driver.close();
  }

}

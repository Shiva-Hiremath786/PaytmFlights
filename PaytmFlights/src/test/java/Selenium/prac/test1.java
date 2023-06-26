package Selenium.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class test1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.get("https://tickets.paytm.com/flights/");
		driver.manage().window().maximize();
     

       js.executeScript("window.scroll(0,220)");

        WebElement from = driver.findElement(By.id("text-box"));
        from.click();
        Thread.sleep(2000);
        
        WebElement fromOption = driver.findElement(By.xpath("//*[@id=\"flightsBookingForm\"]/div[2]/div[2]/div[1]/div[2]/div/div/div[2]/div/div/div[1]/div[2]"));
        fromOption.click();
        Thread.sleep(2000);

        WebElement to = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[1]/div/div/div[2]/div[4]/div[1]/div[1]/input"));
        to.click();
        Thread.sleep(2000);
        
        WebElement toOption = driver.findElement(By.xpath("//*[@id=\"flightsBookingForm\"]/div[2]/div[4]/div[1]/div[2]/div/div/div[3]/div/div/div[1]/div[2]"));
        toOption.click();
        Thread.sleep(2000);

        driver.findElement(By.className("QbC4")).click();

        WebElement date = driver.findElement(By.xpath("//*[@id=\"datePickerOnward\"]/div[2]/div/div[3]/table/tbody/tr[4]/td[4]/div/div"));
        date.click();

        driver.findElement(By.className("button")).click();
        Thread.sleep(3000);
        
        js.executeScript("window.scroll(0,400)");

        WebElement stop = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div/div[2]/div/div[1]/div[3]/div[1]/div[6]/div[2]"));
        WebElement takeoff = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div/div[2]/div/div[1]/div[3]/div[1]/div[3]/div[1]"));
        WebElement reach = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div/div[2]/div/div[1]/div[3]/div[1]/div[5]/div"));

        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div/div[2]/div/div[1]/div[4]/div[1]/div[9]/a")).click();

        java.util.Set<String> handles = driver.getWindowHandles();
        java.util.Iterator<String> iterator = handles.iterator();
        iterator.next(); // Skip the first handle (main window)
        String newWindowHandle = iterator.next();
        driver.switchTo().window(newWindowHandle);

        js.executeScript("window.scroll(0,300)");

        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div/div[3]/div[1]/div[1]/div[2]/div[2]/div/div[3]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"flights-review-traveller-details\"]/div[2]/div[2]/div/div/a")).click();
        Thread.sleep(3000);

        driver.switchTo().frame(0);
        driver.findElement(By.className("info")).click();
        Thread.sleep(10000);
        driver.switchTo().defaultContent();

        Thread.sleep(1000);

        js.executeScript("window.scroll(0,200)");
        driver.findElement(By.xpath("(//div[contains(@class,'KFKU')])[1]")).click();//MR
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Shiva");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Hiremath");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='col-xs-4']//input[@type='text']")).sendKeys("Shivahiremath786@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='_2AFi']//button[@class='button button--default _1YAy']")).click();//MR
        Thread.sleep(2000);
        
      //baggege

      		driver.findElement(By.xpath("//div[contains(text(),'Prebook your additional baggage')]")).click();
      	   Thread.sleep(2000);
      		driver.findElement(By.xpath("(//img[@class='_3Vhc'])[2]")).click();

      		//meals
      		
      		
      		driver.findElement(By.xpath("//*[@id=\"flights-review-ancillary\"]/div[2]/div/div[1]/div/div[2]/div[1]/div[1]")).click(); 
      		Thread.sleep(3000);
      		driver.findElement(By.xpath("//*[@id=\"flights-review-ancillary\"]/div[2]/div/div[1]/div/div[2]/div[2]/div/div/div/div/div[2]/div[6]/div[2]")).click();
      		Thread.sleep(3000);
      		

      		//peakup a seat

      		driver.findElement(By.xpath("//*[@id=\"flights-review-ancillary\"]/div[2]/div/div[2]/div/div[1]/div[1]")).click();
      		Thread.sleep(5000);
      		driver.findElement(By.xpath("//*[@id=\"flights-review-ancillary\"]/div[2]/div/div[2]/div/div[2]/div/div/div/div/div[2]/div/div[2]/div/div/div[42]/div/img"));
      		 js.executeScript("window.scroll(0,300)");
      		Thread.sleep(5000);

      		//img[@class="flightSeat"]
      		
      		
      		//procedtopay
      		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div/div[3]/div[1]/div[6]/div/button/div/div")).click();
      		Thread.sleep(5000);
      		
      		driver.quit();

	}

}

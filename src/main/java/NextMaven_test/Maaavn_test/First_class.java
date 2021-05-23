package NextMaven_test.Maaavn_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;  
  
public class First_class {  
  
    public static void main(String[] args) throws InterruptedException {  
        
    // declaration and instantiation of objects/variables  
    //System.setProperty("webdriver.chrome.driver", "D:\\Jars and softwares\\chromedriver.exe");  

    	WebDriverManager.chromedriver().setup();
    ChromeDriver driver=new ChromeDriver();  
      
// Launch website  
    driver.navigate().to("http://www.google.com/");  

    Thread.sleep(1000);
          
    // Click on the search text box and send value  
    driver.findElement(By.name("q")).sendKeys("javatpoint tutorials"+ "\n");  
          
    }  
  
}  
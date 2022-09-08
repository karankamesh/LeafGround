package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Udemy_2_Checkbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium Tools\\Firefox Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.name("name")).sendKeys("Kamesh");
		driver.findElement(By.name("email")).sendKeys("karankamesh@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("ConeIce");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement options = driver.findElement(By.id("exampleFormControlSelect1"));
		Select option = new Select(options); 
		option.selectByVisibleText("Male");
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("28");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println(driver.findElement(By.className("alert")).getText());
		

	}

}

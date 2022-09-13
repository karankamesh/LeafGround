package assignments;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Udemy_4_ExplicitWait {

	public static void main(String[] args) throws InterruptedException {

		String[] buyprd = {"iphone X","Samsung Note 8","Nokia Edge","Blackberry"};

		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("rahulshettyacademy");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("learning");

		WebElement radiobutton = driver.findElement(By.xpath("(//*[@class='customradio'])[2]/span[2]"));
		radiobutton.click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement alert=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		alert.click();

		WebElement dropdown = driver.findElement(By.xpath("(//*[@class='form-control'])[3]"));
		dropdown.click();
		Select select = new Select(dropdown);
		select.selectByValue("consult");

		WebElement checkbox = driver.findElement(By.id("terms"));
		checkbox.click();

		WebElement signbt = driver.findElement(By.id("signInBtn"));
		signbt.click();

		List buyprd1 = Arrays.asList(buyprd);

		List<WebElement> prdname = driver.findElements(By.xpath("//*[@class='card h-100']/div/h4/a"));
		for (int i = 0; i < prdname.size(); i++) {
			String prd =	prdname.get(i).getText();
			if (buyprd1.contains(prd)) {
				driver.findElements(By.xpath("//*[@class='btn btn-info']")).get(i).click();
			}

		}

		driver.findElement(By.xpath("//*[@class='nav-link btn btn-primary']")).click();
	}

}

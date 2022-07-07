package leafground;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Alerts {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.leafground.com/");

		WebElement alertlink = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div/ul/li[9]/a"));
		alertlink.click();

		WebElement alertbutton = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div/div/button"));
		alertbutton.click();
		Alert Alert = driver.switchTo().alert();
		Alert.accept();
		
		WebElement Confirmbutton = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/button"));
		Confirmbutton.click();
		Alert Confirmalert = driver.switchTo().alert();
		Confirmalert.dismiss();
		
		WebElement promptbutton = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/button"));
		promptbutton.click();
		Alert promptalert = driver.switchTo().alert();
		promptalert.sendKeys(" example");
		promptalert.accept();
		
		WebElement linebreak = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div/div/button"));
		linebreak.click();
		Alert linebreakconfirm = driver.switchTo().alert();
		linebreakconfirm.accept();
		
	}

}

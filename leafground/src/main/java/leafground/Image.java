package leafground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Image {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.leafground.com/");

		WebElement hyperlink = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div/ul/li[4]/a"));
		hyperlink.click();
		
		WebElement clickimage = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div/div/img"));
		clickimage.click();
		driver.navigate().back();
		
		WebElement brokenimage = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div/div/img"));
		if (brokenimage.getAttribute("naturalWidth").equals("0")) {
			System.out.println("The image is Broken");
		}else {
			System.out.println("The image is not broken");
		}
	}

}

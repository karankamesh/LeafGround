package leafground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextBox {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.leafground.com/");
		
		WebElement edit = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div/ul/li[1]"));
		edit.click();
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("example@email.com");
		
		WebElement append = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/input"));
		append.sendKeys(" Example");
		
		WebElement gettext = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/input"));
		String value = gettext.getAttribute("value");
		System.out.println("The Default value is  "+value);

		WebElement clear = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div/div/input"));
		clear.clear();	
		
		WebElement enabled = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[5]/div/div/input"));
		boolean disabled = enabled.isEnabled();
		System.out.println("The Textbox is enabled  "+disabled);
	}

}

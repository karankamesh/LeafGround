package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Udemy_1_Checkbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium Tools\\Firefox Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		System.out.println("The checkbox is selected :"+driver.findElement(By.id("checkBoxOption1")).isSelected());
		driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println("The checkbox is selected :"+driver.findElement(By.id("checkBoxOption1")).isSelected());
		driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println("The checkbox is selected :"+driver.findElement(By.id("checkBoxOption1")).isSelected());

		List<WebElement> size = driver.findElements(By.xpath("//*[@type='checkbox']"));
		int total = size.size();
		System.out.println("Number of Checkbox Present in the Webpage :"+total);



	}

}

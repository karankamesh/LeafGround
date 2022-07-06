package leafground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.leafground.com/");

		WebElement hyperlink = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div/ul/li[5]"));
		hyperlink.click();
		
		WebElement index = driver.findElement(By.id("dropdown1"));
		Select byindex = new Select(index);
		byindex.selectByIndex(4);
		
		WebElement text = driver.findElement(By.name("dropdown2"));
		Select bytext = new Select(text);
		bytext.selectByVisibleText("UFT/QTP");
		
		WebElement value = driver.findElement(By.id("dropdown3"));
		Select byvalue = new Select(value);
		byvalue.selectByValue("2");
		
		WebElement send = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[5]/select"));
		send.sendKeys("Selenium");
		
		WebElement multiselect = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[6]/select"));
		Select mselect = new Select(multiselect);
		mselect.selectByIndex(0);
		mselect.selectByIndex(1);
		mselect.selectByIndex(2);
		
		WebElement dropdowns = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/select"));
		Select total = new Select(dropdowns);
		int totaldrop =  total.getOptions().size();
		System.out.println(totaldrop);

	}

}

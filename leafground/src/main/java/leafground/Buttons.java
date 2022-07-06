package leafground;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Buttons {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.leafground.com/");

		WebElement edit = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div/ul/li[2]/a"));
		edit.click();

		WebElement homebutton = driver.findElement(By.xpath("//*[@id=\"home\"]"));
		homebutton.click();
		driver.navigate().back();

		WebElement position = driver.findElement(By.id("position"));
		Point location =  position.getLocation();
		int Xaxis = location.getX();
		int Yaxis = location.getY();
		System.out.println("The Xaxis is "+Xaxis +" " +"The Yaxis is "+Yaxis );
		
		WebElement colour = driver.findElement(By.id("color"));
		String buttoncolour = colour.getCssValue("background-color");
		System.out.println(buttoncolour);
		
		WebElement Size = driver.findElement(By.id("size"));
		int height = Size.getSize().getHeight();
		int width = Size.getSize().getWidth();
		System.out.println("The height of button is "+height +" "+"The Width of the button is "+width);

	}

}

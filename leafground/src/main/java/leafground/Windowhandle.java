package leafground;


import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windowhandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.leafground.com/");

		WebElement alertlink = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div/ul/li[11]/a"));
		alertlink.click();

		String mainwindow = driver.getWindowHandle();
		WebElement window1 = driver.findElement(By.id("home"));
		window1.click();

		Set<String> windows = driver.getWindowHandles();
		for (String newwindow : windows) {
			driver.switchTo().window(newwindow);
		}
		driver.close();
		driver.switchTo().window(mainwindow);


		WebElement window2 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/button"));
		window2.click();
		Set<String> multiwindow = driver.getWindowHandles();
		int totalwindows = multiwindow.size();
		System.out.println("Total No.of Windows "+totalwindows);
		for (String newwindow2 : multiwindow) {
			if (!newwindow2.equals(mainwindow)) {
				driver.switchTo().window(newwindow2);
			}
		}
		driver.close();
		
		//for (String newwindow2 : multiwindow) {
			//if (!newwindow2.equals(mainwindow)) {
				//driver.switchTo().window(newwindow2);
			//}
		//}
		//driver.close();
		//driver.switchTo().window(mainwindow);
		//Set<String> multiwindow2 = driver.getWindowHandles();
		//for (String newwindow3 : multiwindow2) {
			//driver.switchTo().window(newwindow3);
		//}
		//driver.close();


		driver.switchTo().window(mainwindow);
		WebElement window3 = driver.findElement(By.id("color"));
		window3.click();
		Set<String> multiwindow3 = driver.getWindowHandles();
		for (String newwindow3 : multiwindow3) {
			if (!newwindow3.equals(mainwindow)) {
				driver.switchTo().window(newwindow3);
				driver.close();
			}
		}
		driver.switchTo().window(mainwindow);
		driver.close();
	}


}



package leafground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.leafground.com/");

		WebElement RadioButton = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div/ul/li[6]/a"));
		RadioButton.click();

		WebElement radio1 = driver.findElement(By.id("yes"));
		radio1.click();

		WebElement selected1 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/input[1]"));
		WebElement selected2 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/input[2]"));
		boolean isSelected1 = selected1.isSelected();
		boolean isSelected2 = selected2.isSelected();
		if (isSelected1==true) {
			System.out.println("Unchecked is Checked");
		}
		if (isSelected2==true) {
			System.out.println("Checked is Checked");
		}

		WebElement Age = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/input[1]"));
		boolean Selected = Age.isSelected();
		if (Selected==false) {
			Age.click();
		}

	}

}

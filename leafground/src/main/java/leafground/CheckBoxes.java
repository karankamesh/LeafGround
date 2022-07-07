package leafground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxes {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.leafground.com/");

		WebElement RadioButton = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div/ul/li[7]/a"));
		RadioButton.click();
		
		WebElement java = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/input[1]"));
		java.click();
		WebElement sql = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/input[3]"));
		sql.click();
		WebElement cpp = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/input[5]"));
		cpp.click();
		
		WebElement checked = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/input"));
		boolean selected = checked.isSelected();
		if (selected==true) {
			System.out.println("Selenium is Selected");
		}else {
			System.out.println("Selenium is not selected");
		}
		
		WebElement NotSelected = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/input[1]"));
		WebElement Selected = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/input[2]"));
		boolean DSelect1 = NotSelected.isSelected();
		boolean DSelect2 = Selected.isSelected();
		if (DSelect1==true) {
			NotSelected.click();
		}else if (DSelect2==true) {
			Selected.click();
		}
		
		WebElement option1 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/input[1]"));
		option1.click();
		WebElement option2 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/input[2]"));
		option2.click();
		WebElement option3 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/input[3]"));
		option3.click();
		WebElement option4 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/input[4]"));
		option4.click();
		WebElement option5 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/input[5]"));
		option5.click();
		WebElement option6 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/input[6]"));
		option6.click();

	}

}

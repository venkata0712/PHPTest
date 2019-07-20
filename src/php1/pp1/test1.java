package php1.pp1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("http://13.59.84.32/PHPTest/index.php");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("ASD");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("rohit");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input")).sendKeys("Virat");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[4]/td[2]/input")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).sendKeys("mail@mail.com");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[7]/td[2]/input[1]")).sendKeys(" ");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[8]/td/input[1]")).sendKeys(" ");
		
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[8]/td/input[2]")).click();
		//driver.close();
	}
	
	
}


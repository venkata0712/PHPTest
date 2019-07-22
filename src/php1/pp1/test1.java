package php1.pp1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		ChromeOptions chromeOptions = new ChromeOptions();
//		chromeOptions.addArguments("--headless");
//		chromeOptions.addArguments("--no-sandbox");
//		ChromeDriver driver=new ChromeDriver();

		chromeOptions.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors");  
		WebDriver driver = new ChromeDriver(chromeOptions);  
		
		Thread.sleep(2000);
		driver.get("http://172.31.35.123/PHPTest/index.php");
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
		System.out.println("Passed");
		driver.quit();
		
//		driver.get("https://google.com");
//
//		Thread.sleep(1000);
//
//		if (driver.getPageSource().contains("I'm Feeling Lucky")) {
//			System.out.println("Pass");
//		} else {
//			System.out.println("Fail");
//		}
//		driver.quit();
	}


}


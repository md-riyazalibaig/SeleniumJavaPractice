package assignments;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AssignmentOne {

	public static void main(String[] args) throws Exception {
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder = 'First Name']")).sendKeys("xtyyy");
		driver.findElement(By.xpath("//input[@placeholder = 'Last Name']")).sendKeys("ythgh");
		driver.findElement(By.xpath("//textarea[@rows = '3']")).sendKeys("Huzurabad");
		driver.findElement(By.xpath("//input[@type = 'email']")).sendKeys("asmnn43@gmail.com");
		driver.findElement(By.xpath("//input[@type = 'tel']")).sendKeys("9876655555");
		
		WebElement radio1 = driver.findElement(By.xpath("//input[@value = 'Male']"));
		radio1.click();
		WebElement checkbox2 = driver.findElement(By.xpath("//input[@Value = 'Movies']"));
		checkbox2.click();
		
		driver.findElement(By.xpath("//li/a[text()='Arabic']")).isSelected();
		WebElement element = driver.findElement(By.xpath("//select[@id = 'Skills']"));
		
		Select select2 = new Select(element);
		select2.selectByVisibleText("Android");
		WebElement firstEle = select2.getFirstSelectedOption();
		System.out.println("first element = " + firstEle.getText());
		
		WebElement element1 = driver.findElement(By.xpath("//select[@id = 'country']"));
		Select select3 = new Select(element1);
		select3.selectByVisibleText("Australia");
		WebElement country = select2.getFirstSelectedOption();
		System.out.println("country element = " + country.getText());
		
		Select Year = new Select(driver.findElement(By.xpath("//select[@id = 'yearbox']")));
		Year.selectByVisibleText("2012");
		Select Month = new Select(driver.findElement(By.xpath("//select[@placeholder = 'Month']")));
		Month.selectByVisibleText("May");
		Select Day = new Select(driver.findElement(By.xpath("//select[@id = 'daybox']")));
		Day.selectByVisibleText("20");
		
		driver.findElement(By.xpath("//input[@id = 'firstpassword']")).sendKeys("Akhila@443");
		driver.findElement(By.xpath("//input[@id = 'secondpassword']")).sendKeys("Akhila@443");
		driver.findElement(By.xpath("//button[@id = 'submitbtn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id = 'Button1']")).click();
		
		driver.quit();
	}
}

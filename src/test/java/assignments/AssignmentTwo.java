package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentTwo {

	public static void main(String[] args) throws Exception {
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[@onclick = 'alertbox()']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//a[@href = '#CancelTab']")).click();
		driver.findElement(By.xpath("//button[@onclick = 'confirmbox()']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//a[@href = '#Textbox']")).click();
		driver.findElement(By.xpath("//button[@onclick = 'promptbox()']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		// driver.switchTo().alert().dismiss();
		
		driver.quit();
	}
}
package com.example.test.demojenkins;



import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


//@SpringBootTest
public class DemojenkinsApplicationTests {

	@Test
	public void contextLoads() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",  "C:\\DevStudio\\Installs\\gecko\\gecko 29\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);

		System.out.println("hii");



	}

}

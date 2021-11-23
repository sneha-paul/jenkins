package com.example.test.demojenkins;



import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


//@SpringBootTest
public class DemojenkinsApplicationTests {

	@Test
	public void contextLoads() throws InterruptedException
	{
		/*System.setProperty("webdriver.chrome.driver",  "C:\\DevStudio\\Installs\\gecko\\gecko 29\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();*/
		System.setProperty("webdriver.chrome.driver","C:\\DevStudio\\Installs\\chrome\\chrome96\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		System.out.println("hii");

	}

}

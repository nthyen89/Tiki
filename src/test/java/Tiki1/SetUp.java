package Tiki1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetUp {

	static WebDriver driver = null;

	public static void setUp() {

		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(CommonConstant.TIKI);
	}

}

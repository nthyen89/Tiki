package Tiki1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonAction extends SetUp {

	public static void waitForVisible(String xpath) {

		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));

	}

	public static void typeText(String xpath, String value) {

		WebElement element = driver.findElement(By.xpath(xpath));
		element.clear();
		element.sendKeys(value);
	}

	public static void clickElement(String xpath) {

		WebElement element = driver.findElement(By.xpath(xpath));
		waitForVisible(xpath);
		element.click();

	}

	public static void clickLogo(String logo_xpath) {
		CommonAction.waitForVisible(logo_xpath);
		CommonAction.clickElement(logo_xpath);
	}

}

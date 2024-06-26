

import static org.testng.Assert.fail;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GSearchTestCase {
  private WebDriver driver;
  //private String baseUrl;
 // private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
 // private JavascriptExecutor js;

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
   // System.setProperty("webdriver.chrome.driver", "");
    driver = new ChromeDriver();
  //  baseUrl = "https://www.google.com/";
    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
   // js = (JavascriptExecutor) driver;
  }

  @Test
  public void testGSearchTestCase() throws Exception {
    driver.get("https://www.google.com/");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.findElement(By.id("APjFqb")).click();
    driver.findElement(By.id("APjFqb")).clear();
    driver.findElement(By.id("APjFqb")).sendKeys("test search");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sign in'])[1]/following::div[2]")).click();
    driver.findElement(By.xpath("//div[4]/center/input")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

	/*
	 * private boolean isElementPresent(By by) { try { driver.findElement(by);
	 * return true; } catch (NoSuchElementException e) { return false; } }
	 */

	/*
	 * private boolean isAlertPresent() { try { driver.switchTo().alert(); return
	 * true; } catch (NoAlertPresentException e) { return false; } }
	 */
	/*
	 * private String closeAlertAndGetItsText() { try { Alert alert =
	 * driver.switchTo().alert(); String alertText = alert.getText(); if
	 * (acceptNextAlert) { alert.accept(); } else { alert.dismiss(); } return
	 * alertText; } finally { acceptNextAlert = true; } }
	 */
}

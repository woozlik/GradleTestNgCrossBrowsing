import org.testng.Assert;
import org.testng.annotations.Test;

import static org.openqa.selenium.By.cssSelector;

public class SuiteOfTest extends BaseTest {
    @Test
    public void css_locators() throws InterruptedException {
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        cssSelector("input[type='search']").findElement(driver).sendKeys("Software");
        driver.findElement(cssSelector("input[id='searchButton']")).click();
        Thread.sleep(5000);
        Assert.assertEquals("Software", driver.findElement(cssSelector("h1[id='firstHeading']")).getText());
    }
}

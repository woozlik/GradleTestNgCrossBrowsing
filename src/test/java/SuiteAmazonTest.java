import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class SuiteAmazonTest extends BaseTest {
    @Test
    public void AmazonTitleTest1() {
        String baseUrl = "https://www.amazon.com/";
        String expectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        String actualTitle = "";
        // launch Chrome and direct it to the Base URL
        driver.get(baseUrl);
        // get the actual value of the title
        actualTitle = driver.getTitle();

        AssertJUnit.assertEquals(expectedTitle, actualTitle);
    }

    @Test
    public void AmazonTitleTest2() {
        String baseUrl = "http://static.javadoc.io/org.testng/testng/6.11/org/testng/AssertJUnit.html";
        String expectedTitle = "AssertJUnit";
        String actualTitle = "";
        // launch Chrome and direct it to the Base URL
        driver.get(baseUrl);
        // get the actual value of the title
        actualTitle = driver.getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);

     }
}

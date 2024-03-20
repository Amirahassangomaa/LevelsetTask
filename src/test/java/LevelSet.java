import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LevelSet {
    WebDriver driver;
    Homepage homepage;
    Document document;
    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        homepage = new Homepage(driver);
        document = new Document(driver);
    }
    @Test
    public void levelSetHomePage() {
        homepage.navigateToHomePage();
        homepage.clickOnButtonGetPaid();
    }
    @Test
    public void levelSetDocumentPage() {
        document.navigateToDocumentPage();
        document.clickOnButtonReleaseALien();
        Assert.assertEquals( "$149", document.getDocPrice() ,"the price is not as expected");
    }
    @AfterTest
    public void closeDriver() { driver.quit(); }
}

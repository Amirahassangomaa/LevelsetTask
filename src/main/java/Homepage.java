import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;



public class Homepage {

    String url = "https://www.levelset.com/";
    WebDriver driver ;
    By getpaidbutton = By.xpath("//div/nav/ul/li[8]/a");
    Document doc= new Document(driver);
    public Homepage (WebDriver d)
    {
       this.driver=d;
    }

    public void navigateToHomePage()
    {
        driver.get(url);
    }

    public void clickOnButtonGetPaid()
    {
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(70));
       wait.until(ExpectedConditions.visibilityOfElementLocated(getpaidbutton));

       driver.findElement(getpaidbutton).click();
       driver.findElement(getpaidbutton).click();

       WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(80));
       wait.until(ExpectedConditions.visibilityOfElementLocated(doc.ReleaseALienButton));
    }



}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Document {

    WebDriver driver ;
    String urlDocument ="https://app.levelset.com/wizard/SelectDocument/?_ga=2.80848791.1667112815.1710677534-1847480954.1710677534";
    By ReleaseALienButton = By.xpath("//div[@class=\'section\']/div[4]/div");
    By ReleaseALienPrice = By.xpath("//div[@class=\"section\"]/div[4]/div/div/span");
    public Document (WebDriver d)
    {
        this.driver=d;
    }

    public void navigateToDocumentPage()
    {
        driver.get(urlDocument);
    }
    public void clickOnButtonReleaseALien()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(80));
        wait.until(ExpectedConditions.visibilityOfElementLocated(ReleaseALienButton));

        driver.findElement(ReleaseALienButton).isDisplayed();
        driver.findElement(ReleaseALienButton).click();

        WebElement text =driver.findElement(ReleaseALienButton);
        Assert.assertTrue ( text.getText().contains("Release a Lien"));
    }

    public String getDocPrice()
    {
        WebElement docprice = driver.findElement( ReleaseALienPrice);
          String releasealiandocmentprice =docprice.getText();
          return releasealiandocmentprice;
    }


}



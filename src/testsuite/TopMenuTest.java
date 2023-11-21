package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest {

    //Declaring BaseURL
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToComputerPageSuccessfully() throws InterruptedException {
        //find Computers link and click on it
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Computers ']")).click();
        Thread.sleep(5000);
        //verify computers text
        String expected = "Computers";
        String actual = driver.findElement(By.xpath("//div[@class = 'page-title']")).getText();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() throws InterruptedException {
        //find electronics link and click on it
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Electronics ']")).click();
        Thread.sleep(5000);
        //verify electronics text
        String expected = "Electronics";
        String actual = driver.findElement(By.xpath("//div[@class = 'page-title']")).getText();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() throws InterruptedException {
        //find apparel link and click on it
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Apparel ']")).click();
        Thread.sleep(5000);
        //verify Apparel text
        String expected = "Apparel";
        String actual = driver.findElement(By.xpath("//div[@class = 'page-title']")).getText();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() throws InterruptedException {
        //find Digital downloads link and click on it
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Digital downloads ']")).click();
        Thread.sleep(5000);
        //verify Digital downloads text
        String expected = "Digital downloads";
        String actual = driver.findElement(By.xpath("//div[@class = 'page-title']")).getText();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() throws InterruptedException {
        //find Books link and click on it
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Books ']")).click();
Thread.sleep(5000);
        //verify Books text
        String expected = "Books";
        String actual = driver.findElement(By.xpath("//div[@class = 'page-title']")).getText();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() throws InterruptedException {
        //find Jewelry link and click on it
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Jewelry ']")).click();
        Thread.sleep(5000);
        //verify Jewelry text
        String expected = "Jewelry";
        String actual = driver.findElement(By.xpath("//div[@class = 'page-title']")).getText();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() throws InterruptedException {
        //find Gift Cards link and click on it
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Gift Cards ']")).click();
        Thread.sleep(5000);
        //verify Gift Cards text
        String expected = "Gift Cards";
        String actual = driver.findElement(By.xpath("//div[@class = 'page-title']")).getText();
        Assert.assertEquals(expected,actual);
    }

    @After
    public void tearDown(){
        closeBrowser();
    }

}
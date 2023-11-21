package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
// //ul[@class = 'top-menu notmobile']//a[text() = 'Computers ']

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        /**
         * * click on the ‘Login’ link
         * * Verify the text ‘Welcome, Please Sign In!’
         */

        // find the login link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        String expectedText = "Welcome, Please Sign In!";
        String actualText = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("Not redirected to login page", expectedText, actualText);

    }

    @Test
    public void verifyThatUserShouldLoginSuccessfullyWithValidCredentials() {
        /**
         * * click on the ‘Login’ link
         * * Enter valid username
         * * Enter valid password
         * * Click on ‘LOGIN’ button
         * * Verify the ‘Log out’ text is display
         */
        // click on the ‘Login’ link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        // Find the email field element
        WebElement emailField = driver.findElement(By.id("Email"));

        // Type/enter the email address to the email field element
        emailField.sendKeys("casinoroyaljamesbond7@gmail.com");

        // Find the password field element & Type the password to the password field element
        driver.findElement(By.id("Password")).sendKeys("Bond007%");
        // click on login button
        driver.findElement(By.xpath("//button[text() ='Log in']")).click();
        String expectedText = "Log out";
        String actualText = driver.findElement(By.className("ico-logout")).getText();
        Assert.assertEquals("Not redirected to login page", expectedText, actualText);

    }


    @Test
    public void verifyTheErrorMessage() {
        // find log in link element
        WebElement loginLink = driver.findElement(By.linkText("Log in"));

        // click on Login Link Element
        loginLink.click();

        // Find the email field element
        WebElement emailField = driver.findElement(By.id("Email"));

        // Type/enter the email address to the email field element
        emailField.sendKeys("Prime123@gmail.com");

        // Find the password field element & Type the password to the password field element
        driver.findElement(By.id("Password")).sendKeys("Prime123");
        // click on login button
        driver.findElement(By.xpath("//button[text() ='Log in']")).click();
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualMessage = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
        Assert.assertEquals(expectedMessage,actualMessage);
    }

//    @After
//    public void tearDown() {
//        closeBrowser();
//    }

}
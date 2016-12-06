package edu.tsenzuk.selenium_automation;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
// import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
// import org.openqa.selenium.opera.*;
import org.junit.*;
import java.util.List;

public class BookingTest{
    private static WebDriver driver;

    @BeforeClass
    public static void init() throws Exception {
        System.out.println("TESTCASE START");
        //TODO: add maven task to download from https://github.com/mozilla/geckodriver/releases
        System.setProperty("webdriver.gecko.driver", "/home/tsz/Downloads/geckodriver");
        BookingTest.driver = new FirefoxDriver();
    }

    @Before
    public void setUp() throws Exception {
        BookingTest.driver.get("http://www.booking.com");
        System.out.println("TEST START");
    }

    @Ignore
    @Test
    public void open() {
        WebElement input = BookingTest.driver.findElement(BookingHomePage.INPUT_SEARCH);
        Assert.assertNotNull(input);
        input = BookingTest.driver.findElement(BookingHomePage.LIST_SEARCH_AUTOCOMPLETE);
        Assert.assertNotNull(input);
        input = BookingTest.driver.findElement(BookingHomePage.BUTTON_FROM_DROPDOWN);
        Assert.assertNotNull(input);
    }

    @Test
    public void search() {


        WebElement input = BookingTest.driver.findElement(BookingHomePage.INPUT_SEARCH);
        input.sendKeys("New York");
        WebDriverWait wait = new WebDriverWait(BookingTest.driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(BookingHomePage.LIST_SEARCH_AUTOCOMPLETE_ELEMENT));
        input.sendKeys(Keys.DOWN);
        input.sendKeys(Keys.TAB);
        input.sendKeys(Keys.TAB);
        input.sendKeys(Keys.TAB);
        
        WebElement inputCheckin = BookingTest.driver.findElement(BookingHomePage.INPUT_CHECKIN_YEAR);
        inputCheckin.sendKeys("2016");
        inputCheckin = BookingTest.driver.findElement(BookingHomePage.INPUT_CHECKIN_MONTH);
        inputCheckin.sendKeys("12");
        inputCheckin = BookingTest.driver.findElement(BookingHomePage.INPUT_CHECKIN_DAY);
        inputCheckin.sendKeys("20");
        inputCheckin.sendKeys(Keys.TAB);
        
        WebElement inputCheckout = BookingTest.driver.findElement(BookingHomePage.INPUT_CHECKOUT_YEAR);
        inputCheckout.sendKeys("2016");
        inputCheckout = BookingTest.driver.findElement(BookingHomePage.INPUT_CHECKOUT_MONTH);
        inputCheckout.sendKeys("12");
        inputCheckout = BookingTest.driver.findElement(BookingHomePage.INPUT_CHECKOUT_DAY);
        inputCheckout.sendKeys("25");
        
        input.click();
        input.sendKeys(Keys.RETURN);

        try{
            Thread.sleep(30000);
        } catch (Exception e) {}
    }

    @AfterClass
    public static void tearDown() throws Exception {
        BookingTest.driver.quit();
    }
}
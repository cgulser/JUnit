package day07_assertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class C07_DropDownSoru1 {
    static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");


    }

    @AfterClass

    public static void tearDown(){
        driver.close();
    }

    @Test
    public void test01(){
        WebElement ddm = driver.findElement(By.xpath("//select[@id='searchDropDownBox']"));

        Select select=new Select(ddm);

        int actualSize = select.getOptions().size();
        int expectedSize =45;

        Assert.assertTrue("Kategori sayisi uyusmuyor",actualSize == expectedSize);

    }
    @Test
    public void test02(){
        WebElement ddm = driver.findElement(By.xpath("//select[@id='searchDropDownBox']"));

        Select select=new Select(ddm);


    }
}

package day06_radioButton_checkBox;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_Deneme {

    WebDriver driver;


    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @After
    public void tearDown() {
        //driver.close();
    }

    @Test
    public void test01() {

        //  1. http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com");


        //  2. Signin buttonuna tiklayin
        driver.findElement(By.xpath("//button[@class='signin btn btn-info']")).click();
        //  3. Login alanine “username” yazdirin
        driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("username");
        //  4. Password alanine “password” yazdirin
        driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("password");
        //  5. Sign in buttonuna tiklayin
        driver.findElement(By.xpath("//input[@value='Sign in']")).click();
        driver.navigate().back();
        //  6. Pay Bills sayfasina gidin
        //  7. amount kismina yatirmak istediginiz herhangi bir miktari yazin
        //  8. tarih kismina “2020-09-10” yazdirin
        //  9. Pay buttonuna tiklayin
        //  10. “The payment was successfully submitted.” mesajinin ciktigini control edin


    }


}

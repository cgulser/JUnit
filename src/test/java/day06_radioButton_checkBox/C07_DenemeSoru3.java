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

public class C07_DenemeSoru3 {

    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @After
    public void tearDown() {
         driver.close();
    }

    @Test
    public void test01(){
        //  1. “https://www.saucedemo.com” Adresine gidin
        driver.get("https://www.saucedemo.com");
        //          2. Username kutusuna “standard_user” yazdirin
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        //  3. Password kutusuna “secret_sauce” yazdirin
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        //  4. Login tusuna basin
        driver.findElement(By.xpath("//input[@data-test='login-button']")).click();

        //  5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
        WebElement ilkUrun=driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        System.out.println(ilkUrun.getText());
        ilkUrun.click();
        //  6. Add to Cart butonuna basin
        WebElement add=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        add.click();
        //  7. Alisveris sepetine tiklayin
        WebElement sepet=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        sepet.click();
        //  8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
        WebElement sepetteMi= driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        System.out.println(sepetteMi.isDisplayed());
        //  9. Sayfayi kapatin

    }


}

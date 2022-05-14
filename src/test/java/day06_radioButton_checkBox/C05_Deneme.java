package day06_radioButton_checkBox;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import java.time.Duration;

public class C05_Deneme {
    WebDriver driver;
    //1. Bir class oluşturun : RadioButtonTest
    //2. Gerekli yapiyi olusturun ve aşağıdaki görevi tamamlayın.
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @After
    public void tearDown(){ driver.close();}
    @Test
    public void test01() throws InterruptedException {
        //https://www.facebook.com adresine gidin
        driver.get("https://www.facebook.com");
        Actions action = new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN).build().perform();


        //Cookies’i kabul edin
        driver.findElement(By.xpath("//button[@title='Nur erforderliche Cookies erlauben']")).click();

        //“Create an Account” button’una basin
        driver.findElement(By.xpath("//a[@rel='async']")).click();

        //“radio buttons” elementlerini locate edin
        WebElement femaleButton=driver.findElement(By.xpath("//input[@value='1']"));
        WebElement maleButton=driver.findElement(By.xpath("//input[@value='2']"));
        WebElement customButton=driver.findElement(By.xpath("//input[@value='-1']"));

        //Secili degilse cinsiyet butonundan size uygun olani secin
        Thread.sleep(3000);
        if (!maleButton.isSelected()){
            maleButton.click();
        }
        Thread.sleep(3000);
    }
}

package day05_JUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_BeforeAfter {
    WebDriver driver;
@Before
public void setup(){
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
}

@After
public void tearDown() {
    driver.close();
}

@Test
public void test1() { driver.get("https://www.amazon.com");}
@Test
public void test2() { driver.get("https://www.facebook.com");}
@Test
public void test3() { driver.get("https://www.techproeducation.com");}

}

package day13_cookies_webTables;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class C04_Deneme extends TestBase {
    //Bir Class olusturun D19_WebtablesHomework
    //1. “https://demoqa.com/webtables” sayfasina gidin
    //2. Headers da bulunan department isimlerini yazdirin
    //3. sutunun basligini yazdirin
    //4. Tablodaki tum datalari yazdirin
    //5. Tabloda kac cell (data) oldugunu yazdirin
    //6. Tablodaki satir sayisini yazdirin
    //7. Tablodaki sutun sayisini yazdirin
    //8. Tablodaki 3.kolonu yazdirin
    //9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin
    //10. Page sayfasinda bir method olusturun, Test sayfasindan satir ve sutun sayisini
    //girdigimde bana datayi yazdirsin
    @Test
    public void test01() {
        driver.get("https://demoqa.com/webtables");
        //2. Headers da bulunan department isimlerini yazdirin
        List<WebElement> liste = driver.findElements(By.xpath("//div[@class='rt-tr']/div"));
        System.out.println(liste.size());
        int count = 0;
        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i).getText().equals("Department")) {
                count = i;
            }
        }
        List<WebElement> dpartmanListe = driver.findElements(By.xpath("//div[@class='rt-tr-group']/div/div[" + (count + 1) + "]"));
        for (WebElement each : dpartmanListe
        ) {
            System.out.println(each.getText());
        }
    }
}


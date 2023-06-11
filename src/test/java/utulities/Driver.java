package utulities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {
    /*
Testleri calistirdigimizda her seferinde yeni driver olusturdugu icin her test methodu icin yeni
bir pencere (driver) aciyor.Eger driver'a bir deger atanmamissa yani driver==null ise
bir kere driver'i calistir diyerek bir kere if icini calistiracak ve driver artik bir kere
 calistigi icin ve deger atandigi icin null olmayacak ve direk return edecek ve diger testlerimiz
 ayni pencerede (driver) uzerinde calisacak

 */

    /*
    Configuration.propertiesde browser olarak ne sectiysek onu calıstırır
     */
    private Driver(){//bu constructur private yapmamızın sebebi obje olusturarak ulasılmamısı icin

    }

    static WebDriver driver;
    public static WebDriver getDriver(){
        if (driver==null) {

            switch (ConfigReader.getProperty("browser")){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "opera":
                    WebDriverManager.safaridriver().setup();
                    driver=new SafariDriver();
                    break;
                case "firefox" :
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                case "headless-chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        return driver;
    }

    public static void closeDriver(){
        //eğer null ise ve kapatmaya çalısırsanız exception fırlatır.Bu yüzden driver!=null kullanıldı.
        if (driver!=null) { //driver'a deger atanmıssa
            driver.close();
            driver=null;//kapandıktan sonra, yeni driver açıldığında getDriver methodunun doğru çalışması için
        }
    }

    public static void quitDriver(){
        if (driver!=null)
            driver.quit();
        driver=null;

    }
}

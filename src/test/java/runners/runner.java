package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@gp6", // iki tag'ı aynı anda çalıştırmak isterseniz "@gp1 or @gp2"
        dryRun = false

)
public class runner {
     /*
     Runner Class'ı TestNG'deki XMl mantığı ile çalışır. Çalıştırmak istediğimiz senartolara tag belirtiriz
    ve belirttiğimiz tag'ları çalıştırır. XMl deki gibi istediğimiz testleri çalıştırmak için kullanırız.
    Runner class body'si boştur ve runner class'ını ekleyeceğimiz notasyonlar aktive eder.
     Bu class'da kullanacağımız 2 adet notasyon vardır
    -@RunWith(Cucumber.class)  notasyonu Runner class'ına çalışma özelliği ekler.
    Bu notasyon olduğu için Cucumber frameworkumuzde Junit kullanmayı tercih ederiz
    -@CucumberOptions notasyonu içinde
    features : Runeer dosyasının feature dosyasını nereden bulacağını tarif eder
    glue : stepDefinitions yolunu belirtiriz
    tags : Hangi tag'i çalıştırmak istiyorsak onu belli eder

    dryRun : iki seçenek vardır
    dryRun = true; dersek testimizi çalıştırmadan eksik adımları bize verir
    dryRun = false; testlerimizi driver ile çalıştırır.
     */

    //not; runner classı butun feacare klasürünü bütün stepDefinitions pacgege ile birleştiriyor ve calıstırıyor
    //yani bu stepDefinitionsdan calıstır yazılmıyor
}
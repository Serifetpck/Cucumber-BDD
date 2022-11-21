package utulities;



import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class ConfigReader {
    /*
    basta Properties classından properties objesi olusturuyoruz.Bu objeyele static blok önce calıstıgından  configuration.propertiesdeki değere okuması icin fileinput üzerinden
    yolu göstermemiz ve okuduğu tüm değerleri propertiese yükler ve istedigimiz keye karsılık gelen value bize döndürür
    Static blok icinde yazmamızın sebebi static blok class calıstıgı sürece sadece bir kez calısır
    ama methodun icerisinde yazılırsa her seferinde yükleme yapmak zorunda kalır
     */

   public static Properties properties;
    static {
        // Static blok Her method'dan önce çalışır
        String dosyaYolu="configuration.properties";
        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
            properties=new Properties();
            properties.load(fis);
            // fis'in okuduğu bilgileri properties'e yükledi



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    @Test
    public static String getProperty(String key){

             /*
        test metodundan yolladığımız string key değerini alıp
        Properties class'ından getProperty() methodunu kullanarak
        bu key'e ait value'yu bize getirir
         */


       return properties.getProperty(key);
    }


}

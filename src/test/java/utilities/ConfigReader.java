package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static Properties properties;

    static {
        String dosyayolu="configuration.properties";
        try {
            FileInputStream fis=new FileInputStream(dosyayolu);
       //fis dosyayolunu tanımladığımız configuration.properties dosyasını okudu
        properties=new Properties();
        properties.load(fis);// fis in okuduğu bilgileri properties e yükledi

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key){
/*
test methodundan yolladığımız String key değerini alıp
Properties class ından getProperty() method unu kullanarak
bu key e ait value u bize getirdi
 */


        return  properties.getProperty(key);
    }
}

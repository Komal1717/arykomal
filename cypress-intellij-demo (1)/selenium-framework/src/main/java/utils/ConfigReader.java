package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    private static Properties prop;

    public static void initProperties() {
        try {
            FileInputStream ip = new FileInputStream("src/main/resources/config.properties");
            prop = new Properties();
            prop.load(ip);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return prop.getProperty(key);
    }
}

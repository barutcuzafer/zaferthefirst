package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties;

/*
    public void ConfigurationReader2() throws IOException {
        String path="configuration.properties";
        FileInputStream inputStream=new FileInputStream(path);
        properties=new Properties();
        properties.load(inputStream);
        inputStream.close();
    }
    public static String get(String keyName) throws IOException {
        return properties.getProperty(keyName);

    }

 */



    static {

        try {
            //what file to read
            String path = "configuration.properties";
            //read the file into java, finds the file using the string path
            FileInputStream input = new FileInputStream(path);
            //properties---->class that store properties in key/value format
            properties = new Properties();
            //the values from the file input is loaded/fed in to te properties object
            properties.load(input);

            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String get(String keyName){
        return properties.getProperty(keyName);
    }


}

package com.utilities;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class ConfigurationReader {
    //1- create the object of Properties
    private static Properties properties= new Properties();

    static{
        try {
            //2- we need to open the file in java memory
            FileInputStream file = new FileInputStream("configuration.properties");

            //3- load the properties object using FileInput stream object

            InputStreamReader reader = new InputStreamReader(file, StandardCharsets.UTF_8);
            properties.load(reader);

            //close the file
            file.close();
        } catch (IOException e) {
            System.out.println("file not found in the configurationreader class");
        }
    }

    public static String getProperty(String keyword){

        return properties.getProperty(keyword);
    }
}

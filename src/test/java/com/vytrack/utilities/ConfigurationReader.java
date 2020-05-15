package com.vytrack.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties;

    static {
        try (FileInputStream fileInputStream = new FileInputStream("configuration.properties"))
         {
            //read file in java. we need to pass the path of the file
           // FileInputStream fileInputStream = new FileInputStream("configuration.properties");
            // we can user this path /Users/tahimna/IdeaProjects/vytrackautomation/configuration.properties

            //initialize the object
            properties = new Properties();
            properties.load(fileInputStream);
            //loads contents of the file properties object
            fileInputStream.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
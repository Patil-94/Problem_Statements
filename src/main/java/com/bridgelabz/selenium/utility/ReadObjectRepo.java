package com.bridgelabz.selenium.utility;

import com.bridgelabz.selenium.base.BaseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadObjectRepo extends BaseClass {


    public static String filePath = "C:/Users/sachin/IdeaProjects/AutoITLinkedin/src/test/resources/objectrepofile.properties";

    public static String getLocatorProperty(String propertyFilePath, String key) throws IOException {

        String property = "";

        Properties properties = new Properties();// create object of prop.class
        try {

            properties.load(new FileInputStream(propertyFilePath));

            //getProperty fetches the value of target key from the properties file

            property = properties.getProperty(key);

        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
        return property;
    }
}

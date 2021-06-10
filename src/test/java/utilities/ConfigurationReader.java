package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    /*
    We will create a re-usable method that will be reading from configuration.reader file
     */

    // #1- Create properties object
    private  static  Properties properties = new Properties();

    static {

        // #2- Load the file into FileInputString

        try {
            FileInputStream file = new FileInputStream("configuration.properties");

            //#3- load properties object with the file (configuration.properties)
            properties.load(file);

            //close the file
            file.close();

        } catch (IOException e) {

            System.out.println("File not found in Configuration properties.");
        }
    }
    //USE THE ABOVE CREATED LOGIC TO CREATE A RE-USABLE STATIC METHOD
    public static String getProperty(String keyWord){
        return properties.getProperty("keyWord");
    }
}
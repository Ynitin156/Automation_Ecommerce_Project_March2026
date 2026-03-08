package utils_Ekart;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader 
{
	Properties prop;

    public ConfigReader() 
    {
        try 
        {
            // Path to your config.properties file in src/main/resources
            FileInputStream fis = new FileInputStream("./src/main/resources/Config.properties");
            prop = new Properties();
            prop.load(fis);
        } 
        catch (Exception e) 
        {
            System.out.println("Config file not found: " + e.getMessage());
        }
    }

    public String getBrowser() 
    {
        return prop.getProperty("browser");
    }

    public String getBaseUrl() 
    {
        return prop.getProperty("baseurl");
    }
}

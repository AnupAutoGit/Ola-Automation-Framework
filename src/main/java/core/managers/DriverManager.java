package core.managers;

import api.android.Android;
import core.ADB;
import core.MyLogger;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by anup on 4/13/2016.
 */
public class DriverManager {

    private static HashMap<String, URL> hosts;
    private static String unlockPackage = "adb shell am start -n io.appium.unlock/.Unlock";

    private static DesiredCapabilities getCaps(String deviceID){
        MyLogger.log.info("Creating driver caps for device: "+deviceID);
        DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("deviceName", deviceID);
            caps.setCapability("platformName", "Android");
            caps.setCapability("app", "/Users/apple/Documents/Demo/Olla/src/main/resources/OlaCabs_com.apk");
        return caps;
    }

    private static URL host(String deviceID) throws MalformedURLException {
        if(hosts == null){
            hosts = new HashMap<>();
            //hosts.put("192.168.2.6:5555 ", new URL("http://127.0.0.1:4723/wd/hub"));
            hosts.put("192.168.1.2:5555", new URL("http://127.0.0.1:4725/wd/hub"));
        }return hosts.get(deviceID);
    }

    private static ArrayList<String> getAvailableDevices(){
        MyLogger.log.info("Checking for available devices");
        ArrayList<String> avaiableDevices = new ArrayList<>();
        ArrayList connectedDevices = ADB.getConnectedDevices();
        for(Object connectedDevice: connectedDevices){
            String device = connectedDevice.toString();
            ArrayList apps = new ADB(device).getInstalledPackages();
            if(!apps.contains(unlockPackage)) avaiableDevices.add(device);
            else MyLogger.log.info("Device: "+device+" has "+unlockPackage+" installed, assuming it is under testing");
        }
        if(avaiableDevices.size() == 0) throw new RuntimeException("Not a single device is available for testing at this time");
        return avaiableDevices;
    }

    public static void createDriver() throws MalformedURLException {
        ArrayList<String> devices = getAvailableDevices();
        for(String device : devices){
            try{
                MyLogger.log.info("Trying to create new Driver for device: "+device);
                Android.driver = new AndroidDriver(host(device), getCaps(device));
                Android.adb = new ADB(device);
                break;
            }catch (Exception e){
                e.printStackTrace();
                //Ignore and try next device
            }
        }
    }

    public static void killDriver(){
        if(Android.driver != null){
            MyLogger.log.info("Killing Android Driver");
            Android.driver.quit();
            Android.adb.uninstallApp(unlockPackage);
        }else MyLogger.log.info("Android Driver is not initialized, nothing to kill");
    }
}

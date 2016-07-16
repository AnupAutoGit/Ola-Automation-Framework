import core.MyLogger;
import core.managers.DriverManager;
import org.apache.log4j.Level;
import org.junit.runner.JUnitCore;
import tests.TestPrimer;

import java.net.MalformedURLException;

/**
 * Created by Anup on 3/23/2016.
 */
public class Runner {
    public static void main(String[] args) throws MalformedURLException {

        MyLogger.log.setLevel(Level.INFO);
        try{
            DriverManager.createDriver();
            JUnitCore.runClasses(TestPrimer.class);
            //Android.app.speedtest.open();
            //Home results = Android.app.speedtest.home.tapTestAgain();
            //MyLogger.log.info("Ping: "+results.getPingSpeed());
            //MyLogger.log.info("Download: "+results.getDownloadSpeed());
            //MyLogger.log.info("Upload: "+results.getUploadSpeed());
        }finally {
            DriverManager.killDriver();
        }
    }
}

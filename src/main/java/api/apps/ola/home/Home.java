package api.apps.ola.home;

import api.android.Android;

import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by Anup on 02/07/16.
 */
public class Home {

    public HomeUiObject uiObject = new HomeUiObject();

    public void tapmicro(){
        try{
            MyLogger.log.info("Tapping on the Speedtest Menu Button");
            uiObject.micro().tap();

        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Speedtest Button, element absent or blocked");
        }
    }

    public Home tapResults(){
        try{
            MyLogger.log.info("Tapping on the Results Menu Button");
            uiObject.mini().tap();
            return Android.app.ola.home;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Results Button, element absent or blocked");
        }
    }
}

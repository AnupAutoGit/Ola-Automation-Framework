package api.apps.ola.login;

import api.android.Android;
import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by anup on 02/07/16.
 */
public class Login {

    public LoginUiObject uiObject = new LoginUiObject();

    public void login(){
        try{
            MyLogger.log.info("Tapping on the Speedtest Menu Button");
            uiObject.login().tap();

        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Speedtest Button, element absent or blocked");
        }
    }

    public Login loginvalue() {
        try {
            MyLogger.log.info("Enter Login Value");

            uiObject.loginvalue().typeText("9241221770");
            Android.app.ola.login.uiObject.loginvalue().waitToAppear(120);
            return Android.app.ola.login;
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant Enter Login Value, element absent or blocked");
        } catch (AssertionError e) {
            throw new AssertionError("HolidayIQ failed to complete within 120 seconds");
        }


    }

    public Login passwordvalue() {
        try {
            MyLogger.log.info("Enter Password Value");

            uiObject.passwordvalue().typeText("pass123");
            Android.app.ola.login.uiObject.passwordvalue().waitToAppear(120);
            return Android.app.ola.login;
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant Enter Password Value, element absent or blocked");
        } catch (AssertionError e) {
            throw new AssertionError("HolidayIQ failed to complete within 120 seconds");
        }


    }
}

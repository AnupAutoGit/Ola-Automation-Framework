package api.apps.ola.login;

import core.UiObject;
import core.UiSelector;

/**
 * Created by apple on 02/07/16.
 */
public class LoginUiObject {
    private static UiObject
    login,
    loginvalue,
    passwordvalue;

    public UiObject login() {
        if (login == null) login = new UiSelector().text("LOGIN").makeUiObject();
        return login;
    }
    public UiObject loginvalue() {
        if (loginvalue == null) loginvalue = new UiSelector().text("10-digit mobile number or email ID").makeUiObject();
        return loginvalue;
    }
    public UiObject passwordvalue() {
        if (passwordvalue == null) passwordvalue = new UiSelector().resourceId("com.olacabs.customer:id/login_password_txt").makeUiObject();
        return passwordvalue;
    }
}

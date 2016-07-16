package api.apps.ola.home;

import core.UiObject;
import core.UiSelector;

/**
 * Created by apple on 02/07/16.
 */
public class HomeUiObject {

    private static UiObject
            micro,
            mini,
            share,
            prime;

    public UiObject micro(){
        if(micro == null) micro = new UiSelector().xPath("//android.widget.RelativeLayout[@index='0']").makeUiObject();
        return micro;
    }

    public UiObject mini(){
        if(mini == null) mini = new UiSelector().text("RESULTS").makeUiObject();
        return mini;
    }

    public UiObject share(){
        if(share == null) share = new UiSelector().text("SETTINGS").makeUiObject();
        return share;
    }

    public UiObject prime(){
        if(prime == null) prime = new UiSelector().text("ABOUT").makeUiObject();
        return prime;
    }
}


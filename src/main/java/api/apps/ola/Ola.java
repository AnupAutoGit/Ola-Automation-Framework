package api.apps.ola;

import api.android.Android;
import api.apps.ola.home.Home;
import api.apps.ola.login.Login;
import api.interfaces.Application;

/**
 * Created by apple on 02/07/16.
 */
public class Ola implements Application {


    public Home home = new Home();
    public Login login = new Login();


    @Override
    public void forceStop() {
        Android.adb.forceStopApp(packageID());
    }

    @Override
    public void clearData() {
        Android.adb.clearAppsData(packageID());
    }

    @Override
    public Object open() {
        Android.adb.openAppsActivity(packageID(), activityID());
        return null;
    }

    @Override
    public String packageID() {
        return "com.olacabs.customer.ui.SplashActivity";
    }

    @Override
    public String activityID() {
        return "com.olacabs.olamoneyrest.core.PayActivity";
    }
}

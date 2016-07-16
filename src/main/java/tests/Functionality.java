package tests;

import api.android.Android;
import api.apps.ola.Ola;
import core.managers.TestManager;
import org.junit.Test;

/**
 * Created by Anup on 6/2/2016.
 */
public class Functionality extends TestManager {

    private static Ola ola = Android.app.ola;

    @Test
    public void test2() throws InterruptedException {
        testInfo.id("test2").suite("Funtionality").name("Click on Login Button");
        ola.login.login();
    }

    @Test
    public void test3() throws InterruptedException {
        testInfo.id("test3").suite("Funtionality").name("Enter login value");
        ola.login.loginvalue();
    }
    @Test
    public void test4() throws InterruptedException {
        testInfo.id("test4").suite("Funtionality").name("Enter Password value");
        ola.login.passwordvalue();
    }
    @Test
    public void test5() throws InterruptedException {
        testInfo.id("test5").suite("Funtionality").name("Click on Login Button");
        ola.login.login();
    }


}

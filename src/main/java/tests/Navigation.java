package tests;

import api.android.Android;
import api.apps.ola.Ola;
import core.managers.TestManager;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Anup on 6/2/2016.
 */
public class Navigation extends TestManager {

    private static Ola ola = Android.app.ola;
    //private static Destination destination= Android.app.destination;

    @BeforeClass
    public static void beforeclass(){
        ola.open();


    }
    @Before
    public void before(){
        testInfo.suite("Navigation");
    }

    @Test
    public void test1(){
        testInfo.id("test1").name("Open Home Screen");
    }


}

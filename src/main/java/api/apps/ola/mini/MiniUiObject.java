package api.apps.ola.mini;

import core.UiObject;
import core.UiSelector;

/**
 * Created by Anup on 02/07/16.
 */
public class MiniUiObject {


    private static UiObject
            ridenow,
            ridelater,
            getcablabel,
            getcabname,
            getfirst4kmprice,
            getafter4kmprice,
            getridetimerate,
            getservicetaxextra;

    public UiObject getcablabel(){
        if(getcablabel == null) getcablabel = new UiSelector().resourceId("com.olacabs.customer:id/item_category").makeUiObject();
        return getcablabel;
    }
    public UiObject getcabname(){
        if(getcabname == null) getcabname = new UiSelector().resourceId("com.olacabs.customer:id/item_options").makeUiObject();
        return getcabname;
    }
    public UiObject getfirst4kmprice(){
        if(getfirst4kmprice == null) getfirst4kmprice = new UiSelector().text("₹ 80").makeUiObject();
        return getfirst4kmprice;
    }
    public UiObject getafter4kmprice(){
        if(getafter4kmprice == null) getafter4kmprice = new UiSelector().resourceId("com.olacabs.customer:id/multiplier_surcharge_base_fare").makeUiObject();
        return getafter4kmprice;
    }
    public UiObject getridetimerate(){
        if(getridetimerate == null) getridetimerate = new UiSelector().resourceId("com.olacabs.customer:id/ratecard_container").makeUiObject();
        return getridetimerate;
    }
    public UiObject getservicetaxextra(){
        if(getservicetaxextra == null) getservicetaxextra = new UiSelector().resourceId("com.olacabs.customer:id/min_fare_text").makeUiObject();
        return getservicetaxextra;
    }
}

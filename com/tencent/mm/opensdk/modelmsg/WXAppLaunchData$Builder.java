package com.tencent.mm.opensdk.modelmsg.WXAppLaunchData$Builder;
import java.lang.Object;
import android.os.Bundle;
import com.tencent.mm.opensdk.modelmsg.WXAppLaunchData;
import java.lang.String;

public class WXAppLaunchData$Builder	// class@000eed
{

    public void WXAppLaunchData$Builder(){
       super();
    }
    public static WXAppLaunchData fromBundle(Bundle p0){
       WXAppLaunchData wXAppLaunchD = new WXAppLaunchData();
       wXAppLaunchD.launchType = p0.getInt("_wxapplaunchdata_launchType");
       wXAppLaunchD.message = p0.getString("_wxapplaunchdata_message");
       return wXAppLaunchD;
    }
    public static Bundle toBundle(WXAppLaunchData p0){
       Bundle uBundle = new Bundle();
       uBundle.putInt("_wxapplaunchdata_launchType", p0.launchType);
       uBundle.putString("_wxapplaunchdata_message", p0.message);
       return uBundle;
    }
}

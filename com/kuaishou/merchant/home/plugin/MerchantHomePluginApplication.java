package com.kuaishou.merchant.home.plugin.MerchantHomePluginApplication;
import android.app.Application;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class MerchantHomePluginApplication extends Application	// class@0016dd
{

    public void MerchantHomePluginApplication(){
       super();
    }
    public static void doRegister(){
    }
    public void onCreate(){
       if (PatchProxy.applyVoid(null, this, MerchantHomePluginApplication.class, "1")) {
          return;
       }
       super.onCreate();
       MerchantHomePluginApplication.doRegister();
       return;
    }
}

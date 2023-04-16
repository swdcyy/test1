package com.kuaishou.merchant.feedpayment.plugin.MerchantPaymentPluginApplication;
import android.app.Application;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class MerchantPaymentPluginApplication extends Application	// class@0016bc
{

    public void MerchantPaymentPluginApplication(){
       super();
    }
    public static void doRegister(){
    }
    public void onCreate(){
       if (PatchProxy.applyVoid(null, this, MerchantPaymentPluginApplication.class, "1")) {
          return;
       }
       super.onCreate();
       MerchantPaymentPluginApplication.doRegister();
       return;
    }
}

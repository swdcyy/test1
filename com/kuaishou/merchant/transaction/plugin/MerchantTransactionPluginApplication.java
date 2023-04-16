package com.kuaishou.merchant.transaction.plugin.MerchantTransactionPluginApplication;
import android.app.Application;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class MerchantTransactionPluginApplication extends Application	// class@0008ee
{

    public void MerchantTransactionPluginApplication(){
       super();
    }
    public static void doRegister(){
    }
    public void onCreate(){
       if (PatchProxy.applyVoid(null, this, MerchantTransactionPluginApplication.class, "1")) {
          return;
       }
       super.onCreate();
       MerchantTransactionPluginApplication.doRegister();
       return;
    }
}

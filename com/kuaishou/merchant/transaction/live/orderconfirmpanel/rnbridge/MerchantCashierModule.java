package com.kuaishou.merchant.transaction.live.orderconfirmpanel.rnbridge.MerchantCashierModule;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.Callback;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.rnbridge.MerchantCashierModule$a;
import la4.b;
import crd.b;
import la4.l;

public class MerchantCashierModule extends KrnBridge	// class@00084a
{

    public void MerchantCashierModule(ReactApplicationContext p0){
       super(p0);
    }
    public void getCashierInfo(Callback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantCashierModule.class, "1")) {
          return;
       }
       l.b(this.getCurrentActivity(), new MerchantCashierModule$a(this, p0), true);
       return;
    }
    public String getName(){
       return "KSMerchantCashier";
    }
}

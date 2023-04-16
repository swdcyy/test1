package com.kuaishou.merchant.transaction.live.orderconfirmpanel.rnbridge.MerchantHalfYodaModule;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;
import com.facebook.react.bridge.Callback;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.app.Activity;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.rnbridge.MerchantHalfYodaModule$a;
import java.lang.Runnable;
import ekd.k1;

public class MerchantHalfYodaModule extends KrnBridge	// class@00084c
{

    public void MerchantHalfYodaModule(ReactApplicationContext p0){
       super(p0);
    }
    public String getName(){
       return "KSMerchantHalfYoda";
    }
    public void openHalfYoda(String p0,Callback p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MerchantHalfYodaModule.class, "1")) {
          return;
       }
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       GifshowActivity gifshowActiv = null;
       if (this.getCurrentActivity() instanceof GifshowActivity) {
          gifshowActiv = this.getCurrentActivity();
       }
       if (gifshowActiv != null && !gifshowActiv.isFinishing()) {
          k1.o(new MerchantHalfYodaModule$a(this, gifshowActiv, TextUtils.c(p0, "isTranslucent", String.valueOf(1))));
       }
       return;
    }
}

package com.yxcorp.gifshow.webview.yoda.utils.YodaUtils$3;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Build$VERSION;
import android.os.PowerManager;
import nyc.c;
import com.kwai.yoda.event.d;
import yz7.e;
import com.kwai.yoda.bridge.YodaBaseWebView;

public class YodaUtils$3 extends BroadcastReceiver	// class@0017c8
{

    public void YodaUtils$3(){
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, YodaUtils$3.class, "1")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       if (Build$VERSION.SDK_INT < 23) {
          return;
       }
       PowerManager systemServic = p0.getSystemService("power");
       if (systemServic == null) {
          return;
       }
       d.f().c(null, "batteryStatusChanged", e.f(new c(systemServic.isPowerSaveMode())));
       return;
    }
}

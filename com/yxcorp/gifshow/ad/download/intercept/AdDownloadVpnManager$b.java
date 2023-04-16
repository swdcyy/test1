package com.yxcorp.gifshow.ad.download.intercept.AdDownloadVpnManager$b;
import fw8.b;
import com.yxcorp.gifshow.ad.download.intercept.AdDownloadVpnManager$a;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.ad.download.intercept.AdDownloadVpnManager;
import java.lang.System;
import android.os.Handler;
import java.lang.ref.WeakReference;
import android.content.Context;
import android.app.Application;
import o56.a;
import android.app.Application$ActivityLifecycleCallbacks;

public class AdDownloadVpnManager$b extends b	// class@00175a
{

    public void AdDownloadVpnManager$b(){
       super();
    }
    public void AdDownloadVpnManager$b(AdDownloadVpnManager$a p0){
       super();
    }
    public void onActivityResumed(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdDownloadVpnManager$b.class, "1")) {
          return;
       }
       if (AdDownloadVpnManager.b && (System.currentTimeMillis() - AdDownloadVpnManager.f) - 0xc350 < 0) {
          AdDownloadVpnManager.a().removeCallbacksAndMessages(null);
          if (!PatchProxy.applyVoid(null, null, AdDownloadVpnManager.class, "4") && AdDownloadVpnManager.b) {
             WeakReference d = AdDownloadVpnManager.d;
             if (d != null && d.get() != null) {
                AdDownloadVpnManager.e(4132);
                AdDownloadVpnManager.d = null;
                AdDownloadVpnManager.b = false;
                if (AdDownloadVpnManager.a != null) {
                   a.b().unregisterActivityLifecycleCallbacks(AdDownloadVpnManager.a);
                   AdDownloadVpnManager.a = null;
                }
             }
          }
       }
       return;
    }
}

package com.yxcorp.gifshow.ad.download.intercept.AdDownloadService$VpnReceiver;
import android.content.BroadcastReceiver;
import com.yxcorp.gifshow.ad.download.intercept.AdDownloadService;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import android.net.VpnService;
import android.app.ActivityManager;
import java.lang.StringBuilder;
import yx.j0;

public final class AdDownloadService$VpnReceiver extends BroadcastReceiver	// class@001756
{
    public final AdDownloadService a;

    public void AdDownloadService$VpnReceiver(AdDownloadService p0){
       this.a = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AdDownloadService$VpnReceiver.class, "1")) {
          return;
       }
       try{
          int i = 0;
          int intExtra = p1.getIntExtra("token", i);
          if (("ACTION_DISCONNECT").equals(p1.getAction())) {
             AdDownloadService$VpnReceiver ta = this.a;
             if (ta.m == intExtra) {
                ta.b();
             }else if(("ACTION_BACK_TO_FRONT").equals(p1.getAction())){
                this.a.getSystemService("activity").moveTaskToFront(ActivityContext.g().e().getTaskId(), 2);
             }else {
                Object[] objArray = new Object[i];
                j0.l("AdDownloadService", "StopService invoked but NOT Executed. token: "+intExtra+" mToken: "+this.a.m, objArray);
             }
          }else {
             goto label_0028 ;
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
}

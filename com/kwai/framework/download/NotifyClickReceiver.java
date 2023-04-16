package com.kwai.framework.download.NotifyClickReceiver;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ekd.j0;
import java.io.Serializable;
import com.kwai.framework.download.KwaiDownloadNotificationInfo;

public class NotifyClickReceiver extends BroadcastReceiver	// class@001534
{

    public void NotifyClickReceiver(){
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, NotifyClickReceiver.class, "1")) {
          return;
       }
       if (TextUtils.n(p1.getAction(), "com.kwai.framework.download.NOTIFICATION_CLICK")) {
          int i = j0.b(p1, "notification_type", -1);
          int i1 = j0.b(p1, "task_id", -1);
          KwaiDownloadNotificationInfo kwaiDownload = j0.e(p1, "task_tag3");
          if (kwaiDownload != null) {
             kwaiDownload.onNotificationClick(i1, i, p1);
          }
       }
       return;
    }
}

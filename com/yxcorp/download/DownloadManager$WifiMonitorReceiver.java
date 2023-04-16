package com.yxcorp.download.DownloadManager$WifiMonitorReceiver;
import android.content.BroadcastReceiver;
import com.yxcorp.download.DownloadManager;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mu8.a;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;

public class DownloadManager$WifiMonitorReceiver extends BroadcastReceiver	// class@0011a7
{
    public final DownloadManager a;
    public static final int b;

    public void DownloadManager$WifiMonitorReceiver(DownloadManager p0){
       this.a = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DownloadManager$WifiMonitorReceiver.class, "1")) {
          return;
       }
       c.k(new a(this, p0));
       return;
    }
}

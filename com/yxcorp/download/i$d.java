package com.yxcorp.download.i$d;
import android.os.Handler;
import com.yxcorp.download.i;
import android.os.Looper;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mu8.v;
import com.yxcorp.utility.Log;
import com.yxcorp.download.DownloadDispatcher$PromoteTaskReason;

public class i$d extends Handler	// class@0011c3
{
    public final i a;

    public void i$d(i p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public void handleMessage(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$d.class, "1")) {
          return;
       }
       super.handleMessage(p0);
       if (p0.what == 1) {
          if (v.c()) {
             Log.b("DownloadManager:PreDownloadDispatcher", "NETWORK_CHECK : keep waiting due to bad net work");
             this.a.q();
          }else {
             this.a.i(DownloadDispatcher$PromoteTaskReason.Focus_Change);
          }
       }
       return;
    }
}

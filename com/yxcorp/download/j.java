package com.yxcorp.download.j;
import android.os.Handler;
import com.yxcorp.download.i$e;
import android.os.Looper;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.aegon.netcheck.NetworkQualityEstimator$Metrics;
import com.kuaishou.aegon.netcheck.NetworkQualityEstimator;
import java.lang.StringBuilder;
import mu8.v;
import com.yxcorp.utility.Log;
import com.yxcorp.download.g;
import mu8.q;
import mu8.n;
import com.yxcorp.download.DownloadDispatcher;
import java.util.List;
import com.yxcorp.download.i;
import java.util.Queue;
import java.util.Deque;
import com.yxcorp.download.DownloadTask;

public class j extends Handler	// class@0011c6
{
    public final i$e a;

    public void j(i$e p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public void handleMessage(Message p0){
       DownloadTask uDownloadTas;
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       super.handleMessage(p0);
       int i = 1;
       if (p0.what == i) {
          j ta = this.a;
          _monitor_enter(ta);
          j ta1 = this.a;
          ta1.c = ta1.c + 1;
          Log.b("DownloadManager:PreDownloadDebugger", "Seq:"+this.a.c+" limit-v2-info : Aegon Network Estimator :  ## downstream\(kbps\):"+NetworkQualityEstimator.a().downstreamThroughputKbps+" ## score:"+NetworkQualityEstimator.b()+" ## limit speed:"+v.b());
          String str = "Seq:"+this.a.c+" Basic info : networkFocus : "+n.a(g.c().b().a())+"  mRunningQueueSize: "+this.a.g.d.size()+"  mPauseQueueSize:"+this.a.g.f.size()+"  mWaitingQueueSize:"+this.a.g.c.size()+"  mUtilityWaitingQueueSize:"+this.a.g.h.size()+"  mInitWaitingQueue:"+this.a.g.g.size();
          Log.b("DownloadManager:PreDownloadDebugger", str);
          j ta2 = this.a;
          ta2.d = str;
          int i1 = 0;
          if (ta2.g.d.size() > 0) {
             uDownloadTas = this.a.g.d.get(i1);
             str = "Seq:"+this.a.c+" Detail info : mRunningTask : "+uDownloadTas.getUrl()+" ## downloaded bytes:"+uDownloadTas.getSoFarBytes()+" ## instant_speed:"+uDownloadTas.getSpeed()+" ## taskFocus:"+n.a(uDownloadTas.getHostType());
             Log.b("DownloadManager:PreDownloadDebugger", str);
             this.a.e = str;
          }
          if (this.a.g.f.size() > 0) {
             uDownloadTas = this.a.g.f.get(i1);
             str = "Seq:"+this.a.c+" Detail info : mPausedTask : "+uDownloadTas.getUrl()+" ## downloaded bytes:"+uDownloadTas.getSoFarBytes()+" ## taskFocus:"+n.a(uDownloadTas.getHostType());
             Log.b("DownloadManager:PreDownloadDebugger", str);
             this.a.f = str;
          }
          i$e b = this.a.b;
          b.sendMessageDelayed(Message.obtain(b, i), 1000);
          _monitor_exit(ta);
       }
       return;
    }
}

package com.kwai.performance.overhead.traffic.monitor.TrafficMonitor$a;
import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.a;
import com.kwai.performance.overhead.traffic.monitor.TrafficMonitor;
import hg7.b;
import android.os.Message;
import java.lang.Object;
import java.lang.String;
import com.kwai.performance.overhead.traffic.monitor.TrafficBucket;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public final class TrafficMonitor$a extends Handler	// class@001178
{
    public final int a;
    public final long b;

    public void TrafficMonitor$a(Looper p0){
       long mDefaultSamp;
       if (p0 == null) {
          a.L();
       }
       super(p0);
       this.a = 1;
       TrafficMonitor iNSTANCE = TrafficMonitor.INSTANCE;
       b uob = TrafficMonitor.access$getMMonitorConfig$p(iNSTANCE);
       uob = (uob != null)? uob.a: iNSTANCE.getMDefaultSampleTimeMs();
       this.b = uob;
       return;
    }
    public void handleMessage(Message p0){
       a.q(p0, "msg");
       if (p0.what != this.a) {
          throw new IllegalArgumentException("Unknown what="+p0.what);
       }
       TrafficMonitor iNSTANCE = TrafficMonitor.INSTANCE;
       TrafficBucket trafficBucke = TrafficMonitor.access$getMThreadBucket$p(iNSTANCE);
       if (trafficBucke == null) {
          trafficBucke = iNSTANCE.getNextBucket();
       }
       iNSTANCE.updateThreadBucketAndReport(trafficBucke);
       this.sendEmptyMessageDelayed(this.a, this.b);
       iNSTANCE.resetThreadBucket();
       return;
    }
}

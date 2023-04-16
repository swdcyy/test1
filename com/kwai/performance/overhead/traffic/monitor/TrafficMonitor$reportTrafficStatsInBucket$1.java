package com.kwai.performance.overhead.traffic.monitor.TrafficMonitor$reportTrafficStatsInBucket$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.performance.overhead.traffic.monitor.TrafficBucket;
import java.lang.Object;
import qrd.l1;
import com.kwai.performance.overhead.traffic.monitor.TrafficMonitor;
import hg7.a;
import android.app.Application;
import android.content.Context;
import ekd.p0;
import com.google.gson.Gson;
import java.lang.String;
import yf7.i;
import yf7.d;
import yf7.d$a;

public final class TrafficMonitor$reportTrafficStatsInBucket$1 extends Lambda implements a	// class@00117c
{
    public final TrafficBucket $trafficBucket;

    public void TrafficMonitor$reportTrafficStatsInBucket$1(TrafficBucket p0){
       this.$trafficBucket = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       TrafficMonitor$reportTrafficStatsInBucket$1 t$trafficBuc = this.$trafficBucket;
       TrafficMonitor iNSTANCE = TrafficMonitor.INSTANCE;
       a uoa = TrafficMonitor.access$getMFreeTraffic$p(iNSTANCE);
       int i = (uoa != null)? uoa.a(): 2;
       try{
          t$trafficBuc.setTrafficStat(i);
          t$trafficBuc.setWifi(p0.F(TrafficMonitor.access$getApplication$p(iNSTANCE)));
          TrafficMonitor iNSTANCE1 = TrafficMonitor.INSTANCE;
          TrafficMonitor.access$getMGson$p(iNSTANCE1).q(this.$trafficBucket);
          d$a.b(i.a, "traffic_summary", TrafficMonitor.access$getMGson$p(iNSTANCE1).q(this.$trafficBucket), false, 4, null);
          return;
       }catch(java.lang.Exception e0){
       }
    }
}

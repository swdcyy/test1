package com.yxcorp.gifshow.performance.monitor.PerformanceMonitorLogger;
import yf7.d;
import com.yxcorp.gifshow.performance.monitor.PerformanceMonitorLogger$a;
import nsd.u;
import zk.d;
import java.lang.String;
import com.yxcorp.gifshow.performance.monitor.PerformanceMonitorLogger$BlockEventStringTypeAdapter;
import java.lang.reflect.Type;
import java.lang.Object;
import com.google.gson.Gson;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import yf7.d$a;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExceptionEvent;
import o56.a;
import k2b.u1;
import java.lang.Boolean;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$IoMonitorStatEvent;
import fg6.a;
import com.kuaishou.client.log.packages.nano.ClientBase$PerformanceMonitoringStatus;
import yf7.r;
import iu5.b;
import wkd.b;
import com.kwai.feature.api.platform.tracker.plugin.LeaveApplicationTracker;
import com.yxcorp.gifshow.w;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$MainThreadBlockEvent;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import android.os.SystemClock;

public final class PerformanceMonitorLogger implements d	// class@001295
{
    public b a;
    public static final Gson b;
    public static final PerformanceMonitorLogger$a c;

    static {
       PerformanceMonitorLogger.c = new PerformanceMonitorLogger$a(null);
       d uod = new d();
       uod.f(String.class, new PerformanceMonitorLogger$BlockEventStringTypeAdapter());
       uod.c();
       PerformanceMonitorLogger.b = uod.b();
    }
    public void PerformanceMonitorLogger(){
       super();
    }
    public void a(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PerformanceMonitorLogger.class, "5")) {
          return;
       }
       a.p(p0, "exceptionMessages");
       d$a.a(this, p0);
       return;
    }
    public void b(String p0,int p1,String p2){
       if (PatchProxy.isSupport(PerformanceMonitorLogger.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, PerformanceMonitorLogger.class, "2")) {
          return;
       }
       a.p(p0, "message");
       ClientEvent$ExceptionEvent uExceptionEv = new ClientEvent$ExceptionEvent();
       uExceptionEv.message = p0;
       p0 = "";
       if (p2 == null) {
          p2 = p0;
       }
       uExceptionEv.exceptionMetrics = p2;
       uExceptionEv.type = p1;
       String r = a.r;
       if (r == null) {
          r = p0;
       }
       uExceptionEv.androidPatchBaseVersion = r;
       r = a.o;
       if (r != null) {
          p0 = r;
       }
       uExceptionEv.androidPatchVersion = p0;
       u1.P(uExceptionEv);
       return;
    }
    public void c(String p0,String p1,boolean p2){
       if (PatchProxy.isSupport(PerformanceMonitorLogger.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, PerformanceMonitorLogger.class, "3")) {
          return;
       }
       a.p(p0, "key");
       if (p1 == null) {
          p1 = "";
       }
       u1.R(p0, p1, 19);
       return;
    }
    public void d(String p0,int p1,String p2){
       if (PatchProxy.isSupport(PerformanceMonitorLogger.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, PerformanceMonitorLogger.class, "6")) {
          return;
       }
       a.p(p0, "message");
       d$a.d(this, p0, p1, p2);
       throw null;
    }
    public void e(String p0,String p1,boolean p2){
       ClientStat$StatPackage statPackage;
       u1 ou1 = u1.class;
       if (PatchProxy.isSupport(PerformanceMonitorLogger.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, PerformanceMonitorLogger.class, "4")) {
          return;
       }
       a.p(p0, "key");
       boolean i = 19;
       String str = "";
       switch (p0.hashCode()){
           case 0xc7556051:
             if (p0.equals("report_length")) {
                u1.s0(p1, "report_length");
             }else if(p1 != null){
                p1 = str;
             }
             u1.Y(p0, p1, i);
             break;
           case 0xde911dde:
             if (p0.equals("io-trace")) {
                u1.s0(p1, "tr");
             }else {
                goto label_01c7 ;
             }
             break;
           case 0xf36b5ac9:
             if (p0.equals("random_trace")) {
                u1.s0(p1, "random_trace");
             }else {
                goto label_01c7 ;
             }
             break;
           case 0x784b8a9:
             if (p0.equals("perf-block")) {
                LeaveApplicationTracker leaveApplica = b.a(-1051884548);
                w ow = b.a(-1343064608);
                ClientStat$MainThreadBlockEvent mainThreadBl = PerformanceMonitorLogger.b.h(p1, ClientStat$MainThreadBlockEvent.class);
                ActivityContext uActivityCon = ActivityContext.g();
                a.o(uActivityCon, "ActivityContext.getInstance\(\)");
                Activity uActivity = uActivityCon.e();
                if (uActivity != null) {
                   mainThreadBl.currentActivity = uActivity.getClass().getSimpleName();
                }
                mainThreadBl.currentUrlPackage = u1.k();
                a.o(ow, "launchTracker");
                mainThreadBl.applicationCreateElapseTime = SystemClock.elapsedRealtime() - ow.getAppStartTime();
                mainThreadBl.applicationForegroundTime = leaveApplica.c();
                mainThreadBl.applicationForegroundElapseTime = SystemClock.elapsedRealtime() - leaveApplica.c();
                if (!PatchProxy.applyVoidOneRefs(mainThreadBl, null, ou1, "61")) {
                   statPackage = new ClientStat$StatPackage();
                   statPackage.mainThreadBlockEvent = mainThreadBl;
                   u1.j0(statPackage);
                }
             }else {
                goto label_01c7 ;
             }
             break;
           case 0x2d45ce40:
             if (p0.equals("io-overview")) {
                u1.s0(p1, "ov");
             }else {
                goto label_01c7 ;
             }
             break;
           case 0x75fffc90:
             if (p0.equals("over_limit")) {
                u1.s0(p1, "over_limit");
             }else {
                goto label_01c7 ;
             }
             break;
           case 0x793bc6dd:
             if (p0.equals("frame_metric_monitor")) {
                PerformanceMonitorLogger ta = this.a;
                if (ta == null || ta.onResult(p1) != true) {
                   if (p1 == null) {
                      p1 = str;
                   }
                   u1.Y(p0, p1, i);
                }
                this.a = null;
             }else {
                goto label_01c7 ;
             }
             break;
           case 0x7c2ad14d:
             if (p0.equals("switch-stat")) {
                Map map = a.a.h(p1, Map.class);
                ClientBase$PerformanceMonitoringStatus performanceM = new ClientBase$PerformanceMonitoringStatus();
                a.o(map, "map");
                Boolean uBoolean = map.get("blockMonitoringEnabled");
                i = false;
                uBoolean = (uBoolean != null)? uBoolean.booleanValue(): false;
                performanceM.blockMonitoringEnabled = uBoolean;
                uBoolean = map.get("threadMonitoringEnabled");
                uBoolean = (uBoolean != null)? uBoolean.booleanValue(): false;
                performanceM.threadCountMonitoringEnabled = uBoolean;
                uBoolean = map.get("fpsMonitoringEnabled");
                uBoolean = (uBoolean != null)? uBoolean.booleanValue(): false;
                performanceM.frameRateMonitoringEnabled = uBoolean;
                uBoolean = map.get("batteryMonitoringEnabled");
                uBoolean = (uBoolean != null)? uBoolean.booleanValue(): false;
                performanceM.batteryMonitoringEnabled = uBoolean;
                Boolean uBoolean1 = map.get("ioMonitoringEnabled");
                if (uBoolean1 != null) {
                   i = uBoolean1.booleanValue();
                }
                performanceM.ioMonitoringEnabled = i;
                performanceM.process = r.a();
                if (!PatchProxy.applyVoidOneRefs(performanceM, null, ou1, "60")) {
                   statPackage = new ClientStat$StatPackage();
                   statPackage.performanceMonitorStatus = performanceM;
                   u1.j0(statPackage);
                }
             }else {
                goto label_01c7 ;
             }
             break;
           case 0x7fe8704f:
             if (p0.equals("io-file-issue")) {
                if (!PatchProxy.applyVoidTwoRefs(p1, "fi", null, ou1, "46")) {
                   ClientStat$StatPackage statPackage1 = new ClientStat$StatPackage();
                   ClientStat$IoMonitorStatEvent ioMonitorSta = new ClientStat$IoMonitorStatEvent();
                   statPackage1.ioMonitorStatEvent = ioMonitorSta;
                   ioMonitorSta.procName = str;
                   ioMonitorSta.version = "fi";
                   ioMonitorSta.ioFiles = p1;
                   u1.j0(statPackage1);
                }
             }else {
                goto label_01c7 ;
             }
             break;
           default:
             goto label_01c7 ;
       }
    label_01ce :
       return;
    }
}

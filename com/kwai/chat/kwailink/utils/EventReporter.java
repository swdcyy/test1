package com.kwai.chat.kwailink.utils.EventReporter;
import java.lang.Object;
import java.util.concurrent.ScheduledExecutorService;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import g85.a;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import java.lang.CharSequence;
import android.text.TextUtils;
import r97.r$a;
import r97.r;
import r97.o$a;
import r97.o;
import c97.d;
import r97.a0;
import java.util.Map;
import ca7.f;
import com.google.gson.Gson;
import java.util.HashMap;
import java.lang.StringBuilder;
import com.kwai.chat.kwailink.log.a;
import java.lang.Float;
import h85.a;
import java.lang.Runnable;
import h85.b;

public class EventReporter	// class@000a73
{
    public static ScheduledExecutorService executor;
    public static int runtimeState;

    public void EventReporter(){
       super();
    }
    public static ScheduledExecutorService getExecutor(){
       EventReporter uEventReport = EventReporter.class;
       Object obj = PatchProxy.apply(null, null, uEventReport, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (EventReporter.executor == null) {
          _monitor_enter(uEventReport);
          if (EventReporter.executor == null) {
             EventReporter.executor = Executors.newSingleThreadScheduledExecutor(new a("EventReporter"));
          }
          _monitor_exit(uEventReport);
       }
       return EventReporter.executor;
    }
    public static void lambda$reportEvent$0(String p0,String p1,float p2,String p3){
       if (!TextUtils.isEmpty(p0)) {
          r$a uoa = r.b();
          uoa.d(o.builder().i(p1).h(p2).b());
          uoa.f(p0);
          uoa.h(p3);
          d.a().g().E(uoa.c());
       }
       return;
    }
    public static void lambda$reportEvent$1(String p0,String p1,float p2,Map p3){
       if (!TextUtils.isEmpty(p0)) {
          r$a uoa = r.b();
          uoa.d(o.builder().i(p1).h(p2).b());
          uoa.f(p0);
          uoa.h(f.b.q(p3));
          d.a().g().E(uoa.c());
       }
       return;
    }
    public static void onPushStat(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, EventReporter.class, "10")) {
          return;
       }
       HashMap hashMap = new HashMap();
       hashMap.put("subBiz", p0);
       hashMap.put("command", p1);
       hashMap.put("stage", p2);
       p0 = (EventReporter.runtimeState == 1)? "1": "0";
       hashMap.put("foreground", p0);
       a.a("EventReporter", "onPushStat, aspects="+hashMap);
       EventReporter.reportEvent("KLINK_PUSH_STAT", hashMap);
       return;
    }
    public static void reportEvent(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, EventReporter.class, "5")) {
          return;
       }
       EventReporter.reportEvent(p0, p1, "link", 0x3f800000);
       return;
    }
    public static void reportEvent(String p0,String p1,float p2){
       if (PatchProxy.isSupport(EventReporter.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Float.valueOf(p2), null, EventReporter.class, "4")) {
          return;
       }
       EventReporter.reportEvent(p0, p1, "link", p2);
       return;
    }
    public static void reportEvent(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, EventReporter.class, "3")) {
          return;
       }
       EventReporter.reportEvent(p0, p1, p2, 0x3f800000);
       return;
    }
    public static void reportEvent(String p0,String p1,String p2,float p3){
       if (PatchProxy.isSupport(EventReporter.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Float.valueOf(p3), null, EventReporter.class, "2")) {
          return;
       }
       EventReporter.getExecutor().execute(new a(p0, p2, p3, p1));
       return;
    }
    public static void reportEvent(String p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, EventReporter.class, "9")) {
          return;
       }
       EventReporter.reportEvent(p0, p1, "link", 0x3f800000);
       return;
    }
    public static void reportEvent(String p0,Map p1,float p2){
       if (PatchProxy.isSupport(EventReporter.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Float.valueOf(p2), null, EventReporter.class, "8")) {
          return;
       }
       EventReporter.reportEvent(p0, p1, "link", p2);
       return;
    }
    public static void reportEvent(String p0,Map p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, EventReporter.class, "7")) {
          return;
       }
       EventReporter.reportEvent(p0, p1, p2, 0x3f800000);
       return;
    }
    public static void reportEvent(String p0,Map p1,String p2,float p3){
       if (PatchProxy.isSupport(EventReporter.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Float.valueOf(p3), null, EventReporter.class, "6")) {
          return;
       }
       EventReporter.getExecutor().execute(new b(p0, p2, p3, p1));
       return;
    }
    public static void syncRuntime(int p0){
       EventReporter.runtimeState = p0;
    }
}

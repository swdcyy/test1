package com.kwai.component.tti.TTIStrategy;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.component.tti.monitor.TTIData;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.kwai.component.tti.TTIStrategy$Scene;
import com.kwai.performance.fluency.jank.monitor.JankMonitor;
import java.lang.Long;
import android.os.SystemClock;
import com.kwai.component.tti.log.TTITaskModel;
import fg6.a;
import com.google.gson.Gson;
import k2b.u1;

public class TTIStrategy	// class@000a9c
{
    public static long a = 0x0;
    public static long b = 0x0;
    public static boolean c = false;
    public static boolean d = false;
    public static boolean e;
    public static boolean f;
    public static boolean g;
    public static a h;

    public void TTIStrategy(){
       super();
    }
    public static void a(String p0,String p1,boolean p2){
       if (PatchProxy.isSupport(TTIStrategy.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), null, TTIStrategy.class, "4")) {
          return;
       }
       if (!TextUtils.isEmpty(p0) && !TTIData.getInstance().isOverTTITime()) {
          Log.g("TTI.Strategy", "start scene: "+p0);
          if (TextUtils.isEmpty(TTIStrategy$Scene.b) && p2) {
             TTIStrategy$Scene.b = p0;
             TTIStrategy$Scene.c = p0;
             TTIStrategy$Scene.d = p1;
          }else {
             TTIStrategy$Scene.c = p0;
             TTIStrategy$Scene.d = p1;
          }
       }
       return;
    }
    public static void b(String p0,boolean p1){
       TTIStrategy tTIStrategy = TTIStrategy.class;
       if (PatchProxy.isSupport(tTIStrategy) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, tTIStrategy, "6")) {
          return;
       }
       if (!TextUtils.isEmpty(p0) && !TTIData.getInstance().isOverTTITime()) {
          Log.g("TTI.Strategy", "stop scene: "+p0);
          boolean b = true;
          if (p1) {
             TTIStrategy$Scene.e = b;
             TTIStrategy$Scene.f = b;
             TTIStrategy$Scene.c = null;
             TTIStrategy$Scene.d = null;
          }else {
             TTIStrategy$Scene.e = b;
             TTIStrategy$Scene.c = null;
             TTIStrategy$Scene.d = null;
          }
          JankMonitor.optimize("TTI.Vsync", false);
       }
       return;
    }
    public static void c(long p0,String p1,boolean p2){
       if (PatchProxy.isSupport(TTIStrategy.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), p1, Boolean.valueOf(p2), null, TTIStrategy.class, "9")) {
          return;
       }
       if (TextUtils.isEmpty(p1)) {
          Log.d("TTI.Strategy", "uploadTaskCost fail as taskName is null");
          return;
       }else if(!TTIStrategy.e){
          return;
       }else {
          TTITaskModel tTITaskModel = new TTITaskModel(p1, p2, TTIStrategy$Scene.a(), (p0 - TTIStrategy.a), (SystemClock.elapsedRealtime() - p0));
          Gson a = a.a;
          u1.Y("TTITaskModel", a.q(p0), 19);
          Log.b("TTI.Strategy", a.q(p0));
          return;
       }
    }
}

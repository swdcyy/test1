package com.kwai.feature.api.live.plugin.dva.LivePluginManager;
import java.util.concurrent.CopyOnWriteArraySet;
import com.kwai.feature.api.live.plugin.dva.LivePluginManager$d;
import com.kwai.plugin.dva.Dva;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.plugin.dva.install.b;
import ij7.c;
import java.lang.Class;
import tkd.b;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tkd.d;
import os5.p;
import java.lang.Boolean;
import jd6.g;
import com.kwai.feature.api.live.plugin.dva.LoadPolicy;
import android.app.Activity;
import brd.a0;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import qs5.d;
import java.lang.System;
import brd.t;
import com.kwai.feature.api.live.plugin.dva.LivePluginManager$a;
import erd.o;
import brd.w;
import com.kwai.feature.api.live.plugin.dva.LivePluginManager$b;
import com.kwai.feature.api.live.plugin.dva.LivePluginManager$loadIfLaunchFinish$onLoadResult$1;
import com.kwai.plugin.dva.work.c;
import com.kwai.feature.api.live.plugin.dva.LivePluginManager$c;
import msd.p;
import com.kwai.plugin.dva.work.c$c;
import qs5.e;
import android.os.Looper;
import java.lang.Thread;
import erd.g;
import java.lang.Long;
import java.lang.CharSequence;
import android.text.TextUtils;
import qs5.a;

public final class LivePluginManager	// class@000ff7
{
    public static boolean a;
    public static final CopyOnWriteArraySet b;
    public static boolean c;
    public static final LivePluginManager d;

    static {
       LivePluginManager.d = new LivePluginManager();
       LivePluginManager.b = new CopyOnWriteArraySet();
       Dva uDva = Dva.instance();
       a.o(uDva, "Dva.instance\(\)");
       uDva.getPluginInstallManager().q(new LivePluginManager$d());
    }
    public void LivePluginManager(){
       super();
    }
    public static final CopyOnWriteArraySet a(LivePluginManager p0){
       return LivePluginManager.b;
    }
    public static final b b(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LivePluginManager.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "clazz");
       p0 = d.a(0x79a7ed92).IP(p0);
       a.o(p0, "PluginManager.get\(Plugin¡­java\).getPluginImp\(clazz\)");
       return p0;
    }
    public static final boolean c(){
       String obj = PatchProxy.apply(null, null, LivePluginManager.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = "live_audience_plugin";
       boolean b = (g.e(obj) || Dva.instance().isLoaded(obj))? true: false;
       return b;
    }
    public static final a0 d(Class p0,LoadPolicy p1,Activity p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, LivePluginManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LivePluginManager.f(p0, p1, p2, null, 8, null);
    }
    public static final a0 e(Class p0,LoadPolicy p1,Activity p2,String p3){
       int i = p1;
       Activity uActivity = p2;
       a0 obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, LivePluginManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "clazz");
       a.p(p1, "loadPolicy");
       boolean b = LivePluginManager.c();
       b.V(LiveLogTag.LIVE_PLUGIN.appendTag("LivePluginManager"), "live audience load: ", "clazz", p0, "loadPolicy", p1, "activity", p2, "isInstalled", Boolean.valueOf(b));
       if (b) {
          obj = a0.B(LivePluginManager.b(p0));
          a.o(obj, "Single.just\(get\(clazz\)\)");
       }else {
          String str = "live_audience_plugin";
          boolean b1 = d.c(str);
          long l = System.currentTimeMillis();
          if (i == LoadPolicy.DIALOG && uActivity) {
             LivePluginManager$a uoa = new LivePluginManager$a(p3, l, b1, p0);
             obj = a0.z(d.b(uActivity, str).map(v7));
             a.o(obj, "Single.fromObservable\(Li¡­\"\)\n          }\n        }\)");
          }else {
             LivePluginManager$b uob = new LivePluginManager$b(p3, l, b1, p0);
             obj = a0.z(d.a(str, 40).map(v7));
             a.o(obj, "Single.fromObservable\(in¡­\"\)\n          }\n        }\)");
          }
       }
       return obj;
    }
    public static a0 f(Class p0,LoadPolicy p1,Activity p2,String p3,int p4,Object p5){
       if (p4 & 0x04) {
          p2 = null;
       }
       return LivePluginManager.e(p0, p1, p2, null);
    }
    public static final void g(boolean p0){
       LivePluginManager livePluginMa = LivePluginManager.class;
       LivePluginManager$loadIfLaunchFinish$onLoadResult$1 oloadIfLaunc = null;
       if (PatchProxy.isSupport(livePluginMa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), oloadIfLaunc, livePluginMa, "10")) {
          return;
       }
       if (p0) {
          LivePluginManager.a = true;
       }
       if (LivePluginManager.a) {
          String str = "live_audience_plugin";
          if (p0) {
             oloadIfLaunc = new LivePluginManager$loadIfLaunchFinish$onLoadResult$1(System.currentTimeMillis(), d.c(str));
          }
          c uoc = d.g(str, 30);
          if (uoc != null && oloadIfLaunc != null) {
             uoc.a(new LivePluginManager$c(oloadIfLaunc));
          }
       }
    label_0043 :
       return;
    }
    public static final void h(boolean p0,e p1){
       LivePluginManager livePluginMa = LivePluginManager.class;
       if (PatchProxy.isSupport(livePluginMa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, null, livePluginMa, "7")) {
          return;
       }
       a.p(p1, "consumer");
       boolean b = LivePluginManager.c();
       Looper mainLooper = Looper.getMainLooper();
       a.o(mainLooper, "Looper.getMainLooper\(\)");
       int i = 1;
       if (a.g(mainLooper.getThread(), Thread.currentThread()) ^ i) {
          p1.b = i;
       }
       LiveLogTag lIVE_PLUGIN = LiveLogTag.LIVE_PLUGIN;
       lIVE_PLUGIN.appendTag("LivePluginManager");
       LiveLogTag liveLogTag = lIVE_PLUGIN;
       b.V(liveLogTag, "live audience plugin observe: ", "shouldLoadAgain", Boolean.valueOf(p0), "consumer", p1, "isLaunchFinished", Boolean.valueOf(LivePluginManager.a), "isInstalled", Boolean.valueOf(b));
       if (b) {
          p1.accept(new Object());
          return;
       }else {
          LivePluginManager.b.add(p1);
          if (p0) {
             LivePluginManager.g(false);
          }
          return;
       }
    }
    public final void i(String p0,long p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(LivePluginManager.class) && PatchProxy.applyVoidFourRefs(p0, Long.valueOf(p1), Boolean.valueOf(p2), Boolean.valueOf(p3), this, LivePluginManager.class, "4")) {
          return;
       }
       if (!TextUtils.isEmpty(p0)) {
          a.c(p0, p1, p2, p3);
       }
       return;
    }
}

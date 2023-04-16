package com.yxcorp.gifshow.performance.monitor.boost.RenderThrBoostInitModule;
import com.yxcorp.gifshow.performance.monitor.PerformanceBaseInitModule;
import com.yxcorp.gifshow.performance.monitor.boost.RenderThrBoostInitModule$a;
import nsd.u;
import com.google.gson.Gson;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import android.os.Build$VERSION;
import kotlin.jvm.internal.Ref$LongRef;
import com.kwai.sdk.switchconfig.a;
import android.app.Application;
import com.yxcorp.gifshow.performance.monitor.boost.RenderThrBoostInitModule$b;
import android.app.Application$ActivityLifecycleCallbacks;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuffer;
import java.lang.System;
import android.os.Looper;
import kotlin.jvm.internal.a;
import java.lang.Thread;
import java.lang.ThreadGroup;
import zsd.u;
import java.io.PrintStream;
import com.yxcorp.gifshow.performance.monitor.boost.RenderThrBoostInitModule$Fails;
import k2b.u1;

public final class RenderThrBoostInitModule extends PerformanceBaseInitModule	// class@000e65
{
    public boolean q;
    public boolean r;
    public final Gson s;
    public static final RenderThrBoostInitModule$a t;

    static {
       RenderThrBoostInitModule.t = new RenderThrBoostInitModule$a(null);
    }
    public void RenderThrBoostInitModule(){
       super();
       this.s = new Gson();
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, RenderThrBoostInitModule.class, "1")) {
          return;
       }
       if (this.q != null) {
          return;
       }
       this.q = true;
       if (!SystemUtil.L(a.B)) {
          return;
       }
       if (Build$VERSION.SDK_INT < 23) {
          return;
       }
       Ref$LongRef longRef = new Ref$LongRef();
       long l = a.t().b("thrBoostSwitchVal", 0);
       longRef.element = l;
       if (l - 3 <= 0 && l >= 0) {
          if (!l) {
             return;
          }else {
             a.b().registerActivityLifecycleCallbacks(new RenderThrBoostInitModule$b(this, longRef));
          }
       }
       return;
    }
    public final boolean o0(){
       Object[] objArray = null;
       StringBuffer obj = PatchProxy.apply(objArray, this, RenderThrBoostInitModule.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = new StringBuffer(256)+"threads: ";
       boolean b = false;
       System.currentTimeMillis();
       Looper mainLooper = Looper.getMainLooper();
       a.o(mainLooper, "Looper.getMainLooper\(\)");
       Thread thread = mainLooper.getThread();
       a.o(thread, "Looper.getMainLooper\(\).thread");
       ThreadGroup threadGroup = thread.getThreadGroup();
       a.o(threadGroup, "Looper.getMainLooper\(\).thread.threadGroup");
       int i = threadGroup.activeCount();
       Thread[] threadArray = new Thread[(i + (i / 2))];
       int i1 = threadGroup.enumerate(threadArray);
       boolean b1 = true;
       if (i1 >= 0) {
          int i2 = 0;
          object oobject = threadArray[i2];
          while (oobject != null) {
             oobject.getName();
             break ;
             i2 = i2 + 1;
          }
          oobject = threadArray[i2];
          String name = (oobject != null)? oobject.getName(): objArray;
          obj = obj+name+" ;";
          name = "RenderThread";
          object oobject1 = threadArray[i2];
          String name1 = (oobject1 != null)? oobject1.getName(): objArray;
          if (u.I1(name, name1, b1)) {
             object oobject2 = threadArray[i2];
             if (oobject2 != null) {
                oobject2.setPriority(10);
             }
             System.out.println("RenderThrBoostInitModule : promote render-thr done");
             b = true;
          }else if(i2 != i1){
             goto label_008f ;
          }
       }
       if (!b) {
          System.out.println("RenderThrBoostInitModule : failed to boost render thr");
          String str = obj;
          a.o(str, "bufferedStr.toString\(\)");
          RenderThrBoostInitModule$Fails uFails = new RenderThrBoostInitModule$Fails(str, null, 0, 6, null);
          u1.R("render_boost_event", this.s.q(v10), 19);
       }
       System.currentTimeMillis();
       return b;
    }
    public final boolean p0(){
       Object obj = PatchProxy.apply(null, this, RenderThrBoostInitModule.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Looper mainLooper = Looper.getMainLooper();
       a.o(mainLooper, "Looper.getMainLooper\(\)");
       Thread thread = mainLooper.getThread();
       a.o(thread, "Looper.getMainLooper\(\).thread");
       thread.setPriority(10);
       return true;
    }
}

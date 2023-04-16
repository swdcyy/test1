package com.kwai.framework.config.heartbeat.g;
import java.lang.String;
import java.util.concurrent.ExecutorService;
import t45.c;
import java.util.concurrent.Executor;
import brd.z;
import lrd.b;
import java.lang.Object;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import e66.c;
import q87.c;
import java.lang.System;
import java.lang.Math;
import o56.a;
import android.content.Context;
import lnc.t3;
import fud.a;
import fud.c;
import wkd.b;
import a66.e;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import k2b.k2;
import k2b.u1;
import java.util.Map;
import a66.f;
import brd.t;
import cjd.e;
import erd.o;
import a66.c;
import erd.g;
import a66.a;
import com.kwai.framework.config.heartbeat.f;
import com.kwai.framework.config.heartbeat.e;
import erd.a;
import crd.b;
import java.lang.Throwable;
import java.lang.Long;
import java.lang.StringBuilder;
import java.util.Timer;
import com.kwai.framework.config.heartbeat.g$a;
import java.util.TimerTask;
import com.kwai.framework.config.heartbeat.g$b;
import java.lang.Exception;
import ob6.p;
import ob6.f;
import com.kwai.framework.network.keyconfig.ApiFeature;

public class g	// class@001509
{
    public Timer a;
    public boolean b;
    public int c;
    public long d;
    public static z e;
    public static g f;

    static {
       g.e = b.b(c.f("Heartbeat"));
       g.f = new g();
    }
    public void g(){
       super();
       this.c = 0x1d4c0;
       this.d = 0;
    }
    public static g b(){
       return g.f;
    }
    public void a(RequestTiming p0){
       int i1;
       g og = g.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, og, "6")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       c.C().s("Heartbeat", "Start doHeartbeat", objArray);
       if (Math.abs((System.currentTimeMillis() - this.d)) - 5000 < 0) {
          Object[] objArray1 = new Object[i];
          c.C().s("Heartbeat", "Heartbeat called too frequently. Quit.", objArray1);
          return;
       }else {
          Object[] objArray2 = new Object[i];
          c.C().s("Heartbeat", "Start sending api request", objArray2);
          String str = t3.c(a.B);
          String str1 = (str == null)? null: new a().e(str.getBytes("UTF-8"));
          str = (this.b != null)? "true": "false";
          String str2 = str;
          this.d = System.currentTimeMillis();
          Object obj = b.a(-132976742);
          k2 obj1 = PatchProxy.apply(null, this, og, "5");
          if (obj1 != PatchProxyResult.class) {
             i1 = obj1.intValue();
          }else {
             obj1 = u1.q();
             if (obj1 != null) {
                i = obj1.c;
             }
             i1 = i;
          }
          obj.a(str2, 0, i1, str1, f.a(), p0).map(new e()).observeOn(g.e).doOnNext(new c(p0)).subscribe(a.a, f.b, e.b);
          return;
       }
    }
    public synchronized final void c(long p0,RequestTiming p1){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, og, "3")) {
          return;
       }
       c uoc = c.C();
       String str = "Heartbeat";
       String str1 = "heartbeat is called. InitialDelay: "+p0;
       Object[] objArray = new Object[0];
       try{
          uoc.s(str, str1, objArray);
          og = this.a;
          if (og == null) {
             Timer timer = new Timer("heatbeat-timer");
             this.a = timer;
             timer.scheduleAtFixedRate(new g$a(this, p1), p0, (long)this.c);
          }else {
             og.schedule(new g$b(this, p1), 0);
          }
       }catch(java.lang.Exception e8){
          e8.printStackTrace();
       }
       return;
    }
    public void d(boolean p0){
       this.b = p0;
    }
    public void e(RequestTiming p0){
       g og = g.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, og, "1")) {
          return;
       }
       Object obj = PatchProxy.apply(null, this, og, "7");
       long l = (obj != PatchProxyResult.class)? obj.longValue(): b.a(0x36463d96).i().f(ApiFeature.HEARTBEAT);
       this.c(l, p0);
       return;
    }
    public synchronized void f(){
       if (PatchProxy.applyVoid(null, this, g.class, "2")) {
          return;
       }
       g ta = this.a;
       if (ta != null) {
          ta.cancel();
          this.a = null;
       }
       this.d = 0;
       return;
    }
}

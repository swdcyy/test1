package com.kuaishou.commercial.splash.c;
import erd.g;
import com.kuaishou.commercial.splash.e;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.lang.Object;
import java.lang.Long;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;
import o56.c;
import o56.a;
import android.content.Context;
import android.graphics.Point;
import com.yxcorp.utility.n;
import java.lang.StringBuilder;
import com.kuaishou.commercial.splash.SplashUtils;
import yy.y0;
import com.kwai.performance.overhead.battery.monitor.BatteryMonitor;
import java.lang.Integer;
import qw.f;
import android.content.SharedPreferences;
import java.lang.System;
import tkd.b;
import tkd.d;
import hn5.n;
import android.app.Application;
import android.hardware.SensorManager;
import java.util.List;
import wkd.b;
import yy.g0;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.commercial.splash.i;
import com.kwai.robust.PatchProxyResult;
import u49.e;
import brd.t;
import t45.d;
import brd.z;
import cjd.e;
import erd.o;
import yy.r;
import yy.s;
import crd.b;
import yy.g1;
import yy.p;
import com.kuaishou.commercial.splash.SplashAdDataPolicy;
import java.util.concurrent.ConcurrentHashMap;

public final class c implements g	// class@0015a5
{
    public final e b;
    public final RequestTiming c;

    public void c(e p0,RequestTiming p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       int b2;
       String str2;
       c uoc = this;
       c b = uoc.b;
       c c = uoc.c;
       Objects.requireNonNull(b);
       if (PatchProxy.applyVoidOneRefs(c, b, e.class, "7")) {
       }else {
          int i = 0;
          Object[] objArray = new Object[i];
          String str = "SplashAdDownloadHelper";
          j0.a(str, "WorkerThread updateNewSplashAdData", objArray);
          Point point = n.s(a.a().f());
          Object[] objArray1 = new Object[i];
          j0.f(str, "getRealScreenSize:"+point, objArray1);
          Point x = point.x;
          if (SplashUtils.f()) {
             point = point.y;
          }else {
             int i1 = n.q(a.a().f());
             Object[] objArray3 = new Object[i];
             j0.f(str, "navigationBarHeight:"+i1, objArray3);
             b2 = point.y - i1;
          }
          Point point1 = point;
          if (x <= null || point1 <= null) {
             objArray = new Object[i];
             j0.c(str, "initSplashAd cannnot get screen size", objArray);
          }else {
             boolean b1 = y0.b;
             String str1 = "OptimizeSplashModel_"+b1;
             BatteryMonitor.startSection(str1, true);
             if (!PatchProxy.isSupport(e.class) || !PatchProxy.applyVoidThreeRefs(c, Integer.valueOf(x), Integer.valueOf(point1), b, e.class, "2")) {
                b2 = f.a.getInt("requestSplashAdInterval", i);
                Object[] objArray2 = null;
                if (b2 > 0 && ((long)(b2 * 1000) + f.h()) - System.currentTimeMillis() < 0) {
                   if (!PatchProxy.applyVoid(objArray2, b, e.class, "6")) {
                      if (d.a(-1883158055).Sl()) {
                         b.e = f.e();
                         b.f = f.d();
                      }else {
                         SensorManager systemServic = a.b().getSystemService("sensor");
                         b.e = SplashUtils.K(systemServic);
                         b.f = SplashUtils.J(systemServic);
                      }
                   }
                   List list = b.a.e();
                   List list1 = b.a(-1220313162).i(list, b.a);
                   i3 oi3 = i3.f();
                   oi3.c("support_gyroscope", Integer.valueOf(b.e));
                   oi3.c("support_accelerometer", Integer.valueOf(b.f));
                   i3 oi31 = oi3;
                   List list2 = list;
                   p0 = list1;
                   List list3 = list;
                   i.l(c, false, "", list2, list1, oi31);
                   long l = System.currentTimeMillis();
                   if (b1) {
                      str2 = b.b(x, point1, list3, p0);
                   }else if(PatchProxy.isSupport(e.class)){
                      str2 = PatchProxy.applyTwoRefs(Integer.valueOf(x), Integer.valueOf(point1), b, e.class, "8");
                      if (str2 != PatchProxyResult.class) {
                      }
                   }
                   List list4 = b.a.e();
                   str2 = b.b(x, point1, list4, b.a(-1220313162).i(list4, b.a));
                   b.a(0x1ca87f04).b(str2, c).observeOn(d.c).map(new e()).subscribe(new r(b, l), new s(c));
                }else if(b.d == null){
                   e b3 = b.b;
                   Objects.requireNonNull(b3);
                   if (!PatchProxy.applyVoid(objArray2, b3, g1.class, "12") && b3.b == null) {
                      b3.b = b.a(0x946a02c).C();
                   }
                   b.a.d();
                }
                if (g0.f) {
                   b.a(-1220313162).l(b.a, objArray2);
                }
             }
             b2 = true;
             BatteryMonitor.stopSection(str1, b2);
          }
       }
       return;
    }
}

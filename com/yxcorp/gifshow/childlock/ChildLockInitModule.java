package com.yxcorp.gifshow.childlock.ChildLockInitModule;
import com.kwai.framework.init.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import com.yxcorp.gifshow.childlock.a;
import android.app.Activity;
import b76.a;
import o56.a;
import uj9.j;
import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Application;
import wh5.c;
import com.yxcorp.gifshow.util.rx.RxBus;
import zca.r;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import uj9.h;
import erd.g;
import crd.b;
import eda.n;
import uj9.g;
import eda.l;
import uj9.f;
import java.util.Objects;
import fw8.r;
import uj9.e;
import fw8.r$a;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import uj9.l;
import android.content.SharedPreferences;
import java.lang.System;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.yxcorp.gifshow.util.DateUtils;
import java.lang.Boolean;
import uj9.i;
import java.lang.Runnable;
import t45.c;
import java.lang.StringBuilder;
import km8.b;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import android.text.format.Time;
import uj9.c;
import ekd.k1;
import java.util.concurrent.TimeUnit;
import uj9.b;
import io.reactivex.internal.functions.Functions;

public class ChildLockInitModule extends a	// class@001076
{
    public boolean q;
    public static final int r;

    public void ChildLockInitModule(){
       super();
    }
    public boolean C(){
       return true;
    }
    public int f0(){
       return 5;
    }
    public void h0(){
       if (PatchProxy.applyVoid(null, this, ChildLockInitModule.class, "3")) {
          return;
       }
       b.a(-1942497302).b();
       return;
    }
    public void i0(){
       if (PatchProxy.applyVoid(null, this, ChildLockInitModule.class, "6")) {
          return;
       }
       this.n0();
       return;
    }
    public void j0(Activity p0){
       this.q = true;
    }
    public void k0(a p0){
       SharedPreferences a;
       long l;
       if (PatchProxy.applyVoidOneRefs(p0, this, ChildLockInitModule.class, "1")) {
          return;
       }
       p0 = a.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, ChildLockInitModule.class, "2")) {
          if (!PatchProxy.applyVoid(objArray, this, ChildLockInitModule.class, "8")) {
             a.B.registerActivityLifecycleCallbacks(new j(this));
             this.l0(c.b());
          }
          RxBus f = RxBus.f;
          RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
          f.g(r.class, mAIN).subscribe(new h(this));
          f.g(n.class, mAIN).subscribe(new g(this));
          f.g(l.class, mAIN).subscribe(new f(this));
          int i = -1942497302;
          a uoa = b.a(i);
          Objects.requireNonNull(uoa);
          if (!PatchProxy.applyVoid(objArray, uoa, p0, "12")) {
             r.c().a(new e(uoa));
          }
          a uoa1 = b.a(i);
          Application uApplication = a.b();
          Objects.requireNonNull(uoa1);
          if (!PatchProxy.applyVoidOneRefs(uApplication, uoa1, p0, "11") && (uApplication.getPackageName()).equals(SystemUtil.r(uApplication))) {
             a = l.a;
             l = 0;
             long longx = a.getLong("last_cold_launch_time", l);
             SharedPreferences$Editor uEditor = a.edit();
             uEditor.putLong("last_cold_launch_time", System.currentTimeMillis());
             g.a(uEditor);
             if (longx - l > 0 && !DateUtils.H(longx)) {
                l.f(1);
             }else {
                i = l.b();
                if (i < 2) {
                   l.f((i + 1));
                }
             }
          }
       }
    label_00dd :
       return;
    }
    public final void l0(boolean p0){
       if (PatchProxy.isSupport(ChildLockInitModule.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ChildLockInitModule.class, "10")) {
          return;
       }
       c.a(new i(p0));
       return;
    }
    public void n(){
    }
    public void n0(){
       a obj;
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ChildLockInitModule.class, "7")) {
          return;
       }
       if (SystemUtil.L(a.B)) {
          a uoa = b.a(-1942497302);
          Objects.requireNonNull(uoa);
          a uoa1 = a.class;
          if (!PatchProxy.applyVoid(objArray, uoa, uoa1, "4")) {
             if (c.b()) {
                long longx = l.a.getLong(b.d("user")+"last_show_child_lock_dialog_time", 0);
                if (longx > 0) {
                   if (PatchProxy.isSupport(uoa1)) {
                      obj = PatchProxy.applyOneRefs(Long.valueOf(longx), uoa, uoa1, "14");
                      if (obj != PatchProxyResult.class) {
                         b = obj.booleanValue();
                      }else {
                      label_0070 :
                         Time time = new Time();
                         time.set(longx);
                         Time month = time.month;
                         Time monthDay = time.monthDay;
                         time.set(c.i());
                         b = (time.year == time.year && (month == time.month && monthDay == time.monthDay))? true: false;
                      }
                   }else {
                      goto label_0070 ;
                   }
                   if (!b) {
                      l.g(0);
                      l.e(0);
                      k1.o(new c(uoa));
                   }
                }
                uoa.c();
                obj = uoa.a;
                if (obj == null || obj.isDisposed()) {
                   uoa.a = t.interval(0xea60, 0xea60, TimeUnit.MILLISECONDS).subscribe(new b(uoa), Functions.d());
                }
             }else {
                k1.o(new c(uoa));
             }
          }
       }
       return;
    }
}

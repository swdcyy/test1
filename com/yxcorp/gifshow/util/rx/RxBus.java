package com.yxcorp.gifshow.util.rx.RxBus;
import java.lang.Object;
import ph7.i;
import ph7.f;
import com.yxcorp.gifshow.util.rx.a;
import android.app.Application;
import o56.a;
import android.content.Context;
import java.lang.String;
import android.content.SharedPreferences;
import vid.b;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import eoc.c;
import java.lang.Class;
import java.util.concurrent.ConcurrentHashMap;
import com.kwai.sdk.switchconfig.v1.internal.a;
import com.kwai.sdk.switchconfig.a;
import io7.a;
import java.util.Objects;
import brd.t;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import com.yxcorp.gifshow.util.rx.RxBus$a;
import java.lang.Enum;
import com.kwai.platform.keventbus.KEventBus$ThreadMode;
import com.yxcorp.gifshow.util.rx.b;
import io.reactivex.g;
import java.lang.Integer;
import java.util.TreeMap;
import dn.b;
import com.yxcorp.experiment.c;
import wu8.p;
import com.jakewharton.rxrelay2.PublishRelay;
import eoc.a;
import brd.w;
import com.yxcorp.gifshow.util.rx.a$a;
import brd.z;
import t45.d;
import eoc.e;

public class RxBus	// class@001343
{
    public final f a;
    public final a b;
    public SharedPreferences c;
    public boolean d;
    public a e;
    public static final RxBus f;

    static {
       RxBus.f = new RxBus();
    }
    public void RxBus(){
       super();
       this.a = i.d.b(1);
       this.b = new a();
       SharedPreferences sharedPrefer = b.c(a.b(), "KEventBusSDK", 0);
       this.c = sharedPrefer;
       this.d = sharedPrefer.getBoolean("openKEventBus", 1);
       Log.g("KEventBusSDK", "openKEventBus is "+this.d);
       this.e = new c(this);
    }
    public Object a(Class p0){
       if (this.d != null) {
          return this.a.X1(p0);
       }
       Object obj = this.b.b.get(p0);
       p0 = (p0.isInstance(obj))? p0.cast(obj): null;
       return p0;
    }
    public void b(Object p0){
       if (this.d != null) {
          this.a.K1(p0);
       }else {
          this.b.a(p0);
       }
       if (a.d().c() && !a.t().o("openKEventBus", this.e)) {
          Log.g("KEventBusSDK", "addSwitchObserver ");
          a.t().p("openKEventBus", this.e);
       }
       return;
    }
    public void c(Object p0){
       if (this.d != null) {
          this.a.P1(p0);
       }else {
          this.b.a(p0);
       }
       return;
    }
    public Object d(Class p0){
       if (this.d != null) {
          return this.a.V1(p0);
       }
       Object obj = this.b.b.remove(p0);
       p0 = (p0.isInstance(obj))? p0.cast(obj): null;
       return p0;
    }
    public boolean e(Object p0){
       if (this.d != null) {
          return this.a.O1(p0);
       }
       RxBus tb = this.b;
       Objects.requireNonNull(tb);
       boolean b = (p0 == null)? false: tb.b.remove(p0.getClass(), p0);
       return b;
    }
    public t f(Class p0){
       return this.j(p0, RxBus$ThreadMode.POSTING, false, false);
    }
    public t g(Class p0,RxBus$ThreadMode p1){
       return this.j(p0, p1, false, false);
    }
    public t h(Class p0,RxBus$ThreadMode p1,int p2){
       return this.j(p0, p1, false, p2);
    }
    public t i(Class p0,RxBus$ThreadMode p1,boolean p2){
       return this.j(p0, p1, p2, 0);
    }
    public t j(Class p0,RxBus$ThreadMode p1,boolean p2,int p3){
       KEventBus$ThreadMode pOSTING;
       int i = 4;
       int i1 = 3;
       int i2 = 2;
       int i3 = 1;
       if (this.d != null) {
          int i4 = RxBus$a.a[p1.ordinal()];
          if (i4 != i3) {
             if (i4 != i2) {
                if (i4 != i1) {
                   pOSTING = (i4 != i)? KEventBus$ThreadMode.POSTING: KEventBus$ThreadMode.BACKGROUND;
                }else {
                   pOSTING = KEventBus$ThreadMode.ASYNC;
                }
             }else {
                pOSTING = KEventBus$ThreadMode.MAIN_NEXT_RUNNABLE;
             }
          }else {
             pOSTING = KEventBus$ThreadMode.MAIN;
          }
          b uob = new b(this, p0, pOSTING, p2, p3);
          return t.create(pOSTING);
       }else {
          RxBus tb = this.b;
          a a = tb.a;
          _monitor_enter(a);
          b uob1 = tb.a.get(Integer.valueOf(p3));
          if (uob1 == null) {
             boolean b = false;
             if (c.h().k()) {
                b = p.d().c("rxbus_thread_exp", b);
             }
             uob1 = (b)? PublishRelay.d(): PublishRelay.d().c();
             tb.a.put(Integer.valueOf(p3), uob1);
          }
          _monitor_exit(a);
          t ot = uob1.ofType(p0);
          if (p2) {
             ot = ot.startWith(new a(tb, p0));
          }
          int i5 = a$a.a[p1.ordinal()];
          if (i5 != i3) {
             if (i5 != i2) {
                if (i5 != i1) {
                   if (i5 == i) {
                      ot = ot.observeOn(tb.c);
                   }
                }else {
                   ot = ot.observeOn(d.c);
                }
             }else {
                ot = ot.observeOn(d.a);
             }
          }else {
             ot = ot.observeOn(e.c);
          }
          return ot;
       }
    }
    public t k(Class p0,boolean p1){
       return this.j(p0, RxBus$ThreadMode.POSTING, p1, 0);
    }
}

package com.kwai.framework.abtest.ABTestInitModule;
import com.kwai.framework.init.a;
import java.lang.Math;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import c76.b;
import java.util.List;
import db6.e;
import com.kwai.framework.switchs.SwitchConfigInitModule;
import com.kwai.framework.initmodule.AzerothInitModule;
import com.kwai.framework.network.RetrofitInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import i56.e;
import java.lang.Runnable;
import ekd.s1;
import b76.a;
import wu8.p;
import java.util.Objects;
import com.yxcorp.experiment.c;
import wu8.f;
import wu8.h;
import f97.a;
import i56.d;
import wu8.s$b;
import wu8.q$a;
import com.yxcorp.experiment.f;
import ub7.f;
import bv8.e;
import bv8.a;
import com.yxcorp.experiment.g;
import com.yxcorp.experiment.e;
import com.yxcorp.experiment.logger.a;
import c97.d;
import h97.g;
import com.kwai.framework.abtest.a;
import com.kwai.framework.model.user.QCurrentUser;
import wu8.o;
import com.kwai.framework.abtest.e;
import com.kwai.framework.abtest.b;
import i56.a;
import com.kwai.sdk.switchconfig.a;
import wu8.q;
import yb7.p;
import java.lang.IllegalArgumentException;
import zu8.c;
import zu8.a;
import zu8.b;
import wu8.v;
import com.kwai.middleware.azeroth.Azeroth2;
import android.content.Context;
import wu8.b;
import wu8.d;
import dv8.b;
import android.content.SharedPreferences;
import dv8.a;
import com.yxcorp.experiment.ABConfigUpdateReceiver;
import wu8.e;
import i56.f;
import o56.d;
import com.kwai.framework.abtest.c;
import t45.c;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.n;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import i56.b;
import erd.g;
import crd.b;
import eda.l;
import i56.c;

public class ABTestInitModule extends a	// class@000b07
{
    public static final boolean q;
    public static final Boolean r;

    static {
       boolean b = (Math.random() - 0x3f50624dd2f1a9fc <= 0)? true: false;
       ABTestInitModule.q = b;
       ABTestInitModule.r = Boolean.TRUE;
    }
    public void ABTestInitModule(){
       super();
    }
    public boolean H7(){
       Object obj = PatchProxy.apply(null, this, ABTestInitModule.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (b.b() ^ 0x01);
    }
    public int f0(){
       return 21;
    }
    public List g(){
       Class[] obj = PatchProxy.apply(null, this, ABTestInitModule.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 1;
       int i1 = 0;
       int i2 = 2;
       if (e.f()) {
          obj = new Class[]{SwitchConfigInitModule.class,AzerothInitModule.class,RetrofitInitModule.class};
          return Lists.e(obj);
       }else {
          obj = new Class[i2];
          obj[i1] = SwitchConfigInitModule.class;
          obj[i] = AzerothInitModule.class;
          return Lists.e(obj);
       }
    }
    public void h0(){
       if (PatchProxy.applyVoid(null, this, ABTestInitModule.class, "4")) {
          return;
       }
       s1.d(new e(this));
       return;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ABTestInitModule.class, "3")) {
          return;
       }
       Objects.requireNonNull(p.d());
       if (c.h().f()) {
          Objects.requireNonNull(p.d());
          c uoc = c.h();
          Objects.requireNonNull(uoc);
          if (!f.c() && c.h().f()) {
             uoc.m = true;
             a.a(new h(uoc));
          }
       }
       s1.d(new d(this));
       return;
    }
    public void n(){
       c e;
       v d;
       v f;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ABTestInitModule.class, "1")) {
          return;
       }
       p op = p.d();
       s$b uob = new s$b();
       uob.h(true);
       uob.i(f.a);
       uob.m(f.a);
       uob.c(new e());
       uob.j(true);
       uob.b(g.a);
       uob.a(e.a);
       uob.l("/rest/zt/appsupport/abtest/config");
       boolean b = false;
       uob.e(b);
       uob.f(a.m);
       uob.g(b);
       uob.n(d.a().b().getUserId());
       uob.h(true);
       uob.i(a.a);
       uob.n(QCurrentUser.ME.getId());
       e uoe = PatchProxy.apply(objArray, this, ABTestInitModule.class, "9");
       if (uoe != patchProxyRe) {
       }else {
          uoe = new e(this);
       }
       uob.k(uoe);
       uob.m(0xea60);
       uob.b(b.a);
       uob.a(new a(this));
       uob.l("/rest/n/system/abtest/config");
       uob.e(true);
       uob.f(a.t().b("abTestEntranceLogInterval", 0x4e20));
       uob.g(a.t().d("abTestEntranceLogUsingHighFrequency", b));
       q oq = uob.d();
       if (d.a().i()) {
          boolean[] uobooleanArr = new boolean[true];
          int b1 = (oq.e() - 1000 >= 0)? true: false;
          uobooleanArr[b] = b1;
          b1 = 0;
          while (true) {
             if (b1 < 1) {
                if (uobooleanArr[b1]) {
                   b1 = b1 + 1;
                }else {
                   throw new IllegalArgumentException("");
                }
             }
          }
       }
       Objects.requireNonNull(op);
       p.a(oq, "initParams cannot be null");
       f.c = oq.g();
       f.b = Boolean.valueOf(oq.h().get().booleanValue());
       c uoc = c.h();
       Objects.requireNonNull(uoc);
       p.a(oq, "initParams cannot be null");
       uoc.k = oq;
       uoc.e = oq.n();
       uoc.b.i(new c());
       uoc.g = true;
       Azeroth2 b2 = Azeroth2.B;
       v ov = new v(b2.d());
       uoc.h = ov;
       e = uoc.e;
       uoc.i = new b(ov, e);
       uoc.j = new d(ov, e);
       _monitor_enter(ov);
       d = ov.d;
       if (d != null) {
          _monitor_exit(ov);
       }else {
          Object[] objArray3 = new Object[true];
          objArray3[b] = ov.a.getPackageName();
          d = d.a().b().getSharedPreferences(String.format("%s_logevent_abtest", objArray3), b);
          ov.d = d;
          _monitor_exit(ov);
       }
       b uob1 = new b(d);
       e = uoc.h;
       _monitor_enter(e);
       v e1 = e.e;
       if (e1 != null) {
          _monitor_exit(e);
       }else {
          Object[] objArray2 = new Object[true];
          objArray2[b] = e.a.getPackageName();
          e1 = d.a().b().getSharedPreferences(String.format("%s_manual_logevent_abtest", objArray2), b);
          e.e = e1;
          _monitor_exit(e);
       }
       b uob2 = new b(e1);
       c h = uoc.h;
       _monitor_enter(h);
       f = h.f;
       if (f != null) {
          _monitor_exit(h);
       }else {
          Object[] objArray1 = new Object[true];
          objArray1[b] = h.a.getPackageName();
          f = d.a().b().getSharedPreferences(String.format("%s_unique_seq_id_abtest", objArray1), b);
          h.f = f;
          _monitor_exit(h);
       }
       uoc.n = new a(uob1, uob2, new a(f));
       if (f.c()) {
          ABConfigUpdateReceiver uABConfigUpd = new ABConfigUpdateReceiver();
          Context uContext = b2.d();
          if (f.c()) {
             a.a(new e(uContext, uABConfigUpd));
          }
       }
       op = p.d();
       f uof = PatchProxy.apply(objArray, this, ABTestInitModule.class, "7");
       if (uof != patchProxyRe) {
       }else {
          uof = new f(this);
       }
       Objects.requireNonNull(op);
       if (uof != null) {
          c.h().b.i(uof);
       }
       if (ABTestInitModule.r.booleanValue() && d.i) {
          Objects.requireNonNull(p.d());
          c.h().l = true;
       }
       c.a(c.b);
       RxBus f1 = RxBus.f;
       RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
       f1.g(n.class, mAIN).subscribe(new b(this));
       f1.g(l.class, mAIN).subscribe(new c(this));
       return;
    }
    public int priority(){
       return 100;
    }
}

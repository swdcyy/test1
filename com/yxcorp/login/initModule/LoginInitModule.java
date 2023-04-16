package com.yxcorp.login.initModule.LoginInitModule;
import com.kwai.framework.init.a;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.init.CoreInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import com.yxcorp.login.util.x;
import b76.a;
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.n;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import n1d.c;
import erd.g;
import crd.b;
import eda.l;
import n1d.b;
import i56.h;
import t45.d;
import brd.z;
import n1d.a;
import fw8.r;
import com.yxcorp.login.initModule.e;
import fw8.r$a;
import com.yxcorp.login.initModule.a;
import com.yxcorp.login.initModule.b;
import n1d.f;
import java.lang.Runnable;
import com.kwai.framework.init.e;
import n1d.d;
import n1d.e;
import java.util.concurrent.Future;
import t45.c;
import android.app.Application;
import o56.a;
import u45.b;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import com.kwai.feature.api.social.login.model.LoginParams;
import android.content.Context;
import b3d.v;
import wkd.b;
import m1d.a;
import cjd.e;
import erd.o;
import com.yxcorp.login.util.i;
import com.yxcorp.login.util.j;
import b66.k$a;

public class LoginInitModule extends a	// class@001adc
{
    public boolean q;
    public ProgressFragment r;
    public b s;
    public static final int t;

    public void LoginInitModule(){
       super();
       this.q = true;
    }
    public boolean C(){
       return true;
    }
    public int f0(){
       return 13;
    }
    public List g(){
       Class[] obj = PatchProxy.apply(null, this, LoginInitModule.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{CoreInitModule.class};
       return Lists.e(obj);
    }
    public void h0(){
       PatchProxy.applyVoid(null, this, LoginInitModule.class, "12");
    }
    public void i0(){
       if (PatchProxy.applyVoid(null, this, LoginInitModule.class, "11")) {
          return;
       }
       if (this.g0()) {
          x.b(this.l0());
       }
       this.n0();
       return;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LoginInitModule.class, "3")) {
          return;
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, LoginInitModule.class, "2")) {
          if (!a.d().i(this)) {
             a.d().p(this);
             RxBus f = RxBus.f;
             RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
             f.g(n.class, mAIN).subscribe(new c(this));
             t ot = f.g(l.class, mAIN);
             ot.subscribe(new b(this));
             this.s = f.f(h.class).observeOn(d.c).subscribe(new a(this));
          }
          if (!PatchProxy.applyVoid(objArray, this, LoginInitModule.class, "14")) {
             r.c().a(new e(this));
          }
          if (!PatchProxy.applyVoid(objArray, this, LoginInitModule.class, "15")) {
             l.g = a.a;
             n.c = b.a;
          }
       }
       x.b(this.l0());
       e.g(new f(this), "LoginInitModule");
       e.g(new d(this), "LoginInitModule-sharedAccount");
       c.k(new e(this));
       return;
    }
    public final RequestTiming l0(){
       if (this.q == null) {
          return RequestTiming.ON_FOREGROUND;
       }
       this.q = false;
       return RequestTiming.COLD_START;
    }
    public void n(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LoginInitModule.class, "1")) {
          return;
       }
       Application uApplication = a.b();
       if (!PatchProxy.applyVoidOneRefs(uApplication, objArray, b.class, "1")) {
          b.c = uApplication;
          b.d = new b();
       }
       return;
    }
    public void n0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LoginInitModule.class, "7")) {
          return;
       }
       if (!QCurrentUser.ME.isLogined()) {
          LoginParams$a uoa = new LoginParams$a();
          uoa.f("initModule");
          if (v.c(a.b(), uoa.a()) && !PatchProxy.applyVoid(objArray, objArray, v.class, "3")) {
             b.a(0x5cfaafff).g0().map(new e()).subscribe(i.b, j.b);
          }
       }
       return;
    }
    public void onEventMainThread(k$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LoginInitModule.class, "8")) {
          return;
       }
       if (p0.a == 2 && !QCurrentUser.me().isLogined()) {
          x.a(RequestTiming.AFTER_STARTUP);
       }
       return;
    }
}

package com.yxcorp.gifshow.webview.yoda.YodaInitModule;
import com.kwai.framework.init.a;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.initmodule.AzerothInitModule;
import com.kwai.framework.abtest.ABTestInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import tx7.a;
import java.util.Objects;
import yz7.r;
import java.util.concurrent.TimeUnit;
import brd.a0;
import brd.z;
import tx7.j;
import tx7.k;
import erd.g;
import crd.b;
import b76.a;
import o56.a;
import com.yxcorp.gifshow.webview.cookie.g;
import com.google.common.collect.ImmutableCollection;
import xx7.b;
import myc.t;
import android.app.Application;
import java.lang.Runnable;
import com.kwai.framework.init.e;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.n;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import com.yxcorp.gifshow.webview.yoda.i;
import com.kwai.yoda.Yoda;
import com.kwai.yoda.session.logger.webviewload.SdkInitInfo;
import java.lang.System;
import android.os.SystemClock;
import wkd.b;
import com.yxcorp.gifshow.w;
import java.lang.Long;
import java.lang.Boolean;
import c76.b;
import p80.z;
import java.lang.Number;
import p80.z$a;
import com.yxcorp.gifshow.webview.yoda.utils.q;
import com.yxcorp.gifshow.webview.yoda.j;
import t45.c;

public class YodaInitModule extends a	// class@0017a6
{
    public static final int q;

    public void YodaInitModule(){
       super();
    }
    public int f0(){
       return 20;
    }
    public List g(){
       Class[] obj = PatchProxy.apply(null, this, YodaInitModule.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{AzerothInitModule.class,ABTestInitModule.class};
       return Lists.e(obj);
    }
    public void h0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, YodaInitModule.class, "7")) {
          return;
       }
       a i = a.i;
       Objects.requireNonNull(i);
       if (!PatchProxy.applyVoid(objArray, i, a.class, "10")) {
          r.b("YodaCodeCache", "onBackground\(\) called");
          if (a.f) {
             r.b("YodaCodeCache", "onBackground\(\) checked in this app life");
          }else if(!i.n()){
             r.j("YodaCodeCache", "onBackground Please call inited\(\) first.");
          }else if(!a.c){
             r.j("YodaCodeCache", "onBackground Code cache generating is not supported by webview core.");
          }else {
             a.f = true;
             a0.Y(3, TimeUnit.SECONDS).T(a.a).R(j.b, k.b);
             r.b("YodaCodeCache", "onBackground\(\) start delay");
          }
       }
       return;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaInitModule.class, "5")) {
          return;
       }
       if (!this.l0()) {
          this.n0();
       }
       Application b = a.B;
       if (!PatchProxy.applyVoidOneRefs(b, this, YodaInitModule.class, "6")) {
          String[] stringArray = new String[0];
          b.a(g.c.toArray(stringArray));
          String[] stringArray1 = new String[]{"userId"};
          b.a(stringArray1);
          stringArray1 = new String[]{"kpn"};
          b.a(stringArray1);
          e.g(new t(this, b), "YodaInitModule");
          RxBus.f.g(n.class, RxBus$ThreadMode.MAIN).subscribe(i.b);
       }
       SdkInitInfo initSDKInfo = Yoda.get().getInitSDKInfo();
       initSDKInfo.appLaunchStartTime = Long.valueOf((System.currentTimeMillis() - (SystemClock.elapsedRealtime() - b.a(-1343064608).getAppStartTime())));
       initSDKInfo.appLaunchFinishTime = Long.valueOf(System.currentTimeMillis());
       return;
    }
    public final boolean l0(){
       Object obj = PatchProxy.apply(null, this, YodaInitModule.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.a();
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, YodaInitModule.class, "2")) {
          return;
       }
       if (this.l0()) {
          this.n0();
       }
       return;
    }
    public final void n0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, YodaInitModule.class, "4")) {
          return;
       }
       Object obj = PatchProxy.apply(objArray, objArray, z.class, "1");
       int i = (obj != PatchProxyResult.class)? obj.intValue(): z.a.a();
       boolean b = true;
       if (i != b) {
          if (i != 2) {
             q.e();
          }else {
             c.a(j.b);
          }
       }else {
          q.c(a.B, b);
       }
       return;
    }
}

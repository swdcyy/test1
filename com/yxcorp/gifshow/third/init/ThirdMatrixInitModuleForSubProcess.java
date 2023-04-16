package com.yxcorp.gifshow.third.init.ThirdMatrixInitModuleForSubProcess;
import com.kwai.framework.init.a;
import com.yxcorp.gifshow.third.init.ThirdMatrixInitModuleForSubProcess$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import c76.b;
import java.util.List;
import com.kwai.framework.initmodule.AzerothInitModule;
import com.kwai.framework.switchs.SwitchConfigInitModule;
import com.yxcorp.gifshow.push.init.PushSdkInitModuleForSubProcess;
import com.kwai.framework.imagebase.ImageManagerInitModule;
import com.kwai.framework.network.cronet.CronetInitModule;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;
import o56.a;
import ikc.b;
import android.app.Application;
import kotlin.jvm.internal.a;
import ax7.a$a;
import m6b.b;
import jkc.b;
import android.content.Context;
import tb7.b;
import zsd.u;
import com.kwai.middleware.azeroth.Azeroth2;
import q97.c;
import qrd.l1;
import ax7.a;
import zw7.f;
import zw7.d;
import ax7.c;
import zw7.c;
import com.kwai.sdk.switchconfig.a;
import kkc.i;
import java.util.Objects;
import android.content.SharedPreferences;
import vid.b;
import java.lang.System;
import java.lang.Math;
import wkd.b;
import kkc.d;
import kkc.e;
import java.util.Map;
import brd.t;
import kkc.f;
import erd.g;
import crd.b;
import android.content.IntentFilter;
import com.yxcorp.gifshow.third.signal.ScreenReceiver;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import com.yxcorp.gifshow.util.rx.RxBus;
import kkc.c;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import java.util.concurrent.TimeUnit;
import kkc.g;
import kkc.b;
import java.util.UUID;
import android.os.SystemClock;
import t45.d;
import brd.z;
import kkc.a;
import com.yxcorp.utility.RomUtils;
import android.content.ComponentName;
import com.yxcorp.gifshow.matrix.DirectoryProvider;
import android.content.pm.PackageManager;
import n6b.b;
import com.kwai.android.common.bean.Channel;
import o6b.a;
import com.yxcorp.gifshow.third.init.ThirdMatrixInitModuleForSubProcess$execute$1;
import jkc.c;
import msd.l;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import k2b.u1;
import jkc.a;
import java.lang.Enum;
import io7.f;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import zk.g;
import java.util.Calendar;
import m6b.a;
import gx7.d;
import com.yxcorp.gifshow.third.init.ThirdMatrixInitModuleForSubProcess$dealContact$1;
import asd.c;
import ftd.k0;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import ftd.z1;
import kotlinx.coroutines.a;
import com.yxcorp.gifshow.third.init.ThirdMatrixInitModuleForSubProcess$dealJPush$1;
import com.yxcorp.gifshow.third.init.ThirdMatrixInitModuleForSubProcess$dealGetui$1;
import com.yxcorp.gifshow.third.init.ThirdMatrixInitModuleForSubProcess$dealMatrix$1;

public final class ThirdMatrixInitModuleForSubProcess extends a	// class@001328
{
    public static final ThirdMatrixInitModuleForSubProcess$a q;

    static {
       ThirdMatrixInitModuleForSubProcess.q = new ThirdMatrixInitModuleForSubProcess$a(null);
    }
    public void ThirdMatrixInitModuleForSubProcess(){
       super();
    }
    public boolean H7(){
       Object obj = PatchProxy.apply(null, this, ThirdMatrixInitModuleForSubProcess.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (b.b() ^ 0x01);
    }
    public int f0(){
       return 9;
    }
    public List g(){
       Class[] obj = PatchProxy.apply(null, this, ThirdMatrixInitModuleForSubProcess.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{AzerothInitModule.class,SwitchConfigInitModule.class,PushSdkInitModuleForSubProcess.class,ImageManagerInitModule.class,CronetInitModule.class};
       return CollectionsKt__CollectionsKt.r(obj);
    }
    public final boolean l0(){
       Object obj = PatchProxy.apply(null, this, ThirdMatrixInitModuleForSubProcess.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (a.d()) {
          return b.b.a();
       }
       return false;
    }
    public void n(){
       String a;
       l1 a1;
       Object obj = this;
       Object[] objArray = null;
       String str = "2";
       if (PatchProxy.applyVoid(objArray, obj, ThirdMatrixInitModuleForSubProcess.class, str)) {
          return;
       }
       Application uApplication = a.b();
       String str1 = "context";
       a.o(uApplication, str1);
       boolean b = false;
       if (!PatchProxy.applyVoidOneRefs(uApplication, obj, ThirdMatrixInitModuleForSubProcess.class, "8")) {
          a = a.a;
          a.o(a, "AppEnv.DEVICE_ID");
          a$a uoa = new a$a(uApplication, a);
          uoa.a = this.l0();
          b uob = new b();
          a.p(uob, "provider");
          uoa.c = uob;
          uob = new b();
          a.p(uob, "callback");
          uoa.b = uob;
          if (u.H1(b.e(uoa.d), "push_v3", b, 2, objArray)) {
             String str3 = "matrix";
             if (uoa.b == null) {
                Azeroth2.B.h().e(str3, " call back is not set");
                a1 = l1.a;
             }
             if (uoa.c == null) {
                Azeroth2.B.h().e(str3, " api provider is not set");
                a1 = l1.a;
             }
          }
          a uoa1 = new a(uoa.d, uoa.e, uoa.a, uoa.b, uoa.c, null);
          a.p(uob, "config");
          c.a.a(uob);
       }
       if (a.t().d("signalCollectEnable", b)) {
          i d = i.d;
          Objects.requireNonNull(d);
          i oi = i.class;
          if (!PatchProxy.applyVoidOneRefs(uApplication, d, oi, str)) {
             a.p(uApplication, str1);
             SharedPreferences sharedPrefer = b.c(uApplication, "signal_collect", b);
             a.o(sharedPrefer, "KwaiSharedPreferences.ob¡­me, Context.MODE_PRIVATE\)");
             i.a = sharedPrefer;
             if (!PatchProxy.applyVoidOneRefs(uApplication, d, oi, "3")) {
                sharedPrefer = i.a;
                String str2 = "sp";
                if (sharedPrefer == null) {
                   a.S(str2);
                }
                long l = 0;
                long longx = sharedPrefer.getLong("key_last_cold_request", l);
                sharedPrefer = i.a;
                if (sharedPrefer == null) {
                   a.S(str2);
                }
                l = System.currentTimeMillis();
                if (Math.abs((l - longx)) - sharedPrefer.getLong("cold_request_interval_ms", l) >= 0) {
                   Object obj2 = b.a(-209589128);
                   a.o(obj2, "Singleton.get\(SignalApi::class.java\)");
                   obj2.a().a(d.b(uApplication)).subscribe(new f(l));
                }
             }
             if (!PatchProxy.applyVoidOneRefs(uApplication, d, oi, "10")) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("android.intent.action.USER_PRESENT");
                UniversalReceiver.e(uApplication, new ScreenReceiver(), intentFilter);
                RxBus.f.i(c.class, RxBus$ThreadMode.MAIN, true).debounce(5, TimeUnit.SECONDS).subscribe(g.b);
             }
          }
          b e = b.e;
          Objects.requireNonNull(e);
          if (!PatchProxy.applyVoidOneRefs(uApplication, e, b.class, str)) {
             a.p(uApplication, str1);
             b obj1 = (!(b.a).length())? 1: null;
             if (obj1) {
                str = PatchProxy.apply(objArray, e, b.class, "1");
                if (str != PatchProxyResult.class) {
                }else {
                   str = UUID.randomUUID().toString();
                   a.o(str, "UUID.randomUUID\(\).toString\(\)");
                }
                b.a = str;
             }
             b.b = SystemClock.elapsedRealtime();
             obj1 = b.c;
             if (obj1 != null) {
                obj1.dispose();
             }
             b.c = t.interval(b.d, TimeUnit.MILLISECONDS).observeOn(d.c).subscribe(new a(uApplication));
          }
       }
       ThirdMatrixInitModuleForSubProcess$a q = ThirdMatrixInitModuleForSubProcess.q;
       Objects.requireNonNull(q);
       if (!PatchProxy.applyVoid(objArray, q, ThirdMatrixInitModuleForSubProcess$a.class, "1")) {
          uApplication = a.b();
          if (uApplication != null) {
             if (!RomUtils.n()) {
                b = a.t().d("conEnable", true);
             }
             ComponentName uComponentNa = new ComponentName(uApplication, DirectoryProvider.class);
             int componentEna = uApplication.getPackageManager().getComponentEnabledSetting(uComponentNa);
             if (b) {
                if (componentEna != 1 && componentEna) {
                   uApplication.getPackageManager().setComponentEnabledSetting(uComponentNa, true, true);
                }
             }else if(componentEna != 2){
                uApplication.getPackageManager().setComponentEnabledSetting(uComponentNa, 2, true);
             }
          }
       }
    label_020a :
       if (!a.t().d("getuiEnableRequest", true)) {
          b.a.c("not enable", Channel.MATRIX_GETUI);
          return;
       }else {
          RxBus.f.i(a.class, RxBus$ThreadMode.MAIN, true).throttleFirst(3, TimeUnit.SECONDS).subscribe(new c(new ThirdMatrixInitModuleForSubProcess$execute$1(obj)));
          return;
       }
    }
    public final void onEvent(a p0){
       int b1;
       long l2;
       int i1;
       b a;
       Object obj = this;
       if (PatchProxy.applyVoidOneRefs(p0, obj, ThirdMatrixInitModuleForSubProcess.class, "3")) {
          return;
       }
       if (p0.b()) {
          i3 oi3 = i3.f();
          oi3.c("type", Integer.valueOf(p0.a().type));
          oi3.d("channel", p0.a().classPath);
          u1.H0(p0.b(), oi3.e());
       }
       int i = a.a[p0.a().ordinal()];
       String str = 2;
       long l = 0x5265c00;
       long l1 = 0;
       boolean b = true;
       if (i != b) {
          String str1 = "not enable";
          String str2 = "getuiEnableRequest";
          if (i != str) {
             if (i != 3) {
                if (i == 4 && !PatchProxy.applyVoid(null, obj, ThirdMatrixInitModuleForSubProcess.class, "6")) {
                   if (!a.t().d(str2, b)) {
                      b.a.c(str1, Channel.CONTACT);
                   }else {
                      Application uApplication = a.b();
                      a.o(uApplication, "AppEnv.getAppContext\(\)");
                      ThirdMatrixInitModuleForSubProcess$a q = ThirdMatrixInitModuleForSubProcess.q;
                      Objects.requireNonNull(q);
                      i obj1 = PatchProxy.apply(null, q, ThirdMatrixInitModuleForSubProcess$a.class, "2");
                      if (obj1 != PatchProxyResult.class) {
                         b1 = obj1.booleanValue();
                      }else {
                         f uof = a.t().f("screenOfSilent");
                         JsonElement jsonElement = (uof != null)? uof.c(): null;
                         v10 = jsonElement instanceof JsonObject;
                         Object[] objArray = (!str1)? null: jsonElement;
                         if (objArray != null) {
                            g og = objArray.r0("begin");
                            if (og != null) {
                               i1 = og.p();
                            label_00d1 :
                               i1 = i1 * 60;
                               if (!str1) {
                                  jsonElement = null;
                               }
                               if (jsonElement != null) {
                                  g og1 = jsonElement.r0("end");
                                  if (og1 != null) {
                                     b1 = og1.p();
                                  label_00e8 :
                                     b1 = b1 * 60;
                                     Calendar instance = Calendar.getInstance();
                                     a.o(instance, "calendar");
                                     instance.setTimeInMillis(System.currentTimeMillis());
                                     int i2 = (instance.get(11) * 60) + instance.get(12);
                                     if (i1 > i2 || (1440 < i2 && (i2 < 0 || b1 < i2))) {
                                        b = false;
                                     }
                                     b1 = b;
                                  }
                               }
                               b1 = 7;
                               goto label_00e8 ;
                            }
                         }
                         i1 = 23;
                         goto label_00d1 ;
                      }
                      if (b1) {
                         obj1 = i.d;
                         if (obj1.d(uApplication) && (!obj1.c(uApplication) || this.l0())) {
                         }
                      }else if(this.l0()){
                         l1 = a.a.getLong("contactLastRequestTimestamp", l1);
                      }
                      l2 = System.currentTimeMillis();
                      if (Math.abs((l2 - l1)) - a.a.getLong("contactRequestIntervalInMs", l) >= 0) {
                         a.f(d.b, null, null, new ThirdMatrixInitModuleForSubProcess$dealContact$1(uApplication, l2, null), 3, null);
                      }else {
                         b.a.c("too frequent", Channel.CONTACT);
                      }
                   }
                }
             }else if(PatchProxy.applyVoid(null, obj, ThirdMatrixInitModuleForSubProcess.class, "5")){
                if (!a.t().d(str2, b)) {
                   b.a.c(str1, Channel.MATRIX_JPUSH);
                }else if(this.l0()){
                   l1 = a.a.getLong("jPushLastRequestTimestamp", l1);
                }
                l = System.currentTimeMillis();
                if (Math.abs((l - l1)) - a.a.getLong("jPushRequestIntervalInMs", l) >= 0) {
                   a.f(d.b, null, null, new ThirdMatrixInitModuleForSubProcess$dealJPush$1(l, null), 3, null);
                }else {
                   b.a.c("too frequent", Channel.MATRIX_JPUSH);
                }
             }
          }else if(PatchProxy.applyVoid(null, obj, ThirdMatrixInitModuleForSubProcess.class, "4")){
             if (!a.t().d(str2, b)) {
                b.a.c(str1, Channel.MATRIX_GETUI);
             }else if(this.l0()){
                l1 = a.a.getLong("lastRequestTimestamp", l1);
             }
             l = System.currentTimeMillis();
             if (Math.abs((l - l1)) - a.a.getLong("requestIntervalInMs", l) >= 0) {
                a.f(d.b, null, null, new ThirdMatrixInitModuleForSubProcess$dealGetui$1(l, null), 3, null);
             }else {
                b.a.c("too frequent", Channel.MATRIX_GETUI);
             }
          }
       }else if(PatchProxy.applyVoid(null, obj, ThirdMatrixInitModuleForSubProcess.class, "9")){
          a = b.a;
          b.b(a, "MATRIX_SUC", null, str, null);
          if (!this.l0()) {
             l1 = a.a.getLong("matrixLastRequestTimestamp", l1);
          }
          l2 = System.currentTimeMillis();
          if (Math.abs((l2 - l1)) - a.a.getLong("matrixRequestIntervalInMs", l) >= 0) {
             a.f(d.b, null, null, new ThirdMatrixInitModuleForSubProcess$dealMatrix$1(l2, null), 3, null);
          }else {
             a.c("too frequent", Channel.MATRIX);
          }
       }
    label_0274 :
       return;
    }
}

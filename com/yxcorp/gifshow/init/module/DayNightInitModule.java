package com.yxcorp.gifshow.init.module.DayNightInitModule;
import android.content.ComponentCallbacks2;
import com.kwai.framework.init.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import c76.b;
import java.util.List;
import com.kwai.framework.abtest.ABTestInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import android.content.ComponentCallbacks;
import o56.e;
import xf6.d;
import xf6.l;
import zf6.i;
import zf6.d;
import java.util.concurrent.atomic.AtomicBoolean;
import zf6.c;
import android.app.Application$ActivityLifecycleCallbacks;
import java.util.Map;
import wl7.b;
import rl7.b;
import km8.b;
import android.content.SharedPreferences;
import com.yxcorp.gifshow.init.module.o;
import com.kwai.library.widget.icon.b;
import com.kwai.library.widget.icon.b$c;
import android.util.LongSparseArray;
import java.lang.Throwable;
import android.content.res.Resources;
import java.lang.UnsupportedOperationException;
import com.yxcorp.gifshow.init.module.k;
import com.yxcorp.gifshow.init.module.l;
import com.yxcorp.gifshow.init.module.n;
import com.yxcorp.gifshow.init.module.m;
import zf6.k;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import zf6.l;
import android.content.res.Configuration;
import com.kwai.performance.stability.crash.monitor.util.e;
import com.yxcorp.gifshow.log.n;
import com.kwai.framework.logger.config.b;
import wkd.b;
import j80.c;
import java.io.File;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.init.module.DayNightInitModule$DesignCDNServiceCallbackImpl;
import com.yxcorp.gifshow.init.module.DayNightInitModule$1;
import zyc.b;
import kotlin.jvm.internal.a;
import zyc.a;
import java.util.Objects;
import java.util.LinkedHashSet;
import java.util.Set;
import java.lang.IllegalArgumentException;
import java.util.Collection;
import trd.y;
import com.yxcorp.gifshow.widget.cdn.DesignPreloadManager;
import zyc.h;
import zyc.g;
import java.lang.Runnable;
import ekd.k1;

public class DayNightInitModule extends a implements ComponentCallbacks2	// class@001970
{
    public static final int q;

    public void DayNightInitModule(){
       super();
    }
    public boolean C(){
       return true;
    }
    public boolean H7(){
       Object obj = PatchProxy.applyWithListener(null, this, DayNightInitModule.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       PatchProxy.onMethodExit(DayNightInitModule.class, "2");
       return (b.b() ^ 0x01);
    }
    public int f0(){
       return 23;
    }
    public List g(){
       Class[] obj = PatchProxy.applyWithListener(null, this, DayNightInitModule.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{ABTestInitModule.class};
       PatchProxy.onMethodExit(DayNightInitModule.class, "3");
       return Lists.e(obj);
    }
    public void n(){
       String str1;
       String absolutePath;
       int i;
       String str2;
       List e;
       int i1;
       l a;
       o0 l;
       int i2;
       DayNightInitModule uDayNightIni1;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, DayNightInitModule.class, "1")) {
          return;
       }
       Application uApplication = a.b();
       if (SystemUtil.L(uApplication)) {
          a.C.registerComponentCallbacks(this);
          String str = "6";
          boolean b = false;
          if (!PatchProxy.applyVoidWithListener(objArray, this, DayNightInitModule.class, str)) {
             i = -1;
             if (SystemUtil.K()) {
                i1 = l.e("key_dark_mode_experiment", i);
                i2 = l.e("key_dark_mode_white_comment_experiment_new", i);
             }else {
                uDayNightIni1 = -1;
                i2 = -1;
             }
             if (i1 == i) {
                uDayNightIni1 = 1;
             }
             str1 = (i2 == i || !i2)? 1: null;
             if (!i.a) {
                i.a = true;
                i.b = uDayNightIni1;
                i.c = str1;
             }
             PatchProxy.onMethodExit(DayNightInitModule.class, str);
          }
          d uod = d.a();
          if (!uod.a.getAndSet(true)) {
             uod.b = new ArrayList();
             uApplication.registerActivityLifecycleCallbacks(new c(uod));
          }
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          str1 = "7";
          Map obj = PatchProxy.applyOneRefsWithListener(uApplication, this, DayNightInitModule.class, str1);
          if (obj != patchProxyRe) {
             obj.booleanValue();
          }else {
             str2 = "8";
             obj = PatchProxy.applyWithListener(objArray, this, DayNightInitModule.class, str2);
             if (obj != patchProxyRe) {
             }else {
                b uob = new b();
                if (!PatchProxy.applyVoidOneRefs(uob, objArray, b.class, "1")) {
                   uob.a(b.a);
                }
                obj = b.a;
                PatchProxy.onMethodExit(DayNightInitModule.class, str2);
             }
             if (obj.isEmpty()) {
                PatchProxy.onMethodExit(DayNightInitModule.class, str1);
             }else {
                b.i = b.b("DefaultPreferenceHelper");
                b.g = obj;
                b.e = uApplication;
                b.c = b;
                b.b(b.f(uApplication, obj, o.a), 1000);
                PatchProxy.onMethodExit(DayNightInitModule.class, str1);
             }
          }
          str = "5";
          if (!PatchProxy.applyVoidWithListener(objArray, this, DayNightInitModule.class, str)) {
             i = 2;
             if (!i.c()) {
                i1 = 1;
             }else if(i.d()){
                i1 = 2;
             }else {
                i1 = 0;
             }
             Application b2 = a.B;
             a = l.a;
             boolean b3 = i.b();
             boolean b4 = i.a();
             n a1 = n.a;
             m a2 = m.a;
             k.a = b2;
             k.b = k.a;
             String uid = a.getUid();
             k.c = uid;
             if (("0").equals(uid) || TextUtils.x(k.c)) {
                k.d = a;
             }
             Log.g("DayNightSettings", "init uid="+k.c+", initMode="+i1);
             k.e = i1;
             k.i = a1;
             k.j = a2;
             k.f = b3;
             k.h = Boolean.valueOf(b4);
             k.k = l.q(b2, 32);
             if (i1 == i) {
                absolutePath = "isSetupedDefaultEnable";
                if (!k.c(absolutePath)) {
                   k.i(true);
                   k.h(absolutePath, true);
                label_01a5 :
                   i1 = k.d();
                   e.v("dayNight", String.valueOf(i1));
                   l = n.L;
                   if (l instanceof b) {
                      l.g(i1);
                   }
                   PatchProxy.onMethodExit(DayNightInitModule.class, str);
                }
             }
             k.a(k.d());
             l.t(k.a, "10");
             goto label_01a5 ;
          }
          if (!PatchProxy.applyVoidOneRefsWithListener(uApplication, this, DayNightInitModule.class, "9")) {
             absolutePath = b.a(-1504323719).h("design/preload").getAbsolutePath();
             boolean b1 = a.t().d("kidIconPreloadResource", b);
             DayNightInitModule$DesignCDNServiceCallbackImpl uDesignCDNSe = new DayNightInitModule$DesignCDNServiceCallbackImpl(objArray);
             a.p(uApplication, "context");
             a.p(absolutePath, "preloadDirPath");
             a.p(uDesignCDNSe, "callback");
             b.d = uApplication;
             b.c = uDesignCDNSe;
             b.b = absolutePath;
             b.a = b1;
             a[] uoaArray = uDesignCDNSe.e();
             Objects.requireNonNull(b.f);
             LinkedHashSet linkedHashSe = new LinkedHashSet();
             int len = uoaArray.length;
             i = 0;
             while (true) {
                if (i < len) {
                   str2 = uoaArray[i].a();
                   if (!linkedHashSe.contains(str2)) {
                      linkedHashSe.add(str2);
                      i = i + 1;
                   }else {
                      throw new IllegalArgumentException("DesignCDNManager 不能注册重复的业务信息");
                   }
                }else {
                   e = b.e;
                   _monitor_enter(e);
                   e.clear();
                   y.s0(e, uoaArray);
                   _monitor_exit(e);
                   Log.g("design_cdn#download", "预下载开关："+b1);
                   if (b1) {
                      DayNightInitModule uDayNightIni = 0xea60;
                      List list = b.b();
                      str = b.b;
                      i = (list == null || list.isEmpty())? 1: 0;
                      if (!i) {
                         if (str == null || !str.length()) {
                            b = true;
                         }
                         if (!b) {
                            DesignPreloadManager.c.a(list, str, true);
                            k1.r(new g(new h(list, str), uDayNightIni), uDayNightIni);
                         }
                      }
                   }
                label_028e :
                   PatchProxy.onMethodExit(DayNightInitModule.class, "9");
                   break ;
                }
             }
          }
       }
       PatchProxy.onMethodExit(DayNightInitModule.class, "1");
       return;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, DayNightInitModule.class, "4")) {
          return;
       }
       l.t(a.B, "11");
       PatchProxy.onMethodExit(DayNightInitModule.class, "4");
       return;
    }
    public void onLowMemory(){
    }
    public void onTrimMemory(int p0){
    }
}

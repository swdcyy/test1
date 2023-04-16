package com.yxcorp.gifshow.AppLike;
import com.yxcorp.gifshow.KwaiApp;
import java.lang.System;
import com.yxcorp.gifshow.App;
import android.app.Application;
import o56.d;
import o56.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import pkd.a;
import ekd.n0;
import java.util.Objects;
import android.content.Context;
import bw9.c;
import java.lang.Boolean;
import com.yxcorp.utility.SystemUtil;
import oe6.k;
import wkd.b;
import l66.e;
import uv8.v1;
import java.lang.Integer;
import java.lang.Exception;
import ll8.a;
import java.lang.StringBuilder;
import android.os.Build;
import android.os.Build$VERSION;
import ekd.e0;
import com.yxcorp.gifshow.a;
import jd6.g;
import android.content.res.Configuration;
import bw9.b;
import java.lang.Thread$UncaughtExceptionHandler;
import java.lang.Thread;
import com.kwai.framework.initmodule.FoundationInfoInitModule;
import com.yxcorp.gifshow.init.module.ChannelInitializer;
import pxa.d;
import com.kwai.framework.network.RetrofitInitModule;
import com.kwai.framework.initmodule.AzerothInitModule;
import com.kwai.framework.debuglog.g;
import com.kwai.framework.switchs.SwitchConfigInitModule;
import com.kwai.framework.abtest.ABTestInitModule;
import com.yxcorp.gifshow.message.init.KLinkInitManager;
import com.yxcorp.gifshow.push.init.NotificationManagerInitModule;
import com.yxcorp.gifshow.push.init.PushSdkInitModuleForSubProcess;
import java.lang.CharSequence;
import tkd.b;
import tkd.d;
import m85.a;
import com.kwai.framework.init.a;
import com.yxcorp.gifshow.performance.monitor.PerformanceMonitorInitModule;
import com.yxcorp.gifshow.performance.monitor.crash.CrashMonitorInitModule;
import com.yxcorp.gifshow.ApplicationLike;
import uv8.k;

public class AppLike extends KwaiApp	// class@001025
{
    public static final long LAUNCH_TIME;

    static {
       AppLike.LAUNCH_TIME = System.currentTimeMillis();
    }
    public void AppLike(App p0){
       super(p0);
       d.h = AppLike.LAUNCH_TIME;
       a.B = p0;
    }
    public static int getBuildType(){
       String obj = PatchProxy.apply(null, null, AppLike.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = n0.d(a.b);
       Objects.requireNonNull(obj);
       int i = -1;
       switch (obj.hashCode()){
           case 0x5b09653:
             if (obj.equals("debug")) {
                i = 0;
             }
             break;
           case 0x5f0528d:
             if (obj.equals("huidu")) {
                i = 1;
             }
             break;
           case 0x41012807:
             if (obj.equals("release")) {
                i = 2;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             return 1;
           case 1:
             return 2;
           case 2:
             return 3;
           default:
             return 0;
       }
    }
    public void attachBaseContext(Context p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, AppLike.class, "2")) {
          return;
       }
       this.attachBuildConfig(p0);
       c uoc = c.d();
       Objects.requireNonNull(uoc);
       Object obj = PatchProxy.applyTwoRefs(p0, this, uoc, c.class, "3");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(!uoc.c(p0)){
          b = false;
       }else {
          SystemUtil.r(p0);
          new k().a();
          a.v = a.h;
          a.F = p0;
          a.C = this;
          b = true;
       }
       if (b) {
          return;
       }else if((SystemUtil.r(p0)).endsWith("widgetProvider")){
          return;
       }else {
          b.a(-238885097).install();
          super.attachBaseContext(p0);
          return;
       }
    }
    public final void attachBuildConfig(Context p0){
       Object obj2;
       String str1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       v1 ov1 = v1.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, AppLike.class, "7")) {
          return;
       }
       String str = "release";
       a.b = str;
       String obj = PatchProxy.apply(null, null, ov1, "1");
       int b = (obj != patchProxyRe)? obj.booleanValue(): SystemUtil.P();
       if (b) {
          obj = PatchProxy.applyOneRefs(str, null, ov1, "2");
          if (obj != patchProxyRe) {
             str = obj;
          }else {
             obj = ov1.a("build_type");
             if (obj != null) {
                str = obj;
             }
          }
          a.b = str;
       }
       a.a = false;
       a.c = "gifmaker";
       b = 0x767b;
       if (PatchProxy.isSupport(ov1)) {
          String obj1 = PatchProxy.applyOneRefs(Integer.valueOf(b), null, ov1, "4");
          if (obj1 != patchProxyRe) {
             b = obj1.intValue();
          }else {
          label_0065 :
             obj1 = ov1.a("app_ver");
             if (obj1 != null) {
                try{
                   String[] stringArray = obj1.split("\\.");
                   b = Integer.parseInt(stringArray[(stringArray.length - 1)]);
                }catch(java.lang.Exception e5){
                   e5.printStackTrace();
                }
             }
          }
       }else {
          goto label_0065 ;
       }
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AppLike.class, "3")) {
          return;
       }
       if ((SystemUtil.r(a.b())).endsWith("widgetProvider")) {
          return;
       }
       super.onConfigurationChanged(p0);
       return;
    }
    public void onCreate(){
       boolean b;
       if (PatchProxy.applyVoid(null, this, AppLike.class, "1")) {
          return;
       }
       c uoc = c.d();
       Objects.requireNonNull(uoc);
       Object obj = PatchProxy.applyOneRefs(this, uoc, c.class, "2");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(!uoc.c(a.b())){
          b = false;
       }else {
          Thread.setDefaultUncaughtExceptionHandler(b.a);
          new FoundationInfoInitModule().n();
          new ChannelInitializer().a();
          d.b();
          new RetrofitInitModule().n();
          new AzerothInitModule().n();
          g.a(a.b());
          new SwitchConfigInitModule().n();
          new ABTestInitModule().n();
          KLinkInitManager.a().b();
          new NotificationManagerInitModule().n();
          new PushSdkInitModuleForSubProcess().n();
          if ((a.t).contains("CollectClass")) {
             d.a(-1842031987).I9().n();
          }
          PerformanceMonitorInitModule.l0(a.b());
          new CrashMonitorInitModule().n();
          b = true;
       }
       if (b) {
          return;
       }else if((SystemUtil.r(a.b())).endsWith("widgetProvider")){
          return;
       }else {
          super.onCreate();
          return;
       }
    }
    public void onLowMemory(){
       if (PatchProxy.applyVoid(null, this, AppLike.class, "5")) {
          return;
       }
       if ((SystemUtil.r(a.b())).endsWith("widgetProvider")) {
          return;
       }
       super.onLowMemory();
       return;
    }
    public void onTerminate(){
       if (PatchProxy.applyVoid(null, this, AppLike.class, "6")) {
          return;
       }
       if ((SystemUtil.r(a.b())).endsWith("widgetProvider")) {
          return;
       }
       k.a(this);
       return;
    }
    public void onTrimMemory(int p0){
       AppLike uAppLike = AppLike.class;
       if (PatchProxy.isSupport(uAppLike) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAppLike, "4")) {
          return;
       }
       if ((SystemUtil.r(a.b())).endsWith("widgetProvider")) {
          return;
       }
       super.onTrimMemory(p0);
       return;
    }
}

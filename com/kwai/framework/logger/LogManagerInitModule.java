package com.kwai.framework.logger.LogManagerInitModule;
import com.kwai.framework.init.a;
import java.lang.String;
import xf6.l;
import xf6.h;
import java.lang.Object;
import wkd.b;
import ob6.p;
import ob6.h;
import java.util.Objects;
import w96.h;
import ob6.p$b;
import ob6.o;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.initmodule.FoundationInfoInitModule;
import com.kwai.framework.switchs.SwitchConfigInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import b76.a;
import com.kwai.framework.logger.d;
import java.lang.Runnable;
import com.kwai.framework.init.e;
import w96.i;
import o56.d;
import ba6.e;
import android.content.SharedPreferences;
import java.sql.Date;
import java.lang.System;
import kotlin.jvm.internal.a;
import ba6.a;
import brd.t;
import brd.z;
import t45.d;
import ba6.c;
import ba6.d;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.log.h;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import java.io.PrintStream;
import k2b.y;
import k2b.x1;
import com.yxcorp.gifshow.log.n;
import android.os.Looper;
import ukd.a;
import android.os.MessageQueue;
import android.os.Message;
import android.content.Intent;
import android.content.ComponentName;
import lnc.i3;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import o56.c;
import com.kwai.sdk.switchconfig.a;
import w96.d;
import q87.c;
import com.yxcorp.gifshow.log.c;
import java.lang.Exception;
import w96.a;
import qe6.b;
import w96.b;
import q2b.h$b;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.kwai.framework.logger.config.b;
import y96.h;
import com.kwai.framework.logger.config.c;
import com.kwai.framework.logger.c;
import java.util.concurrent.TimeUnit;
import ekd.k1;
import y56.a;
import com.kwai.framework.logger.b;
import w96.k;
import t45.c;
import com.kwai.framework.logger.e;

public class LogManagerInitModule extends a	// class@001657
{
    public boolean q;
    public static final int r;

    public void LogManagerInitModule(){
       super();
       this.q = false;
    }
    public static void l0(LogManagerInitModule p0){
       p0.n0();
    }
    private void n0(){
       String str = "key_rest_debug_server";
       boolean b = false;
       if (!l.c(str, b)) {
          l.h(str, true);
          l.h("enable_proto_debug_log", b);
          str = "";
          h.x(str);
          l.k("upload_test_idc", str);
       }
       p op = b.a(0x36463d96);
       if (op.b()) {
          h oh = op.f();
          Objects.requireNonNull(oh);
          this.p0(oh);
       }
       o.a(new h(this));
       if (this.q == null) {
          this.o0();
       }
       return;
    }
    public boolean C(){
       return true;
    }
    public boolean H7(){
       return true;
    }
    public int f0(){
       return 1;
    }
    public List g(){
       Class[] obj = PatchProxy.apply(null, this, LogManagerInitModule.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{FoundationInfoInitModule.class,SwitchConfigInitModule.class};
       return Lists.e(obj);
    }
    public void k0(a p0){
       SharedPreferences b;
       if (PatchProxy.applyVoidOneRefs(p0, this, LogManagerInitModule.class, "4")) {
          return;
       }
       String str = "LogManagerInitModule";
       e.d(d.b, str);
       e.g(new i(this), str);
       if (d.i) {
          if (!PatchProxy.applyVoid(null, null, e.class, "1")) {
             b = e.b;
             long longx = b.getLong("urt_config_version", 1);
             e.c = b.getString("urt_request_date", "");
             String str1 = new Date(System.currentTimeMillis()).toString();
             a.o(str1, "Date\(System.currentTimeMillis\(\)\).toString\(\)");
             if (a.g(str1, e.c) ^ 0x01) {
                b.a(0x1ca6a2fa).a(longx).subscribeOn(e.a).observeOn(d.a).subscribe(new c(str1), d.b);
             }
          }
          b.a(0x4b316083).c1(a.b());
       }
       if (SystemUtil.K()) {
          System.out.println("LogManager 关闭启动阶段日志缓存，日志恢复正常逻辑");
       }
       return;
    }
    public void n(){
       boolean b;
       Object[] objArray1;
       SharedPreferences a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LogManagerInitModule.class, "1")) {
          return;
       }
       String str = 1;
       int i = 0x4b316083;
       if (d.i) {
          if (!PatchProxy.applyVoid(objArray, objArray, y.class, "5") && n.A1().S()) {
             MessageQueue messageQueue = a.d(Looper.getMainLooper(), "mQueue");
             _monitor_enter(messageQueue);
             Message message = a.d(messageQueue, "mMessages");
             while (message != null) {
                if (message.obj != null) {
                   Intent intent = y.a(message);
                   if (intent != null) {
                      ComponentName component = intent.getComponent();
                      if (component != null && ("com.yxcorp.gifshow.HomeActivity").equals(component.getClassName())) {
                         i3 oi3 = i3.f();
                         oi3.d("package", TextUtils.k(component.getPackageName()));
                         oi3.d("class", TextUtils.k(component.getClassName()));
                         String str1 = oi3.e();
                         b.a(i).A(26, str1);
                         break ;
                      }else {
                         break ;
                      }
                   }
                }
                message = a.d(message, "next");
             }
             _monitor_exit(messageQueue);
          }
       label_00b9 :
          c uoc = (SystemUtil.B(a.b()) != null)? 1: null;
          if (uoc) {
             a.a().d(System.currentTimeMillis());
          }else {
             a.a().d(0);
          }
          b = a.t().d("kwaiBufferLog", false);
          objArray1 = new Object[false];
          d.C().s("LogManagerInitModule", "LogManagerInitModule isBufferLog:"+b, objArray1);
          if (!b) {
             c.c().b();
          }
       }
       if (!d.i) {
          try{
             this.q0();
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
          }
          return;
       }else {
          a uoa = new a();
          if (b.a()) {
             b.a(i).U0(false);
          }
          if (!PatchProxy.applyVoid(objArray, this, LogManagerInitModule.class, "3")) {
             a = b.a;
             if (!a.getBoolean("isLaunchedApp", false)) {
                objArray1 = new Object[false];
                d.C().w("LogManagerInitModule", "first launch app", objArray1);
                b.a(i).J(h$b.e(str, "APP_FIRST_LAUNCH"));
                SharedPreferences$Editor uEditor = a.edit();
                uEditor.putBoolean("isLaunchedApp", str);
                g.a(uEditor);
             }else {
                Object[] objArray2 = new Object[false];
                d.C().w("LogManagerInitModule", "not first launch app", objArray2);
             }
          }
          this.q0();
          if (!PatchProxy.applyVoid(objArray, objArray, b.class, "1") && !PatchProxy.applyVoid(objArray, objArray, h.class, "2")) {
             c.a("enableLoggingDataCompress", false);
             c.a("enableBoostFrequency", false);
             c.a("isInterceptStidMerge", false);
             c.a("enableNumberFour", false);
             c.a("enabledUrtMonitor", false);
             c.a("enableChangeLogChannel", false);
             c.a("enableMostEventChangeLogChannel", false);
             c.a("enableCoPageStrategy", false);
             c.a("bucketMonitorEnabled", false);
             c.a("enableLogStringNullMonitor", false);
             c.a("enableSearchPageRecordByPage", false);
             c.a("LocationCellLocationCacheSwitch", false);
             c.a("enableLaunchFirstTimeReportHeartBeat", false);
             c.a("enableSendDBErrorLog", false);
             c.a("enableSendBacklogs", false);
             c.a("enableConcurrentUserTrackLog", false);
             c.a("enableClosedTheRealTimeCapacityForStatEvent", false);
             c.a("enableStidExParams", false);
          }
          k1.r(new c(this), TimeUnit.SECONDS.toMillis(15));
          return;
       }
    }
    public final void o0(){
       if (PatchProxy.applyVoid(null, this, LogManagerInitModule.class, "5")) {
          return;
       }
       this.q = true;
       a.b(a.b()).subscribeOn(d.c).subscribe(b.b);
       return;
    }
    public final void p0(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LogManagerInitModule.class, "6")) {
          return;
       }
       if (p0.mFeatureConfig == null) {
          return;
       }
       c.a(new k(p0));
       return;
    }
    public final void q0(){
       if (PatchProxy.applyVoid(null, this, LogManagerInitModule.class, "2")) {
          return;
       }
       c.a(e.b);
       return;
    }
}

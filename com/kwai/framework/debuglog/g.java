package com.kwai.framework.debuglog.g;
import o56.a;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import android.app.Application;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.io.File;
import f66.e;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import java.lang.StringBuilder;
import o56.c;
import wkd.b;
import j80.c;
import qkd.b;
import java.lang.Exception;
import q87.b;
import com.kwai.sdk.switchconfig.a;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import q87.g$b;
import java.lang.Number;
import java.lang.Boolean;
import q87.g;
import java.util.ArrayList;
import f66.d;
import c97.d;
import java.lang.NullPointerException;
import android.os.SystemClock;
import com.kwai.logger.KwaiLog;
import java.lang.System;
import q87.a;
import java.lang.Runnable;
import f97.a;
import s87.c;
import java.lang.Throwable;
import android.util.Log;
import t87.a;
import com.kwai.framework.debuglog.f;
import com.kwai.framework.debuglog.e;
import java.util.Arrays;
import java.util.Collection;
import t87.f;
import t87.d;
import com.kwai.logger.upload.retrieve.azeroth.f;
import com.kwai.logger.upload.retrieve.azeroth.b;
import java.util.Set;
import java.util.Objects;
import com.kwai.logger.upload.retrieve.azeroth.a;
import com.kwai.logger.upload.retrieve.azeroth.AzerothConfigPuller;
import h97.d;
import x87.a;
import com.kwai.logger.upload.retrieve.azeroth.g;
import h97.j;
import com.kwai.logger.upload.internal.f;
import h97.g;
import t87.e;
import com.kwai.framework.debuglog.d;
import com.kwai.framework.debuglog.c;
import com.yxcorp.utility.Log;

public class g	// class@000b29
{
    public static final String a;
    public static boolean b;
    public static boolean c;
    public static File[] d;
    public static final SharedPreferences e;

    static {
       g.a = (a.w).toUpperCase();
       g.b = false;
       g.c = false;
       g.d = null;
       g.e = b.b("DefaultPreferenceHelper");
    }
    public void g(){
       super();
    }
    public static void a(Application p0){
       boolean b;
       a uoa;
       String[] stringArray;
       f uof;
       a uoa1;
       a uoa2;
       boolean i;
       long l1;
       g og = g.class;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, null, og, str)) {
          return;
       }
       if (g.b) {
          return;
       }
       File uFile = new File(a.B.getFilesDir(), "debuglog");
       if (!PatchProxy.applyVoidTwoRefs(p0, uFile, null, og, "5")) {
          if (!PatchProxy.applyVoidTwoRefs(p0, uFile, null, e.class, str)) {
             e.b = uFile;
             str = SystemUtil.r(p0);
             e.c = str;
             String str2 = "main";
             if (str.isEmpty()) {
                e.c = str2;
             }
             if (SystemUtil.L(p0)) {
                e.c = str2;
             }else if((e.c).startsWith(p0.getPackageName()+":")){
                e.c = (e.c).substring(((p0.getPackageName()).length() + true));
             }
             str2 = ".debug";
             int i2 = -1504323719;
             if (!a.a().c() && (SystemUtil.I() || SystemUtil.P())) {
                e.a = b.a(i2).h(str2);
             }else {
                e.a = e.b;
                if (SystemUtil.L(p0)) {
                   File uFile1 = b.a(i2).h(str2);
                   if (uFile1.exists()) {
                      try{
                         b.x(uFile1);
                      }catch(java.io.IOException e12){
                      }catch(java.lang.IllegalArgumentException e12){
                      }
                      e12.printStackTrace();
                   }
                }
             }
          }
       label_00c9 :
          str = e.c;
          if (str == null) {
             str = g.a;
          }
          b uob = new b(str, e.a.getAbsolutePath());
          b = false;
          uob.f = a.t().d("obiwanAsyncTraceLogInfo", b);
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          ArrayList uArrayList = PatchProxy.apply(null, null, og, "6");
          if (uArrayList != patchProxyRe) {
          }else {
             g$b uob1 = new g$b();
             uob1.e("app");
             int i1 = 7;
             uob1.c(i1);
             Object obj = PatchProxy.apply(null, null, og, "7");
             if (obj != patchProxyRe) {
                l1 = obj.longValue();
             }else if(SystemUtil.I() || a.a().c()){
                l1 = 0x3e800000;
             }else {
                Object obj1 = PatchProxy.apply(null, null, og, "11");
                i = (obj1 != patchProxyRe)? obj1.booleanValue(): g.e.getBoolean("IsDiskSpaceSufficient", true);
                if (!i) {
                   l1 = 0x3200000;
                }else {
                   l1 = a.t().b("obiwanLogFilesDiskQuota", 0xc800000);
                }
             }
             uob1.b(l1);
             uob1.d(b);
             g$b uob2 = new g$b();
             uob2.e("im");
             uob2.c(i1);
             uob2.b(0x1e00000);
             uob2.d(b);
             uob1 = new g$b();
             uob1.e("network");
             uob1.c(i1);
             uob1.b(0x3200000);
             uob1.d(true);
             ArrayList uArrayList1 = new ArrayList(3);
             uArrayList1.add(uob1.a());
             uArrayList1.add(uob2.a());
             uArrayList1.add(uob1.a());
             uArrayList = uArrayList1;
          }
          uob.g = uArrayList;
          if (SystemUtil.I() || a.a().c()) {
             uob.f(true);
             uob.g(63);
          }else {
             uob.f(b);
             i = (d.e())? 62: 60;
             uob.g(i);
          }
          Application uApplication = a.b();
          if (uApplication == null) {
             String str1 = "context should not be null!";
             if (!d.a().i()) {
                new NullPointerException(str1).printStackTrace();
             }else {
                throw new NullPointerException(str1);
             }
          }else {
             long l = SystemClock.elapsedRealtime();
             try{
                KwaiLog.b = uApplication.getApplicationContext();
                KwaiLog.d = System.currentTimeMillis();
                KwaiLog.a = uob;
                a.a(new a(l));
                c.b().a(l);
             }catch(java.lang.Exception e12){
                c.b().c(l, 2, Log.getStackTraceString(e12));
             }
          }
       }
       g.b = true;
       if (!PatchProxy.applyVoid(null, null, d.class, "4")) {
          Log.a = c.b;
       }
       return;
    }
}

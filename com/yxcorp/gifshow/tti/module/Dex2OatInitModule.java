package com.yxcorp.gifshow.tti.module.Dex2OatInitModule;
import com.kwai.framework.init.TTIInitModule;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hlc.d;
import java.util.concurrent.TimeUnit;
import com.kwai.sdk.switchconfig.a;
import java.lang.Runnable;
import android.os.Handler;
import java.lang.Exception;
import android.os.HandlerThread;
import b76.a;
import com.yxcorp.utility.SystemUtil;
import s45.a;
import o56.a;
import com.yxcorp.gifshow.tti.module.a;
import com.kwai.framework.init.e;
import s1c.h1;
import s1c.t;
import com.kwai.robust.PatchProxyResult;
import oe6.a;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Boolean;
import s1c.s;
import s1c.n0;
import java.util.Objects;
import java.io.File;
import android.app.Application;
import com.mini.js.jsapi.media.l;
import com.yxcorp.gifshow.tti.module.Dex2OatInitModule$a;
import com.yxcorp.gifshow.profile.profileinstaller.c;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.AssetManager;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.Throwable;
import com.yxcorp.gifshow.profile.profileinstaller.a;
import java.util.concurrent.Executor;
import com.yxcorp.gifshow.profile.profileinstaller.c$c;
import java.lang.System;
import s45.c;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.lang.Integer;
import k2b.u1;
import s1c.p;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Math;
import java.util.HashMap;
import fg6.a;
import com.google.gson.Gson;
import java.lang.Number;

public class Dex2OatInitModule extends TTIInitModule	// class@001dbb
{
    public static boolean q = false;
    public static HandlerThread r;
    public static Handler s;
    public static SharedPreferences t;
    public static SharedPreferences u;
    public static c v;
    public static long w;

    public void Dex2OatInitModule(){
       super();
    }
    public int f0(){
       return 19;
    }
    public void h0(){
       if (PatchProxy.applyVoid(null, this, Dex2OatInitModule.class, "7")) {
          return;
       }
       if (!this.p0() - null && (Dex2OatInitModule.s != null && !Dex2OatInitModule.q)) {
          try{
             Dex2OatInitModule.s.postDelayed(new d(this), TimeUnit.SECONDS.toMillis((long)a.t().a("bgDex2oatDelay", 60)));
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
          }
       }
    }
    public void i0(){
       if (PatchProxy.applyVoid(null, this, Dex2OatInitModule.class, "8")) {
          return;
       }
       if (!this.p0() && Dex2OatInitModule.s != null) {
          Dex2OatInitModule.s.removeCallbacksAndMessages(null);
          if (Dex2OatInitModule.q) {
             Dex2OatInitModule.r.quitSafely();
          }
       }
       return;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Dex2OatInitModule.class, "1")) {
          return;
       }
       if (!SystemUtil.a(24)) {
          return;
       }
       Dex2OatInitModule.v = new a(a.v);
       e.g(new a(this), "Dex2OatInitModule");
       return;
    }
    public final void n0(){
       boolean b;
       n0 a;
       Dex2OatInitModule$a uoa;
       boolean b2;
       String str5;
       File uFile1;
       String str6;
       a uoa1;
       File uFile2;
       t obj4;
       Object obj = this;
       h1 oh1 = h1.class;
       t ot = t.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, Dex2OatInitModule.class, "5")) {
          return;
       }
       String str = a.s();
       String str1 = "1";
       String str2 = "ArtProfileForbiddenWithLocal";
       int i = 0;
       if (!PatchProxy.applyVoidOneRefs(str, objArray, ot, str1)) {
          a.p(str, "lastVersion");
          if (!TextUtils.isEmpty(str) && !TextUtils.equals(a.m, str)) {
             obj4 = t.a;
             obj4.c(str2, i);
             obj4.c("ArtProfileSuccess", i);
          }
       }
       File obj1 = PatchProxy.apply(objArray, objArray, oh1, str1);
       String str3 = "2";
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(s.c("profile_open") || a.t().d("ArtProfileOptV2", i)){
          obj4 = PatchProxy.apply(objArray, objArray, ot, str3);
          boolean b3 = (obj4 != patchProxyRe)? obj4.booleanValue(): t.a.a("ArtProfileForbiddenWithDevice", i);
          if (!b3) {
             Object obj5 = PatchProxy.apply(objArray, objArray, ot, "4");
             b = (obj5 != patchProxyRe)? obj5.booleanValue(): t.a.a(str2, i);
             if (!b) {
                b = true;
             }
          }
       }
    label_0094 :
       b = false;
       if (b) {
          a = n0.a;
          Objects.requireNonNull(a);
          str = "/data/misc/profiles/cur/0";
          str1 = "primary.prof";
          if (!PatchProxy.applyVoid(objArray, a, n0.class, str1)) {
             Object obj3 = PatchProxy.apply(objArray, objArray, oh1, str3);
             if (obj3 != patchProxyRe) {
                b2 = obj3.booleanValue();
             }else if(s.c("profile_collect") || SystemUtil.P()){
                b2 = true;
             }else {
                b2 = false;
             }
             if (b2) {
                uFile2 = new File(new File(str, a.v), str1);
                File uFile3 = new File(new File("/data/misc/profiles/ref", a.v), str1);
                File uFile4 = s.b("profiles");
                if (uFile4 != null) {
                   s.a(uFile2, new File(uFile4, "primary-cur.prof"));
                   s.a(uFile3, new File(uFile4, "primary-ref.prof"));
                }
             }
          }
          try{
          label_0102 :
             Application uApplication = a.b();
             l b1 = l.b;
             uoa = new Dex2OatInitModule$a(obj);
             if (!PatchProxy.applyVoidThreeRefs(uApplication, b1, uoa, null, c.class, "8")) {
                c uoc = c.class;
                if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidFourRefs(uApplication, b1, uoa, Boolean.FALSE, null, c.class, "9")) {
                   Context applicationC = uApplication.getApplicationContext();
                   String packageName = applicationC.getPackageName();
                   ApplicationInfo applicationI = applicationC.getApplicationInfo();
                   AssetManager assets = applicationC.getAssets();
                   String name = new File(applicationI.sourceDir).getName();
                   PackageManager packageManag = uApplication.getPackageManager();
                   int i1 = 7;
                   PackageInfo packageInfo = packageManag.getPackageInfo(packageName, i);
                   File uFile = uApplication.getFilesDir();
                   PackageInfo packageInfo1 = packageInfo;
                   c uoc1 = uoc;
                   PackageInfo packageInfo2 = packageInfo;
                   String str4 = packageName;
                   Object[] obj2 = PatchProxy.applyThreeRefs(packageInfo1, uFile, uoa, 0, c.class, "3");
                   int i2 = 2;
                   if (obj2 != patchProxyRe) {
                      b2 = obj2.booleanValue();
                      str5 = str1;
                      uFile1 = uFile;
                   }else {
                      try{
                         uFile1 = uFile;
                         uFile2 = new File(uFile1, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                         if (!uFile2.exists()) {
                            str5 = str1;
                            b2 = false;
                         }else {
                            DataInputStream uDataInputSt = new DataInputStream(new FileInputStream(uFile2));
                            uDataInputSt.close();
                            str5 = str1;
                            b2 = (!uDataInputSt.readLong() - packageInfo2.lastUpdateTime)? true: false;
                            if (b2) {
                               uoa.b(i2, null);
                            }
                         }
                      }catch(java.io.IOException e0){
                      }
                   }
                }
             }
          }catch(android.content.pm.PackageManager$NameNotFoundException e0){
             uoa.b(7, e0);
          }
       }
    }
    public void o0(String p0){
       int i;
       String str = "";
       if (PatchProxy.applyVoidOneRefs(p0, this, Dex2OatInitModule.class, "6")) {
          return;
       }
       long l = System.currentTimeMillis();
       Object[] objArray = null;
       boolean b = true;
       if (Dex2OatInitModule.v.c()) {
          Dex2OatInitModule.q = b;
          if (!PatchProxy.applyVoid(objArray, this, Dex2OatInitModule.class, "4")) {
             g.a(Dex2OatInitModule.t.edit().putInt(Dex2OatInitModule.v.h(), (Dex2OatInitModule.t.getInt(Dex2OatInitModule.v.h(), 0) + b)));
          }
          i = 1;
       }else {
          Object[] objArray2 = new Object[b];
          objArray2[0] = Integer.valueOf(19);
          u1.onEvent("dex2oat_log", objArray, objArray2);
          Dex2OatInitModule.q = false;
          i = 0;
       }
       long l1 = System.currentTimeMillis();
       Object[] objArray1 = new Object[0];
       p.c.w("doDex2oat", "source: "+p0+"result: "+Dex2OatInitModule.q, objArray1);
       if ((int)(Math.random() * 0x408f400000000000) == b) {
          HashMap hashMap = new HashMap();
          hashMap.put("success", str+Dex2OatInitModule.q);
          hashMap.put("duration", str+(l1 - l));
          hashMap.put("source", p0);
          hashMap.put("count", str+Dex2OatInitModule.t.getInt(Dex2OatInitModule.v.h(), 0));
          u1.R("PERF_DEX2OAT_STAT", a.a.q(hashMap), 19);
       }
       g.a(Dex2OatInitModule.t.edit().putLong(Dex2OatInitModule.v.a(), System.currentTimeMillis()).putInt(Dex2OatInitModule.v.j(), i));
       return;
    }
    public final long p0(){
       Object obj = PatchProxy.apply(null, this, Dex2OatInitModule.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (!Dex2OatInitModule.w - -1) {
          Dex2OatInitModule.w = a.t().b("PerfForceDex2oat", 0);
       }
       return Dex2OatInitModule.w;
    }
}

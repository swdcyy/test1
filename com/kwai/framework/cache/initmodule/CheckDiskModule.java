package com.kwai.framework.cache.initmodule.CheckDiskModule;
import com.kwai.framework.init.TTIInitModule;
import java.util.HashMap;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.System;
import v56.g;
import android.content.SharedPreferences;
import com.kwai.sdk.switchconfig.a;
import x56.e;
import java.lang.reflect.Type;
import java.lang.StringBuilder;
import fg6.a;
import com.google.gson.Gson;
import com.yxcorp.utility.Log;
import android.app.Application;
import o56.a;
import java.io.File;
import org.json.JSONObject;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.List;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.lang.Number;
import com.kwai.performance.overhead.battery.jni.CpuOptimize;
import y56.a;
import com.kwai.framework.init.CoreInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import com.kwai.framework.cache.initmodule.c;
import java.lang.Runnable;
import t45.c;
import w56.b;
import b76.a;
import com.kwai.framework.cache.initmodule.d;
import android.content.Context;
import brd.t;
import t45.d;
import brd.z;
import com.kwai.framework.cache.initmodule.a;
import erd.g;
import crd.b;
import com.kwai.framework.cache.initmodule.b;
import w56.a;
import com.kwai.framework.init.e;
import w56.e;
import w56.d;
import w56.c;
import x56.b;
import com.google.gson.JsonArray;
import com.kwai.framework.cache.model.OnlineClearConfig$PathConfig;
import java.lang.Boolean;
import qkd.b;
import java.util.Set;
import java.util.regex.Pattern;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import com.google.gson.JsonObject;
import com.yxcorp.utility.SystemUtil;
import java.lang.Long;
import android.os.Environment;
import km8.b;
import oe6.c;
import java.lang.Integer;
import android.os.Build$VERSION;
import java.util.Collection;
import ekd.q;
import java.util.HashSet;
import x56.b$a;
import com.google.gson.JsonElement;
import com.kwai.framework.cache.initmodule.e;
import java.util.Comparator;
import java.util.Collections;
import x56.c;
import com.yxcorp.gifshow.util.v;
import java.io.IOException;
import org.json.JSONArray;
import k2b.u1;

public class CheckDiskModule extends TTIInitModule	// class@0014ed
{
    public HashMap q;
    public HashMap r;
    public HashMap s;
    public static boolean A;
    public static boolean B;
    public static boolean C;
    public static int D;
    public static int E;
    public static d t;
    public static c u;
    public static OnlineClearConfig v;
    public static b w;
    public static boolean x;
    public static boolean y;
    public static boolean z;

    public void CheckDiskModule(){
       super();
       this.q = new HashMap();
       this.r = new HashMap();
       this.s = new HashMap();
    }
    public static String r0(){
       String str3;
       long l4;
       SharedPreferences a;
       Object[] objArray = null;
       SharedPreferences obj = PatchProxy.apply(objArray, objArray, CheckDiskModule.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = g.a;
       String str = "LastTopPathSizeUploadTs";
       if ((System.currentTimeMillis() - obj.getLong(str, 0)) - 0x5265c00 < 0) {
          return obj.getString("LastTopPathSize", "");
       }
       e value = a.t().getValue("DISK_TOP_PATH_UPLOAD", e.class, objArray);
       String str1 = "CheckDiskModule";
       Log.b(str1, "TopPathConfig:"+a.a.q(value));
       File parentFile = a.b().getFilesDir().getParentFile();
       File parentFile1 = a.b().getExternalCacheDir().getParentFile();
       JSONObject jSONObject = new JSONObject();
       JSONObject jSONObject1 = new JSONObject();
       JSONObject jSONObject2 = new JSONObject();
       long l = SystemClock.elapsedRealtime();
       long l1 = SystemClock.currentThreadTimeMillis();
       int i = 0;
       Iterator iterator = value.mInnerPackage.iterator();
       long l2 = 0;
       while (iterator.hasNext()) {
          String str2 = iterator.next();
          Iterator iterator1 = iterator;
          File uFile = new File(parentFile, str2);
          if (uFile.exists() && uFile.canRead()) {
             i = i + 1;
             long l3 = CheckDiskModule.x0(uFile);
             l2 = l2 + l3;
             str3 = str;
             l4 = l3 >> 10;
             jSONObject1.put(str2, l4);
          }else {
             str3 = str;
          }
          iterator = iterator1;
          str = str3;
       }
       str3 = str;
       Iterator iterator2 = value.mSdCard.iterator();
       l4 = l2;
       while (iterator2.hasNext()) {
          String str4 = iterator2.next();
          File uFile1 = new File(parentFile1, str4);
          if (uFile1.exists() && uFile1.canRead()) {
             i = i + 1;
             l2 = CheckDiskModule.x0(uFile1);
             l4 = l4 + l2;
             uFile1 = parentFile1;
             long l5 = l2 >> 10;
             jSONObject2.put(str4, l5);
             l4 = l4;
          }else {
             uFile1 = parentFile1;
          }
          parentFile1 = uFile1;
       }
       jSONObject.put("innerPackage", jSONObject1);
       jSONObject.put("sdCard", jSONObject2);
       JSONObject jSONObject3 = new JSONObject();
       jSONObject3.put("enableOptimize", CheckDiskModule.x);
       jSONObject3.put("wall", (SystemClock.elapsedRealtime() - l));
       jSONObject3.put("cpu", (SystemClock.currentThreadTimeMillis() - l1));
       jSONObject3.put("totalDir", i);
       jSONObject3.put("totalSize", l4);
       jSONObject.put("perfData", jSONObject3);
       String str5 = jSONObject.toString();
       Log.b(str1, "topPath:"+str5);
       a = g.a;
       SharedPreferences$Editor uEditor = a.edit();
       uEditor.putString("LastTopPathSize", str5);
       g.a(uEditor);
       SharedPreferences$Editor uEditor1 = a.edit();
       uEditor1.putLong(str3, System.currentTimeMillis());
       g.a(uEditor1);
       return str5;
    }
    public static long x0(File p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CheckDiskModule.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (CheckDiskModule.x) {
          return CpuOptimize.a(p0);
       }
       return a.c(p0);
    }
    public int f0(){
       return 19;
    }
    public List g(){
       Class[] obj = PatchProxy.apply(null, this, CheckDiskModule.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{CoreInitModule.class};
       return Lists.e(obj);
    }
    public void h0(){
       if (PatchProxy.applyVoid(null, this, CheckDiskModule.class, "3")) {
          return;
       }
       if (CheckDiskModule.A && !CheckDiskModule.B) {
          c.a(c.b);
       }else if(!CheckDiskModule.C){
          CheckDiskModule.C = true;
          c.a(new b(this));
       }
       return;
    }
    public void k0(a p0){
       z c;
       if (PatchProxy.applyVoidOneRefs(p0, this, CheckDiskModule.class, "1")) {
          return;
       }
       c.a(d.b);
       c = d.c;
       a.d(a.b(), "com.ss.android.ugc.aweme").subscribeOn(c).subscribe(a.b);
       t ot = a.d(a.b(), "com.ss.android.ugc.aweme.lite").subscribeOn(c);
       ot.subscribe(b.b);
       e.g(new a(this), "PeriodClearCache");
       e.g(new e(this), "CheckLowDisk");
       e.g(new d(this), "DiskSizeCalculate");
       e.g(new c(this), "DiskFileFullScan");
       return;
    }
    public final void n0(b p0,JsonArray p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CheckDiskModule.class, "9")) {
          return;
       }
       if (p0.mIsCalOptEnabled != null) {
          this.v0(a.b().getFilesDir().getParentFile(), p1, p0.mInnerPackageSizeInfo, "/innerPackage");
       }else {
          this.u0(a.b().getFilesDir().getParentFile(), p1, p0.mInnerPackageSizeInfo, "/innerPackage");
       }
       return;
    }
    public final void o0(OnlineClearConfig$PathConfig p0,Boolean p1){
       Iterator iterator;
       File uFile;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CheckDiskModule.class, "6")) {
          return;
       }
       File parentFile = (p1.booleanValue())? a.b().getFilesDir().getParentFile(): this.q0(a.b());
       if (parentFile == null) {
          return;
       }else {
          OnlineClearConfig$PathConfig mClearPaths = p0.mClearPaths;
          if (mClearPaths != null) {
             iterator = mClearPaths.iterator();
             while (iterator.hasNext()) {
                uFile = new File(parentFile, iterator.next());
                if (uFile.exists()) {
                   Log.b("CheckDiskModule", "delete file directly:"+uFile.getAbsolutePath());
                   b.q(uFile);
                }
             }
          }
          mClearPaths = p0.mPatternPaths;
          if (mClearPaths != null) {
             iterator = mClearPaths.keySet().iterator();
             while (iterator.hasNext()) {
                String str = iterator.next();
                uFile = new File(parentFile, str);
                if (uFile.exists() && uFile.isDirectory()) {
                   Pattern pattern = Pattern.compile(p0.mPatternPaths.get(str));
                   if (!uFile.listFiles().length) {
                   }else {
                      File[] uFileArray = uFile.listFiles();
                      int len = uFileArray.length;
                      int i = 0;
                      while (i < len) {
                         object oobject = uFileArray[i];
                         if (pattern.matcher(oobject.getName()).matches()) {
                            Log.b("CheckDiskModule", "delete file by Pattern:"+oobject.getAbsolutePath());
                            b.q(oobject);
                         }
                         i = i + 1;
                      }
                   }
                }
             }
          }
          return;
       }
    }
    public final JsonObject p0(){
       JsonObject obj = PatchProxy.apply(null, this, CheckDiskModule.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new JsonObject();
          long l = 10;
          obj.a0("availableInnerDiskSize", Long.valueOf((SystemUtil.u() >> l)));
          obj.a0("totalInnerDiskSize", Long.valueOf((SystemUtil.v() >> l)));
          if ((Environment.getExternalStorageState()).equals("mounted")) {
             obj.a0("availableExterDiskSize", Long.valueOf((SystemUtil.y() >> l)));
             obj.a0("totalExterDiskSize", Long.valueOf((SystemUtil.z() >> l)));
          }
          SharedPreferences sharedPrefer = b.b("DefaultPreferenceHelper");
          e0.a0("totalDataSize", Long.valueOf(sharedPrefer.getLong("AppUsedSize", 0)));
          e0.a0("firstInstallTime", Long.valueOf(c.a()));
          e0.a0("launchCount", Integer.valueOf(sharedPrefer.getInt("ColdLaunchCount", 1)));
          e0.a0("dyUsedSize", Long.valueOf(g.c()));
          e0.a0("dyLiteUsedSize", Long.valueOf(g.b()));
          e0.a0("sdkVersion", Integer.valueOf(Build$VERSION.SDK_INT));
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public final File q0(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CheckDiskModule.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.getExternalFilesDir("") != null) {
          return p0.getExternalFilesDir("").getParentFile();
       }
       return null;
    }
    public final JsonObject s0(File p0,String p1){
       JsonObject obj = PatchProxy.applyTwoRefs(p0, p1, this, CheckDiskModule.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JsonObject();
       obj.c0("path", p1);
       obj.H("isDirectory", Boolean.valueOf(p0.isDirectory()));
       obj.a0("fileSize", Long.valueOf((a.c(p0) >> 10)));
       return obj;
    }
    public final long t0(JsonObject p0,File p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, CheckDiskModule.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long l = a.c(p1) >> 10;
       p0.c0("path", p2);
       p0.H("isDirectory", Boolean.valueOf(p1.isDirectory()));
       p0.a0("fileSize", Long.valueOf(l));
       return l;
    }
    public final void u0(File p0,JsonArray p1,List p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, CheckDiskModule.class, "13")) {
          return;
       }
       if (p0.canRead() && !q.f(p2)) {
          HashSet hashSet = new HashSet();
          Iterator iterator = p2.iterator();
          while (iterator.hasNext()) {
             b$a uoa = iterator.next();
             b$a mPath = uoa.mPath;
             File uFile = new File(p0, mPath);
             if (uFile.exists() && uFile.canRead()) {
                JsonObject jsonObject = this.s0(uFile, p3+mPath);
                if (!hashSet.contains(mPath)) {
                   hashSet.add(mPath);
                   p1.G(jsonObject);
                }
                if (uFile.isDirectory() && uoa.mPolicy == true) {
                   File[] uFileArray = uFile.listFiles();
                   int len = uFileArray.length;
                   int jsonObject1 = 0;
                   while (jsonObject1 < len) {
                      object oobject = uFileArray[jsonObject1];
                      if (oobject.canRead()) {
                         String str = mPath+File.separator+oobject.getName();
                         JsonObject jsonObject2 = this.s0(oobject, p3+str);
                         if (!hashSet.contains(str)) {
                            hashSet.add(str);
                            p1.G(jsonObject2);
                         }
                      }
                      jsonObject1++;
                   }
                }
             }
          }
       }
       return;
    }
    public final void v0(File p0,JsonArray p1,List p2,String p3){
       String this;
       int i1;
       Iterator iterator;
       JsonObject jsonObject1;
       Object obj = this;
       JsonArray jsonArray = p1;
       Iterator obj1 = p2;
       String str = p3;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, CheckDiskModule.class, "14")) {
          return;
       }
       if (p0.canRead() && !q.f(p2)) {
          HashMap hashMap = new HashMap();
          if (!PatchProxy.applyVoidOneRefs(obj1, obj, CheckDiskModule.class, "15")) {
             Collections.sort(obj1, e.b);
          }
          obj1 = p2.iterator();
          while (obj1.hasNext()) {
             b$a uoa = obj1.next();
             b$a mPath = uoa.mPath;
             File uFile = new File(p0, mPath);
             if (uFile.exists() && uFile.canRead()) {
                if (uFile.isDirectory() && uoa.mPolicy == true) {
                   File[] uFileArray = uFile.listFiles();
                   int len = uFileArray.length;
                   long l = 0;
                   int i = 0;
                   while (i < len) {
                      object oobject = uFileArray[i];
                      if (oobject.canRead()) {
                         this = mPath+File.separator+oobject.getName();
                         if (!hashMap.containsKey(this)) {
                            JsonObject jsonObject = new JsonObject();
                            long l1 = obj.t0(jsonObject, oobject, str+this);
                            l = l + l1;
                            hashMap.put(this, Long.valueOf(l1));
                            jsonArray.G(jsonObject);
                         }else {
                            Long longx = Long.valueOf(0);
                            iterator = obj1;
                            String str1 = this;
                            i1 = i;
                            Long obj2 = PatchProxy.applyThreeRefs(hashMap, this, longx, this, CheckDiskModule.class, "16");
                            if (obj2 != PatchProxyResult.class) {
                               longx = obj2;
                            }else if(!hashMap.containsKey(str1)){
                               obj2 = hashMap.get(str1);
                               if (obj2 != null) {
                                  longx = obj2;
                               }
                            }
                            l = l + longx.longValue();
                         label_0109 :
                            i = i1 + 1;
                            obj1 = iterator;
                         }
                      }
                      i1 = i;
                      iterator = obj1;
                      goto label_0109 ;
                   }
                   iterator = obj1;
                   hashMap.put(mPath, Long.valueOf(l));
                   jsonObject1 = new JsonObject();
                   jsonObject1.c0("path", str+mPath);
                   jsonObject1.H("isDirectory", Boolean.valueOf(uFile.isDirectory()));
                   jsonObject1.a0("fileSize", Long.valueOf(l));
                   jsonArray.G(jsonObject1);
                }else {
                   iterator = obj1;
                   if (!hashMap.containsKey(mPath)) {
                      jsonObject1 = new JsonObject();
                      hashMap.put(mPath, Long.valueOf(obj.t0(jsonObject1, uFile, str+mPath)));
                      jsonArray.G(jsonObject1);
                   }
                }
             }else {
                iterator = obj1;
             }
             obj1 = iterator;
          }
       }
       return;
    }
    public final void w0(File p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CheckDiskModule.class, "20")) {
          return;
       }
       if (p0.listFiles() == null) {
          return;
       }
       File[] uFileArray = p0.listFiles();
       int len = uFileArray.length;
       int i = 0;
       while (i < len) {
          object oobject = uFileArray[i];
          if (oobject.isDirectory() && oobject.canRead()) {
             this.w0(oobject);
          }else if(oobject.isFile() && (!oobject.canRead() || PatchProxy.applyVoidOneRefs(oobject, this, CheckDiskModule.class, "21"))){
             int i1 = CheckDiskModule.D + 1;
             CheckDiskModule.D = i1;
             long l = oobject.length() >> 10;
             if (l - CheckDiskModule.u.fileSizeLimit > 0) {
                int i2 = CheckDiskModule.E + 1;
                CheckDiskModule.E = i2;
                String name = oobject.getName();
                String str = ".";
                if (name.contains(str)) {
                   int i3 = name.lastIndexOf(str) + 1;
                   name = name.substring(i3);
                   if (!name.contains("gifmaker")) {
                   label_0083 :
                      if (this.q.containsKey(name)) {
                         CheckDiskModule tq = this.q;
                         long l1 = tq.get(name).longValue() + l;
                         tq.put(name, Long.valueOf(l1));
                      }else {
                         this.q.put(name, Long.valueOf(l));
                      }
                      String str1 = null;
                      try{
                         str1 = v.e(oobject);
                      }catch(java.io.IOException e4){
                         Log.d("CheckDiskModule", e4.getMessage());
                      }
                      if (this.r.containsKey(str1)) {
                         this.r.get(str1).add(oobject.getAbsolutePath());
                         this.s.put(str1, this.r.get(str1));
                      }else {
                         ArrayList uArrayList = new ArrayList();
                         uArrayList.add(oobject.getAbsolutePath());
                         this.r.put(str1, uArrayList);
                      }
                   }
                }
                name = "null";
                goto label_0083 ;
             }
          }
          i = i + 1;
       }
       return;
    }
    public final void y0(){
       if (PatchProxy.applyVoid(null, this, CheckDiskModule.class, "22")) {
          return;
       }
       JSONObject jSONObject = new JSONObject();
       JSONObject jSONObject1 = new JSONObject();
       Iterator iterator = this.q.keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          jSONObject1.put(str, this.q.get(str));
       }
       jSONObject.put("extList", jSONObject1);
       JSONArray jSONArray = new JSONArray();
       iterator = this.s.keySet().iterator();
       long l = 0;
       while (iterator.hasNext()) {
          JSONObject jSONObject2 = new JSONObject();
          ArrayList uArrayList = this.s.get(iterator.next());
          Iterator iterator1 = uArrayList.iterator();
          long l1 = 0;
          while (iterator1.hasNext()) {
             File uFile = new File(iterator1.next());
             if (uFile.exists()) {
                long l2 = uFile.length() >> 10;
                l1 = l1 + l2;
             }
          }
          jSONObject2.put("file_size", l1);
          jSONObject2.put("file_count", uArrayList.size());
          jSONObject2.put("file_paths", uArrayList);
          l = l + l1;
          if (l1 - CheckDiskModule.u.dupFileSizeLimit > 0) {
             jSONArray.put(jSONObject2);
          }
       }
       jSONObject.put("total_duplicate_size", l);
       jSONObject.put("duplicate_files", jSONArray);
       Log.b("CheckDiskModule", jSONObject.toString());
       u1.R("DUP_EXT_MESSAGE", jSONObject.toString(), 19);
       return;
    }
}

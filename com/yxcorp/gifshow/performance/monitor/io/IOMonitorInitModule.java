package com.yxcorp.gifshow.performance.monitor.io.IOMonitorInitModule;
import k2b.s1;
import com.yxcorp.gifshow.performance.monitor.PerformanceBaseInitModule;
import com.yxcorp.gifshow.performance.monitor.io.IOMonitorInitModule$a;
import nsd.u;
import java.util.HashMap;
import com.yxcorp.gifshow.performance.monitor.io.diskuseage.IoMonitorDiskUsageConfigOnline;
import java.io.File;
import java.lang.String;
import com.yxcorp.gifshow.performance.monitor.io.IOMonitorInitModule$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.performance.overhead.io.monitor.IoMonitor;
import com.kwai.performance.monitor.base.Monitor;
import yf7.k;
import com.yxcorp.gifshow.performance.monitor.io.IOMonitorInitModule$c;
import java.lang.Runnable;
import am8.d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import com.kwai.performance.overhead.io.monitor.FDMonitorArgsConfig;
import java.lang.reflect.Type;
import com.kwai.performance.overhead.io.monitor.IoMonitorWBConfig;
import com.yxcorp.utility.SystemUtil;
import o56.a;
import java.lang.Math;
import dg7.a;
import yf7.r;
import yf7.f;
import k2b.u1;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import android.app.Application;
import android.app.Application$ActivityLifecycleCallbacks;
import kotlin.jvm.internal.a;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import trd.t;
import java.util.Random;
import java.util.Collection;
import java.util.ArrayList;
import y56.a;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import mwb.b;
import com.yxcorp.utility.Log;
import android.os.Build$VERSION;
import com.yxcorp.utility.AbiUtil;
import android.text.TextUtils;
import com.yxcorp.gifshow.performance.monitor.io.IOMonitorInitModule$d;
import java.lang.StringBuilder;
import java.lang.Double;
import com.kwai.performance.overhead.io.monitor.IoMonitorArgsConfig;
import com.kwai.performance.overhead.io.monitor.IoMonitorPdConfig;
import km8.b;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;
import fg6.a;
import com.google.gson.Gson;
import java.lang.System;
import com.yxcorp.gifshow.performance.monitor.io.IOMonitorInitModule$e;
import com.yxcorp.gifshow.performance.monitor.io.IOMonitorInitModule$f;
import com.kwai.performance.overhead.io.monitor.IoMonitorDiskUsageConfig;
import qkd.b;
import java.util.Objects;
import java.lang.Long;
import k80.c;
import java.nio.charset.Charset;
import kotlin.io.FilesKt__FileReadWriteKt;
import com.yxcorp.gifshow.performance.monitor.io.IOMonitorInitModule$g;
import el.a;
import zsd.d;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.Reader;
import wsd.m;
import kotlin.io.TextStreamsKt;
import java.util.Iterator;
import java.lang.Number;
import qrd.l1;
import java.io.Closeable;
import java.lang.Throwable;
import isd.b;
import org.json.JSONObject;
import java.util.Map;
import java.lang.NullPointerException;
import java.lang.Exception;
import java.util.Set;
import com.yxcorp.gifshow.performance.monitor.io.IOMonitorInitModule$h;
import java.lang.Iterable;
import java.util.Comparator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import trd.u;
import trd.s0;
import usd.q;
import java.util.LinkedHashMap;
import java.util.Map$Entry;
import org.json.JSONArray;

public final class IOMonitorInitModule extends PerformanceBaseInitModule implements s1	// class@0012c1
{
    public final IOMonitorInitModule$b q;
    public static final IOMonitorInitModule$a A;
    public static HashMap r;
    public static HashMap s;
    public static long t;
    public static long u;
    public static IoMonitorDiskUsageConfigOnline v;
    public static String w;
    public static String x;
    public static File y;
    public static File z;

    static {
       IOMonitorInitModule.A = new IOMonitorInitModule$a(null);
       IOMonitorInitModule.r = new HashMap();
       IOMonitorInitModule.s = new HashMap();
       IOMonitorInitModule.v = new IoMonitorDiskUsageConfigOnline();
       IOMonitorInitModule.w = "";
       IOMonitorInitModule.y = new File("");
       IOMonitorInitModule.z = new File("");
    }
    public void IOMonitorInitModule(){
       super();
       this.q = new IOMonitorInitModule$b();
    }
    public void d(String p0,int p1,String p2){
       if (PatchProxy.isSupport(IOMonitorInitModule.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, IOMonitorInitModule.class, "13")) {
          return;
       }
       if (p0 != null) {
          k.d(IoMonitor.class).setCurrentPage(p0);
       }
       return;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, IOMonitorInitModule.class, "2")) {
          return;
       }
       d.a(new IOMonitorInitModule$c(this), "io-detector", 1, 5000);
       return;
    }
    public final boolean o0(){
       a obj = PatchProxy.apply(null, this, IOMonitorInitModule.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = a.t();
       FDMonitorArgsConfig value = obj.getValue("kswitch_key_fd_monitor_arg", FDMonitorArgsConfig.class, new FDMonitorArgsConfig());
       IoMonitorWBConfig value1 = obj.getValue("kswitch_key_io_detector_white_black_list", IoMonitorWBConfig.class, new IoMonitorWBConfig());
       FDMonitorArgsConfig uFDMonitorAr = value.fdMonitorRate;
       if (SystemUtil.K() && a.d()) {
          uFDMonitorAr = uFDMonitorAr * (float)100;
       }
       if (Math.random() - (double)uFDMonitorAr < 0) {
          a uoa = new a();
          uoa.d = value;
          uoa.c(value1);
          uoa.d(r.a());
          k.a(uoa);
          k.d(IoMonitor.class).checkStartMonitor(2);
          u1.s0("over_limit_fd_trace_launch", "monitor_launch");
          u1.s0("fd_random_trace_launch", "monitor_launch");
          b.a(0x4b316083).T0(this);
          a.b().registerActivityLifecycleCallbacks(this.q);
          return true;
       }else {
          return false;
       }
    }
    public final String p0(){
       List list;
       Object obj4;
       String absolutePath;
       Object[] objArray1;
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Application obj1 = PatchProxy.apply(objArray, obj, IOMonitorInitModule.class, "10");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       obj1 = a.b();
       String str = "AppEnv.getAppContext\(\)";
       a.o(obj1, str);
       File externalCach = obj1.getExternalCacheDir();
       externalCach = (externalCach != null)? externalCach.getParentFile(): objArray;
       Application uApplication = a.b();
       a.o(uApplication, str);
       File filesDir = uApplication.getFilesDir();
       a.o(filesDir, "AppEnv.getAppContext\(\).filesDir");
       filesDir = filesDir.getParentFile();
       String str1 = "innerFile";
       int i = 1;
       if (externalCach != null) {
          File[] uFileArray = new File[]{filesDir,externalCach};
          a.o(filesDir, str1);
          list = CollectionsKt__CollectionsKt.L(uFileArray);
       }else {
          list = t.k(filesDir);
       }
       Random random = new Random();
       a.o(filesDir, str1);
       int i1 = 0;
       while (true) {
          if ((long)i1 - IOMonitorInitModule.v.randomDirLevelLimit <= 0) {
             int i2 = list.isEmpty() ^ i;
             if (i2) {
                ArrayList obj2 = list.get(random.nextInt(list.size()));
                a.m(obj2);
                Object obj3 = obj2;
                list = PatchProxy.applyOneRefs(obj3, obj, IOMonitorInitModule.class, "11");
                if (list != patchProxyRe) {
                }else {
                   obj2 = new ArrayList();
                   File[] uFileArray1 = obj3.listFiles();
                   int len = uFileArray1.length;
                   int i3 = 0;
                   while (i3 < len) {
                      object oobject = uFileArray1[i3];
                      if (oobject.isDirectory()) {
                         obj4 = obj3;
                         if (a.c(oobject) - IOMonitorInitModule.v.randomDirSizeLimit > 0) {
                            obj2.add(oobject);
                         }
                      }else {
                         obj4 = obj3;
                      }
                      i3 = i3 + 1;
                      obj3 = obj4;
                      IoMonitorDiskUsageConfigOnline ioMonitorDis = 1;
                   }
                }
                obj4 = obj3;
                i1 = i1 + 1;
                filesDir = obj4;
                i = 1;
             }else {
             label_00c5 :
                absolutePath = filesDir.getAbsolutePath();
                a.o(absolutePath, "dir.absolutePath");
                if (StringsKt__StringsKt.O2(absolutePath, IOMonitorInitModule.w, 0, 2, null)) {
                   b.o(IOMonitorInitModule.w);
                   break ;
                }else {
                   absolutePath = IOMonitorInitModule.x;
                   if (absolutePath != null) {
                      b.o(absolutePath);
                      break ;
                   }
                }
                break ;
             }
          }else {
             goto label_00c5 ;
          }
       }
       absolutePath = filesDir.getAbsolutePath();
       a.o(absolutePath, "dir.absolutePath");
       return absolutePath;
    }
    public final void q0(){
       if (PatchProxy.applyVoid(null, this, IOMonitorInitModule.class, "3")) {
          return;
       }
       if (this.s0()) {
          Log.b("io-detector", "io-monitor isFirstLaunch!");
          return;
       }else {
          int sDK_INT = Build$VERSION.SDK_INT;
          if (sDK_INT <= 23 || sDK_INT > 32) {
             Log.b("io-detector", "io-monitor ignore SDK_INT="+sDK_INT);
             return;
          }else if(!AbiUtil.b()){
             return;
          }else if(!a.t().d("kswitch_key_io_detector_enabled", false)){
             return;
          }else {
             String str = r.a();
             if (TextUtils.isEmpty(str)) {
                return;
             }
             d.a(new IOMonitorInitModule$d(str), "io-detector", 1, 5000);
             if (this.t0()) {
                return;
             }
             if (this.o0()) {
                return;
             }
             this.r0();
             return;
          }
       }
    }
    public final boolean r0(){
       a obj = PatchProxy.apply(null, this, IOMonitorInitModule.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = a.t();
       Double value = obj.getValue("kswitch_key_io_monitor_ratio_double", Double.TYPE, Double.valueOf(0));
       a.o(value, "ioDetectorRatioDouble");
       double d = value.doubleValue();
       a uoa = null;
       IoMonitorWBConfig ioMonitorWBC = (Math.random() - d < 0)? 1: null;
       if (ioMonitorWBC) {
          uoa = new a();
          IoMonitorArgsConfig value1 = obj.getValue("kswitch_key_io_detector_args", IoMonitorArgsConfig.class, new IoMonitorArgsConfig());
          IoMonitorPdConfig value2 = obj.getValue("kswitch_key_io_detector_pds", IoMonitorPdConfig.class, new IoMonitorPdConfig());
          Log.b("io-detector", "io-monitor-begin!");
          uoa.c(obj.getValue("kswitch_key_io_detector_white_black_list", IoMonitorWBConfig.class, new IoMonitorWBConfig()));
          if (value1 != null) {
             uoa.b = value1;
          }
          if (value2 != null) {
             uoa.c = value2;
          }
          uoa.d(r.a());
          k.a(uoa);
          k.d(IoMonitor.class).checkStartMonitor(1);
          return 1;
       }else {
          return uoa;
       }
    }
    public final boolean s0(){
       Object obj = PatchProxy.apply(null, this, IOMonitorInitModule.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       obj = b.c("io_detector_sp", i);
       a.o(obj, "PreferenceContext.get\(IO¡­SP, Context.MODE_PRIVATE\)");
       if (obj.getInt("io_detector_launch_count", i) <= 0) {
          i = 1;
          g.a(obj.edit().putInt("io_detector_launch_count", i));
       }
       return i;
    }
    public final boolean t0(){
       SharedPreferences a;
       a uoa;
       String str = "/files/io-detector/";
       String str1 = "AppEnv.getAppContext\(\)";
       Object[] objArray = null;
       Gson obj = PatchProxy.apply(objArray, this, IOMonitorInitModule.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       String str2 = "io-detector";
       if (!a.t().d("kswitch_key_disk_detector_enabled", b)) {
          Log.b(str2, "disable monitor DiskUseage");
          return b;
       }else if(IOMonitorInitModule.v.disableChildProcess != null && !r.b()){
          Log.b(str2, "disableChildProcess:"+r.a());
          return b;
       }else {
          obj = a.a;
          IoMonitorWBConfig ioMonitorWBC = obj.h("{\n      \"overviewElfs\":[\".*libc.so$\",\".*libbase.so$\",\".*libart.so$\",\".*libartbase.so$\",\n      \".*libopenjdkjvm.so$\", \".*libjavacore.so$\",\".*libopenjdk.so$\",\".*sqlite.so$\"],\n      \"ignoreElfs\":[\".*libio-detector.so$\"]\n      }", IoMonitorWBConfig.class);
          try{
             Application uApplication = a.b();
             a.o(uApplication, str1);
             File filesDir = uApplication.getFilesDir();
             a.o(filesDir, "AppEnv.getAppContext\(\).filesDir");
             filesDir = filesDir.getParentFile();
             a.o(filesDir, "AppEnv.getAppContext\(\).filesDir.parentFile");
             String absolutePath = filesDir.getAbsolutePath();
             a.o(absolutePath, "AppEnv.getAppContext\(\).f¡­r.parentFile.absolutePath");
             IOMonitorInitModule.w = absolutePath;
             uApplication = a.b();
             a.o(uApplication, str1);
             File externalCach = uApplication.getExternalCacheDir();
             if (externalCach != null) {
                externalCach = externalCach.getParentFile();
                if (externalCach != null) {
                   objArray = externalCach.getAbsolutePath();
                }
             }
             IOMonitorInitModule.x = objArray;
             IOMonitorInitModule.y = new File(IOMonitorInitModule.w+str+r.a()+"/file_open_record.txt");
             IOMonitorInitModule.z = new File(IOMonitorInitModule.w+str+r.a()+"/file_open_map.json");
             a = b.a;
             if (a.getBoolean("DiskMonitoring", b)) {
                Log.b(str2, "there is ongoing disk monitoring");
                if ((System.currentTimeMillis() - b.e()) - ((long)b.h() * 0x5265c00) > 0) {
                   Log.b(str2, "monitorInterveltime is matched");
                   d.a(new IOMonitorInitModule$e(this), str2, 1, 5000);
                   return 1;
                }else {
                   d.d(new IOMonitorInitModule$f(this, ioMonitorWBC), str2, 1);
                   return 1;
                }
             }else {
                IoMonitorDiskUsageConfigOnline value = a.t().getValue("kswitch_key_io_detector_disk_usage", IoMonitorDiskUsageConfigOnline.class, new IoMonitorDiskUsageConfigOnline());
                a.o(value, "SwitchConfigManager.getI¡­rDiskUsageConfigOnline\(\)\)");
                IOMonitorInitModule.v = value;
                Log.b(str2, obj.q(value));
                if (IOMonitorInitModule.v.monitorEnable != null) {
                   Log.b(str2, "begin new monitorDiskUseage");
                   SharedPreferences$Editor uEditor = a.edit();
                   uEditor.putLong("MonitorBeginTime", System.currentTimeMillis());
                   g.a(uEditor);
                   SharedPreferences$Editor uEditor1 = a.edit();
                   uEditor1.putInt("MonitorIntervelDays", IOMonitorInitModule.v.monitorIntervelDays);
                   g.a(uEditor1);
                   b.n(1);
                   uEditor = a.edit();
                   uEditor.putLong("UnUsedFileSizeLimit", IOMonitorInitModule.v.unUsedFileSizeLimit);
                   g.a(uEditor);
                   uEditor1 = a.edit();
                   uEditor1.putInt("OpenFileCountLimit", IOMonitorInitModule.v.openFileCountLimit);
                   g.a(uEditor1);
                   uEditor1 = a.edit();
                   uEditor1.putString("BlackDirList", b.e(IOMonitorInitModule.v.blackDirList));
                   g.a(uEditor1);
                   SharedPreferences$Editor uEditor2 = a.edit();
                   uEditor2.putBoolean("MonitorChildDirEnable", IOMonitorInitModule.v.monitorChildDirEnable);
                   g.a(uEditor2);
                   IoMonitorDiskUsageConfigOnline v = IOMonitorInitModule.v;
                   value = v.monitorDir;
                   IoMonitorDiskUsageConfigOnline blackDirList = v.blackDirList;
                   if (value != null) {
                      if (v.isInnerDir != null) {
                         b.o(IOMonitorInitModule.w);
                         str1 = IOMonitorInitModule.w+value;
                      }else {
                         str = IOMonitorInitModule.x;
                         if (str != null) {
                            b.o(str);
                            str1 = str+value;
                         }
                      }
                   }else {
                      try{
                         str1 = this.p0();
                      }catch(java.lang.Exception e0){
                      }
                   }
                }else {
                   Log.b(str2, "go on normal io monitor");
                   return b;
                }
             }
          }catch(java.lang.Exception e0){
          }
       }
    }
    public final void u0(){
       if (PatchProxy.applyVoid(null, this, IOMonitorInitModule.class, "12")) {
          return;
       }
       Log.b("io-detector", "resetMonitorState");
       b.q(IOMonitorInitModule.y);
       b.q(IOMonitorInitModule.z);
       b.m(false);
       return;
    }
    public final void v0(File p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IOMonitorInitModule.class, "9")) {
          return;
       }
       int i = (b.g()).length();
       long longx = b.a.getLong("UnUsedFileSizeLimit", 1);
       File[] uFileArray = p0.listFiles();
       if (!uFileArray.length) {
          return;
       }
       int len = uFileArray.length;
       int i1 = 0;
       while (i1 < len) {
          object oobject = uFileArray[i1];
          if (!b.P(oobject)) {
             a.o(oobject, "file");
             if (oobject.isDirectory()) {
                this.v0(oobject);
             }else {
                long l = oobject.length();
                long l1 = IOMonitorInitModule.t + l;
                IOMonitorInitModule.t = l1;
                String absolutePath = oobject.getAbsolutePath();
                a.o(absolutePath, "file.absolutePath");
                Objects.requireNonNull(absolutePath, "null cannot be cast to non-null type java.lang.String");
                absolutePath = absolutePath.substring(i);
                a.o(absolutePath, "\(this as java.lang.String\).substring\(startIndex\)");
                if (!IOMonitorInitModule.r.containsKey(absolutePath)) {
                   l1 = IOMonitorInitModule.u + l;
                   IOMonitorInitModule.u = l1;
                   if (l - longx > 0) {
                      IOMonitorInitModule.s.put(absolutePath, Long.valueOf(l));
                   }
                }
             }
          }
          i1 = i1 + 1;
       }
       return;
    }
    public final void w0(boolean p0){
       boolean b;
       if (PatchProxy.isSupport(IOMonitorInitModule.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, IOMonitorInitModule.class, "7")) {
          return;
       }
       String str = "io-detector";
       Log.b(str, "tryUpLoadDiskUsageInfo");
       if (!IOMonitorInitModule.y.exists() || c.a(IOMonitorInitModule.y)) {
          Log.d(str, "file is empty");
          if (p0) {
             this.u0();
          }
          return;
       }else if((System.currentTimeMillis() - b.a.getLong("LastDiskUsageUplodTime", -1)) - 0x5265c00 < 0){
          Log.b(str, "upload at most once oneday");
          return;
       }else {
          try{
             Charset uCharset = null;
             if (IOMonitorInitModule.z.exists() && !c.a(IOMonitorInitModule.z)) {
                InputStreamReader obj = a.a.i(FilesKt__FileReadWriteKt.z(IOMonitorInitModule.z, uCharset, 1, uCharset), new IOMonitorInitModule$g().getType());
                a.o(obj, "Gsons.KWAI_GSON.fromJson¡­g, Long>>\(\) {}.getType\(\)\)");
                IOMonitorInitModule.r = obj;
                Log.b(str, "history openFileMap£º"+IOMonitorInitModule.r.toString());
             label_0096 :
                b = 8192;
                obj = new InputStreamReader(new FileInputStream(IOMonitorInitModule.y), d.a);
                if (obj instanceof BufferedReader) {
                }else {
                   BufferedReader uBufferedRea = new BufferedReader(obj, b);
                }
                Iterator iterator = TextStreamsKt.h(obj).iterator();
                while (iterator.hasNext()) {
                   String obj1 = iterator.next();
                   Log.b(str, "open_record_file line: "+obj1);
                   String[] stringArray = new String[]{","};
                   Iterator iterator1 = StringsKt__StringsKt.H4(obj1, stringArray, false, 0, 6, null).iterator();
                   while (iterator1.hasNext()) {
                      obj1 = iterator1.next();
                      long l = 1;
                      if (IOMonitorInitModule.r.containsKey(obj1)) {
                         HashMap r = IOMonitorInitModule.r;
                         Object obj2 = r.get(obj1);
                         a.m(obj2);
                         long l1 = obj2.longValue() + l;
                         r.put(obj1, Long.valueOf(l1));
                      }else {
                         IOMonitorInitModule.r.put(obj1, Long.valueOf(l));
                      }
                   }
                }
                b.a(obj, uCharset);
                Log.b(str, "new openFileMap£º"+IOMonitorInitModule.r.toString());
                HashMap r1 = IOMonitorInitModule.r;
                if (r1 != null) {
                   String str1 = new JSONObject(r1).toString();
                   a.o(str1, "it.toString\(\)");
                   FilesKt__FileReadWriteKt.G(IOMonitorInitModule.z, str1, uCharset, 2, uCharset);
                   this.x0();
                   b.q(IOMonitorInitModule.y);
                   if (p0) {
                   }
                }else {
                   throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                }
             }else {
                goto label_0096 ;
             }
          label_0192 :
             return;
          }catch(java.lang.Exception e1){
             this.u0();
             Log.d(str, e1.getMessage());
             e1.printStackTrace();
             b.q(IOMonitorInitModule.y);
             if (p0) {
             }else {
                goto label_0192 ;
             }
          }
          this.u0();
          goto label_0192 ;
       }
    }
    public final void x0(){
       boolean b;
       String absolutePath1;
       Gson a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, IOMonitorInitModule.class, "8")) {
          return;
       }
       String str = "io-detector";
       Log.b(str, "upLoadDiskUsageInfo");
       File uFile = new File(b.f());
       if (uFile.exists() && (!uFile.isDirectory() || c.a(uFile))) {
          Log.b(str, "monitor dir is empty ");
          return;
       }else {
          JSONObject jSONObject = new JSONObject();
          String absolutePath = uFile.getAbsolutePath();
          String str1 = "dir.absolutePath";
          a.o(absolutePath, str1);
          b = false;
          String str2 = "is_inner_dir";
          String str3 = "\(this as java.lang.String\).substring\(startIndex\)";
          String str4 = "null cannot be cast to non-null type java.lang.String";
          String str5 = "monitor_dir";
          if (StringsKt__StringsKt.O2(absolutePath, IOMonitorInitModule.w, b, 2, objArray)) {
             absolutePath1 = uFile.getAbsolutePath();
             a.o(absolutePath1, str1);
             Objects.requireNonNull(absolutePath1, str4);
             absolutePath1 = absolutePath1.substring((IOMonitorInitModule.w).length());
             a.o(absolutePath1, str3);
             jSONObject.put(str5, absolutePath1);
             jSONObject.put(str2, true);
          }else {
             absolutePath = IOMonitorInitModule.x;
             if (absolutePath != null) {
                absolutePath = uFile.getAbsolutePath();
                a.o(absolutePath, str1);
                Objects.requireNonNull(absolutePath, str4);
                absolutePath1 = absolutePath.substring(absolutePath.length());
                a.o(absolutePath1, str3);
             }
             jSONObject.put(str5, absolutePath1);
             jSONObject.put(str2, b);
          }
          jSONObject.put("process_name", r.a());
          jSONObject.put("set_monitor_days", b.h());
          jSONObject.put("launch_count", b.d());
          jSONObject.put("actual_monitor_days", (int)((System.currentTimeMillis() - b.e()) / 0x5265c00));
          Log.b(str, "scanDir: "+uFile.getAbsolutePath());
          this.v0(uFile);
          absolutePath1 = "total_size";
          jSONObject.put(absolutePath1, IOMonitorInitModule.t);
          jSONObject.put("unused_file_size", IOMonitorInitModule.u);
          jSONObject.put("unused_rate", ((double)IOMonitorInitModule.u / (double)IOMonitorInitModule.t));
          Log.b(str, "base data info:"+jSONObject.toString());
          if (IOMonitorInitModule.s.size() > 0) {
             Set set = IOMonitorInitModule.s.entrySet();
             a.o(set, "unUsedFileMap.entries");
             List list = CollectionsKt___CollectionsKt.f5(set, new IOMonitorInitModule$h());
             LinkedHashMap linkedHashMa = new LinkedHashMap(q.n(s0.j(u.Y(list, 10)), 16));
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                str5 = uEntry.getKey();
                linkedHashMa.put(str5, uEntry.getValue());
             }
             a = a.a;
             Log.b(str, "unused_file_rank:"+a.q(linkedHashMa));
             absolutePath = a.q(linkedHashMa);
             jSONObject.put("unused_file_rank", absolutePath);
          }
          if (b.a.getBoolean("MonitorChildDirEnable", b)) {
             File[] uFileArray = uFile.listFiles();
             if (uFileArray.length) {
                JSONArray jSONArray = new JSONArray();
                int len = uFileArray.length;
                while (b < len) {
                   object oobject = uFileArray[b];
                   a.o(oobject, "file");
                   if (oobject.isDirectory() && !c.a(oobject)) {
                      IOMonitorInitModule.t = 0;
                      IOMonitorInitModule.u = 0;
                      Log.b(str, "scanChildDir: "+oobject.getAbsolutePath());
                      this.v0(oobject);
                      JSONObject jSONObject1 = new JSONObject();
                      jSONObject1.put("dir_name", oobject.getAbsolutePath());
                      jSONObject1.put(absolutePath1, IOMonitorInitModule.t);
                      jSONObject1.put("unused_file_size", IOMonitorInitModule.u);
                      double d = (double)IOMonitorInitModule.u / (double)IOMonitorInitModule.t;
                      jSONObject1.put("unused_rate", d);
                      jSONArray.put(jSONObject1);
                   }
                   b = b + 1;
                }
                Log.b(str, "child dir info:"+jSONArray.toString());
                jSONObject.put("child_dir_info", jSONArray);
             }
          }
          Log.b(str, "total data info:"+jSONObject.toString());
          u1.R("DiskUsageInfo", jSONObject.toString(), 19);
          IOMonitorInitModule.r.clear();
          IOMonitorInitModule.s.clear();
          SharedPreferences$Editor uEditor = b.a.edit();
          uEditor.putLong("LastDiskUsageUplodTime", System.currentTimeMillis());
          g.a(uEditor);
          return;
       }
    }
}

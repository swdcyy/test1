package com.kwai.performance.stability.crash.monitor.util.e;
import java.util.HashMap;
import java.io.File;
import java.lang.String;
import java.lang.Object;
import com.kwai.performance.stability.crash.monitor.message.ExceptionMessage;
import android.content.Context;
import vg7.e;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import kotlin.jvm.internal.a;
import qrd.l1;
import java.io.Closeable;
import java.lang.Throwable;
import isd.b;
import java.io.FileDescriptor;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;
import java.io.IOException;
import java.io.FileNotFoundException;
import kotlin.io.FilesKt__UtilsKt;
import java.lang.Exception;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Thread;
import java.lang.StackTraceElement;
import java.lang.CharSequence;
import qrd.i;
import yf7.h;
import android.os.Debug$MemoryInfo;
import android.os.Debug;
import com.kwai.performance.stability.crash.monitor.util.g;
import android.os.ParcelFileDescriptor;
import android.system.Os;
import vg7.i;
import java.lang.Boolean;
import yf7.r;
import java.lang.ThreadGroup;
import java.lang.Class;
import java.lang.Number;
import android.content.res.Resources;
import android.content.res.AssetManager;
import java.io.InputStream;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import zsd.d;
import java.io.InputStreamReader;
import kotlin.io.TextStreamsKt;
import org.json.JSONObject;
import java.io.StringWriter;
import com.kwai.performance.stability.crash.monitor.util.f;
import java.io.PrintWriter;
import java.util.Objects;
import java.lang.StringBuilder;
import java.util.List;
import com.kwai.performance.stability.crash.monitor.util.c;
import zsd.u;
import kotlin.text.StringsKt__StringsKt;
import kotlin.io.FilesKt__FileReadWriteKt;
import com.kwai.performance.stability.crash.monitor.message.JavaExceptionMessage;
import android.os.Process;
import java.lang.System;
import com.kwai.performance.monitor.base.MonitorBuildConfig;
import com.kwai.performance.stability.crash.monitor.util.AbiUtil;
import vg7.h;
import android.content.pm.ApplicationInfo;
import vg7.d;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.google.gson.Gson;
import com.kwai.performance.stability.crash.monitor.message.MemoryInfo;
import vg7.i$a;
import java.lang.Runtime;
import yf7.u;
import trd.x;
import com.kwai.performance.stability.crash.monitor.util.d;
import java.util.Comparator;
import com.kwai.performance.stability.crash.monitor.LifecycleCallbacksHandler;
import com.kwai.performance.stability.crash.monitor.message.DiskInfo;
import android.os.StatFs;
import android.os.Environment;
import java.math.BigDecimal;
import com.kwai.performance.stability.crash.monitor.message.NativeExceptionMessage;
import java.lang.IllegalArgumentException;
import java.lang.OutOfMemoryError;
import com.kwai.performance.stability.crash.monitor.message.DeviceInfo;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.view.Display;
import cw9.c;
import android.content.res.Configuration;
import java.lang.Math;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import java.io.OutputStream;
import android.os.Build$VERSION;
import android.app.Application;
import yf7.k;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import java.lang.Long;
import java.lang.Integer;
import java.lang.ClassLoader;
import kotlin.text.Regex;
import java.util.Collection;
import java.lang.RuntimeException;
import android.os.Bundle;
import nsd.h;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;

public final class e	// class@000e45
{
    public static final e a;
    public static final HashMap b;
    public static final File c;
    public static final File d;

    static {
       e.a = new e();
       e.b = new HashMap();
       e.c = new File("/proc/self/fd");
       e.d = new File("/proc/self/task");
    }
    public void e(){
       super();
    }
    public static void A(ExceptionMessage p0,Context p1,String p2,int p3,Object p4){
       p2 = (p3 & 0x04)? "": null;
       e.z(p0, p1, p2);
       return;
    }
    public static final void B(File p0,String p1,boolean p2){
       File parentFile = p0.getParentFile();
       if (parentFile == null) {
       }else {
          e.a(parentFile);
       }
       if (p1 != null) {
          FileOutputStream uFileOutputS = new FileOutputStream(p0, p2);
          Charset uCharset = Charset.defaultCharset();
          a.o(uCharset, "defaultCharset\(\)");
          byte[] bytes = p1.getBytes(uCharset);
          a.o(bytes, "\(this as java.lang.String\).getBytes\(charset\)");
          uFileOutputS.write(bytes);
          b.a(uFileOutputS, null);
       }
       return;
    }
    public static final void C(File p0,String p1,boolean p2){
       if (p0 == null) {
       }else {
          File parentFile = p0.getParentFile();
          if (parentFile != null) {
             e.a(parentFile);
          }
       }
       if (p1 != null) {
          FileOutputStream uFileOutputS = new FileOutputStream(p0, p2);
          Charset uCharset = Charset.defaultCharset();
          a.o(uCharset, "defaultCharset\(\)");
          byte[] bytes = p1.getBytes(uCharset);
          a.o(bytes, "\(this as java.lang.String\).getBytes\(charset\)");
          uFileOutputS.write(bytes);
          uFileOutputS.getFD().sync();
          b.a(uFileOutputS, null);
       }
       return;
    }
    public static final void a(File p0,File p1){
       e a;
       a.p(p0, "src");
       String str = "target";
       try{
          a.p(p1, str);
          a = e.a;
          a.g(p0);
          try{
             a.g(p1);
             BufferedReader uBufferedRea = new BufferedReader(new FileReader(p0));
             BufferedWriter uBufferedWri = new BufferedWriter(new FileWriter(p1, true));
             String str1 = uBufferedRea.readLine();
             while (str1 != null) {
                uBufferedWri.write(str1);
                uBufferedWri.newLine();
             }
             b.a(uBufferedWri, null);
             b.a(uBufferedRea, null);
          }catch(java.io.FileNotFoundException e3){
             e3.printStackTrace();
          }catch(java.io.IOException e3){
             e3.printStackTrace();
          }
          return;
       }catch(java.io.IOException e3){
          e3.printStackTrace();
          return;
       }
    }
    public static final void b(File p0){
       try{
          if (p0 == null) {
          }else {
             int i = 0;
             int i1 = (p0.exists() && p0.isDirectory())? 1: 0;
             if (!i1) {
                p0 = null;
             }
             if (p0 != null) {
                File[] uFileArray = p0.listFiles();
                if (uFileArray != null) {
                   i1 = uFileArray.length;
                   for (; i < i1; i = i + 1) {
                      object oobject = uFileArray[i];
                      a.o(oobject, "file");
                      FilesKt__UtilsKt.V(oobject);
                   }
                }
             }
          }
       }catch(java.lang.Exception e4){
          e4.printStackTrace();
       }
       return;
    }
    public static final void d(File p0,long p1){
       e a;
       String str = "target";
       try{
          a.p(p0, str);
          a = e.a;
          try{
             a.g(p0);
             BufferedWriter uBufferedWri = new BufferedWriter(new FileWriter(p0, true));
             Iterator iterator = e.h(p1).entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                Thread key = uEntry.getKey();
                String str1 = e.a.o(uEntry.getValue());
                e uoe = (!str1.length())? 1: null;
                if (uoe) {
                   str1 = "\(no managed stack frames\)\n";
                }
                uBufferedWri.write(key.getName());
                uBufferedWri.newLine();
                uBufferedWri.write(str1);
                uBufferedWri.newLine();
             }
             b.a(uBufferedWri, null);
          }catch(java.lang.Exception e4){
             e4.printStackTrace();
             h.b("ExceptionUtil", i.i(e4));
          }
          return;
       }catch(java.io.IOException e4){
          e4.printStackTrace();
          return;
       }
    }
    public static void e(File p0,long p1,int p2,Object p3){
       if (p2 & 0x02) {
          p1 = 0;
       }
       e.d(p0, p1);
       return;
    }
    public static final void f(File p0){
       Object[] objArray1;
       Boolean fALSE;
       Boolean tRUE;
       String[] stringArray;
       String[] stringArray1;
       String str = "target";
       try{
          a.p(p0, str);
          Debug$MemoryInfo memoryInfo = new Debug$MemoryInfo();
          Debug.getMemoryInfo(memoryInfo);
          Object[] objArray = new Object[0];
          Object obj = g.d(g.b("android.app.ActivityThread", "currentActivityThread", objArray), "mAppThread");
          ParcelFileDescriptor parcelFileDe = ParcelFileDescriptor.open(p0, 0x38000000);
          String str1 = "open\(\n        target,\n        ParcelFileDescriptor.MODE_READ_WRITE or ParcelFileDescriptor.MODE_CREATE\n      \)";
          try{
             a.o(parcelFileDe, str1);
             Os.chmod(p0.getPath(), 384);
          }catch(java.lang.Exception e4){
             e4.printStackTrace();
          }
          int i = 26;
          if (!i.a(i)) {
             parcelFileDe = parcelFileDe.getFileDescriptor();
             a.o(parcelFileDe, "fd as ParcelFileDescriptor\).fileDescriptor");
          }
          if (i.a(24)) {
             objArray1 = new Object[]{parcelFileDe,memoryInfo,fALSE,tRUE,tRUE,fALSE,fALSE,stringArray};
             fALSE = Boolean.FALSE;
             tRUE = Boolean.TRUE;
             stringArray = new String[0];
             g.a(obj, "dumpMemInfo", objArray1);
          }else if(i.a(23)){
             objArray1 = new Object[]{parcelFileDe,memoryInfo,fALSE,tRUE,tRUE,fALSE,stringArray};
             fALSE = Boolean.FALSE;
             tRUE = Boolean.TRUE;
             stringArray = new String[0];
             g.a(obj, "dumpMemInfo", objArray1);
          }else if(i.a(19)){
             objArray1 = new Object[]{parcelFileDe,memoryInfo,Boolean.FALSE,fALSE,fALSE,stringArray};
             fALSE = Boolean.TRUE;
             stringArray = new String[0];
             g.a(obj, "dumpMemInfo", objArray1);
          }
          ParcelFileDescriptor parcelFileDe1 = ParcelFileDescriptor.open(p0, 0x2a000000);
          a.o(parcelFileDe1, "open\(\n        target,\n        ParcelFileDescriptor.MODE_WRITE_ONLY or ParcelFileDescriptor.MODE_CREATE\n            or ParcelFileDescriptor.MODE_APPEND\n      \)");
          if (!i.a(i)) {
             parcelFileDe1 = parcelFileDe1.getFileDescriptor();
             a.o(parcelFileDe1, "fd.fileDescriptor");
          }
          Object[] objArray2 = new Object[]{parcelFileDe1,stringArray1};
          stringArray1 = new String[]{r.a()};
          g.a(obj, "dumpGfxInfo", objArray2);
       }catch(java.lang.Exception e14){
          e14.printStackTrace();
       }
       return;
    }
    public static final Map h(long p0){
       if (!p0 - null) {
          Map allStackTrac = Thread.getAllStackTraces();
          a.o(allStackTrac, "getAllStackTraces\(\)");
          return allStackTrac;
       }else {
          Object obj = g.g(ThreadGroup.class, "systemThreadGroup");
          a.o(obj, "getStaticField\(ThreadGroup::class.java, \"systemThreadGroup\"\)");
          int i = obj.activeCount();
          Thread[] threadArray = new Thread[(i + (i / 2))];
          HashMap obj1 = g.d(Thread.currentThread(), "nativePeer");
          a.o(obj1, "getField\(Thread.currentThread\(\), \"nativePeer\"\)");
          long l = obj1.longValue();
          int i1 = obj.enumerate(threadArray);
          obj1 = new HashMap();
          int i2 = 0;
          if (i1 > 0) {
             while (true) {
                int i3 = i2 + 1;
                object oobject = threadArray[i2];
                if (oobject == null) {
                label_0073 :
                   if (i3 < i1) {
                      i2 = i3;
                   }
                }else {
                   StackTraceElement[] obj2 = g.d(oobject, "nativePeer");
                   a.o(obj2, "getField\(thread, \"nativePeer\"\)");
                   long l1 = obj2.longValue();
                   if (l1 - p0 && l1 - l) {
                      obj2 = oobject.getStackTrace();
                      a.o(obj2, "stackTrace");
                      obj1.put(oobject, obj2);
                      goto label_0073 ;
                   }else {
                      goto label_0073 ;
                   }
                }
             }
          }
          return obj1;
       }
    }
    public static final HashMap p(){
       return e.b;
    }
    public static final String q(Context p0){
       if (p0 == null) {
       }else {
          try{
             Resources resources = p0.getResources();
             if (resources != null) {
                AssetManager assets = resources.getAssets();
                if (assets != null) {
                   InputStream inputStream = SplitAssetHelper.open(assets, "apk.json");
                   if (inputStream != null) {
                      InputStreamReader inputStreamR = new InputStreamReader(inputStream, d.a);
                      String str = 8192;
                      if (inputStreamR instanceof BufferedReader) {
                      }else {
                         inputStreamR = new BufferedReader(inputStreamR, str);
                      }
                      b.a(inputStreamR, null);
                      str = new JSONObject(TextStreamsKt.k(inputStreamR)).getString("task_id");
                      a.o(str, "JSONObject\(ips.bufferedReader\(\).use\(BufferedReader::readText\)\)\n          .getString\(\"task_id\"\)");
                      b.a(inputStream, null);
                      return str;
                   }
                }
             }
          }catch(java.lang.Exception e3){
             e3.printStackTrace();
          }
       }
    }
    public static final String r(Throwable p0){
       e a;
       int i2;
       String str1;
       int i3;
       a.p(p0, "t");
       StringWriter stringWriter = new StringWriter();
       boolean b = false;
       f uof = new f(stringWriter, b, 256);
       p0.printStackTrace(uof);
       uof.flush();
       a = e.a;
       String str = stringWriter.toString();
       a.o(str, "sw.toString\(\)");
       int i = 0x5000;
       if (str.length() > i) {
          Objects.requireNonNull(a);
          int i1 = 0x27ff;
          while (true) {
             i2 = i1 - 1;
             str1 = 10;
             i3 = 0x2800;
             if (str.charAt(i1) == str1) {
                i1++;
                break ;
             }else if(i2 < 0){
                i1 = 0x2800;
                break ;
             }else {
                i1 = i2;
             }
          }
          Objects.requireNonNull(e.a);
          i2 = str.length() - i3;
          int i4 = str.length();
          if (i2 < i4) {
             int i5 = i2 + 1;
             while (str.charAt(i2) != str1) {
                if (i5 < i4) {
                   i2 = i5;
                }
             }
             String str2 = "...\n\n[TRUNCATED "+(str.length() - i)+" CHARS]\n\n...";
             String str3 = str.substring(b, i1);
             a.o(str3, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
             str3 = str.substring(i2);
             a.o(str3, "\(this as java.lang.String\).substring\(startIndex\)");
             str = new StringBuilder((i + str2.length()))+str3+str2+str3;
             a.o(str, "sb.toString\(\)");
          }
          i2 = str.length() - i3;
          goto label_0066 ;
       }
       return str;
    }
    public static final void t(File p0){
       a.p(p0, "file");
       String[] stringArray = new String[12];
       stringArray[0] = "logcat";
       stringArray[1] = "-v";
       stringArray[2] = "threadtime";
       stringArray[3] = "-b";
       stringArray[4] = "main";
       stringArray[5] = "-b";
       stringArray[6] = "events";
       stringArray[7] = "-b";
       stringArray[8] = "crash";
       stringArray[9] = "-d";
       stringArray[10] = "-f";
       String path = p0.getPath();
       a.o(path, "file.path");
       try{
          stringArray[11] = path;
          c.b(stringArray, 0);
       }catch(java.io.IOException e5){
          e5.printStackTrace();
       }
       return;
    }
    public static final void u(Throwable p0,ExceptionMessage p1){
       a.p(p0, "ex");
       a.p(p1, "message");
       String str = u.g2(u.g2(e.r(p0), "\n", "#", false, 4, null), "\t", "#", false, 4, null);
       if (!StringsKt__StringsKt.O2(str, "#", false, 2, null)) {
          str = a.C(str, "##");
       }
       p1.mCrashDetail = str;
       return;
    }
    public static final void v(String p0,Object p1){
       a.p(p0, "key");
       if (p1 == null) {
       }else {
          e.b.put(p0, p1);
       }
       return;
    }
    public static final String w(File p0){
       String str = null;
       if (p0 == null) {
       }else {
          str = FilesKt__FileReadWriteKt.z(p0, str, 1, str);
       }
       return str;
    }
    public static final String x(String p0){
       a.p(p0, "path");
       if (StringsKt__StringsKt.O2(p0, ".", false, 2, null)) {
          p0 = p0.substring(false, StringsKt__StringsKt.v3(p0, '.', 0, false, 6, null));
          a.o(p0, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
       }
       return p0;
    }
    public static final void y(Throwable p0,ExceptionMessage p1,Context p2){
       e a;
       String str2;
       boolean len;
       MemoryInfo mFds;
       Throwable throwable2;
       Boolean uBoolean;
       File externalStor;
       HashMap hashMap;
       Matcher matcher;
       Matcher matcher1;
       String str = p1;
       Context uContext = p2;
       a.p(str, "message");
       if (p0 == null) {
       }else {
          e.u(p0, p1);
       }
       a = e.a;
       Objects.requireNonNull(a);
       StringBuilder str1 = "Unknown";
       if (str instanceof JavaExceptionMessage) {
          if (a.g(str1, str.mThreadName)) {
             str.mThreadName = Thread.currentThread().getName();
          }
          if (str.mTid == null) {
             str.mTid = Process.myTid();
          }
       }
       int i = 1;
       if (uContext) {
          str2 = r.a();
          String str3 = (str2 == null || !str2.length())? 1: null;
          if (!str3) {
             str.mProcessName = str2;
          }
       }
       str.mPid = Process.myPid();
       str.mCurrentTimeStamp = System.currentTimeMillis();
       str2 = ((MonitorBuildConfig.h()).length() > 0)? 1: null;
       str2 = (str2)? MonitorBuildConfig.h(): a.s(uContext);
       str.mVersionCode = str2;
       str2 = (AbiUtil.a())? "arm64": "arm";
       str.mAbi = str2;
       if (!a.g(str.mVersionCode, str1)) {
          str.mVersionCodeConflict = a.g(a.s(uContext), MonitorBuildConfig.h()) ^ i;
       }
       str1 = h.b();
       try{
          char c = 10;
          a.m(p2);
          str1 = str1+"BuildConfig Version Name: "+MonitorBuildConfig.h()+c+"PackageInfo CodePath: "+p2.getPackageCodePath()+c+"PackageInfo ResPath: "+p2.getPackageResourcePath()+c+"ApplicationInfo sourceDir:"+p2.getApplicationInfo().sourceDir+c+"DexPath: "+a.l(uContext)+c;
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       String str4 = str1;
       a.o(str4, "info.toString\(\)");
       str.mBuildConfigInfo = str4;
       if (uContext != null) {
          externalStor = p2.getCacheDir();
          if (externalStor != null) {
             externalStor = externalStor.getParentFile();
             if (externalStor != null) {
                externalStor = externalStor.getParentFile();
                if (externalStor != null) {
                   hashMap = externalStor.getParentFile();
                label_0158 :
                   Gson gson = (hashMap == null)? null: hashMap.getCanonicalPath();
                }
             }
          }
          hashMap = null;
          goto label_0158 ;
       }
    label_01b5 :
       str.mStatusMap = d.j.q(e.b);
       str.mTaskId = e.q(p2);
       MemoryInfo memoryInfo = new MemoryInfo();
       e a1 = e.a;
       Objects.requireNonNull(a1);
       i$a uoa = i.c();
       uoa.e = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
       uoa.a = u.d();
       long pss = Debug.getPss();
       uoa.d = pss;
       memoryInfo.mTotalMB = (int)(uoa.a / 0x100000);
       memoryInfo.mJavaHeapLimitMB = (int)(d.b / (double)0x100000);
       memoryInfo.mJavaHeapMB = (int)(uoa.e / 0x100000);
       memoryInfo.mVssMB = (int)(uoa.b / 1024);
       memoryInfo.mRssMB = (int)(uoa.c / 1024);
       memoryInfo.mPssMB = (int)(pss / 1024);
       memoryInfo.mThreadsCount = uoa.f;
       memoryInfo.mFdCount = a1.m();
       if (uContext != null) {
          memoryInfo.mAvailableMB = (int)(u.c(p2) / 0x100000);
       }
       str.mFdOverflow = "false";
       if (memoryInfo.mFdCount > d.e) {
          str.mCrashType = p1.getTypeFdOOM();
          str.mFdOverflow = String.valueOf(Boolean.TRUE);
          File[] uFileArray = e.c.listFiles();
          if (uFileArray != null) {
             int i1 = (!uFileArray.length)? 1: 0;
             if (i1 ^ i) {
                len = uFileArray.length;
                i1 = 0;
                while (i1 < len) {
                   object oobject = uFileArray[i1];
                   i = i1 + 1;
                   try{
                      memoryInfo.mFds.add(Os.readlink(oobject.getPath()));
                   }catch(java.lang.Exception e0){
                      e0.printStackTrace();
                   }
                   i1 = i;
                }
                mFds = memoryInfo.mFds;
                a.o(mFds, "info.mFds");
                x.m0(mFds);
             }
          }
       }
       str.mThreadOverflow = String.valueOf(Boolean.FALSE);
       if (uoa.f > 400) {
          str.mCrashType = p1.getTypeThreadOOM();
          str.mThreadOverflow = String.valueOf(Boolean.TRUE);
          a1.i(memoryInfo);
          mFds = memoryInfo.mThreadNames;
          a.o(mFds, "info.mThreadNames");
          x.p0(mFds, d.b);
       }
       str.mLiveActivities = LifecycleCallbacksHandler.a();
       str.mMemoryInfo = d.j.q(memoryInfo);
       DiskInfo uDiskInfo = new DiskInfo();
       Objects.requireNonNull(e.a);
       try{
          len = 2;
          StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
          uDiskInfo.mDataTotalGB = BigDecimal.valueOf(((double)(statFs.getTotalBytes() >> 20) / 1024.00f)).setScale(len, 4).floatValue();
          uDiskInfo.mDataAvailableGB = BigDecimal.valueOf(((double)(statFs.getAvailableBytes() >> 20) / 1024.00f)).setScale(len, 4).floatValue();
          if (a.g("mounted", Environment.getExternalStorageState())) {
             externalStor = Environment.getExternalStorageDirectory();
             if (externalStor != null) {
                StatFs statFs1 = new StatFs(externalStor.getPath());
                uDiskInfo.mExternalStorageTotalGB = BigDecimal.valueOf(((double)(statFs1.getTotalBytes() >> 20) / 1024.00f)).setScale(len, 4).floatValue();
                uDiskInfo.mExternalStorageAvailableGB = BigDecimal.valueOf(((double)(statFs1.getAvailableBytes() >> 20) / 1024.00f)).setScale(len, 4).floatValue();
             }
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       str.mDiskInfo = d.j.q(uDiskInfo);
       if (str instanceof NativeExceptionMessage) {
          Objects.requireNonNull(e.a);
          if ((memoryInfo.mPssMB * 2) > memoryInfo.mTotalMB || (!AbiUtil.a() && (double)memoryInfo.mVssMB - ((double)d.a * 0x3feccccccccccccd) > 0)) {
             str.mCrashType = p1.getTypeHeapOOM();
          }
       }else if(str instanceof JavaExceptionMessage){
          Objects.requireNonNull(e.a);
          len = 0;
          Throwable throwable = p0;
          Throwable throwable1 = throwable;
          while (true) {
             if (throwable == null) {
             label_0393 :
                throwable2 = null;
             label_0396 :
                if (throwable2 != null) {
                   if (throwable != throwable1) {
                      if (len) {
                         a.m(throwable1);
                         throwable1 = throwable1.getCause();
                      }
                      len = len ^ 0x01;
                   }else {
                      throw new IllegalArgumentException("Loop in causal chain detected.", throwable);
                   }
                }else if(throwable == null){
                   uBoolean = null;
                }else {
                   uBoolean = Boolean.valueOf(throwable instanceof OutOfMemoryError);
                }
                len = (uBoolean == null)? 0: uBoolean.booleanValue();
                if (len && a.g(str.mCrashType, p1.getTypeCommon())) {
                   str.mCrashType = p1.getTypeHeapOOM();
                   break ;
                }
             }else {
                throwable2 = throwable.getCause();
                if (throwable2 == null) {
                   goto label_0393 ;
                }else {
                   throwable = throwable2;
                   goto label_0396 ;
                }
             }
          }
       }
       return;
    }
    public static final void z(ExceptionMessage p0,Context p1,String p2){
       e a;
       DisplayMetrics heightPixels;
       a.p(p0, "message");
       a.p(p2, "socName");
       DeviceInfo uDeviceInfo = new DeviceInfo();
       uDeviceInfo.mModel = Build.MODEL;
       uDeviceInfo.mCpuCores = u.a();
       String str = "true";
       String str1 = (AbiUtil.b())? str: "false";
       uDeviceInfo.mIsSupportArm64 = str1;
       uDeviceInfo.mFingerprint = MonitorBuildConfig.d();
       uDeviceInfo.mCpuPlatform = MonitorBuildConfig.a();
       uDeviceInfo.mRomVersion = MonitorBuildConfig.e()+'#'+MonitorBuildConfig.f();
       if (p1 != null) {
          a = e.a;
          Objects.requireNonNull(a);
          DisplayMetrics uDisplayMetr = new DisplayMetrics();
          WindowManager systemServic = p1.getSystemService("window");
          if (systemServic != null) {
             c.d(systemServic.getDefaultDisplay(), uDisplayMetr);
             Configuration orientation = p1.getResources().getConfiguration().orientation;
             if (orientation != 1) {
                if (orientation != 2) {
                   DisplayMetrics widthPixels = uDisplayMetr.widthPixels;
                   heightPixels = uDisplayMetr.heightPixels;
                   uDisplayMetr.widthPixels = Math.min(widthPixels, heightPixels);
                   uDisplayMetr.heightPixels = Math.max(widthPixels, heightPixels);
                }else {
                   heightPixels = uDisplayMetr.widthPixels;
                   uDisplayMetr.widthPixels = uDisplayMetr.heightPixels;
                   uDisplayMetr.heightPixels = heightPixels;
                }
             }
          }
          uDeviceInfo.mDensityDpi = uDisplayMetr.densityDpi;
          uDeviceInfo.mScreenWidth = uDisplayMetr.widthPixels;
          uDeviceInfo.mScreenHeight = uDisplayMetr.heightPixels;
          Objects.requireNonNull(a);
          Intent intent = UniversalReceiver.e(p1, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
          if (intent != null) {
             uDeviceInfo.mBatteryTemperature = a.n(intent, "temperature", 0);
             uDeviceInfo.mBatteryLevel = a.n(intent, "level", 0);
             int i = a.n(intent, "status", -1);
             if (i != 2 && i != 5) {
                str = "false";
             }
             uDeviceInfo.mIsCharging = str;
          }
          uDeviceInfo.mSocName = p2;
       }
       p0.mDeviceInfo = d.j.q(uDeviceInfo);
       return;
    }
    public final void c(InputStream p0,OutputStream p1){
       int i = 4096;
       try{
          byte[] uobyteArray = new byte[i];
          int i1 = p0.read(uobyteArray);
          while (i1 > 0) {
             p1.write(uobyteArray, 0, i1);
          }
       }catch(java.io.IOException e4){
          e4.printStackTrace();
       }
       return;
    }
    public final void g(File p0){
       if (p0.exists()) {
          if (p0.isDirectory()) {
             throw new IOException("File \'"+p0+"\' exists but is a directory");
          }
       }else {
          File parentFile = p0.getParentFile();
          if (parentFile != null) {
             if (parentFile.mkdirs() || parentFile.isDirectory()) {
                p0.createNewFile();
             }else {
                throw new IOException("Directory \'"+parentFile+"\' could not be created");
             }
          }else {
             throw new IOException("Could not find parent directory");
          }
       }
       return;
    }
    public final void i(MemoryInfo p0){
       String str;
       File[] uFileArray = e.d.listFiles();
       if (uFileArray == null) {
          return;
       }
       int len = uFileArray.length;
       int i = 0;
       while (i < len) {
          object oobject = uFileArray[i];
          i = i + 1;
          Charset uCharset = null;
          int i1 = 1;
          try{
             str = FilesKt__FileReadWriteKt.z(new File(oobject, "comm"), uCharset, i1, uCharset);
          }catch(java.io.IOException e4){
             e4.printStackTrace();
             str = "";
          }
          if (str.length() <= 0) {
             i1 = 0;
          }
          if (i1) {
             String str1 = "\n";
             if (u.H1(str, str1, false, 2, uCharset)) {
                str = str.substring(false, StringsKt__StringsKt.w3(str, str1, 0, false, 6, null));
                a.o(str, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
             }
             p0.mThreadNames.add(str);
          }
       }
       return;
    }
    public final void j(File p0,int p1){
       l1 a;
       a.p(p0, "dumpDir");
       if (Build$VERSION.SDK_INT < 30) {
          return;
       }
       try{
          ActivityManager systemServic = k.b().getSystemService("activity");
          if (systemServic == null) {
             return;
          }else {
             List historicalPr = systemServic.getHistoricalProcessExitReasons(null, 0, 0);
             a.o(historicalPr, "activityManager.getHistoricalProcessExitReasons\(null, 0, 0\)");
             Iterator iterator = historicalPr.iterator();
             while (iterator.hasNext()) {
                ApplicationExitInfo uApplication = iterator.next();
                if (uApplication.getPid() == p1) {
                   File uFile = (uApplication.getReason() == 6)? new File(p0, "anr_trace"): null;
                   if (Build$VERSION.SDK_INT > 30 && uApplication.getReason() == 5) {
                      uFile = new File(p0, "tombstone");
                   }
                   if (uFile != null) {
                      FileOutputStream uFileOutputS = new FileOutputStream(uFile);
                      InputStream traceInputSt = uApplication.getTraceInputStream();
                      if (traceInputSt != null) {
                         e.a.c(traceInputSt, uFileOutputS);
                         a = l1.a;
                      }
                      b.a(uFileOutputS, null);
                      if (uFile.exists() && Long.valueOf(uFile.length()).equals(Integer.valueOf(0))) {
                         uFile.delete();
                         break ;
                      }
                   }
                }
             }
          }
       }catch(java.lang.Exception e9){
          e9.printStackTrace();
       }
       return;
    }
    public final File k(Context p0){
       a.p(p0, "context");
       if (Build$VERSION.SDK_INT < 24) {
          return new File(Environment.getDataDirectory().getPath()+"/data/"+p0.getPackageName());
       }
       File dataDir = p0.getDataDir();
       a.o(dataDir, "context.dataDir");
       return dataDir;
    }
    public final String l(Context p0){
       StringBuilder str = "";
       ClassLoader classLoader = p0.getClassLoader();
       if (classLoader != null) {
          String str1 = classLoader.toString();
          int i = 0;
          String str2 = " : ";
          str = str+"ClassLoader "+i+str2+str1;
          int i1 = 0;
          a.m(classLoader);
          while (classLoader.getParent() != null) {
             classLoader = classLoader.getParent();
             i1 = i1 + 1;
             str = str+"\nClassLoader "+i1+str2+classLoader;
          }
          String[] stringArray = new String[i];
          Object[] objArray = new Regex("\"").split(str1, i).toArray(stringArray);
          Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
          int len = objArray.length;
          i1 = 0;
          while (i1 < len) {
             object oobject = objArray[i1];
             i1 = i1 + 1;
             if (u.H1(oobject, "base.apk", i, 2, null)) {
                String str3 = "\n====path: "+oobject+", length: ";
                try{
                   len = -1;
                   File uFile = new File(oobject);
                   if (uFile.exists()) {
                      long l = uFile.length();
                   }
                   str = e0+str3+len;
                   break ;
                }catch(java.lang.Exception e0){
                }
             }
          }
       }
    }
    public final int m(){
       File c = e.c;
       Objects.requireNonNull(c);
       if (c.exists() && c.isDirectory()) {
          File[] uFileArray = c.listFiles();
          if (uFileArray != null) {
             return uFileArray.length;
          }
       }
       return 0;
    }
    public final int n(Intent p0,String p1,int p2){
       try{
          return p0.getIntExtra(p1, p2);
       }catch(java.lang.RuntimeException e0){
          e0.printStackTrace();
          h.b("ExceptionUtil", "throw exception when getIntExtra£¬with intent.getExtras\(\) = "+p0.getExtras()+" ,name: "+p1+" \n"+e0);
          return p2;
       }
    }
    public final String o(StackTraceElement[] p0){
       String str;
       if (p0 == null) {
          str = "";
       }else {
          StringBuilder str1 = new h().a();
          Iterator iterator = h.a(p0);
          String str2 = null;
          while (iterator.hasNext()) {
             str1 = str1+"at "+iterator.next()+10;
          }
          str = str1.substring(str2);
          a.o(str, "sb.substring\(0\)");
       }
       return str;
    }
    public final String s(Context p0){
       String str = "Unknown";
       if (p0 == null) {
       }else {
          PackageManager packageManag = p0.getPackageManager();
          if (packageManag != null) {
             PackageInfo packageInfo = packageManag.getPackageInfo(p0.getPackageName(), 0);
             if (packageInfo != null) {
                packageInfo = packageInfo.versionName;
                if (packageInfo != null) {
                   str = packageInfo;
                }
             }
          }
       }
       return str;
    }
}

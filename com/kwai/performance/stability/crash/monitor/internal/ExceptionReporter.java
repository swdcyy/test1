package com.kwai.performance.stability.crash.monitor.internal.ExceptionReporter;
import com.kwai.performance.stability.crash.monitor.internal.ExceptionReporter$a;
import nsd.u;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import com.kwai.performance.stability.crash.monitor.message.ExceptionMessage;
import java.util.List;
import msd.a;
import java.io.File;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Collection;
import java.util.Objects;
import java.io.FileOutputStream;
import java.util.zip.ZipOutputStream;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.lang.Exception;
import java.io.Closeable;
import vg7.c;
import java.util.HashMap;
import vg7.d;
import com.google.gson.Gson;
import com.kwai.performance.stability.crash.monitor.b;
import brd.t;
import tg7.d;
import com.kwai.performance.stability.crash.monitor.internal.b;
import erd.g;
import crd.b;
import kotlin.io.FilesKt__UtilsKt;
import java.util.HashSet;
import com.kwai.performance.stability.crash.monitor.message.JavaExceptionMessage;
import com.kwai.performance.stability.crash.monitor.CrashMonitorPreferenceManager;
import android.content.SharedPreferences;
import java.util.Set;
import com.kwai.performance.stability.crash.monitor.message.NativeExceptionMessage;
import com.kwai.performance.stability.crash.monitor.message.AnrExceptionMessage;
import com.kwai.performance.stability.crash.monitor.message.ExceptionHistory;
import java.lang.System;
import java.util.Iterator;
import java.lang.Class;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.kwai.performance.stability.crash.monitor.message.MemoryInfo;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import com.kwai.performance.stability.crash.monitor.message.ThreadInfo;
import com.kwai.performance.stability.crash.monitor.message.Backtrace;
import zsd.u;
import qrd.l1;
import java.lang.Throwable;
import isd.b;
import vg7.h;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import com.kwai.performance.stability.crash.monitor.message.JavaBackTraceElement;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import com.kwai.performance.stability.crash.monitor.message.BackTraceElement;
import java.lang.Long;
import java.lang.NumberFormatException;
import kotlin.text.StringsKt__StringsKt;
import android.text.TextUtils;
import com.kwai.performance.stability.crash.monitor.message.NativeBackTraceElement;
import com.kwai.performance.stability.crash.monitor.internal.e;
import java.io.FileFilter;
import tg7.f;
import com.kwai.performance.stability.crash.monitor.internal.f;
import tg7.g;
import brd.z;
import lrd.b;
import com.kwai.performance.stability.crash.monitor.util.a;
import java.lang.Runnable;
import com.kwai.performance.stability.crash.monitor.util.b;
import com.kwai.performance.stability.crash.monitor.util.e;
import com.kwai.performance.stability.crash.monitor.internal.c;
import yf7.h;
import android.app.Application;
import yf7.k;
import android.content.Context;
import java.lang.Integer;
import com.kwai.performance.stability.crash.monitor.internal.ExceptionHandler;
import java.io.IOException;
import ug7.a;
import com.kwai.performance.stability.crash.monitor.CrashMonitorLoggerKt;
import lg7.g;
import lg7.l;
import msd.p;
import java.util.Map;
import com.kwai.performance.stability.crash.monitor.internal.d;
import trd.y;
import lg7.d;
import com.kwai.performance.stability.crash.monitor.CrashMonitorLoggerKt$logCustomEvent$1;
import com.kwai.performance.monitor.base.Monitor_ThreadKt;
import yf7.r;
import java.util.concurrent.CountDownLatch;
import com.kwai.performance.stability.crash.monitor.internal.ExceptionReporter$uploadRemainingExceptions$1;
import java.util.concurrent.TimeUnit;
import java.lang.InterruptedException;

public abstract class ExceptionReporter	// class@0011e3
{
    public l a;
    public g b;
    public String c;
    public static final ExceptionReporter$a d;
    public static final ConcurrentHashMap e;
    public static RecoverMessage f;

    static {
       ExceptionReporter.d = new ExceptionReporter$a(null);
       ExceptionReporter.e = new ConcurrentHashMap();
    }
    public void ExceptionReporter(){
       super();
       this.c = "";
    }
    public final long a(ExceptionMessage p0,List p1,a p2){
       int i1;
       Closeable uCloseable;
       int i2;
       Closeable uCloseable1;
       Closeable uCloseable2;
       File uFile = new File(this.q(), a.C(p0.mLogUUID, ".zip"));
       int i = 0;
       File[] uFileArray = new File[i];
       Object[] objArray = p1.toArray(uFileArray);
       Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
       String path = uFile.getPath();
       try{
          i1 = 0;
          try{
             FileOutputStream uFileOutputS = new FileOutputStream(path);
             uCloseable1 = new ZipOutputStream(new BufferedOutputStream(uFileOutputS));
             try{
                int i3 = 4096;
                byte[] uobyteArray = new byte[i3];
                int i4 = 0;
                while (true) {
                   if (i4 < objArray.length) {
                      FileInputStream uFileInputSt = new FileInputStream(objArray[i4]);
                      try{
                         BufferedInputStream uBufferedInp = new BufferedInputStream(uFileInputSt, i3);
                         String absolutePath = objArray[i4].getAbsolutePath();
                         int i5 = -1;
                         int i6 = absolutePath.lastIndexOf("/") + 1;
                         uCloseable1.putNextEntry(new ZipEntry(absolutePath.substring(i6)));
                         i1 = uBufferedInp.read(uobyteArray, i, i3);
                         while (i1 != i5) {
                            uCloseable1.write(uobyteArray, i, i1);
                         }
                         uBufferedInp.close();
                         i4 = i4 + 1;
                         uCloseable2 = uBufferedInp;
                      }catch(java.lang.Exception e14){
                      }
                      i1 = uCloseable1;
                   }
                }
             }catch(java.lang.Exception e14){
                i2 = i1;
                goto label_007f ;
             }
          }catch(java.lang.Exception e14){
             i2 = i1;
          }
       }catch(java.lang.Exception e14){
          uCloseable = i1;
          i2 = uCloseable;
       }
    label_0093 :
       c.a(uCloseable2);
       c.a(uCloseable1);
       c.a(uCloseable);
       long l = uFile.length();
       if (l - null > 0) {
          HashMap hashMap = new HashMap();
          p0 = p0.mLogUUID;
          a.o(p0, "message.mLogUUID");
          hashMap.put("mLogUUID", p0);
          String str = d.j.q(hashMap);
          a.o(str, "RAW_GSON.toJson\(map\)");
          b.a.g(uFile, str, this.b()).subscribe(new d(uFile, p2), b.b);
       }else {
          FilesKt__UtilsKt.V(uFile);
       }
       return l;
    }
    public abstract int b();
    public final boolean c(ExceptionMessage p0){
       String str;
       Gson gson;
       CrashMonitorPreferenceManager a;
       HashSet hashSet = new HashSet();
       if (p0 instanceof JavaExceptionMessage) {
          hashSet = CrashMonitorPreferenceManager.a.b().getStringSet("crash_history", new HashSet());
       }else if(p0 instanceof NativeExceptionMessage){
          hashSet = CrashMonitorPreferenceManager.a.b().getStringSet("native_crash_history", new HashSet());
       }else if(p0 instanceof AnrExceptionMessage){
          hashSet = CrashMonitorPreferenceManager.a.b().getStringSet("anr_history", new HashSet());
       }
       ExceptionMessage mCurrentTime = p0.mCurrentTimeStamp;
       ExceptionMessage mPid = p0.mPid;
       ExceptionMessage mIndex = p0.mIndex;
       if (mCurrentTime - null <= 0) {
          mCurrentTime = System.currentTimeMillis();
       }
       ExceptionHistory uExceptionHi = new ExceptionHistory(mPid, mIndex, mCurrentTime);
       Iterator iterator = (hashSet == null)? null: hashSet.iterator();
       while (true) {
          str = null;
          boolean b = true;
          if (iterator != null && iterator.hasNext() == b) {
             gson = 1;
          label_0071 :
             if (gson) {
                ExceptionHistory uExceptionHi1 = d.j.h(iterator.next(), ExceptionHistory.class);
                if (uExceptionHi.equals(uExceptionHi1)) {
                   return b;
                }else {
                   long l = System.currentTimeMillis() - uExceptionHi1.mExceptionTimeStamp;
                   if (l - 0x5265c00 > 0) {
                      iterator.remove();
                   }
                }
             }else if(hashSet == null){
                String str1 = d.j.q(uExceptionHi);
                a.o(str1, "RAW_GSON.toJson\(currentHistory\)");
                hashSet.add(str1);
             }
             if (p0 instanceof JavaExceptionMessage) {
                if (hashSet != null) {
                   a = CrashMonitorPreferenceManager.a;
                   Objects.requireNonNull(a);
                   a.p(hashSet, "historySet");
                   g.a(a.b().edit().putStringSet("crash_history", hashSet));
                   break ;
                }
             }else if(p0 instanceof NativeExceptionMessage){
                if (hashSet != null) {
                   a = CrashMonitorPreferenceManager.a;
                   Objects.requireNonNull(a);
                   a.p(hashSet, "historySet");
                   g.a(a.b().edit().putStringSet("native_crash_history", hashSet));
                   break ;
                }
             }else if(!p0 instanceof AnrExceptionMessage || hashSet == null){
                a = CrashMonitorPreferenceManager.a;
                Objects.requireNonNull(a);
                a.p(hashSet, "historySet");
                g.a(a.b().edit().putStringSet("anr_history", hashSet));
                break ;
             }
             break ;
          }else {
             gson = null;
             goto label_0071 ;
          }
       }
       return str;
    }
    public final void d(File p0,ExceptionMessage p1,MemoryInfo p2){
       a.p(p1, "message");
       String str = "memoryInfo";
       try{
          a.p(p2, str);
          ArrayList uArrayList = new ArrayList();
          BufferedReader uBufferedRea = new BufferedReader(new FileReader(p0));
          ThreadInfo threadInfo = new ThreadInfo();
          Backtrace uBacktrace = new Backtrace();
          int i = 0;
          String str1 = uBufferedRea.readLine();
          Object obj = null;
          while (str1 != null) {
             int i1 = (!str1.length())? 1: 0;
             if (i1) {
                int i2 = i + 1;
                threadInfo.mIndex = i;
                threadInfo.mJavaBacktrace = d.j.q(uBacktrace);
                uArrayList.add(threadInfo);
                uBacktrace = new Backtrace();
                threadInfo = new ThreadInfo();
                i = i2;
             }else if(u.q2(str1, "at ", false, 2, obj) || u.q2(str1, "\(no ", false, 2, obj)){
                if (uBacktrace.mFrame > 256) {
                   continue ;
                }else {
                   this.g(str1, uBacktrace, false);
                }
             }else {
                threadInfo.mName = str1;
             }
          }
          p2.mAllThreads = uArrayList;
          p2.mJavaThreadsCount = uArrayList.size();
          p1.mMemoryInfo = d.j.q(p2);
          b.a(uBufferedRea, obj);
       }catch(java.lang.Exception e10){
          e10.printStackTrace();
       }
       return;
    }
    public abstract ExceptionMessage e(File p0,File p1,File p2,File p3,File p4);
    public final void f(String p0,BufferedReader p1,NativeExceptionMessage p2){
       a.p(p0, "line");
       a.p(p1, "reader");
       a.p(p2, "message");
       StringBuilder str = new h().a();
       a.o(str, "StringBuilderHolder\(\).get\(\)");
       Backtrace uBacktrace = new Backtrace();
       StringBuilder str1 = new h().a();
       a.o(str1, "StringBuilderHolder\(\).get\(\)");
       Backtrace uBacktrace1 = new Backtrace();
       boolean b = u.q2(p0, "de", false, 2, null);
       char c = 10;
       if (b) {
          str1 = str1+p0+c;
       }else {
          str = str+p0+c;
       }
       p0 = p1.readLine();
       a.o(p0, "it");
       while (p0 != null && !u.S1(p0)) {
          Backtrace uBacktrace2 = (b)? uBacktrace1: uBacktrace;
          this.j(p0, uBacktrace2);
       }
       if (b) {
          p2.mGwpAsanDeallocationThread = str1;
          p2.mGwpAsanDeallocationBacktrace = d.j.q(uBacktrace1);
       }else {
          p2.mGwpAsanAllocationThread = str;
          p2.mGwpAsanAllocationBacktrace = d.j.q(uBacktrace);
       }
       return;
    }
    public final void g(String p0,Backtrace p1,boolean p2){
       a.p(p0, "line");
       a.p(p1, "backtrace");
       Backtrace mFrame = p1.mFrame;
       if (mFrame > 256) {
          return;
       }
       JavaBackTraceElement javaBackTrac = new JavaBackTraceElement(p0, mFrame);
       Matcher matcher = ExceptionReporter.d.a(".*at\\s+\(.*\)\\.\(.*\)\\\(\(\(.*\):\(-?\\d+\)|Native method\)\\\)").matcher(p0);
       if (matcher.lookingAt()) {
          javaBackTrac.mDeclaringClass = matcher.group(1);
          javaBackTrac.mMethodName = matcher.group(2);
          if (matcher.groupCount() >= 5) {
             p0 = matcher.group(4);
             javaBackTrac.mFileName = (p0 != null)? p0: true;
             p0 = matcher.group(5);
             if (p0 != null) {
                long l = 0;
                try{
                   l = Long.parseLong(p0);
                }catch(java.lang.NumberFormatException e9){
                   e9.printStackTrace();
                }
                javaBackTrac.mLineNumber = l;
             }
          }
       }else if(p1.mFrame == null && p2){
          javaBackTrac.mIsTitle = true;
       }else if(u.q2(p0, "Caused by: ", false, 2, null)){
          javaBackTrac.mIsCausedBy = true;
       }
       if (javaBackTrac.mIsTitle == null && (javaBackTrac.mIsCausedBy != null || javaBackTrac.mIsNative != null)) {
          javaBackTrac.mNeedClustering = false;
       }
       p1.mFrame = p1.mFrame + 1;
       p1.mBacktraces.add(javaBackTrac);
       return;
    }
    public final void h(BufferedReader p0,ExceptionMessage p1){
       a.p(p0, "reader");
       a.p(p1, "message");
       int i = 0;
       String str = p0.readLine();
       while (str != null) {
          String obj = null;
          int i1 = 2;
          if (!i && StringsKt__StringsKt.O2(str, "JNI DETECTED ERROR IN APPLICATION", false, i1, obj)) {
             String str1 = str.substring(StringsKt__StringsKt.i3(str, "JNI DETECTED ERROR IN APPLICATION", 0, false, 6, null));
             a.o(str1, "\(this as java.lang.String\).substring\(startIndex\)");
             p1.mJNIError = str1;
             str1 = 1;
          }else {
             String str2 = "\n";
             int i2 = 10;
             if (StringsKt__StringsKt.O2(str, "Waiting for a blocking GC ", false, i1, obj) || StringsKt__StringsKt.O2(str, "WaitForGcToComplete", false, i1, obj)) {
                obj = (TextUtils.isEmpty(p1.mGCInfo))? a.C(str, str2): p1.mGCInfo+str+i2;
                p1.mGCInfo = obj;
             }else if(StringsKt__StringsKt.O2(str, "dvm_lock_sample", false, i1, obj)){
                obj = (TextUtils.isEmpty(p1.mLockInfo))? a.C(str, str2): p1.mLockInfo+str+i2;
                p1.mLockInfo = obj;
             }else if(StringsKt__StringsKt.O2(str, "Long monitor", false, i1, obj)){
                obj = (TextUtils.isEmpty(p1.mMonitorInfo))? a.C(str, str2): p1.mMonitorInfo+str+i2;
                p1.mMonitorInfo = obj;
             }else if(StringsKt__StringsKt.O2(str, "Slow Looper", false, i1, obj)){
                obj = (TextUtils.isEmpty(p1.mSlowLooper))? a.C(str, str2): p1.mSlowLooper+str+i2;
                p1.mSlowLooper = obj;
             }else if(StringsKt__StringsKt.O2(str, "Slow Operation", false, i1, obj)){
                obj = (TextUtils.isEmpty(p1.mSlowOperation))? a.C(str, str2): p1.mSlowOperation+str+i2;
                p1.mSlowOperation = obj;
             }
          }
       }
       return;
    }
    public final void i(File p0,ExceptionMessage p1){
       a.p(p0, "file");
       a.p(p1, "message");
       if (!p0.exists()) {
          return;
       }
       char c = 10;
       try{
          BufferedReader uBufferedRea = new BufferedReader(new FileReader(p0));
          this.h(uBufferedRea, p1);
          b.a(uBufferedRea, null);
       }catch(java.io.FileNotFoundException e4){
          this.c = this.c+e4+c;
       }catch(java.io.IOException e4){
          this.c = this.c+e4+c;
       }
       return;
    }
    public final void j(String p0,Backtrace p1){
       a.p(p1, "backtrace");
       Backtrace mFrame = p1.mFrame;
       if (mFrame > 256) {
          return;
       }
       NativeBackTraceElement nativeBackTr = new NativeBackTraceElement(p0, mFrame);
       ExceptionReporter$a d = ExceptionReporter.d;
       Matcher matcher = d.a(".*#\\d+\\s+pc\\s+\(\\w+\)\\s+.*?\([^/]+\\.so\)\(?:\\s+\\\(offset\\s+\\w+\\\)\)?\(?:\\s+\\\(\(.*?\)\\+\\d+\\\)\)?\(\\s+\\\(BuildId:\\s+\(\\b\\w+\)\\\)\)?").matcher(p0);
       Matcher matcher1 = d.a(".*#\\d+\\s+pc\\s+\(\\w+\)\\s+.*?\([^/]+\)\\s+\\\(\(.*?\)\\+\\d+\\\)\\s+\\\(BuildId:\\s+\(\\b\\w+\)\\\)").matcher(p0);
       Matcher matcher2 = d.a(".*#\\d+\\s+pc\\s+\(\\w+\)\\s+.*-cache.*\\\(offset\\s+\\w+\\\)\\s+\\\(\(.*?\)\\+\\d+\\\)").matcher(p0);
       int i = 3;
       if (matcher.lookingAt() && matcher.groupCount() >= 5) {
          nativeBackTr.mPc = matcher.group(1);
          nativeBackTr.mFileName = matcher.group(2);
          matcher2 = matcher.group(i);
          boolean b = false;
          String str = (matcher2 == null || !matcher2.length())? 1: null;
          if (!str) {
             if (d.a(".*\(Mterp|ExecuteMterp|\(art::|_ZN3art11\)\(interpreter|.*Invoke\)|art_?interpreter|art_?quick|ZN3art9ArtMethod6Invoke|art::ArtMethod::Invoke\).*").matcher(matcher2).lookingAt()) {
                nativeBackTr.mNeedClustering = b;
                return;
             }else {
                String str1 = null;
                Matcher matcher3 = d.a("[^\\[\(<\\]]+").matcher(matcher2);
                if (matcher3.lookingAt()) {
                   Matcher matcher4 = d.a(".*\(\\b\\w+\)").matcher(matcher3.group());
                   if (matcher4.lookingAt() && matcher.groupCount() >= 1) {
                      str1 = matcher4.group(1);
                   }
                }
                if (str1 != null) {
                   nativeBackTr.mMethodName = str1;
                }else {
                   nativeBackTr.mMethodName = matcher2;
                }
             }
          }
          matcher2 = matcher.group(5);
          if (matcher2 != null) {
             nativeBackTr.mBuildId = matcher2;
          }
       }else if(matcher1.lookingAt() && matcher1.groupCount() >= 4){
          nativeBackTr.mPc = matcher1.group(1);
          nativeBackTr.mFileName = matcher1.group(2);
          matcher2 = matcher1.group(i);
          if (matcher2 != null) {
             nativeBackTr.mMethodName = matcher2;
          }
          matcher2 = matcher1.group(4);
          if (matcher2 != null) {
             nativeBackTr.mBuildId = matcher2;
          }
       }else if(matcher2.lookingAt() && matcher2.groupCount() >= 2){
          nativeBackTr.mPc = matcher2.group(1);
          nativeBackTr.mFileName = "jit-code-cache";
          matcher2 = matcher2.group(2);
          if (matcher2 != null) {
             nativeBackTr.mMethodName = matcher2;
          }
       }else {
       label_0104 :
          return;
       }
       p1.mFrame = p1.mFrame + 1;
       p1.mBacktraces.add(nativeBackTr);
       goto label_0104 ;
    }
    public abstract ExceptionMessage k(File p0,File p1,File p2);
    public final void l(File p0,a p1){
       a.p(p0, "logDir");
       File uFile = this.q();
       int i = 0;
       if (uFile == null) {
       }else if(!uFile.exists()){
          uFile.mkdirs();
       }else {
          ArrayList uArrayList = new ArrayList();
          File[] uFileArray1 = uFile.listFiles(e.b);
          f uof = new f(uArrayList, this);
          f uof1 = new f(this, uFile, uArrayList);
          g og = new g(uFile);
          if (uFileArray1 != null) {
             ArrayList uArrayList1 = new ArrayList();
             int len1 = uFileArray1.length;
             for (int i1 = 0; i1 < len1; i1 = i1 + 1) {
                uArrayList1.add(t.just(uFileArray1[i1]).observeOn(b.c()).doOnNext(uof));
             }
             b.a(uArrayList1, a.b, uof1, og);
          }
       }
       e.b(b.a.e());
       File[] uFileArray = p0.listFiles(c.b);
       if (uFileArray != null) {
          int len = uFileArray.length;
          for (; i < len; i = i + 1) {
             object oobject = uFileArray[i];
             a.o(oobject, "it");
             this.o(oobject, null, p1);
          }
       }
       e.b(p0);
       return;
    }
    public abstract void m(File[] p0,a p1);
    public final void n(ExceptionMessage p0,File p1,File p2){
       ExceptionMessage mLaunchTimeS;
       Context baseContext = k.b().getBaseContext();
       try{
          int i = 1;
          Matcher matcher = ExceptionReporter.d.a("\(\\w+\)-\(\\d+\)-.*-\(\\d\)").matcher(p1.getName());
          if (matcher.lookingAt()) {
             int i2 = 3;
             if (matcher.groupCount() >= i2) {
                String str = matcher.group(i);
                str = (a.g("main", str))? baseContext.getPackageName(): baseContext.getPackageName()+':'+str;
                p0.mProcessName = str;
                str = matcher.group(2);
                if (str != null) {
                   p0.mPid = Integer.parseInt(str);
                }
                String str1 = matcher.group(i2);
                if (str1 != null) {
                   p0.mIndex = Integer.parseInt(str1);
                }
             }
          }
       }catch(java.lang.Exception e1){
          e1.printStackTrace();
       }
       RecoverMessage f = ExceptionReporter.f;
       if (f != null) {
          if (a.g("Unknown", p0.mVersionCode)) {
             p0.mVersionCode = f.mVersionCode;
          }
          if (a.g("Unknown", p0.mAbi)) {
             p0.mAbi = f.mAbi;
          }
          if (a.g("Unknown", p0.mTaskId)) {
             p0.mTaskId = f.mTaskId;
          }
          ExceptionMessage mRobustInfo = p0.mRobustInfo;
          mRobustInfo = (mRobustInfo == null || !mRobustInfo.length())? 1: null;
          if (mRobustInfo) {
             p0.mRobustInfo = f.mRobustInfo;
          }
          mRobustInfo = p0.mDeviceInfo;
          if (mRobustInfo != null && mRobustInfo.length()) {
             ExceptionMessage uExceptionMe = null;
          }
          if (i) {
             p0.mDeviceInfo = f.mDeviceInfo;
          }
          int i1 = -1;
          if (!p0.mCurrentTimeStamp - i1 && p1.exists()) {
             p0.mCurrentTimeStamp = p1.lastModified();
          }
          if (!p0.mLaunchTimeStamp - i1) {
             mLaunchTimeS = f.mLaunchTimeStamp;
             if (mLaunchTimeS - i1) {
                p0.mLaunchTimeStamp = mLaunchTimeS;
             }
          }
          if (!p0.mUsageTimeMills - i1) {
             mLaunchTimeS = p0.mCurrentTimeStamp;
             if (mLaunchTimeS - i1) {
                ExceptionMessage mLaunchTimeS1 = p0.mLaunchTimeStamp;
                if (mLaunchTimeS1 - i1) {
                   long l = mLaunchTimeS - mLaunchTimeS1;
                   if (l <= 0) {
                      l = -2;
                   }
                   p0.mUsageTimeMills = l;
                }
             }
          }
          if (a.g(p0.mProcessName, baseContext.getPackageName())) {
             if (a.g("Unknown", p0.mLaunched)) {
                p0.mLaunched = f.mLaunched;
             }
             if (a.g("Unknown", p0.mCurrentActivity)) {
                p0.mCurrentActivity = f.mCurrentActivity;
             }
             if (a.g("Unknown", p0.mPage)) {
                p0.mPage = f.mPage;
             }
             if (a.g("Unknown", p0.mFirstLaunch)) {
                p0.mFirstLaunch = f.mFirstLaunch;
             }
             if (a.g("Unknown", p0.mIsAppOnForeground)) {
                p0.mIsAppOnForeground = f.mIsAppOnForeground;
             }
          }
       }
    label_014c :
       return;
    }
    public final void o(File p0,a p1,a p2){
       ExceptionMessage this;
       int i1;
       String str2;
       ExceptionReporter a;
       File[] uFileArray;
       ArrayList uArrayList1;
       long l;
       ArrayList uArrayList2;
       File[] uFileArray1;
       object oobject;
       File[] uFileArray2;
       String name;
       int i2;
       ExceptionMessage mLogUUID;
       String str3;
       int i3;
       Object obj1;
       String str4;
       String str5;
       long l1;
       ExceptionMessage mCrashType;
       String str6;
       Object str6;
       String str7;
       int i4;
       object oobject1;
       long l2;
       l1 a1;
       ExceptionReporter uExceptionRe = this;
       Object obj = p0;
       a uoa = p1;
       String str = "deleteDirectory ";
       a.p(obj, "dumpDir");
       String str1 = "ExceptionReporter";
       if (!uoa && ExceptionHandler.n) {
          h.b(str1, "not support uploadExceptionEventAndLog while exception happened!");
          return;
       }else {
          h.d(str1, "uploadExceptionEventAndLog "+obj+10);
          if (!p0.isDirectory()) {
             h.g(str1, a.C("report exception event does not support ", obj));
             return;
          }else {
             File uFile = new File(obj, "dump");
             File uFile1 = new File(obj, "log");
             File uFile2 = new File(obj, "logcat");
             File uFile3 = new File(obj, "logcat_backup");
             int b = false;
             ArrayList uArrayList = new ArrayList();
             File uFile4 = new File(obj, "message_parsed");
             this = this.e(uFile, new File(obj, "message"), uFile1, uFile2, p0);
             uExceptionRe.n(this, obj, uFile);
             if (uExceptionRe.c(this)) {
                try{
                   h.d(str1, a.C(str, obj));
                   FilesKt__UtilsKt.V(p0);
                }catch(java.io.IOException e0){
                   e0.printStackTrace();
                }
                return;
             }else {
                a uoa1 = new a();
                uoa1.a(this, this.b());
                CrashMonitorLoggerKt.b(this, uoa1, this.b());
                if (p2 != null) {
                   p2.invoke();
                }
                e.C(uFile1, this.toString(), b);
                e.C(uFile4, d.j.q(this), b);
                if (uFile2.exists()) {
                   uFile2 = uFile3;
                }
                e.t(uFile2);
                e.a.j(obj, this.mPid);
                if (uExceptionRe.b == null) {
                   uExceptionRe.b = new g();
                }
                ExceptionReporter b1 = uExceptionRe.b;
                a.m(b1);
                Objects.requireNonNull(b1);
                File uFile5 = 2;
                int i = 1;
                if (this instanceof JavaExceptionMessage && ((b1.c & i) || (this instanceof NativeExceptionMessage && (b1.c & uFile5)))) {
                   i1 = 1;
                   str2 = 4;
                }else if(this instanceof AnrExceptionMessage){
                   if (b1.c & 4) {
                      i1 = 1;
                   }
                }else {
                   str2 = 4;
                }
                i1 = 0;
                HashMap hashMap = new HashMap();
                if (!this instanceof AnrExceptionMessage) {
                   a = uExceptionRe.a;
                   uFile4 = (a == null)? null: a.a(this, b1);
                   if (uFile4 != null && uFile4.exists()) {
                      if (uFile4.length() - b1.a < 0) {
                         try{
                            FilesKt__UtilsKt.O(uFile4, new File(obj, "debuglog.zip"), false, null, 6, null);
                         }catch(java.io.IOException e0){
                            e0.printStackTrace();
                         }
                      }else if(i1){
                         hashMap.put("skip.debuglog.zip", Long.valueOf(uFile4.length()));
                      }
                   }
                }
             }
          }
       }
    }
    public final void p(File p0){
       a.p(p0, "logDir");
       if (!r.b()) {
          return;
       }
       File[] uFileArray = p0.listFiles();
       if (uFileArray != null && uFileArray.length > 2) {
          StringBuilder str = "remainingDirs:\n";
          int i = 0;
          int len = uFileArray.length;
          while (i < len) {
             i = i + 1;
             str = str+uFileArray[i]+"\n";
          }
          ExceptionReporter ta = this.a;
          if (ta != null) {
             ta.c("ExceptionReporter", str);
          }
          CountDownLatch uCountDownLa = new CountDownLatch(uFileArray.length);
          this.m(uFileArray, new ExceptionReporter$uploadRemainingExceptions$1(uCountDownLa));
          try{
             ta = 5;
             uCountDownLa.await(ta, TimeUnit.SECONDS);
          }catch(java.lang.InterruptedException e0){
             e0.printStackTrace();
          }
          e.b(p0);
       }
       return;
    }
    public abstract File q();
}

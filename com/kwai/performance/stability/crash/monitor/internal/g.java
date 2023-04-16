package com.kwai.performance.stability.crash.monitor.internal.g;
import com.kwai.performance.stability.crash.monitor.internal.ExceptionReporter;
import com.kwai.performance.stability.crash.monitor.internal.g$a;
import nsd.u;
import java.util.concurrent.ConcurrentHashMap;
import java.io.File;
import com.kwai.performance.stability.crash.monitor.message.ExceptionMessage;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.performance.stability.crash.monitor.message.NativeExceptionMessage;
import com.kwai.performance.stability.crash.monitor.util.AbiUtil;
import vg7.d;
import com.kwai.performance.stability.crash.monitor.message.MemoryInfo;
import java.lang.Class;
import com.google.gson.Gson;
import yf7.h;
import android.util.Log;
import java.nio.charset.Charset;
import kotlin.io.FilesKt__FileReadWriteKt;
import java.lang.Exception;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;
import msd.a;
import com.kwai.performance.stability.crash.monitor.b;
import java.util.Objects;
import vg7.e;
import java.io.BufferedReader;
import zsd.u;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.lang.Long;
import java.lang.Integer;
import java.lang.NumberFormatException;
import java.lang.Boolean;
import kotlin.text.StringsKt__StringsKt;
import kotlin.Result;
import java.io.FileReader;
import java.io.Reader;
import qrd.l1;
import java.io.Closeable;
import java.lang.Throwable;
import isd.b;
import qrd.j0;
import vg7.h;
import com.kwai.performance.stability.crash.monitor.message.Backtrace;
import java.io.IOException;
import java.io.FileNotFoundException;

public final class g extends ExceptionReporter	// class@0011ee
{
    public static final g$a g;
    public static final ConcurrentHashMap h;

    static {
       g.g = new g$a(null);
       g.h = new ConcurrentHashMap();
    }
    public void g(){
       super();
    }
    public int b(){
       return 4;
    }
    public ExceptionMessage e(File p0,File p1,File p2,File p3,File p4){
       StringBuilder str = "------ Native Crash Report Begin ------\n";
       a.p(p0, "dumpFile");
       File uFile = new File(p4, "java_backtrace");
       File uFile1 = new File(p4, "all_java_backtrace");
       File uFile2 = new File(p4, "maps");
       NativeExceptionMessage nativeExcept = this.v(p1);
       int i = 1;
       g og = this;
       NativeExceptionMessage nativeExcept1 = nativeExcept;
       try{
          int i1 = p0;
          og.t(nativeExcept1, i1, uFile, uFile2, false);
          if (nativeExcept.mTid == null) {
             this.s(nativeExcept, new File(p4, "debug"));
          label_0038 :
             if (nativeExcept.mNeedSwapBacktrace != null && AbiUtil.a()) {
                this.u(nativeExcept, new File(p4, "fp_unwind"));
             }
             MemoryInfo memoryInfo = d.j.h(nativeExcept.mMemoryInfo, MemoryInfo.class);
             a.o(memoryInfo, "memoryInfo");
             this.d(uFile1, nativeExcept, memoryInfo);
             h.d("NativeCrashReporter", a.C(str, nativeExcept.mCrashDetail));
             Log.println(6, "NativeCrashReporter", a.C(str, nativeExcept.mCrashDetail));
             memoryInfo = new File(p4, "meminfo");
             if (memoryInfo.exists()) {
                nativeExcept.mDumpsys = FilesKt__FileReadWriteKt.z(memoryInfo, null, i, null);
             }
          }else {
             goto label_0038 ;
          }
       }catch(java.lang.Exception e9){
          e9.printStackTrace();
          str = this.c+e9;
          this.c = str+10;
       }
       if (this.c.length() <= 0) {
          i = 0;
       }
       if (i) {
          nativeExcept.mErrorMessage = a.C(nativeExcept.mErrorMessage, this.c);
       }
       return nativeExcept;
    }
    public ExceptionMessage k(File p0,File p1,File p2){
       a.p(p0, "dumpFile");
       File uFile = new File(p2, "java_backtrace");
       File uFile1 = new File(p2, "maps");
       NativeExceptionMessage nativeExcept = this.v(p1);
       g og = this;
       NativeExceptionMessage nativeExcept1 = nativeExcept;
       try{
          int i = p0;
          og.t(nativeExcept1, i, uFile, uFile1, true);
       }catch(java.lang.Exception e8){
          e8.printStackTrace();
          StringBuilder str = this.c+e8;
          this.c = str+10;
       }
       if (!TextUtils.isEmpty(this.c)) {
          nativeExcept.mErrorMessage = a.C(nativeExcept.mErrorMessage, this.c);
       }
       return nativeExcept;
    }
    public void m(File[] p0,a p1){
       a.p(p0, "dumpDirs");
       int len = p0.length;
       int i = 0;
       while (i < len) {
          object oobject = p0[i];
          i = i + 1;
          if (oobject == null) {
             continue ;
          }else {
             this.o(oobject, p1, null);
          }
       }
       return;
    }
    public File q(){
       b a = b.a;
       Objects.requireNonNull(a);
       File uFile = new File(a.c(), "native_crash_log/upload");
       e.a(uFile);
       return uFile;
    }
    public final void r(NativeExceptionMessage p0,BufferedReader p1,StringBuilder p2){
       Matcher matcher;
       int i2;
       String str3;
       while (true) {
          String str = p1.readLine();
          if (str == null) {
             return;
          }
          boolean b = false;
          int i = 2;
          Object obj = null;
          if (u.q2(str, "Build fingerprint: ", b, i, obj)) {
             str = str.substring(19);
             a.o(str, "\(this as java.lang.String\).substring\(startIndex\)");
             p0.mFingerprint = str;
          }else {
             int i1 = 10;
             if (u.q2(str, "Revision: ", b, i, obj)) {
                str = str.substring(i1);
                a.o(str, "\(this as java.lang.String\).substring\(startIndex\)");
                p0.mRevision = str;
             }else if(u.q2(str, "ABI: ", b, i, obj)){
                str = str.substring(5);
                a.o(str, "\(this as java.lang.String\).substring\(startIndex\)");
                p0.mAbi = str;
             }else if(u.q2(str, "Timestamp: ", b, i, obj)){
                if (p0.mCurrentTimeStamp - null) {
                   continue ;
                }else {
                   matcher = g.g.a("Timestamp:.*UTC: \(\\d+\).*").matcher(str);
                   if (matcher.lookingAt()) {
                      str = matcher.group(1);
                      if (str == null || !str.length()) {
                         b = true;
                      }
                      if (!b) {
                         a.o(str, "timeStr");
                         p0.mCurrentTimeStamp = Long.parseLong(str);
                      }
                   }
                }
             }else if(u.q2(str, "pid: ", b, i, obj)){
                matcher = g.g.a("pid: \(\\d+\), tid: \(\\d+\), name: \(.*\) {2}>>> \(.*\) <<<").matcher(str);
                if (matcher.lookingAt()) {
                   try{
                      String str1 = matcher.group(1);
                      String str2 = matcher.group(i);
                      if (str1 == null) {
                      label_00b2 :
                         if (str2 != null) {
                            p0.mTid = Integer.parseInt(str2);
                         }
                      }else {
                         p0.mPid = Integer.parseInt(str1);
                         goto label_00b2 ;
                      }
                   }catch(java.lang.NumberFormatException e1){
                      e1.printStackTrace();
                   }
                   p0.mThreadName = matcher.group(3);
                   p0.mProcessName = matcher.group(4);
                }
             }else if(u.q2(str, "uid: ", b, i, obj)){
                continue ;
             }else if(u.q2(str, "signal ", b, i, obj)){
                matcher = g.g.a("signal \(\\d+\) \\\(\(\\w+\)\\\), code \(-*\\d+\) \\\(\(\\w+\).*\\\), fault addr \(.*\)").matcher(str);
                if (matcher.lookingAt()) {
                   p0.mSignal = matcher.group(i);
                   p0.mCode = matcher.group(4);
                   str = matcher.group(5);
                   p0.mFaultAddr = str;
                   Boolean tRUE = (a.g("--------", str))? Boolean.TRUE: Boolean.FALSE;
                   p0.mManuallyKill = String.valueOf(tRUE);
                }
             }else if(u.q2(str, "Abort message: ", b, i, obj)){
                i2 = 15;
                str3 = str.substring(i2);
                a.o(str3, "\(this as java.lang.String\).substring\(startIndex\)");
                p0.mAbortMsg = str3;
                if (StringsKt__StringsKt.O2(str, "Scudo", b, i, obj)) {
                   str = str.substring(i2);
                   a.o(str, "\(this as java.lang.String\).substring\(startIndex\)");
                   p0.mScudoAbortMsg = str;
                }
             }else if(u.q2(str, "Cause: ", b, i, obj)){
                i2 = 7;
                str3 = str.substring(i2);
                a.o(str3, "\(this as java.lang.String\).substring\(startIndex\)");
                p0.mCause = str3;
                if (StringsKt__StringsKt.O2(str, "GWP-ASan", b, i, obj)) {
                   str = str.substring(i2);
                   a.o(str, "\(this as java.lang.String\).substring\(startIndex\)");
                   p0.mGwpAsanCause = str;
                }
             }else if(!u.q2(str, "    x", b, i, obj) && (!u.q2(str, "    lr", b, i, obj) && (u.q2(str, "    r", b, i, obj) || u.q2(str, "    ip", b, i, obj)))){
                p2+str+i1;
             }else {
                break ;
             }
          }
       }
       return;
    }
    public final void s(NativeExceptionMessage p0,File p1){
       if (!p1.exists()) {
          return;
       }
       BufferedReader uBufferedRea = new BufferedReader(new FileReader(p1));
       Throwable throwable = null;
       while (true) {
          String str = uBufferedRea.readLine();
          if (str != null) {
             Matcher matcher = g.g.a("Fatal signal \(\\d+\) \\\(\(\\w+\)\\\), code \(-*\\d+\) \\\(\(\\w+\)\\\), fault addr \(-*\\w*\) in tid \(\\d+\) \\\(\(.*\)\\\), pid \(\\d+\).*").matcher(str);
             if (matcher.lookingAt() && matcher.groupCount() >= 8) {
                String str1 = matcher.group(2);
                if (str1 != null) {
                   p0.mSignal = str1;
                }
                str1 = matcher.group(4);
                if (str1 != null) {
                   p0.mCode = str1;
                }
                str1 = matcher.group(5);
                if (str1 != null) {
                   p0.mFaultAddr = str1;
                   Boolean tRUE = (a.g("--------", str1))? Boolean.TRUE: Boolean.FALSE;
                   p0.mManuallyKill = String.valueOf(tRUE);
                }
                str1 = matcher.group(7);
                if (str1 != null) {
                   p0.mThreadName = str1;
                }
                str = matcher.group(6);
                if (str != null) {
                   a.o(str, "tid");
                   p0.mTid = Integer.parseInt(str);
                }
             }
          }
          b.a(uBufferedRea, throwable);
          p0 = Result.constructor-impl(l1.a);
          Throwable throwable1 = Result.exceptionOrNull-impl(p0);
          if (throwable1 != null) {
             this.c = this.c+throwable1+10;
             break ;
          }
          break ;
       }
       return;
    }
    public final void t(NativeExceptionMessage p0,File p1,File p2,File p3,boolean p4){
       int i;
       int i2;
       boolean b;
       ExceptionReporter uExceptionRe = this;
       ExceptionMessage uExceptionMe = p0;
       File parentFile = p1.getParentFile();
       if (a.g("Unknown", uExceptionMe.mLogUUID) && parentFile != null) {
          uExceptionMe.mLogUUID = parentFile.getName();
       }
       StringBuilder str = h.b();
       a.o(str, "getGlobal\(\)");
       StringBuilder str1 = new h().a();
       a.o(str1, "StringBuilderHolder\(\).get\(\)");
       Backtrace uBacktrace = new Backtrace();
       Backtrace uBacktrace1 = new Backtrace();
       BufferedReader obj = null;
       try{
          i = 0;
          BufferedReader uBufferedRea = new BufferedReader(new FileReader(p1));
          l1 ol1 = null;
          String str2 = null;
          int i1 = 0;
          while (true) {
             i2 = 0;
             break ;
          }
          String str4 = uBufferedRea.readLine();
          while (str4 != null) {
             int i3 = 2;
             if (ol1 && u.q2(str4, "--------- log ", i, i3, obj)) {
                uExceptionRe.h(uBufferedRea, uExceptionMe);
                break ;
             }else if(!p4 && (str2 && u.q2(str4, "memory map", i, i3, obj))){
                b = p3.exists();
                String str5 = uBufferedRea.readLine();
                while (str5 != null) {
                   i2 = (u.q2(str5, "---", i, i3, obj) == true)? 1: 0;
                   if (i2) {
                   }else if(!b){
                      FilesKt__FileReadWriteKt.i(p3, str5, obj, i3, obj);
                   }else {
                      int i4 = p3;
                      continue ;
                   }
                }
                ol1 = 1;
                str2 = null;
             }else if(!p4 && (i1 && u.q2(str4, "backtrace:", i, i3, obj))){
                i1 = 0;
                i2 = 1;
             }else if(i2){
                if (!u.S1(str4)) {
                   if (!p4 && StringsKt__StringsKt.O2(str4, "allocated by", i, i3, obj)) {
                      uExceptionRe.f(str4, uBufferedRea, uExceptionMe);
                   }else if(str4.length() < 16 || u.q2(str4, "memory near", i, i3, null)){
                      obj = null;
                      str2 = 1;
                      continue ;
                   }else {
                      uExceptionRe.j(str4, uBacktrace);
                      str = str+str4+10;
                   }
                }
             }else if(!i1 && u.q2(str4, "*** ***", i, i3, null)){
                uExceptionRe.r(uExceptionMe, uBufferedRea, str1);
                obj = null;
                i1 = 1;
             }
             obj = null;
          }
          b.a(uBufferedRea, null);
       }catch(java.io.FileNotFoundException e0){
          e0.printStackTrace();
          uExceptionRe.c = uExceptionRe.c+e0+10;
       }catch(java.io.IOException e0){
          e0.printStackTrace();
          uExceptionRe.c = uExceptionRe.c+e0+10;
       }
       try{
          obj = new BufferedReader(new FileReader(p2));
          String str3 = obj.readLine();
          while (str3 != null) {
             i2 = (!str3.length())? 1: 0;
             if (!i2) {
                str = str+"    "+str3+10;
                a.m(str3);
                uExceptionRe.g(str3, uBacktrace1, i);
             }else {
                break ;
             }
          }
          b.a(obj, null);
       }catch(java.io.FileNotFoundException e0){
          e0.printStackTrace();
          uExceptionRe.c = uExceptionRe.c+e0+10;
       }catch(java.io.IOException e0){
          e0.printStackTrace();
          uExceptionRe.c = uExceptionRe.c+e0+10;
       }
       Gson j = d.j;
       uExceptionMe.mJavaBacktrace = j.q(uBacktrace1);
       uExceptionMe.mNativeBacktrace = j.q(uBacktrace);
       if (AbiUtil.a()) {
          uExceptionMe.mNeedSwapBacktrace = true;
       }
       if (str.length() > 1) {
          uExceptionMe.mCrashDetail = str.substring(i, (str.length() - true));
       }
       if (str1.length() > 1) {
          uExceptionMe.mRegister = str1.substring(i, (str1.length() - true));
       }
       return;
    }
    public final void u(NativeExceptionMessage p0,File p1){
       if (!p1.exists()) {
          return;
       }
       Backtrace uBacktrace = new Backtrace();
       BufferedReader uBufferedRea = new BufferedReader(new FileReader(p1));
       Throwable throwable = null;
       String str = uBufferedRea.readLine();
       while (str != null) {
          this.j(str, uBacktrace);
       }
       b.a(uBufferedRea, throwable);
       throwable = Result.constructor-impl(l1.a);
       if (Result.isSuccess-impl(throwable)) {
          String str1 = d.j.q(uBacktrace);
          p0.mBackupBacktrace = str1;
          if (uBacktrace.mFrame >= 3) {
             p0.mBackupBacktrace = p0.mNativeBacktrace;
             p0.mNativeBacktrace = str1;
             h.d("NativeCrashReporter", "Swap backtrace, new frame number: "+uBacktrace+".mFrame");
          }else {
             p0.mNeedSwapBacktrace = false;
          }
       }
       Throwable throwable1 = Result.exceptionOrNull-impl(throwable);
       if (throwable1 != null) {
          this.c = this.c+throwable1+10;
       }
       return;
    }
    public final NativeExceptionMessage v(File p0){
       NativeExceptionMessage nativeExcept;
       String str;
       try{
          nativeExcept = null;
          if (p0 == null) {
          }else {
             int i = 1;
             str = FilesKt__FileReadWriteKt.z(p0, nativeExcept, i, nativeExcept);
          label_0024 :
             if (str != null) {
                try{
                   nativeExcept = d.j.h(str, NativeExceptionMessage.class);
                }catch(com.google.gson.JsonSyntaxException e5){
                   this.c = this.c+e5+10;
                }
             }
          }
       }catch(java.io.IOException e5){
          this.c = this.c+e5+10;
       }
       str = nativeExcept;
       goto label_0024 ;
    }
}

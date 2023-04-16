package com.kwai.framework.exceptionhandler.safemode.a$b;
import com.kwai.framework.exceptionhandler.safemode.a$f;
import com.kwai.framework.exceptionhandler.safemode.a;
import com.kwai.framework.exceptionhandler.safemode.a$a;
import android.content.Context;
import java.io.File;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.performance.stability.crash.monitor.message.ExceptionMessage;
import com.kwai.performance.stability.crash.monitor.message.AnrExceptionMessage;
import qkd.b;
import com.kwai.framework.exceptionhandler.safemode.e;
import fg6.a;
import com.google.gson.Gson;
import com.kwai.performance.stability.crash.monitor.util.e;
import java.lang.Number;
import java.lang.CharSequence;
import java.lang.Integer;
import java.lang.StringBuilder;
import ekd.z0;
import com.kwai.performance.stability.crash.monitor.message.Backtrace;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import com.kwai.performance.stability.crash.monitor.message.ThreadInfo;
import tg7.b;
import java.util.regex.Pattern;
import tg7.b$a;
import java.util.regex.Matcher;
import com.yxcorp.utility.TextUtils;
import java.lang.NumberFormatException;
import java.lang.Throwable;
import com.kwai.performance.stability.crash.monitor.message.MemoryInfo;
import java.lang.Boolean;
import com.kwai.performance.stability.crash.monitor.message.JavaBackTraceElement;
import com.kwai.performance.stability.crash.monitor.message.BackTraceElement;
import java.lang.Long;
import java.util.List;
import com.kwai.performance.stability.crash.monitor.message.NativeBackTraceElement;
import com.kwai.performance.stability.crash.monitor.internal.ExceptionReporter;
import com.kwai.performance.stability.crash.monitor.internal.ExceptionReporter$a;

public class a$b extends a$f	// class@001545
{
    public final a a;

    public void a$b(a p0){
       this.a = p0;
       super(null);
    }
    public File a(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new File(this.a.c(p0), "anr_log/dump");
    }
    public File b(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new File(this.a.c(p0), "anr_log/upload");
    }
    public ExceptionMessage c(File p0,File p1,File p2){
       String str;
       a$b uob = a$b.class;
       AnrExceptionMessage obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, a$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = PatchProxy.applyOneRefs(p1, this, uob, "5");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = null;
          try{
             str = b.f0(p1);
          }catch(java.io.IOException e0){
             str = obj;
          }
          if (str != null) {
             try{
                obj = a.a.h(str, AnrExceptionMessage.class);
             }catch(com.google.gson.JsonSyntaxException e0){
                str = e.I;
             }
          }
       }
       try{
          obj.mThreadName = "main";
          str = PatchProxy.applyOneRefs(p2, this, uob, "4");
          if (str != PatchProxyResult.class) {
          }else {
             str = new File(p2, "anr_reason");
             if (str.exists()) {
                try{
                   str = b.f0(str);
                }catch(java.io.IOException e0){
                   str = e.I;
                }
                str = "";
             }else {
                goto label_0063 ;
             }
          }
          obj.mReason = str;
          this.d(obj, p0);
          obj.mTid = obj.mPid;
       }catch(java.lang.Exception e0){
          String i = e.I;
       }
       return obj;
    }
    public final void d(AnrExceptionMessage p0,File p1){
       int i;
       ArrayList uArrayList;
       Object obj = this;
       String str = p0;
       Gson obj1 = p1;
       a$b uob = a$b.class;
       if (PatchProxy.applyVoidTwoRefs(str, obj1, obj, uob, "6")) {
          return;
       }
       File parentFile = p1.getParentFile();
       if (("Unknown").equals(str.mLogUUID) && parentFile != null) {
          str.mLogUUID = e.x(parentFile.getName());
       }
       ExceptionMessage mLogUUID = str.mLogUUID;
       StringBuilder obj2 = PatchProxy.applyOneRefs(mLogUUID, obj, uob, "9");
       if (obj2 != PatchProxyResult.class) {
          i = obj2.intValue();
       }else {
          i = -1;
          if (mLogUUID.contains("-")) {
             i = Integer.parseInt(mLogUUID.substring(mLogUUID.lastIndexOf(45)));
          }
       }
       str.mIndex = i;
       obj2 = z0.b();
       StringBuilder str1 = new z0().a();
       Backtrace uBacktrace = new Backtrace();
       Backtrace uBacktrace1 = new Backtrace();
       try{
          uArrayList = new ArrayList();
          BufferedReader uBufferedRea = new BufferedReader(new FileReader(obj1));
          Backtrace uBacktrace2 = new Backtrace();
          Backtrace uBacktrace3 = new Backtrace();
          int i1 = 0;
          ThreadInfo threadInfo = new ThreadInfo();
          obj1 = 0;
          while (true) {
             String str2 = null;
             i1 = obj1;
             int i4 = i1;
             break ;
          }
          while (true) {
             String str3 = uBufferedRea.readLine();
             if (str3 == null || str3.startsWith("--------- beginning of")) {
                uBacktrace = uBacktrace;
                break ;
             }else {
                Backtrace uBacktrace4 = uBacktrace;
                Matcher matcher = b.g.a("\"\(.*\)\".*tid=\(\\d+\)\\s+\(\\w+\)").matcher(str3);
                if (!str2 && matcher.lookingAt()) {
                   threadInfo.mName = matcher.group(1);
                   int i5 = i4 + 1;
                   threadInfo.mIndex = i4;
                   String str4 = matcher.group(2);
                   if (!TextUtils.x(str4)) {
                      try{
                         threadInfo.mTid = Integer.parseInt(str4);
                      }catch(java.lang.NumberFormatException e0){
                         e0.printStackTrace();
                      }
                   }
                }else if(str2 != null){
                   if (str3.isEmpty()) {
                      threadInfo.mJavaBacktrace = a.a.q(uBacktrace3);
                      uArrayList.add(threadInfo);
                      if (i1) {
                         uBacktrace1 = uBacktrace2;
                         uBacktrace = uBacktrace3;
                         break ;
                      }else {
                         threadInfo = new ThreadInfo();
                         uBacktrace3 = new Backtrace();
                         uBacktrace = uBacktrace4;
                         i1 = i4;
                         i4 = i1;
                      }
                   }else if(i1){
                      if (str3.startsWith("  |")) {
                         str1 = str1+str3+10;
                      }else {
                         obj2 = obj2+str3+10;
                      }
                   }
                   if (str3.startsWith("  at ")) {
                      obj.e(str3, uBacktrace3, false);
                   }
                   if (str3.startsWith(".*#\\d+\\s+pc.*")) {
                      obj.f(str3, uBacktrace2);
                   }
                }
                uBacktrace = uBacktrace4;
             }
          }
          try{
             uBufferedRea.close();
          }catch(java.io.FileNotFoundException e0){
          }catch(java.io.IOException e0){
          }
       }catch(java.io.FileNotFoundException e0){
          int i2 = uBacktrace;
       label_017d :
          uBacktrace = i2;
       }catch(java.io.IOException e0){
       }
       obj1 = a.a;
       str.mJavaBacktrace = obj1.q(uBacktrace);
       str.mNativeBacktrace = obj1.q(uBacktrace1);
       if (obj2.length() > 1) {
          str.mCrashDetail = obj2.substring(0, (obj2.length() - 1));
       }else {
          int i3 = 0;
       }
       if (str1.length() > 1) {
          str.mThreadDetail = str1.substring(0, (str1.length() - 1));
       }
       MemoryInfo memoryInfo = obj1.h(str.mMemoryInfo, MemoryInfo.class);
       memoryInfo.mAllThreads = uArrayList;
       str.mMemoryInfo = obj1.q(memoryInfo);
       str.mExtraInfo = "";
       str.mMessageQueueDetail = "";
       return;
    }
    public void e(String p0,Backtrace p1,boolean p2){
       long this;
       if (PatchProxy.isSupport(a$b.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, a$b.class, "8")) {
          return;
       }
       Backtrace mFrame = p1.mFrame;
       if (mFrame > 256) {
          return;
       }
       JavaBackTraceElement javaBackTrac = new JavaBackTraceElement(p0, mFrame);
       Matcher matcher = a.c.matcher(p0);
       if (matcher.lookingAt()) {
          javaBackTrac.mDeclaringClass = matcher.group(1);
          javaBackTrac.mMethodName = matcher.group(2);
          if (matcher.groupCount() >= 5) {
             p0 = matcher.group(4);
             javaBackTrac.mFileName = (p0 != null)? p0: true;
             p0 = matcher.group(5);
             if (p0 != null) {
                this = 0;
                try{
                   this = Long.parseLong(p0);
                }catch(java.lang.NumberFormatException e8){
                   e8.printStackTrace();
                }
                javaBackTrac.mLineNumber = this;
             }
          }
       }else if(p1.mFrame == null && p2){
          javaBackTrac.mIsTitle = true;
       }else if(p0.startsWith("Caused by: ")){
          javaBackTrac.mIsCausedBy = true;
       }
       if (javaBackTrac.mIsTitle == null && (javaBackTrac.mIsCausedBy != null || javaBackTrac.mIsNative != null)) {
          javaBackTrac.mNeedClustering = false;
       }
       p1.mFrame = p1.mFrame + 1;
       p1.mBacktraces.add(javaBackTrac);
       return;
    }
    public void f(String p0,Backtrace p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$b.class, "7")) {
          return;
       }
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
          if (!TextUtils.x(matcher2)) {
             if (d.a(".*\(Mterp|ExecuteMterp|\(art::|_ZN3art11\)\(interpreter|.*Invoke\)|art_?interpreter|art_?quick|ZN3art9ArtMethod6Invoke|art::ArtMethod::Invoke\).*").matcher(matcher2).lookingAt()) {
                nativeBackTr.mNeedClustering = false;
                return;
             }else {
                String str = null;
                Matcher matcher3 = d.a("[^\\[\(<\\]]+").matcher(matcher2);
                if (matcher3.lookingAt()) {
                   Matcher matcher4 = d.a(".*\(\\b\\w+\)").matcher(matcher3.group());
                   if (matcher4.lookingAt() && matcher.groupCount() >= 1) {
                      str = matcher4.group(1);
                   }
                }
                if (str != null) {
                   nativeBackTr.mMethodName = str;
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
       label_0102 :
          return;
       }
       p1.mFrame = p1.mFrame + 1;
       p1.mBacktraces.add(nativeBackTr);
       goto label_0102 ;
    }
}

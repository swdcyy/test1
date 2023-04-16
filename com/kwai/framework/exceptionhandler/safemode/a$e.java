package com.kwai.framework.exceptionhandler.safemode.a$e;
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
import com.kwai.performance.stability.crash.monitor.message.NativeExceptionMessage;
import qkd.b;
import com.kwai.framework.exceptionhandler.safemode.e;
import fg6.a;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.lang.StringBuilder;
import com.kwai.performance.stability.crash.monitor.internal.g;
import java.util.regex.Pattern;
import com.kwai.performance.stability.crash.monitor.internal.g$a;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import com.yxcorp.utility.TextUtils;
import java.lang.Long;
import java.lang.Integer;
import java.lang.NumberFormatException;
import java.lang.Boolean;
import ekd.z0;
import com.kwai.performance.stability.crash.monitor.message.Backtrace;
import java.io.FileReader;
import java.io.Reader;
import java.lang.Throwable;
import java.io.IOException;
import java.io.FileNotFoundException;
import com.kwai.performance.stability.crash.monitor.message.NativeBackTraceElement;
import com.kwai.performance.stability.crash.monitor.internal.ExceptionReporter;
import com.kwai.performance.stability.crash.monitor.internal.ExceptionReporter$a;
import com.kwai.performance.stability.crash.monitor.message.BackTraceElement;
import java.util.List;

public class a$e extends a$f	// class@001548
{
    public final a a;

    public void a$e(a p0){
       this.a = p0;
       super(null);
    }
    public void a$e(a p0,a$a p1){
       super(p0);
    }
    public File a(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new File(this.a.c(p0), "native_crash_log/dump");
    }
    public File b(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new File(this.a.c(p0), "native_crash_log/upload");
    }
    public ExceptionMessage c(File p0,File p1,File p2){
       String str;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, a$e.class, "3");
       if (p2 != patchProxyRe) {
          return p2;
       }
       NativeExceptionMessage nativeExcept = PatchProxy.applyOneRefs(p1, this, a$e.class, "7");
       if (nativeExcept != patchProxyRe) {
       }else {
          nativeExcept = null;
          try{
             str = b.f0(p1);
          }catch(java.io.IOException e0){
             str = nativeExcept;
          }
          if (str != null) {
             try{
                nativeExcept = a.a.h(str, NativeExceptionMessage.class);
             }catch(com.google.gson.JsonSyntaxException e0){
                str = e.I;
             }
          }
       }
       try{
          this.e(nativeExcept, p0);
       }catch(java.lang.Exception e0){
          String i = e.I;
       }
       return nativeExcept;
    }
    public final void d(NativeExceptionMessage p0,BufferedReader p1,StringBuilder p2){
       int this;
       Matcher matcher;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a$e.class, "5")) {
          return;
       }
       while (true) {
          String str = p1.readLine();
          if (str == null) {
             return;
          }
          if (str.startsWith("Build fingerprint: ")) {
             p0.mFingerprint = str.substring(19);
          }else {
             int i = 10;
             if (str.startsWith("Revision: ")) {
                p0.mRevision = str.substring(i);
             }else {
                this = 5;
                if (str.startsWith("ABI: ")) {
                   p0.mAbi = str.substring(this);
                }else if(str.startsWith("Timestamp: ")){
                   matcher = g.g.a("Timestamp:.*UTC: \(\\d+\).*").matcher(str);
                   if (matcher.lookingAt()) {
                      str = matcher.group(1);
                      if (!TextUtils.x(str)) {
                         p0.mCurrentTimeStamp = Long.parseLong(str);
                      }
                   }
                }else if(str.startsWith("pid: ")){
                   matcher = g.g.a("pid: \(\\d+\), tid: \(\\d+\), name: \(.*\) {2}>>> \(.*\) <<<").matcher(str);
                   if (matcher.lookingAt()) {
                      String str1 = matcher.group(1);
                      String str2 = matcher.group(2);
                      if (!TextUtils.x(str1) && !TextUtils.x(str2)) {
                         try{
                            p0.mPid = Integer.parseInt(str1);
                            p0.mTid = Integer.parseInt(str2);
                         }catch(java.lang.NumberFormatException e1){
                            e1.printStackTrace();
                         }
                      }
                   }
                }else if(str.startsWith("uid: ")){
                   continue ;
                }else if(str.startsWith("signal ")){
                   matcher = g.g.a("signal \(\\d+\) \\\(\(\\w+\)\\\), code \(-*\\d+\) \\\(\(\\w+\).*\\\), fault addr \(.*\)").matcher(str);
                   if (matcher.lookingAt()) {
                      p0.mSignal = matcher.group(2);
                      p0.mCode = matcher.group(4);
                      str = matcher.group(this);
                      p0.mFaultAddr = str;
                      str = (("--------").equals(str))? Boolean.TRUE.toString(): Boolean.FALSE.toString();
                      p0.mManuallyKill = str;
                   }
                }else if(str.startsWith("Abort message: ")){
                   p0.mAbortMsg = str.substring(15);
                }else if(str.startsWith("Cause: ")){
                   p0.mCause = str.substring(7);
                }else if(!str.startsWith("    x") && (!str.startsWith("    lr") && (str.startsWith("    r") || str.startsWith("    ip")))){
                   p2+str+i;
                }else {
                   break ;
                }
             }
          }
       }
       return;
    }
    public void e(NativeExceptionMessage p0,File p1){
       int i;
       Gson gson;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$e.class, "4")) {
          return;
       }
       File parentFile = p1.getParentFile();
       if (("Unknown").equals(p0.mLogUUID) && parentFile != null) {
          p0.mLogUUID = parentFile.getName();
       }
       StringBuilder str = z0.b();
       StringBuilder str1 = new z0().a();
       Backtrace uBacktrace = new Backtrace();
       Backtrace uBacktrace1 = new Backtrace();
       try{
          i = 1;
          BufferedReader uBufferedRea = new BufferedReader(new FileReader(p1));
          gson = null;
          while (true) {
             int i1 = 0;
             while (true) {
                String str2 = uBufferedRea.readLine();
                if (str2 != null) {
                   if (gson && str2.startsWith("backtrace:")) {
                      gson = null;
                      i1 = 1;
                   }else if(i1){
                      if (str2.length() < 16 || str2.startsWith("###### ending of java stack trace ######")) {
                         continue ;
                      }else {
                         this.f(str2, uBacktrace);
                         str = str+str2+10;
                      }
                   }else if(gson == null && str2.startsWith("*** ***")){
                      this.d(p0, uBufferedRea, str1);
                      gson = 1;
                   }
                }else {
                   uBufferedRea.close();
                }
             }
          }
       }catch(java.io.FileNotFoundException e13){
          e13.printStackTrace();
       }catch(java.io.IOException e13){
          e13.printStackTrace();
       }
       gson = a.a;
       p0.mJavaBacktrace = gson.q(uBacktrace1);
       p0.mNativeBacktrace = gson.q(uBacktrace);
       if (str.length() > i) {
          p0.mCrashDetail = str.substring(0, (str.length() - i));
       }
       if (str1.length() > i) {
          p0.mRegister = str1.substring(0, (str1.length() - i));
       }
       return;
    }
    public void f(String p0,Backtrace p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$e.class, "6")) {
          return;
       }
       Backtrace mFrame = p1.mFrame;
       if (mFrame > 256) {
          return;
       }
       NativeBackTraceElement nativeBackTr = new NativeBackTraceElement(p0, mFrame);
       ExceptionReporter$a d = ExceptionReporter.d;
       Matcher matcher = d.a(".*#\\d+\\s+pc\\s+\(\\w+\)\\s+.*?\([^/]+\\.so\)\(?:\\s+\\\(offset\\s+\\w+\\\)\)?\(?:\\s+\\\(\(.*?\)\\+\\d+\\\)\)?\(\\s+\\\(BuildId:\\s+\(\\b\\w+\)\\\)\)?").matcher(p0);
       if (matcher.lookingAt() && matcher.groupCount() >= 5) {
          nativeBackTr.mPc = matcher.group(1);
          nativeBackTr.mFileName = matcher.group(2);
          String str = matcher.group(3);
          if (!TextUtils.x(str)) {
             if (d.a(".*\(Mterp|ExecuteMterp|\(art::|_ZN3art11\)\(interpreter|.*Invoke\)|art_?interpreter|art_?quick|ZN3art9ArtMethod6Invoke|art::ArtMethod::Invoke\).*").matcher(str).lookingAt()) {
                nativeBackTr.mNeedClustering = false;
                return;
             }else {
                String str1 = null;
                Matcher matcher1 = d.a("[^\\[\(<\\]]+").matcher(str);
                if (matcher1.lookingAt()) {
                   Matcher matcher2 = d.a(".*\(\\b\\w+\)").matcher(matcher1.group());
                   if (matcher2.lookingAt() && matcher.groupCount() >= 1) {
                      str1 = matcher2.group(1);
                   }
                }
                if (str1 != null) {
                   nativeBackTr.mMethodName = str1;
                }else {
                   nativeBackTr.mMethodName = str;
                }
             }
          }
          matcher = matcher.group(5);
          if (matcher != null) {
             nativeBackTr.mBuildId = matcher;
          }
          p1.mFrame = p1.mFrame + 1;
          p1.mBacktraces.add(nativeBackTr);
       }
       return;
    }
}

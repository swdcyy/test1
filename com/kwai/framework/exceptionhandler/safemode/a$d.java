package com.kwai.framework.exceptionhandler.safemode.a$d;
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
import qkd.b;
import com.kwai.framework.exceptionhandler.safemode.e;
import fg6.a;
import com.kwai.performance.stability.crash.monitor.message.JavaExceptionMessage;
import com.google.gson.Gson;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.performance.stability.crash.monitor.util.e;
import com.kwai.performance.stability.crash.monitor.message.Backtrace;
import java.lang.Boolean;
import com.kwai.performance.stability.crash.monitor.message.JavaBackTraceElement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.kwai.performance.stability.crash.monitor.message.BackTraceElement;
import java.lang.Long;
import java.lang.NumberFormatException;
import java.util.List;

public class a$d extends a$f	// class@001547
{
    public final a a;

    public void a$d(a p0){
       this.a = p0;
       super(null);
    }
    public void a$d(a p0,a$a p1){
       super(p0);
    }
    public File a(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new File(this.a.c(p0), "java_crash_log/dump");
    }
    public File b(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new File(this.a.c(p0), "java_crash_log/upload");
    }
    public ExceptionMessage c(File p0,File p1,File p2){
       String str1;
       String[] stringArray;
       Backtrace uBacktrace;
       int len;
       int i1;
       String str = "\n";
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, a$d.class, "3");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       JavaExceptionMessage javaExceptio = null;
       try{
          str1 = b.f0(p1);
       }catch(java.io.IOException e0){
          str1 = javaExceptio;
       }
       if (str1 != null) {
          try{
             javaExceptio = a.a.h(str1, JavaExceptionMessage.class);
          }catch(com.google.gson.JsonSyntaxException e0){
             String i = e.I;
          }
       }
    }
    public void d(String p0,Backtrace p1,boolean p2){
       long this;
       if (PatchProxy.isSupport(a$d.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, a$d.class, "4")) {
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
}

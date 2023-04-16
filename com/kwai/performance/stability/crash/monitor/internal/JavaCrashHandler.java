package com.kwai.performance.stability.crash.monitor.internal.JavaCrashHandler;
import com.kwai.performance.stability.crash.monitor.internal.ExceptionHandler;
import com.kwai.performance.stability.crash.monitor.internal.ExceptionReporter;
import tg7.i;
import java.io.File;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import vg7.e;
import java.lang.Throwable;
import com.kwai.performance.stability.crash.monitor.message.ExceptionMessage;
import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import com.kwai.performance.stability.crash.monitor.util.e;
import java.lang.StringBuilder;
import lg7.l;
import lg7.d;
import vg7.d;
import com.google.gson.Gson;
import msd.a;
import ug7.a;
import qrd.l1;
import com.kwai.performance.stability.crash.monitor.CrashMonitorLoggerKt;
import java.lang.Thread;
import android.os.Process;
import com.kwai.performance.stability.crash.monitor.internal.JavaCrashHandler$onFakeException$1;
import com.kwai.performance.monitor.base.Monitor_ThreadKt;

public final class JavaCrashHandler extends ExceptionHandler	// class@000e2b
{
    public static final JavaCrashHandler r;
    public static boolean s;
    public static boolean t;
    public static ExceptionReporter u;

    static {
       JavaCrashHandler.r = new JavaCrashHandler();
    }
    public void JavaCrashHandler(){
       super();
    }
    public ExceptionReporter c(){
       if (JavaCrashHandler.t && JavaCrashHandler.u == null) {
          i oi = new i();
          oi.a = this.i;
          oi.b = this.j;
          JavaCrashHandler.u = oi;
       }
       return JavaCrashHandler.u;
    }
    public final void d(File p0){
       a.p(p0, "logDir");
       JavaCrashHandler.t = true;
       this.c = p0;
       e.a(p0);
       this.d = new File(this.c, this.a());
    }
    public synchronized final void e(Throwable p0,ExceptionMessage p1,Context p2,boolean p3){
       ExceptionHandler i1;
       ExceptionHandler uExceptionHa = this;
       String obj = p0;
       ExceptionMessage uExceptionMe = p1;
       Context uContext = p2;
       int andIncrement = uExceptionHa.b.getAndIncrement();
       if (uExceptionHa.d == null && uContext) {
          uExceptionHa.d(new File(e.a.k(uContext), "exception/java_crash_log/dump"));
       }
       ExceptionHandler c = uExceptionHa.c;
       a.m(c);
       boolean b = c.exists();
       File uFile = new File(uExceptionHa.d+'-'+andIncrement);
       File uFile1 = new File(uFile, "message");
       File uFile2 = new File(uFile, "logcat");
       File uFile3 = new File(uFile, "all_java_backtrace");
       File uFile4 = new File(uFile, "meminfo");
       uExceptionMe.mCrashDetail = obj+"##";
       uExceptionMe.mLogUUID = uFile.getName();
       ExceptionHandler i = uExceptionHa.i;
       if (i == null) {
          e.y(p0, p1, p2);
          e.A(uExceptionMe, uContext, null, 4, null);
       }else {
          a.m(i);
          ExceptionMessage uExceptionMe1 = i.d(obj, uExceptionMe);
          a.o(uExceptionMe1, "fetcher!!.fetchExceptionDetail\(ex, message\)");
          uExceptionMe = uExceptionMe1;
       }
       d.b(uExceptionMe, 1);
       obj = d.j.q(uExceptionMe);
       if (b) {
          e.C(uFile1, obj, false);
          e.e(uFile3, 0, 2, null);
          e.t(uFile2);
          uExceptionHa.b(uFile);
          i1 = uExceptionHa.i;
          if (i1 != null) {
             i1.c("JavaCrashHandler", "------  Java Crash Happened Begin ------\n"+uFile+10);
          }
          if (p3) {
             ExceptionReporter uExceptionRe = this.c();
             if (uExceptionRe != null) {
                File[] uFileArray = new File[]{uFile};
                uExceptionRe.m(uFileArray, null);
             }
          }else {
             ExceptionHandler.n = true;
             i1 = uExceptionHa.c;
             if (i1 != null) {
                ExceptionReporter uExceptionRe1 = JavaCrashHandler.r.c();
                if (uExceptionRe1 != null) {
                   uExceptionRe1.p(i1);
                }
             }
          }
          e.f(uFile4);
       }else {
          a uoa = new a();
          uoa.a(uExceptionMe, 1);
          CrashMonitorLoggerKt.b(uExceptionMe, uoa, 1);
          a.o(obj, "messageJson");
          CrashMonitorLoggerKt.a("java_crash_mkdir_fail", obj, false, 4, null);
          i1 = uExceptionHa.i;
          if (i1 != null) {
             i1.c("JavaCrashHandler", "------  Java Crash Happened Begin ------\n");
          }
       }
    label_01c4 :
       return;
    }
    public final void f(Throwable p0,ExceptionMessage p1,Context p2){
       p1.mThreadName = Thread.currentThread().getName();
       p1.mTid = Process.myTid();
       Monitor_ThreadKt.b(0, new JavaCrashHandler$onFakeException$1(p0, p1, p2), 1, null);
    }
}

package com.kwai.performance.stability.crash.monitor.internal.NativeCrashHandler;
import com.kwai.performance.stability.crash.monitor.internal.ExceptionHandler;
import com.kwai.performance.stability.crash.monitor.message.NativeExceptionMessage;
import java.lang.String;
import yf7.h;
import java.io.File;
import java.lang.StringBuilder;
import com.kwai.performance.stability.crash.monitor.message.ExceptionMessage;
import java.lang.Object;
import vg7.d;
import com.google.gson.Gson;
import kotlin.jvm.internal.a;
import com.kwai.performance.stability.crash.monitor.CrashMonitorLoggerKt;
import android.app.Application;
import yf7.k;
import android.content.Context;
import java.lang.Throwable;
import com.kwai.performance.stability.crash.monitor.util.e;
import lg7.l;
import com.kwai.performance.stability.crash.monitor.internal.ExceptionReporter;
import lg7.d;
import com.kwai.performance.stability.crash.monitor.internal.g;
import java.util.List;
import com.kwai.performance.stability.crash.monitor.internal.ExceptionHandler$a;
import java.util.Iterator;
import java.lang.Iterable;
import yf7.t;
import vg7.e;
import android.content.pm.ApplicationInfo;
import android.os.Build$VERSION;
import java.lang.Exception;

public final class NativeCrashHandler extends ExceptionHandler	// class@000e2c
{
    public static final NativeCrashHandler r;
    public static ExceptionMessage s;
    public static boolean t;
    public static ExceptionReporter u;

    static {
       NativeCrashHandler.r = new NativeCrashHandler();
       NativeCrashHandler.s = new NativeExceptionMessage();
    }
    public void NativeCrashHandler(){
       super();
    }
    public static native final void doCrash();
    public static native final void doMemoryCorruption();
    public static native final void install(String p0,String p1,int p2);
    public static synchronized final void onCallFromNative(long p0){
       ExceptionHandler h;
       ExceptionMessage s;
       ExceptionHandler d;
       ExceptionMessage s1;
       _monitor_enter(NativeCrashHandler.class);
       NativeCrashHandler r = NativeCrashHandler.r;
       h.d("NativeCrashHandler", "onCallFromNative");
       ExceptionHandler.n = true;
       ExceptionHandler e = r.e;
       ExceptionHandler f = r.f;
       ExceptionHandler g = r.g;
       h = r.h;
       ExceptionHandler c = r.c;
       if (c == null) {
       }else if(!c.exists() && !c.mkdirs()){
          s1 = NativeCrashHandler.s;
          s1.mErrorMessage = s1.mErrorMessage+"create "+c.getPath()+" failed! \n";
          String str1 = d.j.q(NativeCrashHandler.s);
          a.o(str1, "RAW_GSON.toJson\(mMessage\)");
          CrashMonitorLoggerKt.a("native_crash_mkdir_fail", str1, false, 4, null);
       }
       c = r.d;
       if (c != null && (!c.exists() && !c.mkdirs())) {
          s1 = NativeCrashHandler.s;
          s1.mErrorMessage = s1.mErrorMessage+"create "+c.getPath()+" failed!\n";
          String str = d.j.q(NativeCrashHandler.s);
          a.o(str, "RAW_GSON.toJson\(mMessage\)");
          CrashMonitorLoggerKt.a("native_crash_mkdir_fail", str, false, 4, null);
          h.b("NativeCrashHandler", "create "+c.getPath()+" failed!");
       }
    label_00c7 :
       if (e == null) {
          e = new File(r.d, "logcat");
       }
       if (f == null) {
          f = new File(r.d, "message");
       }
       if (g == null) {
          g = new File(r.d, "all_java_backtrace");
       }
       if (h == null) {
          h = new File(r.d, "meminfo");
       }
       if (r.i == null) {
          e.y(null, NativeCrashHandler.s, k.b().getBaseContext());
          e.A(NativeCrashHandler.s, k.b().getBaseContext(), null, 4, null);
       }
       c = r.i;
       if (c != null) {
          s = c.d(null, NativeCrashHandler.s);
          a.o(s, "it.fetchExceptionDetail\(null, mMessage\)");
          NativeCrashHandler.s = s;
       }
       s = NativeCrashHandler.s;
       d = r.d;
       Throwable throwable = (d == null)? null: d.getName();
       s.mLogUUID = throwable;
       e.C(f, d.j.q(NativeCrashHandler.s), false);
       e.d(g, p0);
       ExceptionHandler i = r.i;
       if (i != null) {
          i.c("NativeCrashHandler", "------  Native Crash Happened Begin ------\n"+r.d+10);
       }
       i = r.d;
       a.m(i);
       r.b(i);
       i = r.c;
       if (i != null) {
          ExceptionReporter uExceptionRe = r.c();
          if (uExceptionRe != null) {
             uExceptionRe.p(i);
          }
       }
       e.f(h);
       e.t(e);
       d.b(NativeCrashHandler.s, 4);
       _monitor_exit(NativeCrashHandler.class);
       return;
    }
    public ExceptionReporter c(){
       if (NativeCrashHandler.t && NativeCrashHandler.u == null) {
          g og = new g();
          og.a = this.i;
          og.b = this.j;
          NativeCrashHandler.u = og;
       }
       return NativeCrashHandler.u;
    }
    public final void d(File p0){
       a.p(p0, "dir");
       if (NativeCrashHandler.t) {
          return;
       }
       int i = 0;
       try{
          Iterator iterator = ExceptionHandler.l.a().iterator();
          while (iterator.hasNext()) {
             t.a(iterator.next());
          }
          NativeCrashHandler.t = true;
          this.c = p0;
          e.a(p0);
          this.d = new File(p0, this.a());
          this.e = new File(this.d, "logcat");
          this.f = new File(this.d, "message");
          this.g = new File(this.d, "all_java_backtrace");
          p0 = new File(this.d, "meminfo");
          try{
             this.h = p0;
             ExceptionHandler td = this.d;
             a.m(td);
             String path = td.getPath();
             a.o(path, "mDumpDir!!.path");
             ApplicationInfo nativeLibrar = k.b().getBaseContext().getApplicationInfo().nativeLibraryDir;
             a.o(nativeLibrar, "getApplication\(\).baseContext.applicationInfo.nativeLibraryDir");
             NativeCrashHandler.install(path, nativeLibrar, Build$VERSION.SDK_INT);
          }catch(java.lang.Exception e6){
             CrashMonitorLoggerKt.a("native_crash_init_fail", e6.toString(), i, 4, null);
          }
          return;
       }catch(java.lang.Exception e6){
          CrashMonitorLoggerKt.a("exception_load_error", e6.toString(), i, 4, null);
          return;
       }
    }
}

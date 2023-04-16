package com.kwai.performance.stability.crash.monitor.internal.AnrHandler;
import com.kwai.performance.stability.crash.monitor.internal.ExceptionHandler;
import android.os.Process;
import java.lang.String;
import java.util.regex.Pattern;
import vg7.i;
import java.lang.StringBuilder;
import android.os.Looper;
import java.lang.Thread;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.StackTraceElement;
import java.lang.Thread$State;
import android.app.Application;
import yf7.k;
import android.content.Context;
import android.app.ActivityManager;
import java.util.List;
import java.util.Iterator;
import android.app.ActivityManager$RunningAppProcessInfo;
import com.kwai.performance.stability.crash.monitor.message.AnrExceptionMessage;
import java.io.File;
import com.kwai.performance.stability.crash.monitor.anr.b;
import java.lang.System;
import com.kwai.performance.stability.crash.monitor.anr.c;
import com.kwai.performance.stability.crash.monitor.anr.async.b;
import com.kwai.performance.stability.crash.monitor.message.ExceptionMessage;
import java.lang.Throwable;
import android.util.Log;
import kotlin.io.FilesKt__UtilsKt;
import com.kwai.performance.stability.crash.monitor.util.e;
import lg7.l;
import com.kwai.performance.stability.crash.monitor.CrashMonitorLoggerKt;
import vg7.a;
import vg7.h;
import tg7.a;
import android.os.SystemClock;
import android.util.Printer;
import vg7.d;
import com.google.gson.Gson;
import com.kwai.performance.stability.crash.monitor.internal.ExceptionReporter;
import ug7.a;
import qrd.l1;
import com.kwai.performance.stability.crash.monitor.internal.AnrHandler$getAnrReason$1;
import msd.a;
import com.kwai.performance.monitor.base.Monitor_ThreadKt;
import lg7.d;
import android.content.res.Resources;
import android.content.res.Configuration;
import android.content.ContentResolver;
import android.provider.Settings$Secure;
import android.provider.Settings$Global;
import android.os.Build$VERSION;
import yf7.h;
import java.lang.Math;
import android.app.ActivityManager$ProcessErrorStateInfo;
import com.kwai.performance.stability.crash.monitor.message.AnrReason;
import java.util.Objects;
import tg7.b;
import com.kwai.performance.stability.crash.monitor.internal.ExceptionHandler$a;
import java.lang.Iterable;
import yf7.t;
import java.lang.Exception;
import kotlin.collections.CollectionsKt__CollectionsKt;
import android.app.ActivityManager$RunningServiceInfo;
import android.app.KeyguardManager;
import java.util.Collection;
import android.app.ActivityManager$RunningTaskInfo;
import android.content.ComponentName;
import yf7.p;
import com.kwai.performance.stability.crash.monitor.internal.AnrHandler$a;
import android.os.FileObserver;

public final class AnrHandler extends ExceptionHandler	// class@000e23
{
    public static final AnrHandler r;
    public static long s;
    public static final int t;
    public static final Pattern u;
    public static final boolean v;
    public static FileObserver w;
    public static boolean x;
    public static ExceptionReporter y;

    static {
       AnrHandler.r = new AnrHandler();
       AnrHandler.t = Process.myPid();
       AnrHandler.u = Pattern.compile("-{5}\\spid\\s\\d+\\sat\\s\\d+-\\d+-\\d+\\s\\d{2}:\\d{2}:\\d{2}\\s-{5}");
       AnrHandler.v = i.a(21);
    }
    public void AnrHandler(){
       super();
    }
    public static synchronized final String getMainThreadStackTrace(){
       _monitor_enter(AnrHandler.class);
       Thread thread = Looper.getMainLooper().getThread();
       a.o(thread, "getMainLooper\(\).thread");
       StackTraceElement[] stackTrace = thread.getStackTrace();
       String str = thread.getState().toString()+"\n";
       a.o(stackTrace, "stackTraceElements");
       int i = 0;
       int len = stackTrace.length;
       while (i < len) {
          i = i + 1;
          str = str+"  at "+stackTrace[i]+"\n";
       }
       str = str+"\n";
       a.o(str, "stringBuilder.append\(\"\\n\"\).toString\(\)");
       _monitor_exit(AnrHandler.class);
       return str;
    }
    public static native final boolean getStackTraceCrashOccured();
    public static native final void install(String p0,int p1);
    public static final boolean isRealNotResponding(){
       boolean b = true;
       List systemServic = k.b().getBaseContext().getSystemService("activity");
       if (systemServic instanceof ActivityManager) {
       }else {
          systemServic = null;
       }
       if (systemServic != null) {
          systemServic = systemServic.getRunningAppProcesses();
          if (systemServic != null) {
             Iterator iterator = systemServic.iterator();
             while (iterator.hasNext()) {
                if (iterator.next().pid == AnrHandler.t) {
                   b = false;
                   break ;
                }
             }
          }
       }
       return b;
    }
    public static synchronized final void onCallFromNative(int p0){
       _monitor_enter(AnrHandler.class);
       ExceptionHandler.n = true;
       AnrHandler.r.c(null, p0);
       _monitor_exit(AnrHandler.class);
    }
    public synchronized final void c(String p0,int p1){
       int i1;
       int i2;
       ExceptionHandler uExceptionHa = this;
       String str = p0;
       AnrExceptionMessage uAnrExceptio = new AnrExceptionMessage();
       File uFile = new File(uExceptionHa.d+'-'+p1);
       String str1 = 1;
       b.c().s(uFile);
       b uob = b.c();
       if (uob.g != null && uob.j != null) {
          uob.a = System.currentTimeMillis();
          uob.g.a = str1;
       }
       b.a().c(uFile);
       int i = 4;
       try{
          i1 = 0;
          uExceptionHa.e(uAnrExceptio);
       }catch(java.lang.Exception e0){
          uAnrExceptio.mErrorMessage = uAnrExceptio.mErrorMessage+Log.getStackTraceString(e0)+10;
       }
       ExceptionHandler c = uExceptionHa.c;
       if (c != null && (!c.exists() && !c.mkdirs())) {
          uAnrExceptio.mErrorMessage = uAnrExceptio.mErrorMessage+"create "+c.getPath()+" failed!\n";
          str1 = null;
       }
    label_00a9 :
       if (!uFile.exists() && !uFile.mkdirs()) {
          uAnrExceptio.mErrorMessage = uAnrExceptio.mErrorMessage+"create "+uFile.getPath()+" failed!\n";
          i2 = 0;
       }else {
          i2 = str1;
       }
       File uFile1 = new File(uFile, "dump");
       if (str && i2 != null) {
          FilesKt__UtilsKt.Q(new File(str), uFile1, false, 0, 6, null);
       }
       e.t(new File(uFile, "logcat"));
       if (uExceptionHa.i == null) {
          e.y(i1, uAnrExceptio, k.b().getBaseContext());
          e.A(uAnrExceptio, k.b().getBaseContext(), i1, i, i1);
       }
       c = uExceptionHa.i;
       if (c != null) {
          c.d(i1, uAnrExceptio);
       }
       this.d(p0, uFile, uAnrExceptio, p1, i2);
       return;
    }
    public final void d(String p0,File p1,AnrExceptionMessage p2,int p3,boolean p4){
       String str;
       ExceptionHandler uExceptionHa = 10;
       b.c().s(p1);
       p2.mExtraInfo = b.c().a();
       p2.mTraversalBarrier = a.d();
       int i = 0;
       try{
          str = h.b();
          p2.mDumpUptimeMillis = SystemClock.uptimeMillis();
          p2.mDumpUnixTime = System.currentTimeMillis();
          Looper.getMainLooper().dump(new a(str), "");
          p2.mMessageQueueDetail = str.substring(i, (str.length() - 1));
       }catch(java.lang.Exception e4){
          p2.mErrorMessage = p2.mErrorMessage+Log.getStackTraceString(e4)+uExceptionHa;
       }
       str = d.j.q(p2);
       p2.mLogUUID = p1.getName();
       String str1 = "messageJson";
       if (!new File(p1, "dump").exists()) {
          a.o(str, str1);
          CrashMonitorLoggerKt.a("anr_no_dump_file", str, i, 4, null);
          return;
       }else if(p4){
          File uFile = new File(p1, "meminfo");
          e.C(new File(p1, "message"), str, i);
          ExceptionHandler ti = this.i;
          if (ti != null) {
             ti.c("AnrHandler", "------ ANR Happened Begin ------\n"+p1+uExceptionHa);
          }
          this.b(p1);
          uExceptionHa = this.c;
          if (uExceptionHa != null) {
             ExceptionReporter uExceptionRe = AnrHandler.r.g();
             if (uExceptionRe != null) {
                uExceptionRe.p(uExceptionHa);
             }
          }
          e.f(uFile);
       }else if(p0 != null){
          a uoa = new a();
          uoa.a(p2, 3);
          CrashMonitorLoggerKt.b(p2, uoa, 3);
       }
       a.o(str, str1);
       CrashMonitorLoggerKt.a("anr_mkdir_fail", str, i, 4, null);
       uExceptionHa = this.i;
       if (uExceptionHa != null) {
          uExceptionHa.c("AnrHandler", "------ ANR Happened Begin ------\n");
       }
       File uFile1 = new File(p1, "anr_reason");
       if (p0 == null) {
          Monitor_ThreadKt.b(0, new AnrHandler$getAnrReason$1(uFile1), 1, null);
       }else {
          this.f(p0, uFile1);
       }
       d.b(p2, 3);
       return;
    }
    public final void e(AnrExceptionMessage p0){
       String str;
       Context baseContext = k.b().getBaseContext();
       Configuration configuratio = baseContext.getResources().getConfiguration();
       int i = 0;
       int i1 = 1;
       boolean b = (Settings$Secure.getInt(baseContext.getContentResolver(), "anr_show_background", i))? true: false;
       boolean b1 = (configuratio.keyboard == i1 && (configuratio.touchscreen != i1 || configuratio.navigation != i1))? true: false;
       boolean b2 = (Settings$Global.getInt(baseContext.getContentResolver(), "hide_error_dialogs", i))? true: false;
       p0.mAnrShowBackground = String.valueOf(b);
       p0.mAnrForeground = String.valueOf(this.i());
       p0.mAnrInputMethodExists = String.valueOf(b1);
       p0.mAnrHideErrorDialogs = String.valueOf(b2);
       if (!b && !this.i()) {
          p0.mShowAnrDialog = "false";
          return;
       }else if(b1 && !b2){
          str = 1;
       }else {
          str = null;
       }
       if (Build$VERSION.SDK_INT > 24) {
          i = 1;
       }
       if (!i || !b) {
          i1 = str;
       }
       p0.mShowAnrDialog = (i1 != null)? "true": "false";
       return;
    }
    public final void f(String p0,File p1){
       long l = 0;
       if (p0 != null) {
          long l1 = new File(p0).lastModified();
          if (!l1 - l) {
             h.b("anr_reason_fail", p0);
          }
          if (Math.abs((l1 - AnrHandler.s)) - 0x2710 < 0) {
             return;
          }else {
             AnrHandler.s = l1;
          }
       }
       ActivityManager$ProcessErrorStateInfo systemServic = k.b().getBaseContext().getSystemService("activity");
       ActivityManager$ProcessErrorStateInfo processError = null;
       if (systemServic instanceof ActivityManager) {
       }else {
          systemServic = processError;
       }
       if (systemServic == null) {
          h.b("anr_reason_fail", "fail to get ActivityManager!");
          return;
       }else {
          do {
             l = l + 1;
             List processesInE = systemServic.getProcessesInErrorState();
             if (processesInE != null) {
                Iterator iterator = processesInE.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      ActivityManager$ProcessErrorStateInfo processError1 = iterator.next();
                      if (processError1.condition == 2) {
                         processError = processError1;
                      }
                   }
                }
                h.b("anr_reason_fail", "fail to get ProcessErrorStateInfo!");
                return;
             }
             if (processError == null) {
                Thread.sleep(500);
                if (l - 20 < 0) {
                   continue ;
                }
             }
          } while (l - 20 >= 0);
          if (processError == null) {
             goto label_0075 ;
          }else if(processError.pid != AnrHandler.t){
             h.b("anr_reason_fail", "other process anr:"+processError.shortMsg+10);
             return;
          }else {
             AnrReason uAnrReason = new AnrReason();
             uAnrReason.mTag = processError.tag;
             uAnrReason.mShortMsg = processError.shortMsg;
             uAnrReason.mLongMsg = processError.longMsg;
             e.C(p1, d.j.q(uAnrReason), false);
             Objects.requireNonNull(b.c());
             return;
          }
       }
    }
    public ExceptionReporter g(){
       if (AnrHandler.x && AnrHandler.y == null) {
          b uob = new b();
          uob.a = this.i;
          uob.b = this.j;
          AnrHandler.y = uob;
       }
       return AnrHandler.y;
    }
    public final void h(File p0){
       a.p(p0, "logDir");
       if (AnrHandler.x) {
          return;
       }
       AnrHandler.x = true;
       this.c = p0;
       this.d = new File(this.c, this.a());
       if (!AnrHandler.v) {
          this.j();
          return;
       }else {
          int i = 0;
          try{
             Iterator iterator = ExceptionHandler.l.a().iterator();
             while (iterator.hasNext()) {
                t.a(iterator.next());
             }
             try{
                ExceptionHandler td = this.d;
                a.m(td);
                AnrHandler.install(td.getPath(), Build$VERSION.SDK_INT);
             }catch(java.lang.Exception e2){
                CrashMonitorLoggerKt.a("anr_init_fail", e2.toString(), i, 4, 0);
             }
             return;
          }catch(java.lang.Exception e2){
             h.b("AnrHandler", e2.toString());
             CrashMonitorLoggerKt.a("exception_load_error", e2.toString(), i, 4, 0);
             return;
          }
       }
    }
    public final boolean i(){
       boolean b1;
       Context baseContext = k.b().getBaseContext();
       KeyguardManager systemServic = baseContext.getSystemService("activity");
       KeyguardManager keyguardMana = null;
       if (systemServic instanceof ActivityManager) {
       }else {
          systemServic = keyguardMana;
       }
       if (systemServic == null) {
          return false;
       }else {
          int i = Process.myPid();
          List runningServi = systemServic.getRunningServices(10);
          if (runningServi == null) {
             runningServi = CollectionsKt__CollectionsKt.E();
          }
          Iterator iterator = runningServi.iterator();
          while (true) {
             boolean b = true;
             if (iterator.hasNext()) {
                ActivityManager$RunningServiceInfo runningServi1 = iterator.next();
                if (runningServi1.foreground != null && runningServi1.pid == i) {
                   return b;
                }
                continue ;
             }else {
                List systemServic1 = baseContext.getSystemService("keyguard");
                if (systemServic1 instanceof KeyguardManager) {
                   keyguardMana = systemServic1;
                }
                systemServic1 = (keyguardMana == null)? null: keyguardMana.isKeyguardLocked();
                if (systemServic1) {
                   return false;
                }else {
                   systemServic1 = systemServic.getRunningTasks(b);
                   if (systemServic1 != null && !systemServic1.isEmpty()) {
                      b = false;
                   }
                   if (!b) {
                      ActivityManager$RunningTaskInfo topActivity = systemServic1.get(false).topActivity;
                      if (topActivity == null) {
                         return false;
                      }else if(!a.g(topActivity.getPackageName(), k.b().getBaseContext().getPackageName())){
                         return false;
                      }
                   }
                   break ;
                }
             }
          }
          return p.b(k.b());
       }
    }
    public final void j(){
       AnrHandler$a uoa = new AnrHandler$a();
       AnrHandler.w = uoa;
       uoa.startWatching();
       return;
    }
}

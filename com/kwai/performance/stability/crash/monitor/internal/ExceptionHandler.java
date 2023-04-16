package com.kwai.performance.stability.crash.monitor.internal.ExceptionHandler;
import com.kwai.performance.stability.crash.monitor.internal.ExceptionHandler$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.io.File;
import java.lang.StringBuilder;
import android.os.Process;
import android.app.Application;
import yf7.k;
import android.content.Context;
import yf7.r;
import java.lang.CharSequence;
import android.text.TextUtils;
import kotlin.jvm.internal.a;
import zsd.u;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import lg7.l;
import com.kwai.performance.stability.crash.monitor.util.e;
import com.kwai.performance.stability.crash.monitor.CrashMonitor;
import com.kwai.performance.stability.crash.monitor.internal.AnrHandler;
import vg7.i;
import java.util.Objects;
import android.app.Activity;
import yf7.p;
import com.kwai.performance.stability.crash.monitor.util.ScreenshotUtil;
import android.graphics.Bitmap;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import android.graphics.Bitmap$CompressFormat;
import qrd.l1;
import java.io.Closeable;
import java.lang.Throwable;
import isd.b;
import java.lang.Exception;
import yf7.h;

public abstract class ExceptionHandler	// class@000e26
{
    public final String a;
    public AtomicInteger b;
    public File c;
    public File d;
    public File e;
    public File f;
    public File g;
    public File h;
    public l i;
    public g j;
    public ExceptionReporter k;
    public static final ExceptionHandler$a l;
    public static final List m;
    public static boolean n;
    public static File o;
    public static final File p;
    public static final File q;

    static {
       ExceptionHandler.l = new ExceptionHandler$a(null);
       String[] stringArray = new String[]{"c++_shared","plt-base","plt-unwind","exception-handler"};
       ExceptionHandler.m = CollectionsKt__CollectionsKt.L(stringArray);
       ExceptionHandler.p = new File("/proc/"+Process.myPid()+"/maps");
       ExceptionHandler.q = new File("/proc/"+Process.myPid()+"/smaps");
    }
    public void ExceptionHandler(){
       super();
       Context baseContext = k.b().getBaseContext();
       String str = r.a();
       if (TextUtils.isEmpty(str) || r.b()) {
          str = "main";
       }else {
          a.m(str);
          if (u.q2(str, a.C(baseContext.getPackageName(), ":"), false, 2, null)) {
             str = str.substring(((baseContext.getPackageName()).length() + 1));
             a.o(str, "\(this as java.lang.String\).substring\(startIndex\)");
          }
       }
       this.a = str+'-'+Process.myPid()+'-'+UUID.randomUUID();
       this.b = new AtomicInteger();
       return;
    }
    public final String a(){
       return this.a;
    }
    public final void b(File p0){
       e a;
       a.p(p0, "dumpDir");
       File uFile = new File(p0, "activity_lifecycle");
       ExceptionHandler ti = this.i;
       if (ti == null) {
       }else {
          ti.e(uFile);
       }
       e.a(ExceptionHandler.p, new File(p0, "maps"));
       e.a(ExceptionHandler.q, new File(p0, "smaps"));
       uFile = new File(p0, "client_log");
       ti = this.i;
       if (ti != null) {
          ti.b(uFile);
       }
       if (CrashMonitor.INSTANCE.allowScreenShot$com_kwai_performance_stability_crash_monitor() && (!this instanceof AnrHandler && i.a(21))) {
          uFile = new File(p0, "screenshot.jpg");
          a = e.a;
          try{
             Objects.requireNonNull(a);
             Activity uActivity = p.a(k.b());
             if (uActivity != null) {
                Bitmap uBitmap = ScreenshotUtil.a.a(uActivity);
                BufferedOutputStream uBufferedOut = new BufferedOutputStream(new FileOutputStream(uFile));
                if (uBitmap != null) {
                   uBitmap.compress(Bitmap$CompressFormat.JPEG, 30, uBufferedOut);
                }
                uBufferedOut.flush();
                b.a(uBufferedOut, null);
             }
          }catch(java.lang.Exception e5){
             e5.printStackTrace();
             h.b("ExceptionUtil", a.C("take screenshot to bitmap of activity , Error: ", e5));
          }
       }
    }
}

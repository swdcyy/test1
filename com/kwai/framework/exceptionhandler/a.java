package com.kwai.framework.exceptionhandler.a;
import java.lang.Thread$UncaughtExceptionHandler;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import com.kwai.framework.exceptionhandler.a$b;
import java.lang.Object;
import java.lang.Thread;
import ekd.k1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uv8.r1;
import com.yxcorp.gifshow.y;
import com.kwai.framework.exceptionhandler.a$a;
import j89.j;
import com.yxcorp.gifshow.apm.b;
import c6c.b;
import com.yxcorp.gifshow.protector.a;
import java.lang.Exception;
import java.lang.Throwable;
import e66.c;
import java.lang.StringBuilder;
import q87.c;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.kwai.performance.stability.crash.monitor.message.JavaExceptionMessage;
import com.kwai.performance.stability.crash.monitor.internal.ExceptionHandler$ExceptionType;
import com.kwai.performance.stability.crash.monitor.message.ExceptionMessage;
import com.kwai.performance.stability.crash.monitor.CrashMonitor;
import java.lang.NullPointerException;
import java.lang.StackTraceElement;
import com.yxcorp.utility.TextUtils;
import n66.d;
import java.lang.Runnable;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import p66.a;
import java.util.Set;
import java.util.HashSet;
import p66.c$b;
import p66.c;
import p66.d;
import p66.d$b;
import java.lang.UnsupportedOperationException;
import java.lang.ClassCastException;
import s66.a;
import com.yxcorp.image.memory.RecycledBitmapExceptionTracker;
import java.util.Objects;
import kotlin.jvm.internal.a;
import e0d.h;
import android.util.Log;
import com.kwai.performance.stability.crash.monitor.util.e;
import java.util.Iterator;
import ekd.e0;

public class a implements Thread$UncaughtExceptionHandler	// class@000b47
{
    public final a$b a;
    public boolean b;
    public final Thread$UncaughtExceptionHandler c;
    public static final Handler d;
    public static final List e;

    static {
       a.d = new Handler(Looper.getMainLooper());
       a.e = new ArrayList();
    }
    public void a(a$b p0){
       super();
       this.b = false;
       this.c = Thread.getDefaultUncaughtExceptionHandler();
       k1.a(p0);
       this.a = p0;
       a.b();
       this.f();
    }
    public static void a(a p0){
       p0.e();
       throw null;
    }
    public static void b(){
       if (PatchProxy.applyVoid(null, null, a.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, null, r1.class, "1")) {
          a.h(y.a);
       }
       if (!PatchProxy.applyVoid(null, null, j.class, "2")) {
          a.h(b.a);
       }
       if (!PatchProxy.applyVoid(null, null, b.class, "1")) {
          a.h(a.a);
       }
       return;
    }
    private void e(){
       try{
          while (true) {
             Looper.loop();
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
          if (!this.i(e0)) {
          label_000f :
             throw e0;
          }
       }
    }
    public static void h(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       c.C().w("GifshowUncaughtHandler", "Register on crash listeners: "+p0, objArray);
       a.e.add(p0);
       return;
    }
    public final boolean c(Throwable p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0.getMessage() != null && (("RemoteServiceException").equals(p0.getClass().getSimpleName()) && ((p0.getMessage()).contains("Bad notification") || (p0.getMessage()).contains("startForegroundService"))))? true: false;
       if (b) {
          CrashMonitor.handleException(p0, new JavaExceptionMessage(), ExceptionHandler$ExceptionType.FAKE_EXCEPTION_RANDOM);
       }
       return b;
    }
    public final boolean d(Thread p0,Throwable p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p1 instanceof NullPointerException && (p0.getName()).contains("push_client_thread")) {
          StackTraceElement[] stackTrace = p1.getStackTrace();
          int len = stackTrace.length;
          int i = 0;
          while (i < len) {
             String className = stackTrace[i].getClassName();
             if (!TextUtils.x(className) && (className.startsWith("com.vivo.vms.IPCInvoke") || className.startsWith("com.vivo.push.util.t"))) {
                return true;
             }
             i = i + 1;
          }
       }
       return false;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       a.d.postAtFrontOfQueue(new d(this));
       return;
    }
    public final boolean g(Throwable p0){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       JavaExceptionMessage obj = PatchProxy.applyOneRefs(p0, this, a.class, "8");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (SystemUtil.L(a.b())) {
          obj = new JavaExceptionMessage();
          _monitor_enter(a.class);
          Object obj1 = null;
          HashSet obj2 = PatchProxy.applyTwoRefs(p0, obj, obj1, a.class, "2");
          if (obj2 != patchProxyRe) {
             b1 = obj2.booleanValue();
             _monitor_exit(a.class);
          }else if(a.b > 10 || a.b(p0)){
             _monitor_exit(a.class);
             b1 = false;
          }else {
             obj2 = PatchProxy.applyOneRefs(p0, obj1, a.class, "3");
             if (obj2 != patchProxyRe) {
             }else {
                StackTraceElement[] stackTrace = p0.getStackTrace();
                obj2 = new HashSet();
                int len = stackTrace.length;
                for (int i = 0; i < len; i = i + 1) {
                   obj2.add(stackTrace[i].getClassName());
                }
             }
             patchProxyRe = (c$b.a.b(obj2) || d$b.a.b(obj2))? 1: 0;
             if (patchProxyRe) {
                a.b = a.b + 1;
                CrashMonitor.handleException(p0, obj, ExceptionHandler$ExceptionType.FAKE_EXCEPTION);
             }
             _monitor_exit(a.class);
             b1 = patchProxyRe;
          }
          if (b1) {
             b = true;
          }
       }
       return b;
    }
    public final boolean i(Throwable p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (Looper.myLooper() != Looper.getMainLooper()) {
          throw new UnsupportedOperationException("Work thread crash should not be here!");
       }
       boolean b = false;
       if (!SystemUtil.R()) {
          return b;
       }
       if (this.a.a() && (this.c(p0) || this.g(p0))) {
          b = true;
       }
       return b;
    }
    public final boolean j(Throwable p0){
       String obj = PatchProxy.applyOneRefs(p0, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!SystemUtil.P()) {
          return b;
       }
       if (p0 instanceof ClassCastException) {
          obj = p0.getMessage();
          if (!TextUtils.x(obj) && obj.contains("cannot be cast to java.lang.Object[]")) {
             StackTraceElement[] stackTrace = p0.getStackTrace();
             if (stackTrace.length > 0) {
                String className = stackTrace[b].getClassName();
                if (!TextUtils.x(className) && className.startsWith("androidx.collection.ArraySet")) {
                   b = true;
                }
             }
          }
       }
       return b;
    }
    public final boolean k(Thread p0,Throwable p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (Looper.myLooper() == Looper.getMainLooper()) {
          return b;
       }
       try{
          if (this.d(p0, p1) || (SystemUtil.R() && this.g(p1))) {
             b = true;
          }
          return b;
       }catch(java.lang.Exception e4){
          e4.printStackTrace();
          return b;
       }
    }
    public void uncaughtException(Thread p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "4")) {
          return;
       }
       if (this.j(p1) || this.k(p0, p1)) {
          return;
       }
       if (this.b != null) {
          return;
       }
       this.b = true;
       if (!a.c()) {
          RecycledBitmapExceptionTracker c = RecycledBitmapExceptionTracker.c;
          Objects.requireNonNull(c);
          if (!PatchProxy.applyVoidOneRefs(p1, c, RecycledBitmapExceptionTracker.class, "7")) {
             a.p(p1, "t");
             if (h.i()) {
                c.b(p1);
                c.a(p1);
             }
          }
          if (!PatchProxy.applyVoidOneRefs(p1, null, a.class, "14")) {
             a.g(p1);
          }
          CrashMonitor.handleException(p1, new JavaExceptionMessage(), ExceptionHandler$ExceptionType.CRASH);
       }
       Iterator iterator = a.e.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0, p1);
       }
       a tc = this.c;
       if (tc != null) {
          tc.uncaughtException(p0, p1);
       }
       return;
    }
}

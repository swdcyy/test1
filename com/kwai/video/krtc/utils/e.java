package com.kwai.video.krtc.utils.e;
import android.os.Handler;
import java.util.concurrent.Callable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Looper;
import java.lang.Thread;
import java.lang.RuntimeException;
import java.lang.Throwable;
import com.kwai.video.krtc.utils.e$b;
import com.kwai.video.krtc.utils.e$a;
import java.util.concurrent.CountDownLatch;
import com.kwai.video.krtc.utils.e$2;
import java.lang.Runnable;
import java.lang.StackTraceElement;
import java.lang.Exception;
import com.kwai.video.krtc.utils.e$3;
import com.kwai.video.krtc.utils.e$c;
import com.kwai.video.krtc.utils.e$1;
import java.lang.Long;
import java.lang.Boolean;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import java.lang.System;

public class e	// class@0008cb
{

    public static Object a(Handler p0,Callable p1){
       e$b obj = PatchProxy.applyTwoRefs(p0, p1, null, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.getLooper().getThread() == Thread.currentThread()) {
          return p1.call();
       }
       obj = new e$b();
       e$a uoa = new e$a();
       CountDownLatch uCountDownLa = new CountDownLatch(1);
       p0.post(new e$2(obj, p1, uoa, uCountDownLa));
       e.a(uCountDownLa);
       if (uoa.a == null) {
          return obj.a;
       }
       RuntimeException runtimeExcep = new RuntimeException(uoa.a);
       runtimeExcep.setStackTrace(e.a(uoa.a.getStackTrace(), runtimeExcep.getStackTrace()));
       throw runtimeExcep;
    }
    public static void a(Handler p0,Runnable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, e.class, "5")) {
          return;
       }
       e.a(p0, new e$3(p1));
       return;
    }
    public static void a(e$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, e.class, "1")) {
          return;
       }
       int i = 0;
       try{
       label_000d :
          p0.a();
          if (i) {
             Thread.currentThread().interrupt();
          }
          return;
       }catch(java.lang.InterruptedException e0){
          i = 1;
          goto label_000d ;
       }
    }
    public static void a(CountDownLatch p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, e.class, "2")) {
          return;
       }
       e.a(new e$1(p0));
       return;
    }
    public static boolean a(CountDownLatch p0,long p1){
       boolean b;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), null, uoe, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       SystemClock.elapsedRealtime();
       long l = p1;
       int i = 0;
       try{
       label_0025 :
          b = p0.await(l, TimeUnit.MILLISECONDS);
       }catch(java.lang.InterruptedException e0){
          i = 1;
          l = SystemClock.elapsedRealtime() - e0;
          l = p1 - l;
          if (l - null <= 0) {
          }else {
             goto label_0025 ;
          }
       }
       if (i) {
          Thread.currentThread().interrupt();
       }
       return b;
    }
    public static StackTraceElement[] a(StackTraceElement[] p0,StackTraceElement[] p1){
       StackTraceElement[] obj = PatchProxy.applyTwoRefs(p0, p1, null, e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new StackTraceElement[(p0.length + p1.length)];
       System.arraycopy(p0, 0, obj, 0, p0.length);
       System.arraycopy(p1, 0, obj, p0.length, p1.length);
       return obj;
    }
}

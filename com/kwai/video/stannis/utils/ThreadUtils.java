package com.kwai.video.stannis.utils.ThreadUtils;
import java.lang.Object;
import java.util.concurrent.CountDownLatch;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.utils.ThreadUtils$2;
import com.kwai.video.stannis.utils.ThreadUtils$BlockingOperation;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import java.lang.Thread;
import android.os.Looper;
import java.lang.IllegalStateException;
import java.lang.StackTraceElement;
import java.lang.System;
import android.os.Handler;
import java.util.concurrent.Callable;
import java.lang.RuntimeException;
import java.lang.Throwable;
import com.kwai.video.stannis.utils.ThreadUtils$1Result;
import com.kwai.video.stannis.utils.ThreadUtils$1CaughtException;
import com.kwai.video.stannis.utils.ThreadUtils$4;
import java.lang.Runnable;
import java.lang.Exception;
import com.kwai.video.stannis.utils.ThreadUtils$5;
import com.kwai.video.stannis.utils.ThreadUtils$1;
import com.kwai.video.stannis.utils.ThreadUtils$3;

public class ThreadUtils	// class@000c8c
{

    public void ThreadUtils(){
       super();
    }
    public static void awaitUninterruptibly(CountDownLatch p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, ThreadUtils.class, "5")) {
          return;
       }
       ThreadUtils.executeUninterruptibly(new ThreadUtils$2(p0));
       return;
    }
    public static boolean awaitUninterruptibly(CountDownLatch p0,long p1){
       boolean b;
       ThreadUtils threadUtils = ThreadUtils.class;
       if (PatchProxy.isSupport(threadUtils)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), null, threadUtils, "6");
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
    public static void checkIsOnMainThread(){
       if (PatchProxy.applyVoid(null, null, ThreadUtils.class, "1")) {
          return;
       }
       if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
          return;
       }
       throw new IllegalStateException("Not on main thread!");
    }
    public static StackTraceElement[] concatStackTraces(StackTraceElement[] p0,StackTraceElement[] p1){
       StackTraceElement[] obj = PatchProxy.applyTwoRefs(p0, p1, null, ThreadUtils.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new StackTraceElement[(p0.length + p1.length)];
       System.arraycopy(p0, 0, obj, 0, p0.length);
       System.arraycopy(p1, 0, obj, p0.length, p1.length);
       return obj;
    }
    public static void executeUninterruptibly(ThreadUtils$BlockingOperation p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, ThreadUtils.class, "2")) {
          return;
       }
       int i = 0;
       try{
       label_000d :
          p0.run();
          if (i) {
             Thread.currentThread().interrupt();
          }
          return;
       }catch(java.lang.InterruptedException e0){
          i = 1;
          goto label_000d ;
       }
    }
    public static Object invokeAtFrontUninterruptibly(Handler p0,Callable p1){
       ThreadUtils$1Result obj = PatchProxy.applyTwoRefs(p0, p1, null, ThreadUtils.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.getLooper().getThread() == Thread.currentThread()) {
          return p1.call();
       }
       obj = new ThreadUtils$1Result();
       ThreadUtils$1CaughtException u1CaughtExce = new ThreadUtils$1CaughtException();
       CountDownLatch uCountDownLa = new CountDownLatch(1);
       p0.post(new ThreadUtils$4(obj, p1, u1CaughtExce, uCountDownLa));
       ThreadUtils.awaitUninterruptibly(uCountDownLa);
       if (u1CaughtExce.e == null) {
          return obj.value;
       }
       RuntimeException runtimeExcep = new RuntimeException(u1CaughtExce.e);
       runtimeExcep.setStackTrace(ThreadUtils.concatStackTraces(u1CaughtExce.e.getStackTrace(), runtimeExcep.getStackTrace()));
       throw runtimeExcep;
    }
    public static void invokeAtFrontUninterruptibly(Handler p0,Runnable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, ThreadUtils.class, "9")) {
          return;
       }
       ThreadUtils.invokeAtFrontUninterruptibly(p0, new ThreadUtils$5(p1));
       return;
    }
    public static void joinUninterruptibly(Thread p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, ThreadUtils.class, "4")) {
          return;
       }
       ThreadUtils.executeUninterruptibly(new ThreadUtils$1(p0));
       return;
    }
    public static boolean joinUninterruptibly(Thread p0,long p1){
       ThreadUtils threadUtils = ThreadUtils.class;
       if (PatchProxy.isSupport(threadUtils)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), null, threadUtils, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       SystemClock.elapsedRealtime();
       long l = p1;
    label_0025 :
       if (l > 0) {
          try{
             p0.join(l);
          }catch(java.lang.InterruptedException e0){
             l = SystemClock.elapsedRealtime() - e0;
             l = p1 - l;
             int i = 1;
             goto label_0025 ;
          }
       }
       if (0) {
          Thread.currentThread().interrupt();
       }
       return (p0.isAlive() ^ 1);
    }
    public static void waitUninterruptibly(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, ThreadUtils.class, "7")) {
          return;
       }
       ThreadUtils.executeUninterruptibly(new ThreadUtils$3(p0));
       return;
    }
}

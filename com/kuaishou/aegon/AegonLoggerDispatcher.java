package com.kuaishou.aegon.AegonLoggerDispatcher;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.lang.Object;
import java.util.concurrent.Executor;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import bo.t;
import java.util.Iterator;
import bo.m;
import bo.o;
import java.lang.Runnable;
import com.kuaishou.aegon.AegonRequestFinishedInfo;
import bo.n;

public class AegonLoggerDispatcher	// class@0005d8
{
    public static ConcurrentLinkedQueue a;
    public static Executor b;

    static {
       AegonLoggerDispatcher.a = new ConcurrentLinkedQueue();
       AegonLoggerDispatcher.b = null;
    }
    public void AegonLoggerDispatcher(){
       super();
    }
    public static Executor a(){
       Executor obj = PatchProxy.apply(null, null, AegonLoggerDispatcher.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = AegonLoggerDispatcher.b;
       if (obj != null) {
          return obj;
       }
       _monitor_enter(AegonLoggerDispatcher.class);
       if (AegonLoggerDispatcher.b == null) {
          AegonLoggerDispatcher.b = Executors.newSingleThreadExecutor();
       }
       _monitor_exit(AegonLoggerDispatcher.class);
       return AegonLoggerDispatcher.b;
    }
    public static void onConnectionStats(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, AegonLoggerDispatcher.class, "4")) {
          return;
       }
       t.c("AegonLogger", p0);
       if (AegonLoggerDispatcher.a.isEmpty()) {
          return;
       }
       Executor uExecutor = AegonLoggerDispatcher.a();
       Iterator iterator = AegonLoggerDispatcher.a.iterator();
       while (iterator.hasNext()) {
          uExecutor.execute(new o(iterator.next(), p0));
       }
       return;
    }
    public static void onRequestFinished(AegonRequestFinishedInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, AegonLoggerDispatcher.class, "5")) {
          return;
       }
       if (AegonLoggerDispatcher.a.isEmpty()) {
          return;
       }
       Executor uExecutor = AegonLoggerDispatcher.a();
       Iterator iterator = AegonLoggerDispatcher.a.iterator();
       while (iterator.hasNext()) {
          uExecutor.execute(new n(iterator.next(), p0));
       }
       return;
    }
}

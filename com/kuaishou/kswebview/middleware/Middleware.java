package com.kuaishou.kswebview.middleware.Middleware;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.aegon.Aegon;
import java.lang.System;
import java.lang.IllegalStateException;

public class Middleware	// class@00092d
{
    public static AtomicBoolean a;
    public static Object b;

    static {
       Middleware.a = new AtomicBoolean();
       Middleware.b = new Object();
    }
    public void Middleware(){
       super();
    }
    public static long a(){
       Middleware middleware = Middleware.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, objArray, middleware, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (!PatchProxy.applyVoid(objArray, objArray, middleware, "2") && !Middleware.a.get()) {
          Object b = Middleware.b;
          _monitor_enter(b);
          if (!Middleware.a.get()) {
             if (Aegon.f()) {
                System.loadLibrary("kswebview-middleware");
                Middleware.a.set(true);
             }else {
                throw new IllegalStateException("kswebview httpdns aegon not initialized");
             }
          }
          _monitor_exit(b);
       }
       return Middleware.nativeGetHttpDnsFunctionTable();
    }
    public static native long nativeGetHttpDnsFunctionTable();
}

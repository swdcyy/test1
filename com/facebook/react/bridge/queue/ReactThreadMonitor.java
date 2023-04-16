package com.facebook.react.bridge.queue.ReactThreadMonitor;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class ReactThreadMonitor	// class@001257
{
    public static AtomicInteger mJSThreadCount;
    public static AtomicInteger mNativeModuleThreadCount;

    static {
       ReactThreadMonitor.mJSThreadCount = new AtomicInteger(0);
       ReactThreadMonitor.mNativeModuleThreadCount = new AtomicInteger(0);
    }
    public void ReactThreadMonitor(){
       super();
    }
    public static void decrease(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, ReactThreadMonitor.class, "2")) {
          return;
       }
       Objects.requireNonNull(p0);
       if (!p0.equals("native_modules")) {
          if (p0.equals("js")) {
             ReactThreadMonitor.mJSThreadCount.decrementAndGet();
          }
       }else {
          ReactThreadMonitor.mNativeModuleThreadCount.decrementAndGet();
       }
       return;
    }
    public static int get(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ReactThreadMonitor.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Objects.requireNonNull(p0);
       if (p0.equals("native_modules")) {
          return ReactThreadMonitor.mNativeModuleThreadCount.get();
       }
       if (!p0.equals("js")) {
          return -1;
       }
       return ReactThreadMonitor.mJSThreadCount.get();
    }
    public static void increase(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, ReactThreadMonitor.class, "1")) {
          return;
       }
       Objects.requireNonNull(p0);
       if (!p0.equals("native_modules")) {
          if (p0.equals("js")) {
             ReactThreadMonitor.mJSThreadCount.incrementAndGet();
          }
       }else {
          ReactThreadMonitor.mNativeModuleThreadCount.incrementAndGet();
       }
       return;
    }
}

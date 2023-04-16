package com.facebook.react.bridge.CatalystInstanceImpl$2;
import java.lang.Runnable;
import com.facebook.react.bridge.CatalystInstanceImpl;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.JSIModuleRegistry;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;

public class CatalystInstanceImpl$2 implements Runnable	// class@0011a8
{
    public final CatalystInstanceImpl this$0;

    public void CatalystInstanceImpl$2(CatalystInstanceImpl p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, CatalystInstanceImpl$2.class, "1")) {
          return;
       }
       this.this$0.mNativeModuleRegistry.notifyJSInstanceDestroy();
       this.this$0.mJSIModuleRegistry.notifyJSInstanceDestroy();
       int i = 0;
       if (!this.this$0.mPendingJSCalls.getAndSet(i)) {
          i = 1;
       }
       if (!this.this$0.mBridgeIdleListeners.isEmpty()) {
          Iterator iterator = this.this$0.mBridgeIdleListeners.iterator();
          while (iterator.hasNext()) {
             NotThreadSafeBridgeIdleDebugListener notThreadSaf = iterator.next();
             if (!i) {
                notThreadSaf.onTransitionToBridgeIdle();
             }
             notThreadSaf.onBridgeDestroyed();
          }
       }
       this.this$0.mNativeModulesThreadDestructionComplete = true;
       return;
    }
}

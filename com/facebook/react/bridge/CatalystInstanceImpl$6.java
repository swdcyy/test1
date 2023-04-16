package com.facebook.react.bridge.CatalystInstanceImpl$6;
import java.lang.Runnable;
import com.facebook.react.bridge.CatalystInstanceImpl;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;

public class CatalystInstanceImpl$6 implements Runnable	// class@0011ac
{
    public final CatalystInstanceImpl this$0;

    public void CatalystInstanceImpl$6(CatalystInstanceImpl p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, CatalystInstanceImpl$6.class, "1")) {
          return;
       }
       Iterator iterator = this.this$0.mBridgeIdleListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().onTransitionToBridgeIdle();
       }
       return;
    }
}

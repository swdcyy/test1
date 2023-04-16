package com.facebook.react.bridge.CatalystInstanceImpl$1;
import java.lang.Runnable;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.CatalystInstance$DestroyFinishedCallback;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import cb.a;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.bridge.CatalystInstanceImpl$1$1;

public class CatalystInstanceImpl$1 implements Runnable	// class@0011a7
{
    public final CatalystInstanceImpl this$0;
    public final CatalystInstance$DestroyFinishedCallback val$callback;

    public void CatalystInstanceImpl$1(CatalystInstanceImpl p0,CatalystInstance$DestroyFinishedCallback p1){
       this.this$0 = p0;
       this.val$callback = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, CatalystInstanceImpl$1.class, "1")) {
          return;
       }
       a.x("ReactNativeDestroy", "Catalyst runOnNativeModuleThread1 "+this.this$0.hashCode());
       this.this$0.getReactQueueConfiguration().getJSQueueThread().runOnQueue(new CatalystInstanceImpl$1$1(this));
       return;
    }
}

package com.facebook.react.bridge.CatalystInstanceImpl$1$1$1;
import java.lang.Runnable;
import com.facebook.react.bridge.CatalystInstanceImpl$1$1;
import java.lang.Object;
import com.facebook.react.bridge.CatalystInstance$DestroyFinishedCallback;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.CatalystInstanceImpl$1;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import java.lang.StringBuilder;
import cb.a;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactMarker;
import td.i;
import com.facebook.react.bridge.UiThreadUtil;

public class CatalystInstanceImpl$1$1$1 implements Runnable	// class@0011a5
{
    public final CatalystInstanceImpl$1$1 this$2;

    public void CatalystInstanceImpl$1$1$1(CatalystInstanceImpl$1$1 p0){
       this.this$2 = p0;
       super();
    }
    public static void lambda$run$0(CatalystInstance$DestroyFinishedCallback p0){
       p0.onDestroyFinished();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, CatalystInstanceImpl$1$1$1.class, "1")) {
          return;
       }
       this.this$2.this$1.this$0.mJavaScriptContextHolder.clear();
       this.this$2.this$1.this$0.mHybridData.a();
       this.this$2.this$1.this$0.getReactQueueConfiguration().destroy();
       a.x("ReactNativeDestroy", "CatalystInstanceImpl.destroy\(\) end, instanceKey: "+this.this$2.this$1.this$0.hashCode());
       ReactMarker.logMarker(ReactMarkerConstants.DESTROY_CATALYST_INSTANCE_END, this.this$2.this$1.this$0.hashCode());
       this.this$2.this$1.this$0.mFinishDestroyed = true;
       CatalystInstanceImpl$1 val$callback = this.this$2.this$1.val$callback;
       if (val$callback != null) {
          UiThreadUtil.runOnUiThread(new i(val$callback));
       }
       return;
    }
}

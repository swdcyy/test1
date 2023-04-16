package com.kuaishou.krn.bridges.app.KrnAppStateModule$getMemoryInfo$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.krn.bridges.app.KrnAppStateModule;
import com.facebook.react.bridge.Callback;
import java.lang.Object;
import android.app.ActivityManager$MemoryInfo;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import com.kuaishou.krn.base.KrnBridge;

public final class KrnAppStateModule$getMemoryInfo$1 extends Lambda implements l	// class@000807
{
    public final Callback $callback;
    public final KrnAppStateModule this$0;

    public void KrnAppStateModule$getMemoryInfo$1(KrnAppStateModule p0,Callback p1){
       this.this$0 = p0;
       this.$callback = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(ActivityManager$MemoryInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnAppStateModule$getMemoryInfo$1.class, "1")) {
          return;
       }
       WritableMap writableMap = Arguments.createMap();
       if (p0 != null) {
          writableMap.putDouble("totalMemMB", (double)p0.totalMem);
          writableMap.putDouble("availMemMB", (double)p0.availMem);
          writableMap.putDouble("thresholdMB", (double)p0.threshold);
          writableMap.putBoolean("isLowMemory", p0.lowMemory);
       }
       this.this$0.callbackToJS(this.$callback, writableMap);
       return;
    }
}

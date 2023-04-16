package com.kuaishou.krn.bridges.app.KrnAppStateModule$mMemoryEventListener$2$a;
import android.content.ComponentCallbacks2;
import com.kuaishou.krn.bridges.app.KrnAppStateModule$mMemoryEventListener$2;
import java.lang.Object;
import android.content.res.Configuration;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import com.kuaishou.krn.log.sample.KdsMemoryWarningSampler;
import hi0.b;
import java.util.Objects;
import java.util.List;
import com.kuaishou.krn.bridges.app.KrnAppStateModule;
import java.lang.ref.WeakReference;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import com.kuaishou.krn.NativeToJsKt;
import lj0.c;
import lj0.d;

public final class KrnAppStateModule$mMemoryEventListener$2$a implements ComponentCallbacks2	// class@000808
{
    public final KrnAppStateModule$mMemoryEventListener$2 b;

    public void KrnAppStateModule$mMemoryEventListener$2$a(KrnAppStateModule$mMemoryEventListener$2 p0){
       this.b = p0;
       super();
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnAppStateModule$mMemoryEventListener$2$a.class, "1")) {
          return;
       }
       a.p(p0, "newConfig");
       return;
    }
    public void onLowMemory(){
    }
    public void onTrimMemory(int p0){
       if (PatchProxy.isSupport(KrnAppStateModule$mMemoryEventListener$2$a.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, KrnAppStateModule$mMemoryEventListener$2$a.class, "2")) {
          return;
       }
       if (KdsMemoryWarningSampler.d.d()) {
          b c = b.c;
          Objects.requireNonNull(c);
          if (b.a.contains(Integer.valueOf(p0))) {
             ReactContext reactContext = this.b.this$0.weakApplicationContext.get();
             if (reactContext != null && reactContext.hasActiveCatalystInstance()) {
                NativeToJsKt.e(reactContext, "kdsMemoryWarning", Arguments.createMap());
                c.a(d.a(reactContext), "RUNNING", "SYSTEM");
             }
          }
       }
       return;
    }
}

package com.kuaishou.krn.instance.KrnReactInstanceExtKt$startWatchingInstanceAsync$1;
import java.lang.Runnable;
import sj0.b;
import java.lang.ref.WeakReference;
import java.lang.Object;
import com.facebook.react.uimanager.UIManagerModule;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.a;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import java.util.Map;
import com.kuaishou.krn.instance.KrnReactInstanceState;
import java.lang.Enum;
import java.lang.Integer;
import com.kuaishou.krn.apm.memory.KdsLeakDetector;
import com.kuaishou.krn.instance.KrnReactInstanceExtKt$startWatchingInstanceAsync$1$1;
import msd.l;
import com.facebook.react.bridge.ReactContext;
import com.kuaishou.krn.instance.KrnReactInstanceExtKt$startWatchingInstanceAsync$1$$special$$inlined$let$lambda$1;
import com.kuaishou.krn.instance.KrnReactInstanceExtKt$startWatchingInstanceAsync$1$2$2;
import java.util.Set;
import java.util.Iterator;
import ze.v;
import com.kuaishou.krn.experiment.ExpConfigKt;
import java.util.Objects;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.CatalystInstance;
import com.kuaishou.krn.instance.KrnReactInstanceExtKt$startWatchingInstanceAsync$1$$special$$inlined$let$lambda$2;
import com.kuaishou.krn.instance.KrnReactInstanceExtKt$startWatchingInstanceAsync$1$3$2;
import com.facebook.react.bridge.NativeModule;
import com.kuaishou.krn.instance.KrnReactInstanceExtKt$startWatchingInstanceAsync$1$$special$$inlined$let$lambda$3;

public final class KrnReactInstanceExtKt$startWatchingInstanceAsync$1 implements Runnable	// class@0008c8
{
    public final b b;
    public final WeakReference c;

    public void KrnReactInstanceExtKt$startWatchingInstanceAsync$1(b p0,WeakReference p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       UIManagerModule uIManagerMod = UIManagerModule.class;
       if (PatchProxy.applyVoid(null, this, KrnReactInstanceExtKt$startWatchingInstanceAsync$1.class, "1")) {
          return;
       }
       a uoa = this.c.get();
       if (uoa != null) {
          a.o(uoa, "reactInstanceManagerWeak\x20\x02.get\(\) ?: return@Runnable\x00");
          HashMap hashMap = new HashMap();
          hashMap.put("BundleId", this.b.e());
          hashMap.put("State", Integer.valueOf(this.b.j().ordinal()));
          hashMap.put("InstanceKey", Integer.valueOf(this.b.hashCode()));
          KdsLeakDetector g = KdsLeakDetector.g;
          KdsLeakDetector.d(g, uoa, new KrnReactInstanceExtKt$startWatchingInstanceAsync$1$1(hashMap), 5000, null, 8, null);
          ReactContext reactContext = uoa.n();
          if (reactContext != null) {
             g.c(reactContext, new KrnReactInstanceExtKt$startWatchingInstanceAsync$1$$special$$inlined$let$lambda$1(hashMap, 5000), 5000, KrnReactInstanceExtKt$startWatchingInstanceAsync$1$2$2.INSTANCE);
          }
          Iterator iterator = uoa.m().iterator();
          while (iterator.hasNext()) {
             v ov = iterator.next();
             if (ExpConfigKt.i()) {
                Objects.requireNonNull(ov, "null cannot be cast to non-null type com.facebook.react.ReactRootView");
                ov.H = KdsLeakDetector.g.a();
             }
             a.o(ov, "reactRootView");
             KdsLeakDetector.g.f(ov, hashMap, 5000);
          }
          ReactContext reactContext1 = uoa.n();
          if (reactContext1 != null) {
             CatalystInstance catalystInst = reactContext1.getCatalystInstance();
             if (catalystInst != null) {
                KdsLeakDetector.g.c(catalystInst, new KrnReactInstanceExtKt$startWatchingInstanceAsync$1$$special$$inlined$let$lambda$2(hashMap, 5000), 5000, KrnReactInstanceExtKt$startWatchingInstanceAsync$1$3$2.INSTANCE);
             }
          }
          reactContext1 = uoa.n();
          if (reactContext1 != null) {
             CatalystInstance catalystInst1 = reactContext1.getCatalystInstance();
             if (catalystInst1 != null && catalystInst1.hasNativeModule(uIManagerMod) == true) {
                ReactContext reactContext2 = uoa.n();
                if (reactContext2 != null) {
                   NativeModule nativeModule = reactContext2.getNativeModule(uIManagerMod);
                   if (nativeModule != null) {
                      KdsLeakDetector.d(KdsLeakDetector.g, nativeModule, new KrnReactInstanceExtKt$startWatchingInstanceAsync$1$$special$$inlined$let$lambda$3(hashMap, 5000), 5000, null, 8, null);
                   }
                }
             }
          }
       }
    label_00f7 :
       return;
    }
}

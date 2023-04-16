package com.kuaishou.krn.instance.KrnReactInstanceExtKt$startWatchingInstanceAsync$1$2$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.facebook.react.bridge.ReactContext;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class KrnReactInstanceExtKt$startWatchingInstanceAsync$1$2$2 extends Lambda implements l	// class@0008c6
{
    public static final KrnReactInstanceExtKt$startWatchingInstanceAsync$1$2$2 INSTANCE;

    static {
       KrnReactInstanceExtKt$startWatchingInstanceAsync$1$2$2.INSTANCE = new KrnReactInstanceExtKt$startWatchingInstanceAsync$1$2$2();
    }
    public void KrnReactInstanceExtKt$startWatchingInstanceAsync$1$2$2(){
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(ReactContext p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KrnReactInstanceExtKt$startWatchingInstanceAsync$1$2$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "_reactContext");
       return p0.hasCatalystInstance();
    }
}

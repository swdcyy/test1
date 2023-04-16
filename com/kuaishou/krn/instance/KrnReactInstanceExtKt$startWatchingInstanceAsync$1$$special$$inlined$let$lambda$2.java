package com.kuaishou.krn.instance.KrnReactInstanceExtKt$startWatchingInstanceAsync$1$$special$$inlined$let$lambda$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.util.HashMap;
import java.lang.Object;
import com.facebook.react.bridge.CatalystInstance;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import java.lang.Boolean;

public final class KrnReactInstanceExtKt$startWatchingInstanceAsync$1$$special$$inlined$let$lambda$2 extends Lambda implements l	// class@0008c3
{
    public final HashMap $commonDescription$inlined;
    public final long $waitUntilRetain$inlined;

    public void KrnReactInstanceExtKt$startWatchingInstanceAsync$1$$special$$inlined$let$lambda$2(HashMap p0,long p1){
       this.$commonDescription$inlined = p0;
       this.$waitUntilRetain$inlined = p1;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final Map invoke(CatalystInstance p0){
       HashMap obj = PatchProxy.applyOneRefsWithListener(p0, this, KrnReactInstanceExtKt$startWatchingInstanceAsync$1$$special$$inlined$let$lambda$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "_catalystInstance");
       obj = new HashMap(this.$commonDescription$inlined);
       obj.put("Name", "Catalyst");
       obj.put("Id", Integer.valueOf(p0.hashCode()));
       obj.put("IsDestroyed", Boolean.valueOf(p0.isDestroyed()));
       PatchProxy.onMethodExit(KrnReactInstanceExtKt$startWatchingInstanceAsync$1$$special$$inlined$let$lambda$2.class, "1");
       return obj;
    }
}

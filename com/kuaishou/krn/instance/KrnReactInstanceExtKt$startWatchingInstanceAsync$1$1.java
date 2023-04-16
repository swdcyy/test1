package com.kuaishou.krn.instance.KrnReactInstanceExtKt$startWatchingInstanceAsync$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.util.HashMap;
import java.lang.Object;
import com.facebook.react.a;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Integer;

public final class KrnReactInstanceExtKt$startWatchingInstanceAsync$1$1 extends Lambda implements l	// class@0008c5
{
    public final HashMap $commonDescription;

    public void KrnReactInstanceExtKt$startWatchingInstanceAsync$1$1(HashMap p0){
       this.$commonDescription = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final Map invoke(a p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, KrnReactInstanceExtKt$startWatchingInstanceAsync$1$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "_reactInstanceManager");
       obj = new HashMap(this.$commonDescription);
       obj.put("Name", "ReactInstanceManager");
       obj.put("Id", Integer.valueOf(p0.hashCode()));
       return obj;
    }
}

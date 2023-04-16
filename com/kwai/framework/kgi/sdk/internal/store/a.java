package com.kwai.framework.kgi.sdk.internal.store.a;
import com.kwai.framework.kgi.sdk.internal.store.EvictingQueue;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class a	// class@0015a3
{

    public static final boolean a(EvictingQueue p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "$this$addIfAbsent");
       if (p0.contains(p1)) {
          return false;
       }
       return p0.add(p1);
    }
}

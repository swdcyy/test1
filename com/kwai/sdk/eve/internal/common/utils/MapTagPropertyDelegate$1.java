package com.kwai.sdk.eve.internal.common.utils.MapTagPropertyDelegate$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import en7.t;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.concurrent.ConcurrentHashMap;
import java.util.LinkedHashMap;

public final class MapTagPropertyDelegate$1 extends Lambda implements l	// class@0014a4
{
    public final boolean $sync;

    public void MapTagPropertyDelegate$1(boolean p0){
       this.$sync = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final Map invoke(t p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MapTagPropertyDelegate$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       ConcurrentHashMap uConcurrentH = (this.$sync != null)? new ConcurrentHashMap(): new LinkedHashMap();
       return uConcurrentH;
    }
}

package com.kwai.poi.base.debuglog.PoiDebugLog$KPoiDebugLog$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.poi.base.debuglog.PoiDebugLog$KPoiDebugLog$2$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PoiDebugLog$KPoiDebugLog$2 extends Lambda implements a	// class@0013aa
{
    public static final PoiDebugLog$KPoiDebugLog$2 INSTANCE;

    static {
       PoiDebugLog$KPoiDebugLog$2.INSTANCE = new PoiDebugLog$KPoiDebugLog$2();
    }
    public void PoiDebugLog$KPoiDebugLog$2(){
       super(0);
    }
    public final PoiDebugLog$KPoiDebugLog$2$a invoke(){
       Object obj = PatchProxy.apply(null, this, PoiDebugLog$KPoiDebugLog$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PoiDebugLog$KPoiDebugLog$2$a("ks.poi.log", false);
    }
    public Object invoke(){
       return this.invoke();
    }
}

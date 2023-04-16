package com.kwai.poi.base.debuglog.PoiDebugLog;
import com.kwai.poi.base.debuglog.PoiDebugLog$KPoiDebugLog$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.poi.base.debuglog.PoiDebugLog$KPoiDebugLog$2$a;
import q87.c;
import com.kwai.robust.PatchProxyResult;

public final class PoiDebugLog	// class@0013ab
{
    public static final p a;
    public static final PoiDebugLog b;

    static {
       PoiDebugLog.b = new PoiDebugLog();
       PoiDebugLog.a = s.c(PoiDebugLog$KPoiDebugLog$2.INSTANCE);
    }
    public void PoiDebugLog(){
       super();
    }
    public static final void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, PoiDebugLog.class, "2")) {
          return;
       }
       a.p(p0, "info");
       Object[] objArray = new Object[0];
       PoiDebugLog.b.a().s("PoiDebugLog", p0, objArray);
       return;
    }
    public static final void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, PoiDebugLog.class, "3")) {
          return;
       }
       a.p(p0, "info");
       Object[] objArray = new Object[0];
       PoiDebugLog.b.a().t("PoiDebugLog", p0, objArray);
       return;
    }
    public final PoiDebugLog$KPoiDebugLog$2$a a(){
       Object obj = PatchProxy.apply(null, this, PoiDebugLog.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PoiDebugLog.a.getValue();
    }
}

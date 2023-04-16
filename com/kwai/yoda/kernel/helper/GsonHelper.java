package com.kwai.yoda.kernel.helper.GsonHelper;
import com.kwai.yoda.kernel.helper.GsonHelper$a;
import nsd.u;
import com.kwai.yoda.kernel.helper.GsonHelper$Companion$sGson$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class GsonHelper	// class@0012a5
{
    public static final p a;
    public static final GsonHelper$a b;

    static {
       GsonHelper.b = new GsonHelper$a(null);
       GsonHelper.a = s.c(GsonHelper$Companion$sGson$2.INSTANCE);
    }
    public void GsonHelper(){
       super();
    }
    public static final String a(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, GsonHelper.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GsonHelper.b.a(p0);
    }
}

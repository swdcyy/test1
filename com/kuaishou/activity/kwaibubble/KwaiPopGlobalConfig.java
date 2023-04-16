package com.kuaishou.activity.kwaibubble.KwaiPopGlobalConfig;
import com.kuaishou.activity.kwaibubble.KwaiPopGlobalConfig$testSchemeInvoker$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cpa.a;
import com.yxcorp.gifshow.growth.kwaibubble.tools.KwaiPopTestSchemeInvoker$registerTestScheme$1;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import msd.l;

public final class KwaiPopGlobalConfig	// class@000772
{
    public static i a;
    public static l b;
    public static final KwaiPopGlobalConfig c;

    static {
       KwaiPopGlobalConfig kwaiPopGloba = new KwaiPopGlobalConfig();
       KwaiPopGlobalConfig.c = kwaiPopGloba;
       KwaiPopGlobalConfig.b = KwaiPopGlobalConfig$testSchemeInvoker$1.INSTANCE;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, KwaiPopGlobalConfig.class, "4")) {
       }else if(PatchProxy.applyVoid(objArray, objArray, a.class, "1")){
          KwaiPopTestSchemeInvoker$registerTestScheme$1 iNSTANCE = KwaiPopTestSchemeInvoker$registerTestScheme$1.INSTANCE;
          Objects.requireNonNull(kwaiPopGloba);
          if (!PatchProxy.applyVoidOneRefs(iNSTANCE, kwaiPopGloba, KwaiPopGlobalConfig.class, "2")) {
             a.p(iNSTANCE, "invoker");
             KwaiPopGlobalConfig.b = iNSTANCE;
          }
       }
    }
    public void KwaiPopGlobalConfig(){
       super();
    }
    public final String a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiPopGlobalConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "bundleId");
       return KwaiPopGlobalConfig.b.invoke(p0);
    }
}

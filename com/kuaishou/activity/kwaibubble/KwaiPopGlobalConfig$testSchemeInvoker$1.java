package com.kuaishou.activity.kwaibubble.KwaiPopGlobalConfig$testSchemeInvoker$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import java.lang.Void;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class KwaiPopGlobalConfig$testSchemeInvoker$1 extends Lambda implements l	// class@000771
{
    public static final KwaiPopGlobalConfig$testSchemeInvoker$1 INSTANCE;

    static {
       KwaiPopGlobalConfig$testSchemeInvoker$1.INSTANCE = new KwaiPopGlobalConfig$testSchemeInvoker$1();
    }
    public void KwaiPopGlobalConfig$testSchemeInvoker$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final Void invoke(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiPopGlobalConfig$testSchemeInvoker$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "<anonymous parameter 0>");
       return null;
    }
}

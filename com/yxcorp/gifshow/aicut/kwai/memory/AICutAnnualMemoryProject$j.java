package com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject$j;
import erd.o;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import pr3.d;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.util.PostUtils;

public final class AICutAnnualMemoryProject$j implements o	// class@00195a
{
    public static final AICutAnnualMemoryProject$j b;

    static {
       AICutAnnualMemoryProject$j.b = new AICutAnnualMemoryProject$j();
    }
    public void AICutAnnualMemoryProject$j(){
       super();
    }
    public Object apply(Object p0){
       d uod = PatchProxy.applyOneRefs(p0, this, AICutAnnualMemoryProject$j.class, "1");
       if (uod != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          PostUtils.D("AICutAnnualMemoryProject", "changeStyle getExtraMedias", p0);
          uod = new d();
          uod.d(100);
       }
       return uod;
    }
}

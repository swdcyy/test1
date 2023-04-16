package com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject$t;
import erd.o;
import com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject;
import o69.n2;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import brd.t;

public final class AICutAnnualMemoryProject$t implements o	// class@001964
{
    public final AICutAnnualMemoryProject b;
    public final n2 c;

    public void AICutAnnualMemoryProject$t(AICutAnnualMemoryProject p0,n2 p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, AICutAnnualMemoryProject$t.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          ot = AICutAnnualMemoryProject.T0(this.b, this.c);
       }
       return ot;
    }
}

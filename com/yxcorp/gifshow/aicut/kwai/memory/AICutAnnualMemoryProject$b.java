package com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject$b;
import erd.o;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import qrd.l1;

public final class AICutAnnualMemoryProject$b implements o	// class@001951
{
    public final Integer[] b;

    public void AICutAnnualMemoryProject$b(Integer[] p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AICutAnnualMemoryProject$b.class, "1")) {
       }else {
          a.p(p0, "it");
          this.b[0] = p0;
       }
       return l1.a;
    }
}

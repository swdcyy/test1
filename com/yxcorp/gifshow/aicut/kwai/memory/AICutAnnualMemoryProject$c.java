package com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject$c;
import erd.o;
import java.lang.Integer;
import java.lang.Object;
import pr3.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import qrd.l1;

public final class AICutAnnualMemoryProject$c implements o	// class@001952
{
    public final Integer[] b;

    public void AICutAnnualMemoryProject$c(Integer[] p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AICutAnnualMemoryProject$c.class, "1")) {
       }else {
          a.p(p0, "it");
          this.b[1] = Integer.valueOf(p0.a());
       }
       return l1.a;
    }
}

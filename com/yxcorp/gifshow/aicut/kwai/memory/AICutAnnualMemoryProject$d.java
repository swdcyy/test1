package com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject$d;
import erd.o;
import java.lang.Integer;
import java.lang.Object;
import i79.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import qrd.l1;

public final class AICutAnnualMemoryProject$d implements o	// class@001953
{
    public final Integer[] b;

    public void AICutAnnualMemoryProject$d(Integer[] p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AICutAnnualMemoryProject$d.class, "1")) {
       }else {
          a.p(p0, "it");
          this.b[2] = Integer.valueOf(p0.a);
       }
       return l1.a;
    }
}

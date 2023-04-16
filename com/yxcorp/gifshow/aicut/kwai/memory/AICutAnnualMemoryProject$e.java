package com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject$e;
import erd.o;
import java.lang.Integer;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class AICutAnnualMemoryProject$e implements o	// class@001954
{
    public final Integer[] b;

    public void AICutAnnualMemoryProject$e(Integer[] p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       Integer integer = PatchProxy.applyOneRefs(p0, this, AICutAnnualMemoryProject$e.class, "1");
       if (integer != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          integer = Integer.valueOf((int)((((double)this.b[0].intValue() * 0x3fe999999999999a) + ((double)this.b[1].intValue() * 0x3fb999999999999a)) + ((double)this.b[2].intValue() * 0x3fb999999999999a)));
       }
       return integer;
    }
}

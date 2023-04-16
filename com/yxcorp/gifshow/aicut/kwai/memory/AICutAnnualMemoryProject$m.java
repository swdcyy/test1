package com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject$m;
import erd.o;
import com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject;
import o69.n2;
import java.lang.Object;
import o69.g1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import s69.i;
import java.util.List;
import java.lang.Long;
import java.lang.System;
import com.yxcorp.gifshow.aicut.kwai.memory.a;
import k69.e$a;
import k69.e;

public final class AICutAnnualMemoryProject$m implements o	// class@00195d
{
    public final AICutAnnualMemoryProject b;
    public final n2 c;

    public void AICutAnnualMemoryProject$m(AICutAnnualMemoryProject p0,n2 p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       AICutAnnualMemoryProject$m obj = PatchProxy.applyOneRefs(p0, this, AICutAnnualMemoryProject$m.class, "1");
       if (obj != PatchProxyResult.class) {
          p0 = obj;
       }else {
          a.p(p0, "it");
          obj = this.c;
          obj.i(i.a.d(100, obj.e(), 60));
          obj = this.c;
          obj.j(obj.c());
          this.c.b().add(Long.valueOf(0));
          this.c.k(System.currentTimeMillis());
          this.c.l(0);
          this.b.z(new a(this));
       }
       return p0;
    }
}

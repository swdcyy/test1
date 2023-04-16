package com.yxcorp.gifshow.aicut.kwai.memory.a;
import k69.e$a;
import com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject$m;
import java.lang.Object;
import i69.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o69.n2;

public final class a implements e$a	// class@001966
{
    public final AICutAnnualMemoryProject$m a;

    public void a(AICutAnnualMemoryProject$m p0){
       this.a = p0;
       super();
    }
    public void apply(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          p0.g(this.a.c.c());
       }
       return;
    }
}

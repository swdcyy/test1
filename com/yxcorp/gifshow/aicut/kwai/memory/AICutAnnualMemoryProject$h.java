package com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject$h;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import h69.g;
import q87.c;
import com.kwai.feature.post.api.feature.memory.MemoryLogger;
import ekd.k1;

public final class AICutAnnualMemoryProject$h implements g	// class@001957
{
    public final long b;

    public void AICutAnnualMemoryProject$h(long p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AICutAnnualMemoryProject$h.class, "1")) {
       }else {
          g.D().z("AICutAnnualMemoryProject", "changeStyle: ", p0);
          MemoryLogger b = MemoryLogger.b;
          long l = k1.t(this.b);
          p0 = p0.getMessage();
          if (p0 == null) {
             p0 = "";
          }
          b.a("editSwitchTemplate", true, l, p0);
       }
       return;
    }
}

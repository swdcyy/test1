package com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject$g;
import erd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import h69.g;
import q87.c;
import com.kwai.feature.post.api.feature.memory.MemoryLogger;
import ekd.k1;

public final class AICutAnnualMemoryProject$g implements a	// class@001956
{
    public final long b;

    public void AICutAnnualMemoryProject$g(long p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, AICutAnnualMemoryProject$g.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       g.D().w("AICutAnnualMemoryProject", "changeStyle: success over", objArray);
       MemoryLogger.b.a("editSwitchTemplate", true, k1.t(this.b), "");
       return;
    }
}

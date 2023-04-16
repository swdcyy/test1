package com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject$r;
import erd.g;
import com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject;
import java.lang.Object;
import o69.g1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;
import java.lang.Integer;
import java.util.Map;
import h69.g;
import java.lang.StringBuilder;
import q87.c;

public final class AICutAnnualMemoryProject$r implements g	// class@001962
{
    public final AICutAnnualMemoryProject b;

    public void AICutAnnualMemoryProject$r(AICutAnnualMemoryProject p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AICutAnnualMemoryProject$r.class, "1")) {
       }else {
          g1 c = p0.c;
          if (c != null && !this.b.d0.containsKey(c)) {
             this.b.d0.put(c, Integer.valueOf(p0.a()));
             Object[] objArray = new Object[0];
             g.D().w("AICutAnnualMemoryProject", "observableSDKAnalyzing: "+p0.a(), objArray);
          }
       }
       return;
    }
}

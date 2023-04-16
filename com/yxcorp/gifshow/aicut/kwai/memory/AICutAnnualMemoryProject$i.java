package com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject$i;
import erd.o;
import com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject;
import java.lang.Object;
import pr3.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.List;
import h69.g;
import q87.c;
import java.util.ArrayList;
import java.util.Collection;

public final class AICutAnnualMemoryProject$i implements o	// class@001958
{
    public final AICutAnnualMemoryProject b;

    public void AICutAnnualMemoryProject$i(AICutAnnualMemoryProject p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       d obj = PatchProxy.applyOneRefs(p0, this, AICutAnnualMemoryProject$i.class, "1");
       if (obj != PatchProxyResult.class) {
          p0 = obj;
       }else {
          a.p(p0, "it");
          obj = p0.c;
          if (obj != null) {
             Object[] objArray = new Object[0];
             g.D().w("AICutAnnualMemoryProject", "changeStyle: getExtraMedias ok", objArray);
             this.b.Z.clear();
             this.b.Z.addAll(obj);
          }
       }
       return p0;
    }
}

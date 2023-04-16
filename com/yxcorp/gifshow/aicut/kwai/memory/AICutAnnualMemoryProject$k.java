package com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject$k;
import erd.o;
import com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject;
import com.yxcorp.gifshow.aicut.VideoTemplate;
import java.lang.Object;
import i79.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.Objects;
import h69.g;
import java.lang.StringBuilder;
import q87.c;
import java.util.HashMap;
import com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject$a;
import java.util.List;
import nsd.u;
import java.util.Map;

public final class AICutAnnualMemoryProject$k implements o	// class@00195b
{
    public final AICutAnnualMemoryProject b;
    public final VideoTemplate c;

    public void AICutAnnualMemoryProject$k(AICutAnnualMemoryProject p0,VideoTemplate p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       AICutAnnualMemoryProject$k obj = PatchProxy.applyOneRefs(p0, this, AICutAnnualMemoryProject$k.class, "1");
       if (obj != PatchProxyResult.class) {
          p0 = obj;
       }else {
          a.p(p0, "it");
          int i = 0;
          obj = (p0.e != null || p0.f != null)? 1: null;
          if (obj) {
             obj = this.b;
             String id = this.c.getId();
             Objects.requireNonNull(obj);
             if (!PatchProxy.applyVoidTwoRefs(id, p0, obj, AICutAnnualMemoryProject.class, "21")) {
                Object[] objArray = new Object[i];
                g.D().w("AICutAnnualMemoryProject", "updateStatus\(\) called with: id = "+id+", memoryStartEndResult = "+p0, objArray);
                AICutAnnualMemoryProject$a uoa = obj.b0.get(id);
                if (uoa == null) {
                   uoa = new AICutAnnualMemoryProject$a(null, null, 3, null);
                }
                a.o(uoa, "templateStatusMap[id] ?: TemplateStatus\(\)");
                uoa.b = p0;
                obj.b0.put(id, uoa);
             }
          }
       }
       return p0;
    }
}

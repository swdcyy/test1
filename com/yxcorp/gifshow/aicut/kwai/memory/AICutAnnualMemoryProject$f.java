package com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject$f;
import erd.o;
import com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject;
import com.yxcorp.gifshow.aicut.VideoTemplate;
import com.yxcorp.gifshow.aicut.KwaiAICutStyle;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import o69.c;

public final class AICutAnnualMemoryProject$f implements o	// class@001955
{
    public final AICutAnnualMemoryProject b;
    public final VideoTemplate c;
    public final KwaiAICutStyle d;

    public void AICutAnnualMemoryProject$f(AICutAnnualMemoryProject p0,VideoTemplate p1,KwaiAICutStyle p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AICutAnnualMemoryProject$f.class, "1");
       if (obj != PatchProxyResult.class) {
          p0 = obj;
       }else {
          a.p(p0, "it");
          if (p0.intValue() == 100 && a.g(this.b.L(), this.c.getId())) {
             this.b.Y0(this.c, this.d);
          }
       }
       return p0;
    }
}

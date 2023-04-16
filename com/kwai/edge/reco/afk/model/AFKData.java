package com.kwai.edge.reco.afk.model.AFKData;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kwai.edge.reco.afk.model.AFKData$isAFK$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class AFKData	// class@000d2f
{
    public final p a;
    public final String b;
    public final long c;

    public void AFKData(String p0,long p1){
       a.p(p0, "afkLevel");
       super();
       this.b = p0;
       this.c = p1;
       this.a = s.c(new AFKData$isAFK$2(this));
    }
    public final boolean a(){
       Object obj = PatchProxy.apply(null, this, AFKData.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = this.a.getValue();
       }
       return obj.booleanValue();
    }
    public boolean equals(Object p0){
       AFKData obj = PatchProxy.applyOneRefs(p0, this, AFKData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b;
       AFKData uAFKData = null;
       if (!p0 instanceof AFKData) {
          p0 = uAFKData;
       }
       if (p0 != null) {
          uAFKData = p0.b;
       }
       return a.g(obj, uAFKData);
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, AFKData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (this.b).hashCode();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, AFKData.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "AFKData\(afkLevel="+this.b+", nextDataInternalMs="+this.c+"\)";
    }
}

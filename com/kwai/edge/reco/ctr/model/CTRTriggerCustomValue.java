package com.kwai.edge.reco.ctr.model.CTRTriggerCustomValue;
import java.util.List;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class CTRTriggerCustomValue	// class@000d55
{
    public List candidatePages;
    public int triggerType;

    public void CTRTriggerCustomValue(){
       super(0, null, 3, null);
    }
    public void CTRTriggerCustomValue(int p0,List p1){
       a.p(p1, "candidatePages");
       super();
       this.triggerType = p0;
       this.candidatePages = p1;
    }
    public void CTRTriggerCustomValue(int p0,List p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = -1;
       }
       p1 = (p2 & 0x02)? CollectionsKt__CollectionsKt.E(): null;
       super(p0, p1);
       return;
    }
    public final int a(){
       return this.triggerType;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CTRTriggerCustomValue.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof CTRTriggerCustomValue && (this.triggerType == p0.triggerType && a.g(this.candidatePages, p0.candidatePages)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, CTRTriggerCustomValue.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.triggerType * 31;
       CTRTriggerCustomValue tcandidatePa = this.candidatePages;
       int i1 = (tcandidatePa != null)? tcandidatePa.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, CTRTriggerCustomValue.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CTRTriggerCustomValue\(triggerType="+this.triggerType+", candidatePages="+this.candidatePages+"\)";
    }
}

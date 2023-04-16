package com.kuaishou.tuna_core.tuna_canary.TunaCanaryFeaturesManager$b;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.tuna.canary.TunaCanaryFeatureTag;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class TunaCanaryFeaturesManager$b	// class@001126
{
    public TunaCanaryFeatureTag a;
    public final String mFeatureID;

    public void TunaCanaryFeaturesManager$b(String p0){
       a.p(p0, "mFeatureID");
       super();
       this.mFeatureID = p0;
    }
    public void TunaCanaryFeaturesManager$b(String p0,TunaCanaryFeatureTag p1){
       a.p(p0, "featureID");
       super(p0);
       this.a = p1;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TunaCanaryFeaturesManager$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof TunaCanaryFeaturesManager$b && a.g(this.mFeatureID, p0.mFeatureID))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       TunaCanaryFeaturesManager$b obj = PatchProxy.apply(null, this, TunaCanaryFeaturesManager$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mFeatureID;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, TunaCanaryFeaturesManager$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FeatureIDWrapper\(mFeatureID="+this.mFeatureID+"\)";
    }
}

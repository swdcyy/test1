package com.kuaishou.tuna_core.tuna_canary.TunaCanaryFeaturesManager$c;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class TunaCanaryFeaturesManager$c	// class@001127
{
    public final String mFeatureID;
    public final boolean mIsLowPhone;

    public void TunaCanaryFeaturesManager$c(String p0,boolean p1){
       a.p(p0, "mFeatureID");
       super();
       this.mFeatureID = p0;
       this.mIsLowPhone = p1;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TunaCanaryFeaturesManager$c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof TunaCanaryFeaturesManager$c && (a.g(this.mFeatureID, p0.mFeatureID) && this.mIsLowPhone == p0.mIsLowPhone))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       TunaCanaryFeaturesManager$c obj = PatchProxy.apply(null, this, TunaCanaryFeaturesManager$c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mFeatureID;
       int i = (obj != null)? obj.hashCode(): 0;
       i = i * 31;
       TunaCanaryFeaturesManager$c tmIsLowPhone = this.mIsLowPhone;
       if (tmIsLowPhone != null) {
          tmIsLowPhone = 1;
       }
       return (i + tmIsLowPhone);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, TunaCanaryFeaturesManager$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FeatureShownModel\(mFeatureID="+this.mFeatureID+", mIsLowPhone="+this.mIsLowPhone+"\)";
    }
}

package com.kwai.component.bifrost.BifrostFeatureActivityEntry;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import com.kwai.component.bifrost.BifrostFeatureConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import yb6.d;

public class BifrostFeatureActivityEntry implements Serializable	// class@0020c5
{
    public BifrostFeatureConfig mBifrostFeatureConfig;

    public void BifrostFeatureActivityEntry(){
       super();
    }
    public String getActivityId(){
       BifrostFeatureActivityEntry tmBifrostFea = this.mBifrostFeatureConfig;
       if (tmBifrostFea == null) {
          return null;
       }
       return tmBifrostFea.mActivityId;
    }
    public boolean isEffective(){
       BifrostFeatureActivityEntry obj = PatchProxy.apply(null, this, BifrostFeatureActivityEntry.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.mBifrostFeatureConfig.mIsPreview != null) {
          return b;
       }
       long l = d.a();
       obj = this.mBifrostFeatureConfig;
       if (l - obj.mStartTime < 0 || l - obj.mEndTime > 0) {
          b = false;
       }
       return b;
    }
}

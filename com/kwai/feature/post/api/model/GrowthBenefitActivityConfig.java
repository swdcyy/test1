package com.kwai.feature.post.api.model.GrowthBenefitActivityConfig;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class GrowthBenefitActivityConfig implements Serializable	// class@001409
{
    public List mCoinActivities;

    public void GrowthBenefitActivityConfig(){
       super();
       this.mCoinActivities = new ArrayList();
    }
    public final List getMCoinActivities(){
       return this.mCoinActivities;
    }
    public final void setMCoinActivities(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthBenefitActivityConfig.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mCoinActivities = p0;
       return;
    }
}

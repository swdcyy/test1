package com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter$initUserProfileFeaturesProvider$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter;
import java.lang.Object;
import com.kwai.sdk.eve.internal.featurecenter.FeaturesProvider;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Map;

public final class EveFeatureCenter$initUserProfileFeaturesProvider$1 extends Lambda implements l	// class@0014d4
{
    public final EveFeatureCenter this$0;

    public void EveFeatureCenter$initUserProfileFeaturesProvider$1(EveFeatureCenter p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(FeaturesProvider p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EveFeatureCenter$initUserProfileFeaturesProvider$1.class, "1")) {
          return;
       }
       a.p(p0, "userFeaturesProvider");
       EveFeatureCenter$initUserProfileFeaturesProvider$1 tthis$0 = this.this$0;
       tthis$0.mergePrefixFeatures(p0, "u_");
       tthis$0.featuresProviders.put("USER_PROFILE", p0);
       return;
    }
}

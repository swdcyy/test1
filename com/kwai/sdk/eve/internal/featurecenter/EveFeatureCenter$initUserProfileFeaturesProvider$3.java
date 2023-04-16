package com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter$initUserProfileFeaturesProvider$3;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter;
import java.lang.Object;
import ml5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.List;

public final class EveFeatureCenter$initUserProfileFeaturesProvider$3 extends Lambda implements l	// class@0014d6
{
    public final EveFeatureCenter this$0;

    public void EveFeatureCenter$initUserProfileFeaturesProvider$3(EveFeatureCenter p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final a invoke(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EveFeatureCenter$initUserProfileFeaturesProvider$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       List list = p0.c();
       a.m(list);
       return this.this$0.getFeatures("USER_PROFILE", list);
    }
}

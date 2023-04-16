package com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter$initAppFeaturesProvider$5;
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

public final class EveFeatureCenter$initAppFeaturesProvider$5 extends Lambda implements l	// class@0014d1
{
    public final EveFeatureCenter this$0;

    public void EveFeatureCenter$initAppFeaturesProvider$5(EveFeatureCenter p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final a invoke(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EveFeatureCenter$initAppFeaturesProvider$5.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       List list = p0.c();
       a.m(list);
       return this.this$0.getFeatures("APP", list);
    }
}

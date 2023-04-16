package com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter$initFeaturesProvider$2;
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
import java.util.Objects;
import java.lang.RuntimeException;
import java.lang.StringBuilder;

public final class EveFeatureCenter$initFeaturesProvider$2 extends Lambda implements l	// class@0014d3
{
    public final EveFeatureCenter this$0;

    public void EveFeatureCenter$initFeaturesProvider$2(EveFeatureCenter p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final a invoke(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EveFeatureCenter$initFeaturesProvider$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       List list = p0.c();
       a.m(list);
       if (list.size() < 2) {
          throw new RuntimeException("error params "+list+" for FeatureCenter:getFeatures");
       }
       Object obj1 = list.get(0);
       Objects.requireNonNull(obj1, "null cannot be cast to non-null type kotlin.String");
       list = list.get(1);
       Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
       return this.this$0.getFeatures(obj1, list);
    }
}

package com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter$initAppFeaturesProvider$4;
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

public final class EveFeatureCenter$initAppFeaturesProvider$4 extends Lambda implements l	// class@0014d0
{
    public final EveFeatureCenter this$0;

    public void EveFeatureCenter$initAppFeaturesProvider$4(EveFeatureCenter p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final a invoke(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EveFeatureCenter$initAppFeaturesProvider$4.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       String str = p0.g();
       a.m(str);
       str = this.this$0.getFeature("APP", str);
       if (str == null) {
          str = new a("");
       }
       return str;
    }
}

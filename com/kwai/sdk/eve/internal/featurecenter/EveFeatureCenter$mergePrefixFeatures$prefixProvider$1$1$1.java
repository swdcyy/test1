package com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter$mergePrefixFeatures$prefixProvider$1$1$1;
import com.kwai.sdk.eve.internal.featurecenter.IFeatureProvider;
import java.util.Map$Entry;
import java.lang.String;
import ml5.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class EveFeatureCenter$mergePrefixFeatures$prefixProvider$1$1$1 extends IFeatureProvider	// class@0014d7
{
    public final Map$Entry $it;
    public final String $keyWithPrefix;

    public void EveFeatureCenter$mergePrefixFeatures$prefixProvider$1$1$1(Map$Entry p0,String p1,String p2,String p3){
       this.$it = p0;
       this.$keyWithPrefix = p1;
       super(p2, p3);
    }
    public a getFeatureValue(){
       Object obj = PatchProxy.apply(null, this, EveFeatureCenter$mergePrefixFeatures$prefixProvider$1$1$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.$it.getValue().getFeatureValue();
    }
}

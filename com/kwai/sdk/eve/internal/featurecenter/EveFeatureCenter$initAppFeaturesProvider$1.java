package com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter$initAppFeaturesProvider$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import ml5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.System;

public final class EveFeatureCenter$initAppFeaturesProvider$1 extends Lambda implements a	// class@0014cf
{
    public static final EveFeatureCenter$initAppFeaturesProvider$1 INSTANCE;

    static {
       EveFeatureCenter$initAppFeaturesProvider$1.INSTANCE = new EveFeatureCenter$initAppFeaturesProvider$1();
    }
    public void EveFeatureCenter$initAppFeaturesProvider$1(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final a invoke(){
       Object obj = PatchProxy.apply(null, this, EveFeatureCenter$initAppFeaturesProvider$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(System.currentTimeMillis());
    }
}

package com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter$userFeatureProvider$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenter;
import com.kuaishou.eve.kit.api.user.UserFeatureProvider;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import vm7.a;

public final class EveFeatureCenter$userFeatureProvider$2 extends Lambda implements a	// class@0014e0
{
    public final EveFeatureCenter this$0;

    public void EveFeatureCenter$userFeatureProvider$2(EveFeatureCenter p0){
       this.this$0 = p0;
       super(0);
    }
    public final UserFeatureProvider invoke(){
       Object obj = PatchProxy.apply(null, this, EveFeatureCenter$userFeatureProvider$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new UserFeatureProvider(this.this$0.getContext());
    }
    public Object invoke(){
       return this.invoke();
    }
}

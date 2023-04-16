package com.kwai.sdk.eve.internal.api.EveApi$apiMocker$2$a$a;
import erd.g;
import java.lang.Object;
import com.kwai.sdk.eve.internal.featurecenter.global.FeatureCalculateConfigResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import com.kwai.sdk.eve.internal.api.EveApi$apiMocker$2$1$featureCalculateConfig$2$1;
import msd.a;

public final class EveApi$apiMocker$2$a$a implements g	// class@001451
{
    public final g b;

    public void EveApi$apiMocker$2$a$a(g p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EveApi$apiMocker$2$a$a.class, "1")) {
       }else {
          EveLog.INSTANCE.i(new EveApi$apiMocker$2$1$featureCalculateConfig$2$1(p0));
          this.b.accept(p0);
       }
       return;
    }
}

package com.kwai.sdk.eve.internal.api.EveApi$apiMocker$2$a$c;
import erd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.eve.internal.common.utils.EveLog;

public final class EveApi$apiMocker$2$a$c implements a	// class@001453
{
    public final a b;

    public void EveApi$apiMocker$2$a$c(a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, EveApi$apiMocker$2$a$c.class, "1")) {
          return;
       }
       EveLog.w$default("EveGlobalFeatureCalculator#featureCalculateConfig: Mocker ===> onComplete", false, 2, null);
       this.b.run();
       return;
    }
}

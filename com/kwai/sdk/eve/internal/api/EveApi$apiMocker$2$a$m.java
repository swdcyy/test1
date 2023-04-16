package com.kwai.sdk.eve.internal.api.EveApi$apiMocker$2$a$m;
import erd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.eve.internal.common.utils.EveLog;

public final class EveApi$apiMocker$2$a$m implements a	// class@00145d
{
    public final a b;

    public void EveApi$apiMocker$2$a$m(a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, EveApi$apiMocker$2$a$m.class, "1")) {
          return;
       }
       EveLog.w$default("UserFeatureProvider#userFeature: Mocker ===> onComplete", false, 2, null);
       this.b.run();
       return;
    }
}

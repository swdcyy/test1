package com.kwai.sdk.eve.internal.api.EveApi$apiMocker$2$a$l;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.sdk.eve.internal.common.utils.EveLog;

public final class EveApi$apiMocker$2$a$l implements g	// class@00145c
{
    public final g b;

    public void EveApi$apiMocker$2$a$l(g p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EveApi$apiMocker$2$a$l.class, "1")) {
       }else {
          EveLog.e$default("UserFeatureProvider#userFeature: Mocker ===> onError = "+p0, false, 2, null);
          this.b.accept(p0);
       }
       return;
    }
}

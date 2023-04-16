package com.kwai.sdk.eve.internal.api.EveApi$apiMocker$2$a$k;
import erd.g;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import com.kwai.sdk.eve.internal.featurecenter.user.UserProfileFeatureResponse;
import com.google.gson.Gson;
import com.kwai.sdk.eve.internal.common.utils.DataKt;
import v97.b;
import kotlin.jvm.internal.a;
import v97.b$a;
import xa7.c;

public final class EveApi$apiMocker$2$a$k implements g	// class@00145b
{
    public final g b;

    public void EveApi$apiMocker$2$a$k(g p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EveApi$apiMocker$2$a$k.class, "1")) {
       }else {
          EveLog.w$default("UserFeatureProvider#userFeature: Mocker ===> onResponse = "+p0, false, 2, null);
          UserProfileFeatureResponse userProfileF = p0.a();
          EveLog.w$default("UserFeatureProvider#userFeature: Mocker ===> response = "+DataKt.a().q(userProfileF), false, 2, null);
          a.o(userProfileF, "response");
          b uob = b$a.a(b.b, userProfileF, null, 2, null);
          uob.resultCode = p0.b();
          this.b.accept(uob);
       }
       return;
    }
}

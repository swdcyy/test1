package com.kwai.sdk.eve.internal.api.EveApi$apiMocker$2$a$e;
import erd.g;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import rn7.d;
import com.google.gson.Gson;
import com.kwai.sdk.eve.internal.common.utils.DataKt;
import v97.b;
import kotlin.jvm.internal.a;
import v97.b$a;
import xa7.c;

public final class EveApi$apiMocker$2$a$e implements g	// class@001455
{
    public final g b;

    public void EveApi$apiMocker$2$a$e(g p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EveApi$apiMocker$2$a$e.class, "1")) {
       }else {
          EveLog.w$default("EPM#requestServerPackage: Mocker ===> onResponse = "+p0, false, 2, null);
          EveLog.w$default("EPM#requestServerPackage: Mocker ===> response = "+DataKt.a().q(p0.a()), false, 2, null);
          Object obj = p0.a();
          a.o(obj, "it.body\(\)");
          b uob = b$a.a(b.b, obj, null, 2, null);
          uob.resultCode = p0.b();
          this.b.accept(uob);
       }
       return;
    }
}

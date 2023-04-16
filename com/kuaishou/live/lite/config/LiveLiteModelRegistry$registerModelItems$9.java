package com.kuaishou.live.lite.config.LiveLiteModelRegistry$registerModelItems$9;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kuaishou.live.lite.basic.model.LiveLiteModelManager;
import td3.o;
import rd3.b;
import ds5.a;
import e93.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ma3.d;
import java.util.Objects;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import com.kuaishou.live.lite.userstatus.k;
import com.kuaishou.live.lite.userstatus.e;

public final class LiveLiteModelRegistry$registerModelItems$9 extends Lambda implements l	// class@0008b3
{
    public static final LiveLiteModelRegistry$registerModelItems$9 INSTANCE;

    static {
       LiveLiteModelRegistry$registerModelItems$9.INSTANCE = new LiveLiteModelRegistry$registerModelItems$9();
    }
    public void LiveLiteModelRegistry$registerModelItems$9(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final o invoke(LiveLiteModelManager p0){
       a uoa = a.class;
       a uoa1 = a.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d obj = PatchProxy.applyOneRefs(p0, this, LiveLiteModelRegistry$registerModelItems$9.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "it");
       obj = d.a;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(null, obj, d.class, "3");
       boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): a.t().u("SOURCE_LIVE").d("enableNewUserStatusObtain", true);
       k ok = (b)? new k(p0.c(uoa1, ""), p0.c(uoa, ""), p0.c(b.class, "重要接口，流控策略")): new e(p0.c(uoa1, ""), p0.c(uoa, ""), p0.c(b.class, "重要接口，流控策略"));
       return ok;
    }
}

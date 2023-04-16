package com.kuaishou.live.lite.config.LiveLiteModelRegistry$registerModelItems$33;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kuaishou.live.lite.basic.model.LiveLiteModelManager;
import m91.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;

public final class LiveLiteModelRegistry$registerModelItems$33 extends Lambda implements l	// class@000890
{
    public static final LiveLiteModelRegistry$registerModelItems$33 INSTANCE;

    static {
       LiveLiteModelRegistry$registerModelItems$33.INSTANCE = new LiveLiteModelRegistry$registerModelItems$33();
    }
    public void LiveLiteModelRegistry$registerModelItems$33(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final b invoke(LiveLiteModelManager p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteModelRegistry$registerModelItems$33.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return new b(ArraysKt___ArraysKt.uy(AudienceBizRelation.values()));
    }
}

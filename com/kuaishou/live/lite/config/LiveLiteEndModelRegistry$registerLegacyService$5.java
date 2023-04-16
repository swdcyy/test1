package com.kuaishou.live.lite.config.LiveLiteEndModelRegistry$registerLegacyService$5;
import msd.l;
import kotlin.jvm.internal.Lambda;
import android.app.Activity;
import java.lang.Object;
import com.kuaishou.live.lite.basic.model.LiveLiteModelManager;
import za3.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import or5.d;

public final class LiveLiteEndModelRegistry$registerLegacyService$5 extends Lambda implements l	// class@000873
{
    public final Activity $activity;

    public void LiveLiteEndModelRegistry$registerLegacyService$5(Activity p0){
       this.$activity = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final b invoke(LiveLiteModelManager p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteEndModelRegistry$registerLegacyService$5.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return new b(this.$activity, p0.c(d.class, ""));
    }
}

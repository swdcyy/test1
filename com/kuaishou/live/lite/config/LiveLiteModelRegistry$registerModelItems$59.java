package com.kuaishou.live.lite.config.LiveLiteModelRegistry$registerModelItems$59;
import msd.l;
import kotlin.jvm.internal.Lambda;
import mrd.a;
import java.lang.Object;
import com.kuaishou.live.lite.basic.model.LiveLiteModelManager;
import za3.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class LiveLiteModelRegistry$registerModelItems$59 extends Lambda implements l	// class@0008ad
{
    public final a $isTabSelectedInSlide;

    public void LiveLiteModelRegistry$registerModelItems$59(a p0){
       this.$isTabSelectedInSlide = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final i invoke(LiveLiteModelManager p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteModelRegistry$registerModelItems$59.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return new i(this.$isTabSelectedInSlide);
    }
}

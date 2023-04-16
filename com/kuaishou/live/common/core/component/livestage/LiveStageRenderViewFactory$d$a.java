package com.kuaishou.live.common.core.component.livestage.LiveStageRenderViewFactory$d$a;
import d22.k$a;
import com.kuaishou.live.common.core.component.livestage.LiveStageRenderViewFactory$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qrd.l1;
import mrd.a;

public final class LiveStageRenderViewFactory$d$a implements k$a	// class@0014a7
{
    public final LiveStageRenderViewFactory$d a;

    public void LiveStageRenderViewFactory$d$a(LiveStageRenderViewFactory$d p0){
       this.a = p0;
       super();
    }
    public final void onDrawFrame(){
       if (PatchProxy.applyVoid(null, this, LiveStageRenderViewFactory$d$a.class, "1")) {
          return;
       }
       this.a.c.onNext(l1.a);
       return;
    }
}

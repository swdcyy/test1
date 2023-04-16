package com.kuaishou.live.common.core.component.livestage.LiveStageRenderViewFactory$createCameraView$1$onFrame$1$1$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import android.view.View;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import xo1.h;

public final class LiveStageRenderViewFactory$createCameraView$1$onFrame$1$1$1$1 extends Lambda implements l	// class@0014a4
{
    public static final LiveStageRenderViewFactory$createCameraView$1$onFrame$1$1$1$1 INSTANCE;

    static {
       LiveStageRenderViewFactory$createCameraView$1$onFrame$1$1$1$1.INSTANCE = new LiveStageRenderViewFactory$createCameraView$1$onFrame$1$1$1$1();
    }
    public void LiveStageRenderViewFactory$createCameraView$1$onFrame$1$1$1$1(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveStageRenderViewFactory$createCameraView$1$onFrame$1$1$1$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       h.a("CameraView VISIBLE");
       p0.setVisibility(0);
       return;
    }
}

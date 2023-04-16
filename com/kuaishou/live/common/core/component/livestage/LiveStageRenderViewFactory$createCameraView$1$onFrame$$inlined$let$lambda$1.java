package com.kuaishou.live.common.core.component.livestage.LiveStageRenderViewFactory$createCameraView$1$onFrame$$inlined$let$lambda$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import android.view.View;
import kotlin.jvm.internal.Ref$BooleanRef;
import com.kuaishou.live.common.core.component.livestage.LiveStageRenderViewFactory$c;
import java.lang.Object;
import android.graphics.Rect;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import xo1.h;
import xo1.j;
import com.kuaishou.live.common.core.component.livestage.LiveStageRenderViewFactory$createCameraView$1$onFrame$1$1$1$1;
import xo1.j$b;

public final class LiveStageRenderViewFactory$createCameraView$1$onFrame$$inlined$let$lambda$1 extends Lambda implements l	// class@0014a3
{
    public final Ref$BooleanRef $hasSetVisible$inlined;
    public final View $it;
    public final LiveStageRenderViewFactory$c this$0;

    public void LiveStageRenderViewFactory$createCameraView$1$onFrame$$inlined$let$lambda$1(View p0,Ref$BooleanRef p1,LiveStageRenderViewFactory$c p2){
       this.$it = p0;
       this.$hasSetVisible$inlined = p1;
       this.this$0 = p2;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(Rect p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LiveStageRenderViewFactory$createCameraView$1$onFrame$$inlined$let$lambda$1.class, "1")) {
          return;
       }
       a.p(p0, "rect");
       h.a("CameraView layoutTracker "+p0);
       LiveStageRenderViewFactory$createCameraView$1$onFrame$$inlined$let$lambda$1 t$hasSetVisi = this.$hasSetVisible$inlined;
       if (t$hasSetVisi.element == null) {
          t$hasSetVisi.element = true;
          j$b.b(j.f, this.$it, p0, false, false, LiveStageRenderViewFactory$createCameraView$1$onFrame$1$1$1$1.INSTANCE, 12, null);
       }else {
          j$b.b(j.f, this.$it, p0, false, false, null, 28, null);
       }
       PatchProxy.onMethodExit(LiveStageRenderViewFactory$createCameraView$1$onFrame$$inlined$let$lambda$1.class, "1");
       return;
    }
}

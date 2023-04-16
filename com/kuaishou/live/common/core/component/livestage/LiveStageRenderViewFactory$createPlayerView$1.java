package com.kuaishou.live.common.core.component.livestage.LiveStageRenderViewFactory$createPlayerView$1;
import je3.h;
import com.kuaishou.live.common.core.component.livestage.LiveStageRenderViewFactory;
import android.content.Context;
import java.lang.Object;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.livestage.LiveStageRenderViewFactory$b;
import android.view.View;
import xo1.j;
import com.kuaishou.live.common.core.component.livestage.LiveStageRenderViewFactory$createPlayerView$1$layoutTracker$1;
import msd.l;
import nsd.u;
import ue3.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import xo1.h;
import com.kuaishou.live.livestage.VideoScaleMode;
import java.lang.Float;
import com.kuaishou.live.common.core.component.livestage.LiveStageInit;

public final class LiveStageRenderViewFactory$createPlayerView$1 implements h	// class@0014a6
{
    public final View a;
    public final j b;
    public final LiveStageRenderViewFactory c;
    public final Context d;

    public void LiveStageRenderViewFactory$createPlayerView$1(LiveStageRenderViewFactory p0,Context p1){
       this.c = p0;
       this.d = p1;
       super();
       p0.b.a(Boolean.TRUE);
       this.a = new View(p1);
       j oj = new j(this.getView(), false, new LiveStageRenderViewFactory$createPlayerView$1$layoutTracker$1(this), 2, null);
       this.b = new View(p1);
    }
    public void a(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveStageRenderViewFactory$createPlayerView$1.class, "1")) {
       }else {
          a.p(p0, "frame");
          h.a("PlayerView onFrame "+p0);
       }
       return;
    }
    public void b(float p0,VideoScaleMode p1){
       LiveStageRenderViewFactory$createPlayerView$1 uocreatePlay = LiveStageRenderViewFactory$createPlayerView$1.class;
       if (PatchProxy.isSupport(uocreatePlay) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), p1, this, uocreatePlay, "3")) {
          return;
       }
       h.a("CameraView setRatio ratio:"+p0+" fitMode:"+p1);
       return;
    }
    public View getView(){
       return this.a;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, LiveStageRenderViewFactory$createPlayerView$1.class, "2")) {
          return;
       }
       h.a("PlayerView release");
       this.b.b();
       if (!LiveStageInit.e.a()) {
          this.c.b.a(Boolean.FALSE);
       }
       return;
    }
}

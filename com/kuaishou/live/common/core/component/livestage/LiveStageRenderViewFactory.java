package com.kuaishou.live.common.core.component.livestage.LiveStageRenderViewFactory;
import je3.n;
import com.kuaishou.live.common.core.component.livestage.LiveStageRenderViewFactory$a;
import nsd.u;
import java.lang.Object;
import com.kuaishou.live.common.core.component.livestage.LiveStageRenderViewFactory$b;
import com.kuaishou.live.common.core.component.livestage.LiveStageRenderViewFactory$enableRtcViewHeapBufferCopyOpt$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.content.Context;
import je3.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import xo1.h;
import com.kuaishou.live.common.core.component.livestage.LiveStageRenderViewFactory$c;
import msd.l;
import je3.j;
import com.kuaishou.live.common.core.component.livestage.LiveStageRenderViewFactory$d;
import je3.h;
import com.kuaishou.live.common.core.component.livestage.LiveStageRenderViewFactory$createPlayerView$1;

public final class LiveStageRenderViewFactory implements n	// class@0014aa
{
    public final LiveStageRenderViewFactory$b a;
    public final LiveStageRenderViewFactory$b b;
    public final p c;
    public final boolean d;
    public static final LiveStageRenderViewFactory$a e;

    static {
       LiveStageRenderViewFactory.e = new LiveStageRenderViewFactory$a(null);
    }
    public void LiveStageRenderViewFactory(boolean p0){
       super();
       this.d = p0;
       this.a = new LiveStageRenderViewFactory$b(this);
       this.b = new LiveStageRenderViewFactory$b(this);
       this.c = s.c(LiveStageRenderViewFactory$enableRtcViewHeapBufferCopyOpt$2.INSTANCE);
    }
    public void LiveStageRenderViewFactory(boolean p0,int p1,u p2){
       if (p1 & 1) {
          p0 = true;
       }
       super(p0);
       return;
    }
    public f a(Context p0,boolean p1){
       LiveStageRenderViewFactory liveStageRen = LiveStageRenderViewFactory.class;
       if (PatchProxy.isSupport(liveStageRen)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, liveStageRen, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "context");
       h.a("createCameraView");
       return new LiveStageRenderViewFactory$c(this, p1, p0);
    }
    public void b(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveStageRenderViewFactory.class, "5")) {
          return;
       }
       this.a.b(p0);
       return;
    }
    public j c(Context p0,boolean p1){
       LiveStageRenderViewFactory liveStageRen = LiveStageRenderViewFactory.class;
       if (PatchProxy.isSupport(liveStageRen)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, liveStageRen, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "context");
       h.a("createRtcView");
       return new LiveStageRenderViewFactory$d(this, p0, p1);
    }
    public void d(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveStageRenderViewFactory.class, "6")) {
          return;
       }
       this.b.b(p0);
       return;
    }
    public h e(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveStageRenderViewFactory.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "context");
       h.a("createPlayerView");
       return new LiveStageRenderViewFactory$createPlayerView$1(this, p0);
    }
    public final boolean f(){
       Object obj = PatchProxy.apply(null, this, LiveStageRenderViewFactory.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = this.c.getValue();
       }
       return obj.booleanValue();
    }
}

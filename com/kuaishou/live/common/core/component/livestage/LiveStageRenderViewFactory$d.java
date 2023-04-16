package com.kuaishou.live.common.core.component.livestage.LiveStageRenderViewFactory$d;
import je3.j;
import com.kuaishou.live.common.core.component.livestage.LiveStageRenderViewFactory;
import android.content.Context;
import java.lang.Object;
import android.widget.FrameLayout;
import com.kuaishou.live.core.basic.widget.LivePlayGLSurfaceView;
import mrd.a;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import android.opengl.GLSurfaceView;
import d22.k;
import com.kuaishou.live.common.core.component.livestage.LiveStageRenderViewFactory$d$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.List;
import pe3.a;
import java.lang.StringBuilder;
import xo1.h;
import fe3.c;
import java.nio.ByteBuffer;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.livestage.VideoScaleMode;
import java.lang.Float;
import xo1.g;
import java.lang.Enum;
import kotlin.NoWhenBranchMatchedException;
import brd.t;

public final class LiveStageRenderViewFactory$d implements j	// class@0014a8
{
    public final FrameLayout a;
    public final LivePlayGLSurfaceView b;
    public final a c;
    public boolean d;
    public final LiveStageRenderViewFactory e;
    public final Context f;
    public final boolean g;

    public void LiveStageRenderViewFactory$d(LiveStageRenderViewFactory p0,Context p1,boolean p2){
       this.e = p0;
       this.f = p1;
       this.g = p2;
       super();
       this.a = new FrameLayout(p1);
       LivePlayGLSurfaceView livePlayGLSu = new LivePlayGLSurfaceView(p1);
       this.b = livePlayGLSu;
       a uoa = a.g();
       a.o(uoa, "BehaviorSubject.create<Unit>\(\)");
       this.c = uoa;
       this.d().addView(livePlayGLSu, -1, -1);
       if (p2) {
          livePlayGLSu.setZOrderMediaOverlay(true);
       }
       k renderer = livePlayGLSu.getRenderer();
       LiveStageRenderViewFactory$d$a uod$a = new LiveStageRenderViewFactory$d$a(this);
       _monitor_enter(renderer);
       if (PatchProxy.applyVoidOneRefs(uod$a, renderer, k.class, "16")) {
          _monitor_exit(renderer);
       }else if(!renderer.h.contains(uod$a)){
          renderer.h.add(uod$a);
       }
       _monitor_exit(renderer);
       this.d = true;
       return;
    }
    public void a(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveStageRenderViewFactory$d.class, "1")) {
       }else {
          a.p(p0, "frame");
          boolean b = false;
          if (this.d != null) {
             h.a("RtcView onFrame "+p0+' '+this.e.f());
             this.d = b;
             this.d().setTag(p0.getStreamId());
          }
          k renderer = this.b.getRenderer();
          ByteBuffer uByteBuffer = p0.a();
          int videoWidth = p0.getVideoWidth();
          int videoHeight = p0.getVideoHeight();
          boolean b1 = this.e.f();
          _monitor_enter(renderer);
          if (PatchProxy.isSupport(k.class)) {
             p0 = new Object[]{uByteBuffer,Integer.valueOf(videoWidth),Integer.valueOf(videoHeight),Integer.valueOf(b),Boolean.valueOf(b1)};
             if (PatchProxy.apply(p0, renderer, k.class, "10") != PatchProxyResult.class) {
             label_009e :
                _monitor_exit(renderer);
             }
          }
          renderer.h(uByteBuffer, videoWidth, videoHeight, 0, 0, b1);
          goto label_009e ;
       }
       return;
    }
    public void b(float p0,VideoScaleMode p1){
       LiveStageRenderViewFactory$d uod = LiveStageRenderViewFactory$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), p1, this, uod, "3")) {
          return;
       }
       h.a("RtcView setRatio ratio:"+p0+" fitMode:"+p1);
       this.b.getRenderer().g((0x3f800000 / p0));
       k renderer = this.b.getRenderer();
       a.o(renderer, "surfaceView.renderer");
       renderer = renderer.n;
       if (p1 == null) {
          return;
       }
       int i = g.a[p1.ordinal()];
       int i1 = 2;
       if (i != 1) {
          if (i == i1 || i == 3) {
             i1 = 1;
          }else {
             throw new NoWhenBranchMatchedException();
          }
       }
       if (renderer != i1) {
          renderer = this.b.getRenderer();
          a.o(renderer, "surfaceView.renderer");
          renderer.n = i1;
          this.b.getRenderer().f(true);
       }
       return;
    }
    public t c(){
       t obj = PatchProxy.apply(null, this, LiveStageRenderViewFactory$d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c.hide();
       a.o(obj, "renderSubject.hide\(\)");
       return obj;
    }
    public FrameLayout d(){
       return this.a;
    }
    public View getView(){
       return this.d();
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, LiveStageRenderViewFactory$d.class, "2")) {
          return;
       }
       h.a("RtcView release");
       return;
    }
}

package com.kuaishou.live.common.core.component.livestage.LiveStageRenderViewFactory$c;
import je3.f;
import com.kuaishou.live.common.core.component.livestage.LiveStageRenderViewFactory;
import android.content.Context;
import java.lang.Object;
import android.widget.FrameLayout;
import ue3.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import xo1.h;
import java.util.Objects;
import com.kuaishou.live.common.core.component.livestage.a$b;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.live.camerahost.view.LiveCameraView;
import android.view.SurfaceView;
import com.yxcorp.gifshow.video.widget.CameraViewWrapper;
import kotlin.jvm.internal.Ref$BooleanRef;
import xo1.j;
import com.kuaishou.live.common.core.component.livestage.LiveStageRenderViewFactory$createCameraView$1$onFrame$$inlined$let$lambda$1;
import msd.l;
import nsd.u;
import qrd.l1;
import com.kuaishou.live.livestage.VideoScaleMode;
import java.lang.Float;

public final class LiveStageRenderViewFactory$c implements f	// class@0014a2
{
    public final FrameLayout a;
    public boolean b;
    public View c;
    public j d;
    public final LiveStageRenderViewFactory e;
    public final boolean f;
    public final Context g;

    public void LiveStageRenderViewFactory$c(LiveStageRenderViewFactory p0,boolean p1,Context p2){
       this.e = p0;
       this.f = p1;
       this.g = p2;
       super();
       this.a = new FrameLayout(p2);
       this.b = true;
    }
    public void a(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveStageRenderViewFactory$c.class, "1")) {
       }else {
          a.p(p0, "frame");
          if (this.b != null) {
             h.a("CameraView onFrame "+p0+' '+p0.a());
             boolean b = false;
             this.b = b;
             p0 = p0.a();
             Objects.requireNonNull(p0, "null cannot be cast to non-null type com.kuaishou.live.common.core.component.livestage.LiveStageCamera.PayloadData");
             if (p0.a == null) {
                ViewParent parent = p0.a().getParent();
                if (!parent instanceof ViewGroup) {
                   parent = null;
                }
                if (parent != null) {
                   parent.removeView(p0.a());
                }
                this.d().addView(p0.a(), new FrameLayout$LayoutParams(-1, -1));
                if (this.f != null) {
                   p0 = p0.a();
                   Objects.requireNonNull(p0, "null cannot be cast to non-null type com.kuaishou.live.camerahost.view.LiveCameraView");
                   p0.getSurfaceView().setZOrderMediaOverlay(true);
                }
             }else {
                Ref$BooleanRef uBooleanRef = new Ref$BooleanRef();
                uBooleanRef.element = b;
                p0 = p0.a();
                j oj = new j(this.d(), false, new LiveStageRenderViewFactory$createCameraView$1$onFrame$$inlined$let$lambda$1(p0, uBooleanRef, this), 2, null);
                this.d = b;
                this.c = p0;
             }
          }
       }
       return;
    }
    public void b(float p0,VideoScaleMode p1){
       LiveStageRenderViewFactory$c uoc = LiveStageRenderViewFactory$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), p1, this, uoc, "3")) {
          return;
       }
       h.a("CameraView setRatio ratio:"+p0+" fitMode:"+p1);
       return;
    }
    public FrameLayout d(){
       return this.a;
    }
    public View getView(){
       return this.d();
    }
    public void release(){
       LiveStageRenderViewFactory$c tc;
       if (PatchProxy.applyVoid(null, this, LiveStageRenderViewFactory$c.class, "2")) {
          return;
       }
       h.a("CameraView release");
       if (this.e.d != null) {
          tc = this.c;
          if (tc != null) {
             tc.setVisibility(4);
          }
       }
       tc = this.d;
       if (tc != null) {
          tc.b();
       }
       this.d().removeAllViews();
       return;
    }
}

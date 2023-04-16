package com.yxcorp.gifshow.camera.record.widget.AnimCameraView;
import ml8.d;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.content.res.Resources$Theme;
import ll8.c$b;
import android.content.res.TypedArray;
import com.yxcorp.gifshow.camerasdk.q;
import com.yxcorp.gifshow.camera.record.widget.AnimCameraView$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.view.ViewStub;
import com.kwai.library.widget.imageview.ForegroundImageView;
import android.view.ViewParent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import java.lang.System;
import com.yxcorp.gifshow.camera.record.widget.CameraView;
import com.yxcorp.gifshow.media.model.ImageConfig;
import q46.l;
import java.lang.Float;
import n65.k;
import com.yxcorp.gifshow.camera.record.photo.h;
import x8c.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.camera.record.widget.b;
import m65.f;
import com.kwai.camerasdk.models.DisplayLayout;
import com.kwai.camerasdk.models.CaptureImageMode;
import p65.g;
import ki9.b;
import java.lang.Runnable;
import ekd.k1;
import ekd.m1;
import com.kwai.robust.PatchProxyResult;

public class AnimCameraView extends FrameLayout implements d	// class@000fb2
{
    public CameraView b;
    public ViewStub c;
    public FrameLayout d;
    public ForegroundImageView e;
    public int f;
    public final boolean g;
    public static final int h;

    public void AnimCameraView(Context p0){
       super(p0, null);
    }
    public void AnimCameraView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void AnimCameraView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.g = p0.getTheme().obtainStyledAttributes(p1, c$b.G, 0, 0).getBoolean(1, 0);
       this.c(p0);
    }
    public void a(q p0,AnimCameraView$a p1){
       AnimCameraView uAnimCameraV = this;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AnimCameraView.class, "4")) {
          return;
       }
       if (uAnimCameraV.b == null) {
          this.c(this.getContext());
       }
       if (uAnimCameraV.d == null) {
          FrameLayout uFrameLayout = uAnimCameraV.c.inflate();
          uAnimCameraV.d = uFrameLayout;
          uAnimCameraV.e = uFrameLayout.findViewById(0x7f0a0457);
          if (this.getParent() instanceof View && this.getParent().getBackground() instanceof ColorDrawable) {
             uAnimCameraV.d.setBackgroundColor(this.getParent().getBackground().getColor());
          }else {
             uAnimCameraV.d.setBackgroundColor(0xff000000);
          }
       }
       int i = uAnimCameraV.f + 1;
       uAnimCameraV.f = i;
       k ok = h.a(p0, this.getCameraView(), true, false, l.a().getSingleImageLongSide(), null);
       Object[] objArray = new Object[0];
       a.D().w("AnimCameraView", "showLastFrame size:"+ok.d()+"*"+ok.c(), objArray);
       b uob = new b(this, i, System.currentTimeMillis(), p1);
       int i1 = ok.d();
       int i2 = ok.c();
       p0.k(objArray, i1, i2, uAnimCameraV.b.getSurfaceView().getDisplayLayout(), CaptureImageMode.kCaptureLastFrame);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, AnimCameraView.class, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("AnimCameraView", "hideAllCoverView", objArray);
       AnimCameraView td = this.d;
       if (td != null) {
          td.setVisibility(4);
       }
       this.b.getMaskView().setVisibility(8);
       return;
    }
    public final void c(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AnimCameraView.class, "6")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("AnimCameraView", "init", objArray);
       k1.o(new b(this, p0));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AnimCameraView.class, "1")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a31cc);
       this.c = m1.f(p0, 0x7f0a0643);
       return;
    }
    public ForegroundImageView getBlurPreviewImage(){
       return this.e;
    }
    public CameraView getCameraView(){
       Object obj = PatchProxy.apply(null, this, AnimCameraView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b == null) {
          this.c(this.getContext());
       }
       return this.b;
    }
}

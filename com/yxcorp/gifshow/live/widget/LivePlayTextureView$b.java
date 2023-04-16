package com.yxcorp.gifshow.live.widget.LivePlayTextureView$b;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView$a;
import android.view.SurfaceHolder$Callback;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import java.lang.Object;
import android.graphics.SurfaceTexture;
import android.graphics.Bitmap;
import m1b.a;
import android.view.Surface;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.yxcorp.gifshow.live.widget.LivePlaySurfaceView;
import android.content.Context;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import android.view.View;
import java.util.Objects;
import com.yxcorp.gifshow.live.widget.SurfaceSnapshotController;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import android.graphics.Matrix;
import l1b.b;
import java.lang.Math;
import java.lang.Float;
import java.util.Iterator;
import java.util.Set;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView$c;
import java.lang.Integer;
import android.graphics.Paint;
import java.lang.StringBuilder;

public class LivePlayTextureView$b implements LivePlayTextureView$a, SurfaceHolder$Callback	// class@001a8c
{
    public LivePlaySurfaceView b;
    public SurfaceTexture c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final LivePlayTextureView h;

    public void LivePlayTextureView$b(LivePlayTextureView p0){
       this.h = p0;
       super();
       this.c = new SurfaceTexture(0);
    }
    public Bitmap a(Bitmap p0){
       return a.b(this, p0);
    }
    public Surface b(boolean p0){
       Surface obj;
       if (PatchProxy.isSupport(LivePlayTextureView$b.class)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, LivePlayTextureView$b.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.b.getHolder().getSurface();
       if (!obj.isValid()) {
          obj = null;
       }
       return obj;
    }
    public void c(boolean p0){
       a.i(this, p0);
    }
    public void d(){
       LivePlaySurfaceView livePlaySurf;
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, LivePlayTextureView$b.class, str)) {
          return;
       }
       if (this.b == null) {
          livePlaySurf = new LivePlaySurfaceView(this.h.getContext(), this.h);
          this.b = livePlaySurf;
          livePlaySurf.getHolder().addCallback(this);
       }
       this.h.removeAllViews();
       this.g();
       this.h.addView(this.b, -1, -1);
       LivePlayTextureView$b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, LivePlaySurfaceView.class, "3")) {
          livePlaySurf = tb.b;
          Objects.requireNonNull(livePlaySurf);
          if (!PatchProxy.applyVoid(objArray, livePlaySurf, SurfaceSnapshotController.class, str)) {
             livePlaySurf.b.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
             livePlaySurf.a.addView(livePlaySurf.b);
             livePlaySurf.b();
          }
       }
       return;
    }
    public void e(Matrix p0){
       a.j(this, p0);
    }
    public void f(){
       a.g(this);
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, LivePlayTextureView$b.class, "8")) {
          return;
       }
       b.b("LivePlayTextureView", "hideSurfaceView");
       this.b.setScaleX(0);
       this.b.setScaleY(0);
       return;
    }
    public Bitmap getBitmap(){
       return a.a(this);
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, LivePlayTextureView$b.class, "9")) {
          return;
       }
       b.b("LivePlayTextureView", "showSurfaceView");
       this.b.setScaleX(0x3f800000);
       this.b.setScaleY(0x3f800000);
       return;
    }
    public final void i(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LivePlayTextureView$b.class, "7")) {
          return;
       }
       LivePlayTextureView$b te = this.e;
       float f = 0x3f800000;
       LivePlayTextureView$b uob = 0xbf800000;
       float f1 = (te > null)? ((float)this.d * f) / (float)te: 0xbf800000;
       te = this.g;
       if (te > null) {
          uob = ((float)this.f * f) / (float)te;
       }
       te = (!Float.compare(((float)Math.round((f1 * 10.00f)) / 10.00f), ((float)Math.round((uob * 10.00f)) / 10.00f)))? 1: null;
       if (te) {
          this.h();
          te = this.h;
          Objects.requireNonNull(te);
          if (!PatchProxy.applyVoid(objArray, te, LivePlayTextureView.class, "20")) {
             Iterator iterator = te.c.iterator();
             while (iterator.hasNext()) {
                LivePlayTextureView$c uoc = iterator.next();
                if (uoc != null) {
                   uoc.onShow();
                }
             }
          }
       }
       return;
    }
    public void onFirstFrameRender(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LivePlayTextureView$b.class, "10")) {
          return;
       }
       LivePlayTextureView$b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, LivePlaySurfaceView.class, "4")) {
          LivePlaySurfaceView b = tb.b;
          Objects.requireNonNull(b);
          if (!PatchProxy.applyVoid(objArray, b, SurfaceSnapshotController.class, "6")) {
             b.b("SurfaceSnapshotController", "onFirstFramedRender");
             b.b();
          }
       }
       return;
    }
    public void onVideoSizeChanged(int p0,int p1){
       if (PatchProxy.isSupport(LivePlayTextureView$b.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LivePlayTextureView$b.class, "6")) {
          return;
       }
       this.f = p0;
       this.g = p1;
       this.i();
       return;
    }
    public void prepareForStartAnim(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LivePlayTextureView$b.class, "11")) {
          return;
       }
       this.g();
       LivePlayTextureView$b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, LivePlaySurfaceView.class, "5")) {
          if (tb.b.d()) {
             b.b("LivePlaySurfaceView", "prepareForStartAnim success");
          }else {
             b.a("LivePlaySurfaceView", "prepareForStartAnim failed");
          }
       }
       return;
    }
    public void prepareForStopAnim(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LivePlayTextureView$b.class, "12")) {
          return;
       }
       this.h();
       LivePlayTextureView$b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, LivePlaySurfaceView.class, "6")) {
          tb.b.b();
       }
       return;
    }
    public void setLayerType(int p0,Paint p1){
       a.h(this, p0, p1);
    }
    public void surfaceChanged(SurfaceHolder p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(LivePlayTextureView$b.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, LivePlayTextureView$b.class, "4")) {
          return;
       }
       if (p2 != this.d || p3 != this.e) {
          this.d = p2;
          this.e = p3;
          this.h.onSurfaceTextureSizeChanged(this.c, p2, p3);
       }
       this.h.onSurfaceTextureUpdated(this.c);
       this.i();
       return;
    }
    public void surfaceCreated(SurfaceHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayTextureView$b.class, "3")) {
          return;
       }
       this.d = this.b.getWidth();
       int height = this.b.getHeight();
       this.e = height;
       this.h.onSurfaceTextureAvailable(this.c, this.d, height);
       return;
    }
    public void surfaceDestroyed(SurfaceHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayTextureView$b.class, "5")) {
          return;
       }
       this.d = 0;
       this.e = 0;
       this.h.onSurfaceTextureDestroyed(this.c);
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LivePlayTextureView$b.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SurfaceViewProvider{mViewWidth="+this.d+", mViewHeight="+this.e+", mVideoWidth="+this.f+", mVideoHeight="+this.g+'}';
    }
}

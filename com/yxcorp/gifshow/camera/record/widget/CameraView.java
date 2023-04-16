package com.yxcorp.gifshow.camera.record.widget.CameraView;
import android.widget.FrameLayout;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import android.util.AttributeSet;
import android.graphics.PointF;
import com.yxcorp.gifshow.camera.record.widget.CameraView$d;
import com.yxcorp.gifshow.camera.record.widget.c;
import com.yxcorp.gifshow.camera.record.widget.CameraView$a;
import com.yxcorp.gifshow.camera.record.widget.CameraView$b;
import android.os.Looper;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.switchconfig.a;
import android.content.res.Resources$Theme;
import ll8.c$b;
import android.content.res.TypedArray;
import com.kwai.camerasdk.render.VideoTextureView;
import com.kwai.camerasdk.render.VideoSurfaceView;
import android.widget.FrameLayout$LayoutParams;
import android.view.View;
import m65.f;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.camera.record.widget.FocusView;
import ki9.c;
import android.view.View$OnClickListener;
import android.view.ScaleGestureDetector;
import com.yxcorp.gifshow.camera.record.widget.CameraView$e;
import android.view.ScaleGestureDetector$OnScaleGestureListener;
import android.view.GestureDetector;
import android.os.Handler;
import android.view.GestureDetector$OnGestureListener;
import android.view.TextureView;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import x8c.a;
import java.lang.NullPointerException;
import java.lang.Throwable;
import w46.b;
import android.view.MotionEvent;
import gxc.f;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewGroup;
import gxc.a;
import java.lang.Integer;
import android.view.View$MeasureSpec;
import gxc.d;
import com.yxcorp.gifshow.camera.record.widget.CameraView$c;
import android.view.View$OnTouchListener;
import java.lang.Float;

public class CameraView extends FrameLayout	// class@000fc3
{
    public Handler A;
    public final PointF b;
    public final PointF c;
    public f d;
    public FocusView e;
    public View f;
    public a g;
    public View$OnTouchListener h;
    public d i;
    public float j;
    public boolean k;
    public boolean l;
    public ScaleGestureDetector m;
    public GestureDetector n;
    public CameraView$d o;
    public CameraView$c p;
    public f q;
    public List r;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public final View$OnClickListener y;
    public final View$OnTouchListener z;
    public static final int B;

    static {
       CameraView.B = n.c(a.b(), 0x442f0000);
    }
    public void CameraView(Context p0){
       super(p0, null);
    }
    public void CameraView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void CameraView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new PointF();
       this.c = new PointF();
       this.j = 0xbf800000;
       boolean b = false;
       this.k = b;
       boolean b1 = true;
       this.l = b1;
       this.o = new CameraView$d(this);
       this.s = b;
       this.t = b1;
       this.v = b;
       this.w = b1;
       this.x = b1;
       this.y = new c(this);
       this.z = new CameraView$a(this);
       this.A = new CameraView$b(this, Looper.getMainLooper());
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CameraView.class, "1")) {
       }else if(!a.t().d("DISABLE_TEXTURE_VIEW", b) && (p1 != null && (p0 != null && (p0.getTheme() != null && p0.getTheme().obtainStyledAttributes(p1, c$b.G, b, b).getBoolean(b1, b))))){
          this.d = new VideoTextureView(this.getContext(), null, b);
       }else {
          this.d = new VideoSurfaceView(this.getContext(), null, b);
       }
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-1, -1);
       layoutParams.gravity = 17;
       this.d.getView().setLayoutParams(layoutParams);
       this.addView(this.d.getView());
       FocusView uFocusView = new FocusView(this.getContext(), null, b);
       this.e = uFocusView;
       this.addView(uFocusView, -1, -1);
       View view = new View(p0);
       this.f = view;
       view.setVisibility(8);
       this.f.setBackgroundColor(0xff000000);
       layoutParams = new FrameLayout$LayoutParams(-1, -1);
       layoutParams.gravity = 17;
       this.addView(this.f, layoutParams);
       this.setOnClickListener(new c(this));
       this.m = new ScaleGestureDetector(p0, new CameraView$e(this));
       GestureDetector gestureDetec = new GestureDetector(p0, this.o, new Handler(Looper.getMainLooper()));
       this.n = gestureDetec;
       gestureDetec.setIsLongpressEnabled(this.x);
       CameraView td = this.d;
       if (td instanceof VideoTextureView) {
          td.setKeepScreenOn(this.t);
       }else if(td instanceof VideoSurfaceView && td.getHolder() != null){
          try{
             this.d.getHolder().setKeepScreenOn(this.t);
          }catch(java.lang.NullPointerException e5){
             a.D().e("CameraView", e5.getLocalizedMessage(), e5);
          }
       }
    }
    public final void a(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraView.class, "11")) {
          return;
       }
       CameraView tq = this.q;
       if (tq != null) {
          tq.k0(p0);
       }
       return;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CameraView.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.o.d(false);
       if (this.n.onTouchEvent(p0)) {
          this.a(p0);
          return true;
       }else {
          this.a(p0);
          this.m.onTouchEvent(p0);
          return super.dispatchTouchEvent(p0);
       }
    }
    public a getCameraFocusHandler(){
       return this.g;
    }
    public FocusView getFocusView(){
       return this.e;
    }
    public View getMaskView(){
       return this.f;
    }
    public float getRatio(){
       return this.j;
    }
    public f getSurfaceView(){
       return this.d;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, CameraView.class, "14")) {
          return;
       }
       super.onDetachedFromWindow();
       this.g = null;
       this.A = null;
       return;
    }
    public void onMeasure(int p0,int p1){
       float f;
       float f1;
       float f2;
       if (PatchProxy.isSupport(CameraView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, CameraView.class, "9")) {
          return;
       }
       int mode = View$MeasureSpec.getMode(p1);
       int mode1 = View$MeasureSpec.getMode(p0);
       p1 = FrameLayout.getDefaultSize(this.getSuggestedMinimumHeight(), p1);
       p0 = FrameLayout.getDefaultSize(this.getSuggestedMinimumWidth(), p0);
       CameraView tj = this.j;
       if (tj > 0) {
          if (this.k != null) {
             f = (float)p0;
             f1 = (float)p1;
             if (f - (f1 * tj) > 0) {
             label_004a :
                p1 = (int)((f / tj) + 0x3f000000);
             }
          }else if(mode == 0x40000000 && mode1 == 0x40000000){
             if (mode == 0x40000000) {
                f2 = tj * (float)p1;
             label_0050 :
                p0 = (int)(f2 + 0x3f000000);
             }else if(mode1 == 0x40000000){
                p1 = (int)(((float)p0 / tj) + 0x3f000000);
             }else {
                f = (float)p0;
                f1 = (float)p1;
                if (f - (f1 * tj) <= 0) {
                }
             }
          }
          f2 = tj * f1;
          goto label_0050 ;
       }
       super.onMeasure(View$MeasureSpec.makeMeasureSpec(p0, 0x40000000), View$MeasureSpec.makeMeasureSpec(p1, 0x40000000));
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CameraView.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!(p0.getAction() & 0x00ff)) {
          this.s = 0;
          this.b.set(p0.getX(), p0.getY());
       }
       if ((p0.getAction() & 0x00ff) == Float.MIN_VALUE) {
          this.c.set(p0.getX(), p0.getY());
       }
       return super.onTouchEvent(p0);
    }
    public void setBackgroundColor(int p0){
       if (PatchProxy.isSupport(CameraView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CameraView.class, "8")) {
          return;
       }
       CameraView td = this.d;
       if (td instanceof VideoSurfaceView) {
          td.setBackgroundColor(p0);
       }else if(td instanceof VideoTextureView){
          td.setBackgroundColor(p0);
       }
       return;
    }
    public void setCameraAECompensationListener(d p0){
       this.i = p0;
    }
    public void setCameraFocusHandler(a p0){
       this.g = p0;
    }
    public void setDisableFocus(boolean p0){
       this.u = p0;
    }
    public void setFilterEffectSlide(boolean p0){
       this.v = p0;
    }
    public void setFocusViewActiveAreaProvider(CameraView$c p0){
       this.p = p0;
    }
    public void setGestureListener(f p0){
       this.q = p0;
    }
    public void setIsFullScreen(boolean p0){
       this.k = p0;
    }
    public void setIsLongpressEnabled(boolean p0){
       if (PatchProxy.isSupport(CameraView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, CameraView.class, "2")) {
          return;
       }
       this.x = p0;
       CameraView tn = this.n;
       if (tn != null) {
          tn.setIsLongpressEnabled(p0);
       }
       return;
    }
    public void setOnTouchListener(View$OnTouchListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraView.class, "13")) {
          return;
       }
       this.h = p0;
       super.setOnTouchListener(this.z);
       return;
    }
    public void setRatio(float p0){
       if (PatchProxy.isSupport(CameraView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, CameraView.class, "6")) {
          return;
       }
       if (this.j - p0) {
          this.j = p0;
          this.requestLayout();
       }
       return;
    }
    public void setVisibility(int p0){
       if (PatchProxy.isSupport(CameraView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CameraView.class, "7")) {
          return;
       }
       super.setVisibility(p0);
       this.d.getView().setVisibility(p0);
       return;
    }
    public void setZoomEnabled(boolean p0){
       this.w = p0;
    }
}

package com.kwai.feature.post.api.widget.PrettifyLoadingView;
import android.widget.FrameLayout;
import lnc.a1;
import android.content.Context;
import android.view.animation.RotateAnimation;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.FrameLayout$LayoutParams;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Interpolator;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.ImageView;
import com.kwai.feature.post.api.widget.PrettifyLoadingView$a;
import java.lang.Boolean;
import t46.r;
import java.lang.Runnable;
import android.view.ViewGroup;
import java.lang.Integer;

public class PrettifyLoadingView extends FrameLayout	// class@001478
{
    public KwaiImageView b;
    public Runnable c;
    public final Animation d;
    public int e;
    public int f;
    public long g;
    public PrettifyLoadingView$a h;
    public static final int i;

    static {
       PrettifyLoadingView.i = a1.d(0x7f07030d);
    }
    public void PrettifyLoadingView(Context p0){
       super(p0);
       RotateAnimation rotateAnimat = new RotateAnimation(0, 360.00f, 1, 0x3f000000, 1, 0x3f000000);
       this.d = p0;
       this.a();
    }
    public void PrettifyLoadingView(Context p0,AttributeSet p1){
       super(p0, p1);
       RotateAnimation rotateAnimat = new RotateAnimation(0, 360.00f, 1, 0x3f000000, 1, 0x3f000000);
       this.d = p0;
       this.a();
    }
    public void PrettifyLoadingView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       RotateAnimation rotateAnimat = new RotateAnimation(0, 360.00f, 1, 0x3f000000, 1, 0x3f000000);
       this.d = p0;
       this.a();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, PrettifyLoadingView.class, "1")) {
          return;
       }
       this.b = new KwaiImageView(this.getContext());
       this.addView(this.b, new FrameLayout$LayoutParams(PrettifyLoadingView.i, PrettifyLoadingView.i, 17));
       this.d.setFillAfter(false);
       this.d.setRepeatCount(-1);
       this.d.setDuration(1000);
       this.d.setInterpolator(new LinearInterpolator());
       return;
    }
    public boolean b(){
       boolean b = (this.g > 0)? true: false;
       return b;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, PrettifyLoadingView.class, "4")) {
          return;
       }
       this.setVisibility(0);
       if (this.b()) {
          return;
       }
       PrettifyLoadingView tf = this.f;
       if (tf != null) {
          this.b.y(tf, PrettifyLoadingView.i, PrettifyLoadingView.i);
       }
       this.b.startAnimation(this.d);
       this.g = a1.k();
       tf = this.h;
       if (tf != null) {
          tf.onStart();
       }
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, PrettifyLoadingView.class, "6")) {
          return;
       }
       if (this.b()) {
          this.b.clearAnimation();
       }
       this.g = 0;
       PrettifyLoadingView te = this.e;
       if (te != null) {
          this.b.y(te, PrettifyLoadingView.i, PrettifyLoadingView.i);
       }
       this.setVisibility(8);
       te = this.h;
       if (te != null) {
          te.onStop();
       }
       return;
    }
    public void e(boolean p0){
       if (PatchProxy.isSupport(PrettifyLoadingView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PrettifyLoadingView.class, "5")) {
          return;
       }
       if (p0) {
          this.d();
       }else if(this.b()){
          long l = a1.o(this.g);
          long l1 = 500;
          if (l - l1 < 0) {
             r or = new r(this);
             this.c = or;
             this.postDelayed(or, (l1 - l));
          }else {
             this.d();
          }
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, PrettifyLoadingView.class, "7")) {
          return;
       }
       super.onDetachedFromWindow();
       this.removeCallbacks(this.c);
       this.d();
       return;
    }
    public void setCallback(PrettifyLoadingView$a p0){
       this.h = p0;
    }
    public void setIdleResId(int p0){
       if (PatchProxy.isSupport(PrettifyLoadingView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PrettifyLoadingView.class, "2")) {
          return;
       }
       if (this.e == p0) {
          return;
       }
       this.e = p0;
       if (!this.b() && p0) {
          this.b.y(p0, PrettifyLoadingView.i, PrettifyLoadingView.i);
       }
       return;
    }
    public void setLoadingResId(int p0){
       if (PatchProxy.isSupport(PrettifyLoadingView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PrettifyLoadingView.class, "3")) {
          return;
       }
       if (this.f == p0) {
          return;
       }
       this.f = p0;
       if (this.b() && p0) {
          this.b.y(p0, PrettifyLoadingView.i, PrettifyLoadingView.i);
       }
       return;
    }
}

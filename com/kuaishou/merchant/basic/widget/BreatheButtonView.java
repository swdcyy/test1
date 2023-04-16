package com.kuaishou.merchant.basic.widget.BreatheButtonView;
import ml8.d;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import xm4.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.graphics.Rect;
import android.view.ViewParent;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.animation.ObjectAnimator;
import qt3.f;
import android.animation.Animator$AnimatorListener;
import android.widget.ImageView;
import android.graphics.Bitmap;
import android.widget.TextView;
import java.lang.CharSequence;
import qt3.d;
import java.lang.Runnable;
import ekd.m1;
import java.lang.Long;
import com.yxcorp.utility.TextUtils;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;
import qt3.e;
import java.lang.Integer;
import java.util.Objects;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

public class BreatheButtonView extends FrameLayout implements d	// class@0015f0
{
    public TextView b;
    public ImageView c;
    public ObjectAnimator d;
    public ObjectAnimator e;
    public Runnable f;
    public boolean g;
    public static final int h;

    public void BreatheButtonView(Context p0){
       super(p0, null);
    }
    public void BreatheButtonView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void BreatheButtonView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoidOneRefs(p0, this, BreatheButtonView.class, "1")) {
       }else {
          a.b(p0, R.layout.arg_RES_7f0d167f, this);
       }
       return;
    }
    public void a(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, BreatheButtonView.class, "21")) {
          return;
       }
       BreatheButtonView obj = PatchProxy.apply(objArray, this, BreatheButtonView.class, "22");
       int i = 0;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          Rect rect = new Rect();
          b = (this.getGlobalVisibleRect(rect) && ((float)rect.width() - ((float)this.getMeasuredWidth() * this.getParent().getScaleX()) < 0 || (float)rect.height() - ((float)this.getMeasuredHeight() * this.getParent().getScaleY()) < 0))? true: false;
       }
       if (!b && (this.getVisibility() == 4 || this.g == null)) {
          if (!PatchProxy.applyVoid(objArray, this, BreatheButtonView.class, "16")) {
             obj = this.e;
             if (obj != null) {
                obj.cancel();
                this.e = objArray;
             }
          }
       }else if(PatchProxy.applyVoid(objArray, this, BreatheButtonView.class, "15")){
          if (this.e == null) {
             PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(FrameLayout.SCALE_X, new float[2]{0x3f800000,0x3f666666}),PropertyValuesHolder.ofFloat(FrameLayout.SCALE_Y, new float[2]{0x3f800000,0x3f666666})};
             ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(this, propertyValu);
             this.e = objectAnimat;
             objectAnimat.setRepeatMode(2);
             this.e.setRepeatCount(-1);
             this.e.setDuration(500);
             this.e.addListener(new f(this));
          }
          if (!this.e.isRunning()) {
             this.e.start();
          }
       }
       return;
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BreatheButtonView.class, "17")) {
          return;
       }
       this.setVisibility(0);
       this.c.setVisibility(4);
       this.c.setImageBitmap(null);
       this.b.setVisibility(0);
       this.b.setText(p0);
       if (!this.f()) {
          if (this.f == null) {
             this.f = new d(this);
          }
          this.b.post(this.f);
       }
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, BreatheButtonView.class, "20")) {
          return;
       }
       this.c.setVisibility(4);
       this.b.setVisibility(4);
       this.setVisibility(4);
       return;
    }
    public void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BreatheButtonView.class, "8")) {
          return;
       }
       if (!PatchProxy.isSupport(BreatheButtonView.class) || !PatchProxy.applyVoidTwoRefs(p0, Boolean.FALSE, this, BreatheButtonView.class, "9")) {
          this.e(p0, false, 0);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BreatheButtonView.class, "3")) {
          return;
       }
       this.c = m1.f(p0, 0x7f0a1387);
       this.b = m1.f(p0, 0x7f0a3e53);
       return;
    }
    public final void e(String p0,boolean p1,long p2){
       if (PatchProxy.isSupport(BreatheButtonView.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Long.valueOf(p2), this, BreatheButtonView.class, "11")) {
          return;
       }
       if (TextUtils.x(p0)) {
          this.c();
          return;
       }else if(p1){
          if (!PatchProxy.isSupport(BreatheButtonView.class) || !PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p2), this, BreatheButtonView.class, "13")) {
             PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(FrameLayout.SCALE_X, new float[2]{0x3f4ccccd,0x3f800000}),PropertyValuesHolder.ofFloat(FrameLayout.SCALE_Y, new float[2]{0x3f4ccccd,0x3f800000}),PropertyValuesHolder.ofFloat(FrameLayout.ALPHA, new float[2]{0,0x3f800000})};
             ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(this, propertyValu);
             this.d = objectAnimat;
             objectAnimat.setDuration(350);
             this.d.setInterpolator(new AccelerateDecelerateInterpolator());
             this.d.setStartDelay(p2);
             this.d.addListener(new e(this, p0));
             this.d.start();
          }
       }else {
          this.b(p0);
          this.a();
       }
       return;
    }
    public final boolean f(){
       Bitmap uBitmap;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(null, this, BreatheButtonView.class, "18");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       int width = this.b.getWidth();
       int height = this.b.getHeight();
       if (width <= 0 || height <= 0) {
          return 0;
       }
       if (!PatchProxy.isSupport(BreatheButtonView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(width), Integer.valueOf(height), this, BreatheButtonView.class, "19")) {
          BreatheButtonView tc = this.c;
          if (PatchProxy.isSupport(BreatheButtonView.class)) {
             uBitmap = PatchProxy.applyTwoRefs(Integer.valueOf(width), Integer.valueOf(height), this, BreatheButtonView.class, "14");
             if (uBitmap != patchProxyRe) {
             label_007d :
                tc.setImageBitmap(uBitmap);
                this.c.setVisibility(0);
                this.a();
             }
          }
          Objects.toString(this.b.getText());
          uBitmap = Bitmap.createBitmap(width, height, Bitmap$Config.ARGB_8888);
          this.b.layout(0, 0, width, height);
          this.b.draw(new Canvas(uBitmap));
          goto label_007d ;
       }
       return true;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, BreatheButtonView.class, "5")) {
          return;
       }
       super.onAttachedToWindow();
       this.g = true;
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, BreatheButtonView.class, "6")) {
          return;
       }
       super.onDetachedFromWindow();
       this.g = false;
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, BreatheButtonView.class, "2")) {
          return;
       }
       super.onFinishInflate();
       this.doBindView(this);
       return;
    }
    public void setBackground(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BreatheButtonView.class, "4")) {
          return;
       }
       this.b.setBackground(p0);
       return;
    }
    public void setText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BreatheButtonView.class, "7")) {
          return;
       }
       this.d(p0);
       return;
    }
}

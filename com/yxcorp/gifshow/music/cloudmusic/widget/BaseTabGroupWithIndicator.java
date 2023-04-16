package com.yxcorp.gifshow.music.cloudmusic.widget.BaseTabGroupWithIndicator;
import t46.a0;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.yxcorp.gifshow.music.cloudmusic.widget.BaseTabIndicatorView;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;
import com.yxcorp.gifshow.music.cloudmusic.widget.a;
import java.lang.Runnable;
import com.kwai.library.widget.popup.common.f;
import android.view.ViewGroup$MarginLayoutParams;

public abstract class BaseTabGroupWithIndicator extends FrameLayout implements a0	// class@002048
{
    public View b;
    public BaseTabIndicatorView c;
    public int d;
    public int e;
    public static final int f;

    public void BaseTabGroupWithIndicator(Context p0){
       super(p0, null, 0);
    }
    public void BaseTabGroupWithIndicator(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void BaseTabGroupWithIndicator(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.d = a1.e(3.50f);
       this.e = a1.e(12.00f);
       if (PatchProxy.applyVoid(null, this, BaseTabGroupWithIndicator.class, "1")) {
       }else {
          BaseTabGroupWithIndicator tc = this.c;
          if (tc != null) {
             this.removeView(tc);
          }
          this.c = this.g(this.getContext());
          FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(this.e, this.d);
          layoutParams.gravity = 83;
          this.c.setLayoutParams(layoutParams);
          this.addView(this.c);
       }
       return;
    }
    public int a(float p0){
       if (PatchProxy.isSupport(BaseTabGroupWithIndicator.class)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, BaseTabGroupWithIndicator.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       this.c.setScaleX(this.f(p0));
       return this.e;
    }
    public int b(float p0){
       if (PatchProxy.isSupport(BaseTabGroupWithIndicator.class)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, BaseTabGroupWithIndicator.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = (int)((float)this.e * this.f(p0));
       this.setWidth(i);
       return i;
    }
    public float c(View p0,int p1){
       if (PatchProxy.isSupport(BaseTabGroupWithIndicator.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, BaseTabGroupWithIndicator.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       float f = 0;
       if (p0 == null || this.c == null) {
          return f;
       }else if(!p0.getWidth()){
          return f;
       }else {
          return ((float)((this.getParentView().getLeft() + p0.getLeft()) + (p0.getWidth() / 2)) - ((float)p1 / 2.00f));
       }
    }
    public void d(View p0,View p1,float p2){
       if (PatchProxy.isSupport(BaseTabGroupWithIndicator.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Float.valueOf(p2), this, BaseTabGroupWithIndicator.class, "7")) {
          return;
       }
       f.G(p0, new a(this, p1, p0, p2));
       return;
    }
    public void e(int p0,int p1){
       if (PatchProxy.isSupport(BaseTabGroupWithIndicator.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, BaseTabGroupWithIndicator.class, "2")) {
          return;
       }
       this.e = p0;
       this.d = p1;
       ViewGroup$LayoutParams layoutParams = this.c.getLayoutParams();
       if (layoutParams == null) {
          return;
       }
       layoutParams.width = p0;
       layoutParams.height = p1;
       this.c.setLayoutParams(layoutParams);
       return;
    }
    public float f(float p0){
       if (p0 - 0x3f000000 > 0) {
          return (3.00f - (p0 * 2.00f));
       }
       return ((p0 * 2.00f) + 0x3f800000);
    }
    public abstract BaseTabIndicatorView g(Context p0);
    public int getIndicatorDefaultWidth(){
       return this.e;
    }
    public float getIndicatorTranslateX(){
       Object obj = PatchProxy.apply(null, this, BaseTabGroupWithIndicator.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.c.getTranslationX();
    }
    public int getIndicatorWidth(){
       Object obj = PatchProxy.apply(null, this, BaseTabGroupWithIndicator.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.c.getWidth();
    }
    public View getParentView(){
       return this.b;
    }
    public void h(View p0,View p1,float p2){
    }
    public void setIndicatorCorner(float p0){
       if (PatchProxy.isSupport(BaseTabGroupWithIndicator.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, BaseTabGroupWithIndicator.class, "8")) {
          return;
       }
       this.c.setCorner(p0);
       return;
    }
    public void setIndicatorTranslateX(float p0){
       if (PatchProxy.isSupport(BaseTabGroupWithIndicator.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, BaseTabGroupWithIndicator.class, "6")) {
          return;
       }
       this.c.setTranslationX(p0);
       return;
    }
    public void setMarginBottom(int p0){
       if (PatchProxy.isSupport(BaseTabGroupWithIndicator.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, BaseTabGroupWithIndicator.class, "9")) {
          return;
       }
       if (!this.c.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
          return;
       }
       ViewGroup$MarginLayoutParams layoutParams = this.c.getLayoutParams();
       if (layoutParams.bottomMargin == p0) {
          return;
       }
       layoutParams.bottomMargin = p0;
       this.c.setLayoutParams(layoutParams);
       return;
    }
    public void setTabContainerView(View p0){
       this.b = p0;
    }
    public void setWidth(int p0){
       if (PatchProxy.isSupport(BaseTabGroupWithIndicator.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, BaseTabGroupWithIndicator.class, "12")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = this.c.getLayoutParams();
       if (layoutParams != null && layoutParams.width != p0) {
          layoutParams.width = p0;
          this.c.setLayoutParams(layoutParams);
       }
       return;
    }
}

package com.yxcorp.gifshow.magic.ui.widget.PostGroupWithIndicatorExt;
import t46.a0;
import com.kwai.feature.post.api.widget.PostGroupWithIndicator;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.FrameLayout;
import com.kwai.feature.post.api.widget.CornerView;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;
import com.yxcorp.gifshow.magic.ui.widget.b;
import java.lang.Runnable;
import com.kwai.library.widget.popup.common.f;
import android.view.ViewGroup$MarginLayoutParams;

public class PostGroupWithIndicatorExt extends PostGroupWithIndicator implements a0	// class@001c4e
{
    public View m;
    public static final int n;

    public void PostGroupWithIndicatorExt(Context p0){
       super(p0, null, 0);
    }
    public void PostGroupWithIndicatorExt(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void PostGroupWithIndicatorExt(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, PostGroupWithIndicatorExt.class, "1")) {
       }else {
          PostGroupWithIndicator tb = this.b;
          if (tb != null) {
             this.removeView(tb);
          }
          this.b = new CornerView(this.getContext());
          FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(this.e, this.d);
          layoutParams.gravity = 83;
          this.b.setLayoutParams(layoutParams);
          this.addView(this.b);
       }
       return;
    }
    public int a(float p0){
       if (PatchProxy.isSupport(PostGroupWithIndicatorExt.class)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, PostGroupWithIndicatorExt.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       this.b.setScaleX(this.l(p0));
       return this.e;
    }
    public int b(float p0){
       Object obj;
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(PostGroupWithIndicatorExt.class)) {
          obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, PostGroupWithIndicatorExt.class, "10");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       if (PatchProxy.isSupport(PostGroupWithIndicatorExt.class)) {
          obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, PostGroupWithIndicatorExt.class, "4");
          if (obj != patchProxyRe) {
             i = obj.intValue();
          label_0046 :
             this.setWidth(i);
             return i;
          }
       }
       i = (int)((float)this.e * this.l(p0));
       goto label_0046 ;
    }
    public float c(View p0,int p1){
       if (PatchProxy.isSupport(PostGroupWithIndicatorExt.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, PostGroupWithIndicatorExt.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       float f = 0;
       if (p0 == null || this.b == null) {
          return f;
       }else if(!p0.getWidth()){
          return f;
       }else {
          return ((float)((this.getParentView().getLeft() + p0.getLeft()) + (p0.getWidth() / 2)) - ((float)p1 / 2.00f));
       }
    }
    public void d(View p0,View p1,float p2){
       if (PatchProxy.isSupport(PostGroupWithIndicatorExt.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Float.valueOf(p2), this, PostGroupWithIndicatorExt.class, "2")) {
          return;
       }
       f.G(p0, new b(this, p1, p0, p2));
       return;
    }
    public void e(int p0,int p1){
       if (PatchProxy.isSupport(PostGroupWithIndicatorExt.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, PostGroupWithIndicatorExt.class, "5")) {
          return;
       }
       this.e = p0;
       this.d = p1;
       ViewGroup$LayoutParams layoutParams = this.b.getLayoutParams();
       if (layoutParams == null) {
          return;
       }
       layoutParams.width = p0;
       layoutParams.height = p1;
       this.b.setLayoutParams(layoutParams);
       return;
    }
    public void f(){
    }
    public void g(){
    }
    public int getIndicatorDefaultWidth(){
       return this.e;
    }
    public float getIndicatorTranslateX(){
       Object obj = PatchProxy.apply(null, this, PostGroupWithIndicatorExt.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.b.getTranslationX();
    }
    public int getIndicatorWidth(){
       Object obj = PatchProxy.apply(null, this, PostGroupWithIndicatorExt.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.getWidth();
    }
    public View getParentView(){
       return this.m;
    }
    public float l(float p0){
       if (p0 - 0x3f000000 > 0) {
          return (3.00f - (p0 * 2.00f));
       }
       return ((p0 * 2.00f) + 0x3f800000);
    }
    public float m(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostGroupWithIndicatorExt.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.c(p0, this.b.getWidth());
    }
    public void setIndicatorCorner(float p0){
       if (PatchProxy.isSupport(PostGroupWithIndicatorExt.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, PostGroupWithIndicatorExt.class, "3")) {
          return;
       }
       this.b.setCorner(p0);
       return;
    }
    public void setIndicatorTranslateX(float p0){
       if (PatchProxy.isSupport(PostGroupWithIndicatorExt.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, PostGroupWithIndicatorExt.class, "14")) {
          return;
       }
       this.b.setTranslationX(p0);
       return;
    }
    public void setMarginBottom(int p0){
       if (PatchProxy.isSupport(PostGroupWithIndicatorExt.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PostGroupWithIndicatorExt.class, "6")) {
          return;
       }
       if (!this.b.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
          return;
       }
       ViewGroup$MarginLayoutParams layoutParams = this.b.getLayoutParams();
       if (layoutParams.bottomMargin == p0) {
          return;
       }
       layoutParams.bottomMargin = p0;
       this.b.setLayoutParams(layoutParams);
       return;
    }
    public void setTabContainerView(View p0){
       this.m = p0;
    }
    public void setWidth(int p0){
       if (PatchProxy.isSupport(PostGroupWithIndicatorExt.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PostGroupWithIndicatorExt.class, "7")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = this.b.getLayoutParams();
       if (layoutParams != null && layoutParams.width != p0) {
          layoutParams.width = p0;
          this.b.setLayoutParams(layoutParams);
       }
       return;
    }
}

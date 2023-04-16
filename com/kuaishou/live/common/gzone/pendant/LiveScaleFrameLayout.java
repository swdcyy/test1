package com.kuaishou.live.common.gzone.pendant.LiveScaleFrameLayout;
import ya1.m;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.view.ViewGroup;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View$MeasureSpec;
import java.lang.Float;

public class LiveScaleFrameLayout extends FrameLayout implements m	// class@0017da
{
    public float b;
    public FrameLayout c;

    public void LiveScaleFrameLayout(Context p0){
       super(p0, null);
    }
    public void LiveScaleFrameLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveScaleFrameLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = 0x3f800000;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, LiveScaleFrameLayout.class, "12")) {
          return;
       }
       if (this.c == null) {
          FrameLayout uFrameLayout = new FrameLayout(this.getContext());
          this.c = uFrameLayout;
          uFrameLayout.setPivotX(0);
          this.c.setPivotY(0);
          this.c.setScaleX(this.b);
          this.c.setScaleY(this.b);
          this.c.setClipChildren(this.getClipChildren());
          this.c.setClipToPadding(this.getClipChildren());
          if (this.getLayoutParams() != null) {
             this.addView(this.c, new ViewGroup$LayoutParams(this.getLayoutParams().width, this.getLayoutParams().height));
          }else {
             this.addView(this.c);
          }
       }
       return;
    }
    public void addView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveScaleFrameLayout.class, "5")) {
          return;
       }
       if (p0 == this.c) {
          super.addView(p0);
          return;
       }else {
          this.a();
          this.c.addView(p0);
          return;
       }
    }
    public void addView(View p0,int p1,int p2){
       if (PatchProxy.isSupport(LiveScaleFrameLayout.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, LiveScaleFrameLayout.class, "6")) {
          return;
       }
       this.a();
       this.c.addView(p0, p1, p2);
       return;
    }
    public void addView(View p0,int p1,ViewGroup$LayoutParams p2){
       if (PatchProxy.isSupport(LiveScaleFrameLayout.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, LiveScaleFrameLayout.class, "8")) {
          return;
       }
       if (p0 == this.c) {
          super.addView(p0, p1, p2);
          return;
       }else {
          this.a();
          this.c.addView(p0, p1, p2);
          return;
       }
    }
    public boolean addViewInLayout(View p0,int p1,ViewGroup$LayoutParams p2){
       if (PatchProxy.isSupport(LiveScaleFrameLayout.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, LiveScaleFrameLayout.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return super.addViewInLayout(p0, p1, p2);
    }
    public float getScale(){
       return this.b;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(LiveScaleFrameLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LiveScaleFrameLayout.class, "2")) {
          return;
       }
       if (!this.b - 0x3f800000) {
          super.onMeasure(p0, p1);
          return;
       }else {
          p0 = 0;
          super.onMeasure(View$MeasureSpec.makeMeasureSpec(p0, p0), View$MeasureSpec.makeMeasureSpec(p0, p0));
          p1 = this.getMeasuredWidth();
          int measuredHeig = this.getMeasuredHeight();
          if (this.getChildCount() > 0) {
             this.setMeasuredDimension((int)((float)p1 * this.getChildAt(p0).getScaleX()), (int)((float)measuredHeig * this.getChildAt(p0).getScaleY()));
             this.forceLayout();
          }
          return;
       }
    }
    public void setClipChildren(boolean p0){
       if (PatchProxy.isSupport(LiveScaleFrameLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveScaleFrameLayout.class, "11")) {
          return;
       }
       super.setClipChildren(p0);
       LiveScaleFrameLayout tc = this.c;
       if (tc != null) {
          tc.setClipChildren(p0);
       }
       return;
    }
    public void setClipToPadding(boolean p0){
       if (PatchProxy.isSupport(LiveScaleFrameLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveScaleFrameLayout.class, "10")) {
          return;
       }
       super.setClipToPadding(p0);
       LiveScaleFrameLayout tc = this.c;
       if (tc != null) {
          tc.setClipToPadding(p0);
       }
       return;
    }
    public void setLayoutParams(ViewGroup$LayoutParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveScaleFrameLayout.class, "9")) {
          return;
       }
       LiveScaleFrameLayout tc = this.c;
       if (tc != null && tc.getLayoutParams() != null) {
          this.c.getLayoutParams().height = p0.height;
          this.c.getLayoutParams().width = p0.width;
       }
       super.setLayoutParams(p0);
       return;
    }
    public void setScale(float p0){
       if (PatchProxy.isSupport(LiveScaleFrameLayout.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, LiveScaleFrameLayout.class, "1")) {
          return;
       }
       if (!this.b - p0) {
          return;
       }
       this.b = p0;
       LiveScaleFrameLayout tc = this.c;
       if (tc != null) {
          tc.setPivotX(0);
          this.c.setPivotY(0);
          this.c.setScaleX(p0);
          this.c.setScaleY(p0);
       }
       return;
    }
    public void setScaleX(float p0){
       if (PatchProxy.isSupport(LiveScaleFrameLayout.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, LiveScaleFrameLayout.class, "3")) {
          return;
       }
       this.setScale(p0);
       return;
    }
    public void setScaleY(float p0){
       if (PatchProxy.isSupport(LiveScaleFrameLayout.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, LiveScaleFrameLayout.class, "4")) {
          return;
       }
       this.setScale(p0);
       return;
    }
}

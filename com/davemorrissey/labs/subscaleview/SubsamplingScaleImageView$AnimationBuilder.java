package com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView$AnimationBuilder;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.lang.Object;
import android.graphics.PointF;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView$1;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView$Anim;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView$OnAnimationEventListener;
import android.view.View;
import java.lang.System;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView$ScaleAndTranslate;
import java.lang.Integer;
import java.util.List;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;

public final class SubsamplingScaleImageView$AnimationBuilder	// class@000faf
{
    public long duration;
    public int easing;
    public boolean interruptible;
    public SubsamplingScaleImageView$OnAnimationEventListener listener;
    public int origin;
    public boolean panLimited;
    public final PointF targetSCenter;
    public final float targetScale;
    public final SubsamplingScaleImageView this$0;
    public final PointF vFocus;

    public void SubsamplingScaleImageView$AnimationBuilder(SubsamplingScaleImageView p0,float p1){
       this.this$0 = p0;
       super();
       this.duration = 500;
       this.easing = 2;
       this.origin = 1;
       this.interruptible = true;
       this.panLimited = true;
       this.targetScale = p1;
       this.targetSCenter = p0.getCenter();
       this.vFocus = null;
    }
    public void SubsamplingScaleImageView$AnimationBuilder(SubsamplingScaleImageView p0,float p1,PointF p2){
       this.this$0 = p0;
       super();
       this.duration = 500;
       this.easing = 2;
       this.origin = 1;
       this.interruptible = true;
       this.panLimited = true;
       this.targetScale = p1;
       this.targetSCenter = p2;
       this.vFocus = null;
    }
    public void SubsamplingScaleImageView$AnimationBuilder(SubsamplingScaleImageView p0,float p1,PointF p2,PointF p3){
       this.this$0 = p0;
       super();
       this.duration = 500;
       this.easing = 2;
       this.origin = 1;
       this.interruptible = true;
       this.panLimited = true;
       this.targetScale = p1;
       this.targetSCenter = p2;
       this.vFocus = p3;
    }
    public void SubsamplingScaleImageView$AnimationBuilder(SubsamplingScaleImageView p0,float p1,PointF p2,PointF p3,SubsamplingScaleImageView$1 p4){
       super(p0, p1, p2, p3);
    }
    public void SubsamplingScaleImageView$AnimationBuilder(SubsamplingScaleImageView p0,float p1,PointF p2,SubsamplingScaleImageView$1 p3){
       super(p0, p1, p2);
    }
    public void SubsamplingScaleImageView$AnimationBuilder(SubsamplingScaleImageView p0,float p1,SubsamplingScaleImageView$1 p2){
       super(p0, p1);
    }
    public void SubsamplingScaleImageView$AnimationBuilder(SubsamplingScaleImageView p0,PointF p1){
       this.this$0 = p0;
       super();
       this.duration = 500;
       this.easing = 2;
       this.origin = 1;
       this.interruptible = true;
       this.panLimited = true;
       this.targetScale = p0.scale;
       this.targetSCenter = p1;
       this.vFocus = null;
    }
    public void SubsamplingScaleImageView$AnimationBuilder(SubsamplingScaleImageView p0,PointF p1,SubsamplingScaleImageView$1 p2){
       super(p0, p1);
    }
    public void start(){
       int i;
       int i1;
       float f;
       SubsamplingScaleImageView$AnimationBuilder ttargetSCent;
       PointF pointF;
       SubsamplingScaleImageView$1 u1;
       SubsamplingScaleImageView anim1;
       SubsamplingScaleImageView$AnimationBuilder tvFocus;
       float f1;
       float f2;
       SubsamplingScaleImageView$ScaleAndTranslate scaleAndTran;
       SubsamplingScaleImageView$AnimationBuilder tvFocus1;
       SubsamplingScaleImageView anim = this.this$0.anim;
       if (anim != null) {
          SubsamplingScaleImageView$Anim listener = anim.listener;
          if (listener != null) {
             try{
                listener.onInterruptedByNewAnim();
             }catch(java.lang.Exception e0){
                String tAG = SubsamplingScaleImageView.TAG;
             }
          }
       }
    }
    public SubsamplingScaleImageView$AnimationBuilder withDuration(long p0){
       this.duration = p0;
       return this;
    }
    public SubsamplingScaleImageView$AnimationBuilder withEasing(int p0){
       if (!SubsamplingScaleImageView.VALID_EASING_STYLES.contains(Integer.valueOf(p0))) {
          throw new IllegalArgumentException("Unknown easing type: "+p0);
       }
       this.easing = p0;
       return this;
    }
    public SubsamplingScaleImageView$AnimationBuilder withInterruptible(boolean p0){
       this.interruptible = p0;
       return this;
    }
    public SubsamplingScaleImageView$AnimationBuilder withOnAnimationEventListener(SubsamplingScaleImageView$OnAnimationEventListener p0){
       this.listener = p0;
       return this;
    }
    public SubsamplingScaleImageView$AnimationBuilder withOrigin(int p0){
       this.origin = p0;
       return this;
    }
    public SubsamplingScaleImageView$AnimationBuilder withPanLimited(boolean p0){
       this.panLimited = p0;
       return this;
    }
}

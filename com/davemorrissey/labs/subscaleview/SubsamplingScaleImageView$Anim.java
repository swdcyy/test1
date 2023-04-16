package com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView$Anim;
import java.lang.Object;
import java.lang.System;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView$1;

public class SubsamplingScaleImageView$Anim	// class@000fae
{
    public long duration;
    public int easing;
    public boolean interruptible;
    public SubsamplingScaleImageView$OnAnimationEventListener listener;
    public int origin;
    public PointF sCenterEnd;
    public PointF sCenterEndRequested;
    public PointF sCenterStart;
    public float scaleEnd;
    public float scaleStart;
    public long time;
    public PointF vFocusEnd;
    public PointF vFocusStart;

    public void SubsamplingScaleImageView$Anim(){
       super();
       this.duration = 500;
       this.interruptible = true;
       this.easing = 2;
       this.origin = 1;
       this.time = System.currentTimeMillis();
    }
    public void SubsamplingScaleImageView$Anim(SubsamplingScaleImageView$1 p0){
       super();
    }
}

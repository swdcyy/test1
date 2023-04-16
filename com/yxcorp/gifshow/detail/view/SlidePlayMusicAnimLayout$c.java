package com.yxcorp.gifshow.detail.view.SlidePlayMusicAnimLayout$c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.detail.view.SlidePlayMusicAnimLayout;
import android.view.View;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.PointF;
import java.lang.Float;

public class SlidePlayMusicAnimLayout$c implements ValueAnimator$AnimatorUpdateListener	// class@001a66
{
    public View a;
    public final SlidePlayMusicAnimLayout b;

    public void SlidePlayMusicAnimLayout$c(SlidePlayMusicAnimLayout p0,View p1){
       this.b = p0;
       super();
       this.a = p1;
    }
    public void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayMusicAnimLayout$c.class, "1")) {
          return;
       }
       PointF animatedValu = p0.getAnimatedValue();
       SlidePlayMusicAnimLayout$c ta = this.a;
       if (ta != null) {
          ta.setX(animatedValu.x);
          this.a.setY(animatedValu.y);
          float animatedFrac = p0.getAnimatedFraction();
          if (!PatchProxy.isSupport(SlidePlayMusicAnimLayout$c.class) || !PatchProxy.applyVoidOneRefs(Float.valueOf(animatedFrac), this, SlidePlayMusicAnimLayout$c.class, "4")) {
             double d = (double)animatedFrac;
             if (d - 0x3fd51eb851eb851f <= 0) {
                this.a.setAlpha((animatedFrac * 0x4007c1f0));
             }else if(d - 0x3fe51eb851eb851f >= 0){
                float f = 0x3f800000;
                if (animatedFrac - f <= 0) {
                   this.a.setAlpha(((f - animatedFrac) * 2.06f));
                }
             }
          }
          animatedFrac = p0.getAnimatedFraction();
          if (PatchProxy.isSupport(SlidePlayMusicAnimLayout$c.class) && (!PatchProxy.applyVoidOneRefs(Float.valueOf(animatedFrac), this, SlidePlayMusicAnimLayout$c.class, "3") && (double)animatedFrac - 0x3fdf5c28f5c28f5c <= 0)) {
             animatedFrac = (animatedFrac * 0x3fb6db6d) + 0.30f;
             this.a.setScaleX(animatedFrac);
             this.a.setScaleY(animatedFrac);
          }
          float animatedFrac1 = p0.getAnimatedFraction();
          if (!PatchProxy.isSupport(SlidePlayMusicAnimLayout$c.class) || !PatchProxy.applyVoidOneRefs(Float.valueOf(animatedFrac1), this, SlidePlayMusicAnimLayout$c.class, "2")) {
             animatedFrac1 = ((double)animatedFrac1 - 0x3fe0000000000000 <= 0)? (animatedFrac1 * -70.00f) + 35.00f: (animatedFrac1 * 70.00f) - 35.00f;
             this.a.setRotation((- animatedFrac1));
          }
       }
       return;
    }
}

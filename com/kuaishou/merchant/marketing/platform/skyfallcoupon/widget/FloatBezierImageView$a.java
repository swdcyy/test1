package com.kuaishou.merchant.marketing.platform.skyfallcoupon.widget.FloatBezierImageView$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.widget.FloatBezierImageView;
import android.view.View;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.PointF;

public class FloatBezierImageView$a implements ValueAnimator$AnimatorUpdateListener	// class@001b61
{
    public View a;
    public final FloatBezierImageView b;

    public void FloatBezierImageView$a(FloatBezierImageView p0,View p1){
       this.b = p0;
       super();
       this.a = p1;
    }
    public void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FloatBezierImageView$a.class, "1")) {
          return;
       }
       PointF animatedValu = p0.getAnimatedValue();
       this.a.setX(animatedValu.x);
       this.a.setY(animatedValu.y);
       return;
    }
}

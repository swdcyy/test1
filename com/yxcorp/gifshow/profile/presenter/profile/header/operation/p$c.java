package com.yxcorp.gifshow.profile.presenter.profile.header.operation.p$c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.View;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.PointF;

public class p$c implements ValueAnimator$AnimatorUpdateListener	// class@001514
{
    public final View a;

    public void p$c(View p0){
       super();
       this.a = p0;
    }
    public void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p$c.class, "1")) {
          return;
       }
       PointF animatedValu = p0.getAnimatedValue();
       this.a.setX(animatedValu.x);
       this.a.setY(animatedValu.y);
       return;
    }
}

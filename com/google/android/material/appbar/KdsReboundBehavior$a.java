package com.google.android.material.appbar.KdsReboundBehavior$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.google.android.material.appbar.KdsReboundBehavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Integer;

public class KdsReboundBehavior$a implements ValueAnimator$AnimatorUpdateListener	// class@001628
{
    public final CoordinatorLayout a;
    public final AppBarLayout b;
    public final KdsReboundBehavior c;

    public void KdsReboundBehavior$a(KdsReboundBehavior p0,CoordinatorLayout p1,AppBarLayout p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onAnimationUpdate(ValueAnimator p0){
       this.c.Y(this.a, this.b, p0.getAnimatedValue().intValue(), 2);
    }
}

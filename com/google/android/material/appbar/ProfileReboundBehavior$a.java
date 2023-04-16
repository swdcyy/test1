package com.google.android.material.appbar.ProfileReboundBehavior$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.google.android.material.appbar.ProfileReboundBehavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Integer;

public class ProfileReboundBehavior$a implements ValueAnimator$AnimatorUpdateListener	// class@00162c
{
    public final CoordinatorLayout a;
    public final AppBarLayout b;
    public final ProfileReboundBehavior c;

    public void ProfileReboundBehavior$a(ProfileReboundBehavior p0,CoordinatorLayout p1,AppBarLayout p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onAnimationUpdate(ValueAnimator p0){
       this.c.a0(this.a, this.b, p0.getAnimatedValue().intValue(), 2);
    }
}

package com.google.android.material.appbar.AppBarLayout$BaseBehavior$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Integer;
import android.view.View;
import com.google.android.material.appbar.HeaderBehavior;

public class AppBarLayout$BaseBehavior$a implements ValueAnimator$AnimatorUpdateListener	// class@00160d
{
    public final CoordinatorLayout a;
    public final AppBarLayout b;
    public final AppBarLayout$BaseBehavior c;

    public void AppBarLayout$BaseBehavior$a(AppBarLayout$BaseBehavior p0,CoordinatorLayout p1,AppBarLayout p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onAnimationUpdate(ValueAnimator p0){
       this.c.setHeaderTopBottomOffset(this.a, this.b, p0.getAnimatedValue().intValue());
    }
}

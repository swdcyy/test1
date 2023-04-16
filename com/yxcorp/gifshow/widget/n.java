package com.yxcorp.gifshow.widget.n;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.widget.ExpandableFloatButton;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.util.Objects;
import android.widget.TextView;
import tyc.c1;
import lnc.c3$a;
import lnc.c3;

public final class n implements ValueAnimator$AnimatorUpdateListener	// class@00199a
{
    public final ExpandableFloatButton a;
    public final int b;
    public final int c;

    public void n(ExpandableFloatButton p0,int p1,int p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       n ta = this.a;
       Objects.requireNonNull(ta);
       float animatedFrac = p0.getAnimatedFraction();
       ta.setPadding((int)((float)ta.r + ((float)this.b * animatedFrac)), ta.getPaddingTop(), (int)((float)ta.s + ((float)this.c * animatedFrac)), ta.getPaddingBottom());
       c3.c(ta.n, new c1(p0));
    }
}

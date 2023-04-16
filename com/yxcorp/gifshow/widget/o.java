package com.yxcorp.gifshow.widget.o;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.widget.ExpandableFloatButton;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.util.Objects;
import android.widget.TextView;
import tyc.d1;
import lnc.c3$a;
import lnc.c3;

public final class o implements ValueAnimator$AnimatorUpdateListener	// class@00199b
{
    public final ExpandableFloatButton a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public void o(ExpandableFloatButton p0,int p1,int p2,int p3,int p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       o ta = this.a;
       Objects.requireNonNull(ta);
       float animatedFrac = p0.getAnimatedFraction();
       ta.setPadding((int)((float)this.b - ((float)this.c * animatedFrac)), ta.getPaddingTop(), (int)((float)this.d - ((float)this.e * animatedFrac)), ta.getPaddingBottom());
       c3.c(ta.o, new d1(p0));
    }
}

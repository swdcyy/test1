package com.tachikoma.component.scroll.TKHorizontalScrollView$c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.tachikoma.component.scroll.TKHorizontalScrollView;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.widget.HorizontalScrollView;

public class TKHorizontalScrollView$c implements ValueAnimator$AnimatorUpdateListener	// class@000d1a
{
    public final int a;
    public final TKHorizontalScrollView b;

    public void TKHorizontalScrollView$c(TKHorizontalScrollView p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKHorizontalScrollView$c.class, "1")) {
          return;
       }
       this.b.scrollTo(p0.getAnimatedValue().intValue(), this.a);
       return;
    }
}

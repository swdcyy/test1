package com.tachikoma.component.scroll.TKVerticalScrollView$c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.tachikoma.component.scroll.TKVerticalScrollView;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.widget.ScrollView;

public class TKVerticalScrollView$c implements ValueAnimator$AnimatorUpdateListener	// class@000d22
{
    public final int a;
    public final TKVerticalScrollView b;

    public void TKVerticalScrollView$c(TKVerticalScrollView p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKVerticalScrollView$c.class, "1")) {
          return;
       }
       this.b.scrollTo(this.a, p0.getAnimatedValue().intValue());
       return;
    }
}

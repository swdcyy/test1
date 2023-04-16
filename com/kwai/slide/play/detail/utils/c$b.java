package com.kwai.slide.play.detail.utils.c$b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.View;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Float;

public class c$b implements ValueAnimator$AnimatorUpdateListener	// class@001886
{
    public final View a;

    public void c$b(View p0){
       this.a = p0;
       super();
    }
    public void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "1")) {
          return;
       }
       this.a.setAlpha(p0.getAnimatedValue().floatValue());
       return;
    }
}

package com.yxcorp.gifshow.slider.SliderView$b;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.slider.SliderView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.LinearLayout;

public final class SliderView$b extends AnimatorListenerAdapter	// class@001d42
{
    public final SliderView a;

    public void SliderView$b(SliderView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       p0.j = false;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SliderView$b.class, "1")) {
          return;
       }
       SliderView$b ta = this.a;
       ta.j = true;
       ta.setVisibility(0);
       return;
    }
}

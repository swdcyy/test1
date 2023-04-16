package com.yxcorp.gifshow.slider.SliderPositionerLayout$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.slider.SliderPositionerLayout;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.slider.SliderView;
import java.util.Objects;
import com.yxcorp.utility.Log;
import android.animation.AnimatorSet;
import android.view.View;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.widget.LinearLayout;
import android.animation.Animator;
import hjc.d;
import android.animation.Animator$AnimatorListener;
import th0.j;
import android.animation.TimeInterpolator;

public final class SliderPositionerLayout$b implements Runnable	// class@001d3d
{
    public final SliderPositionerLayout b;

    public void SliderPositionerLayout$b(SliderPositionerLayout p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SliderPositionerLayout$b.class, "1")) {
          return;
       }
       SliderPositionerLayout$b tb = this.b;
       if (tb.f == null) {
          SliderView slider = tb.getSlider();
          Objects.requireNonNull(slider);
          if (!PatchProxy.applyVoid(objArray, slider, SliderView.class, "4") && (slider.i != null && slider.j == null)) {
             Log.g("Slider", "slider hide");
             AnimatorSet uAnimatorSet = new AnimatorSet();
             float[] uofloatArray = new float[]{0,(float)(slider.getWidth() + slider.l)};
             uAnimatorSet.setDuration(300);
             Animator[] uAnimatorArr = new Animator[]{ObjectAnimator.ofFloat(slider, View.ALPHA, new float[2]{0x3f800000,0}),ObjectAnimator.ofFloat(slider, View.TRANSLATION_X, uofloatArray)};
             uAnimatorSet.playTogether(uAnimatorArr);
             uAnimatorSet.addListener(new d(slider));
             uAnimatorSet.setInterpolator(new j());
             uAnimatorSet.start();
             slider.i = false;
          }
       label_007e :
          this.b.f();
       }
       return;
    }
}

package com.yxcorp.gifshow.widget.b0;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.widget.RatioExpandView$RatioExpandItemView;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;

public class b0 implements Animator$AnimatorListener	// class@001932
{
    public final RatioExpandView$RatioExpandItemView a;

    public void b0(RatioExpandView$RatioExpandItemView p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0.class, "2")) {
          return;
       }
       b0 ta = this.a;
       ta.setTranslationX((- ta.e));
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0.class, "1")) {
          return;
       }
       b0 ta = this.a;
       ta.setTranslationX((- ta.e));
       return;
    }
    public void onAnimationRepeat(Animator p0){
    }
    public void onAnimationStart(Animator p0){
    }
}

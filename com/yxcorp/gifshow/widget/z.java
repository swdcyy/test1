package com.yxcorp.gifshow.widget.z;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.widget.RatioExpandView$RatioExpandItemView;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;

public class z implements Animator$AnimatorListener	// class@0019fa
{
    public final RatioExpandView$RatioExpandItemView a;

    public void z(RatioExpandView$RatioExpandItemView p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z.class, "2")) {
          return;
       }
       this.a.setClickable(true);
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z.class, "1")) {
          return;
       }
       this.a.setClickable(true);
       return;
    }
    public void onAnimationRepeat(Animator p0){
    }
    public void onAnimationStart(Animator p0){
    }
}

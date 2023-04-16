package com.yxcorp.gifshow.widget.a0;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.widget.RatioExpandView$RatioExpandItemView;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.RatioExpandView;
import android.view.View;

public class a0 implements Animator$AnimatorListener	// class@0018eb
{
    public final RatioExpandView$RatioExpandItemView a;

    public void a0(RatioExpandView$RatioExpandItemView p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a0.class, "2")) {
          return;
       }
       this.a.b.setAlpha((float)RatioExpandView.G);
       p0.h = false;
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a0.class, "1")) {
          return;
       }
       this.a.b.setAlpha((float)RatioExpandView.G);
       p0.h = false;
       return;
    }
    public void onAnimationRepeat(Animator p0){
    }
    public void onAnimationStart(Animator p0){
       p0.h = true;
    }
}

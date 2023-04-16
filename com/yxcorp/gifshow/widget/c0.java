package com.yxcorp.gifshow.widget.c0;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.widget.RatioExpandView$RatioExpandItemView;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.widget.RatioExpandView;

public class c0 implements Animator$AnimatorListener	// class@001958
{
    public final RatioExpandView$RatioExpandItemView a;

    public void c0(RatioExpandView$RatioExpandItemView p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c0.class, "2")) {
          return;
       }
       this.a.b.setAlpha(0);
       this.a.setClickable(true);
       p0.h = false;
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c0.class, "1")) {
          return;
       }
       this.a.b.setAlpha(0);
       this.a.setClickable(true);
       p0.h = false;
       return;
    }
    public void onAnimationRepeat(Animator p0){
    }
    public void onAnimationStart(Animator p0){
       p0.h = true;
    }
}

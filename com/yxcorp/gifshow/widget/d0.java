package com.yxcorp.gifshow.widget.d0;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.widget.RatioExpandView$RatioExpandItemView;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.yxcorp.gifshow.widget.RatioExpandView;
import android.widget.TextView;
import android.widget.FrameLayout;

public class d0 implements Animator$AnimatorListener	// class@00196e
{
    public final RatioExpandView$RatioExpandItemView a;

    public void d0(RatioExpandView$RatioExpandItemView p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d0.class, "3")) {
          return;
       }
       this.a.b.setAlpha(0);
       this.a.c.setTextColor(RatioExpandView.I);
       this.a.setVisibility(4);
       this.a.setClickable(false);
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d0.class, "2")) {
          return;
       }
       this.a.b.setAlpha(0);
       this.a.c.setTextColor(RatioExpandView.I);
       this.a.setVisibility(4);
       this.a.setClickable(false);
       return;
    }
    public void onAnimationRepeat(Animator p0){
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d0.class, "1")) {
          return;
       }
       this.a.setVisibility(0);
       return;
    }
}

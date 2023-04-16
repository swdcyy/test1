package com.kwai.live.gzone.widget.ViewAnimator2$a;
import android.animation.Animator$AnimatorListener;
import com.kwai.live.gzone.widget.ViewAnimator2;
import android.view.View;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class ViewAnimator2$a implements Animator$AnimatorListener	// class@000e84
{
    public final View a;
    public final Animator$AnimatorListener b;
    public final ViewAnimator2 c;

    public void ViewAnimator2$a(ViewAnimator2 p0,View p1,Animator$AnimatorListener p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ViewAnimator2$a.class, "2")) {
          return;
       }
       this.a.setVisibility(8);
       ViewAnimator2$a tb = this.b;
       if (tb != null) {
          tb.onAnimationEnd(p0);
       }
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ViewAnimator2$a.class, "1")) {
          return;
       }
       this.a.setVisibility(8);
       ViewAnimator2$a tb = this.b;
       if (tb != null) {
          tb.onAnimationEnd(p0);
       }
       return;
    }
    public void onAnimationRepeat(Animator p0){
    }
    public void onAnimationStart(Animator p0){
    }
}

package com.tachikoma.component.scroll.TKHorizontalScrollView$d;
import android.animation.Animator$AnimatorListener;
import com.tachikoma.component.scroll.TKHorizontalScrollView;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import android.widget.HorizontalScrollView;

public class TKHorizontalScrollView$d implements Animator$AnimatorListener	// class@000d1b
{
    public final TKHorizontalScrollView a;

    public void TKHorizontalScrollView$d(TKHorizontalScrollView p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKHorizontalScrollView$d.class, "2")) {
          return;
       }
       if (this.a.u != null) {
          return;
       }
       TKHorizontalScrollView$d ta = this.a;
       ta.postOnAnimationDelayed(ta.x, 60);
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKHorizontalScrollView$d.class, "1")) {
          return;
       }
       if (this.a.u != null) {
          return;
       }
       TKHorizontalScrollView$d ta = this.a;
       ta.postOnAnimationDelayed(ta.x, 60);
       return;
    }
    public void onAnimationRepeat(Animator p0){
    }
    public void onAnimationStart(Animator p0){
    }
}

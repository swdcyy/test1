package com.tachikoma.component.scroll.TKVerticalScrollView$d;
import android.animation.Animator$AnimatorListener;
import com.tachikoma.component.scroll.TKVerticalScrollView;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import android.widget.ScrollView;

public class TKVerticalScrollView$d implements Animator$AnimatorListener	// class@000d23
{
    public final TKVerticalScrollView a;

    public void TKVerticalScrollView$d(TKVerticalScrollView p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKVerticalScrollView$d.class, "2")) {
          return;
       }
       if (this.a.u != null) {
          return;
       }
       TKVerticalScrollView$d ta = this.a;
       ta.postOnAnimationDelayed(ta.x, 60);
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKVerticalScrollView$d.class, "1")) {
          return;
       }
       if (this.a.u != null) {
          return;
       }
       TKVerticalScrollView$d ta = this.a;
       ta.postOnAnimationDelayed(ta.x, 60);
       return;
    }
    public void onAnimationRepeat(Animator p0){
    }
    public void onAnimationStart(Animator p0){
    }
}

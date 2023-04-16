package com.kwai.slide.play.detail.negative.feedback.content.j;
import android.animation.AnimatorListenerAdapter;
import com.kwai.slide.play.detail.negative.feedback.content.l;
import com.kwai.slide.play.detail.negative.feedback.content.l$b;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;

public class j extends AnimatorListenerAdapter	// class@00183b
{
    public final l$b a;
    public final l b;

    public void j(l p0,l$b p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       if (this.b.a.getVisibility() != 8) {
          this.b.a.setVisibility(8);
       }
       j ta = this.a;
       if (ta != null) {
          ta.D();
       }
       return;
    }
}

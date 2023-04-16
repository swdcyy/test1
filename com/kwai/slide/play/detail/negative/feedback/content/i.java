package com.kwai.slide.play.detail.negative.feedback.content.i;
import android.animation.AnimatorListenerAdapter;
import com.kwai.slide.play.detail.negative.feedback.content.l;
import com.kwai.slide.play.detail.negative.feedback.content.l$c;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class i extends AnimatorListenerAdapter	// class@00183a
{
    public final l$c a;
    public final l b;

    public void i(l p0,l$c p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       i ta = this.a;
       if (ta != null) {
          ta.onShow();
       }
       return;
    }
}

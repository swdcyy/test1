package com.kwai.slide.play.detail.information.intensifyfollow.IntensifyFollowElementView$showQuickCommentAnimation$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import dr7.a;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.animation.AnimatorSet;
import com.kwai.slide.play.detail.information.intensifyfollow.IntensifyFollowElementView$showQuickCommentAnimation$1$a;
import android.animation.Animator$AnimatorListener;
import android.animation.ValueAnimator;
import com.kwai.slide.play.detail.information.intensifyfollow.IntensifyFollowElementView$showQuickCommentAnimation$1$b;
import lnc.a1;
import com.kwai.slide.play.detail.information.intensifyfollow.IntensifyFollowElementView$showQuickCommentAnimation$1$c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import kotlin.jvm.internal.a;
import android.animation.Animator;

public final class IntensifyFollowElementView$showQuickCommentAnimation$1 extends Lambda implements a	// class@0017f0
{
    public final a this$0;

    public void IntensifyFollowElementView$showQuickCommentAnimation$1(a p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, IntensifyFollowElementView$showQuickCommentAnimation$1.class, "1")) {
          return;
       }
       IntensifyFollowElementView$showQuickCommentAnimation$1 tthis$0 = this.this$0;
       if (tthis$0.v == null) {
          a.A(tthis$0).setAlpha(0x3f800000);
          return;
       }else {
          tthis$0.w = new AnimatorSet();
          AnimatorSet uAnimatorSet = a.G(this.this$0, false, 1, objArray);
          uAnimatorSet.addListener(new IntensifyFollowElementView$showQuickCommentAnimation$1$a(this));
          int i = 2;
          ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[i]{0,0x3f800000});
          valueAnimato.addListener(new IntensifyFollowElementView$showQuickCommentAnimation$1$b(this));
          valueAnimato.addUpdateListener(new IntensifyFollowElementView$showQuickCommentAnimation$1$c(this, a.v(this.this$0).getHeight(), a1.e(8.00f)));
          a.o(valueAnimato, "quickCommentShow");
          valueAnimato.setStartDelay(1000);
          a w = this.this$0.w;
          if (w != null) {
             Animator[] uAnimatorArr = new Animator[i];
             uAnimatorArr[0] = uAnimatorSet;
             uAnimatorArr[1] = valueAnimato;
             w.playSequentially(uAnimatorArr);
          }
          a w1 = this.this$0.w;
          if (w1 != null) {
             w1.start();
          }
          return;
       }
    }
}

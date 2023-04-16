package com.kwai.slide.play.detail.information.intensifyfollow.IntensifyFollowElementView$showQuickCommentAnimation$1$c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kwai.slide.play.detail.information.intensifyfollow.IntensifyFollowElementView$showQuickCommentAnimation$1;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Float;
import dr7.a;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;

public final class IntensifyFollowElementView$showQuickCommentAnimation$1$c implements ValueAnimator$AnimatorUpdateListener	// class@0017ef
{
    public final IntensifyFollowElementView$showQuickCommentAnimation$1 a;
    public final int b;
    public final int c;

    public void IntensifyFollowElementView$showQuickCommentAnimation$1$c(IntensifyFollowElementView$showQuickCommentAnimation$1 p0,int p1,int p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IntensifyFollowElementView$showQuickCommentAnimation$1$c.class, "1")) {
          return;
       }
       a.o(p0, "it");
       p0 = p0.getAnimatedValue();
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.Float");
       float f = p0.floatValue();
       a.v(this.a.this$0).getLayoutParams().height = (int)((float)this.b * f);
       ViewGroup$LayoutParams layoutParams = a.v(this.a.this$0).getLayoutParams();
       Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
       layoutParams.topMargin = (int)((float)this.c * f);
       a.v(this.a.this$0).requestLayout();
       return;
    }
}

package com.kwai.slide.play.detail.information.intensifyfollow.IntensifyFollowElementView$showQuickCommentAnimation$1$a;
import android.animation.AnimatorListenerAdapter;
import com.kwai.slide.play.detail.information.intensifyfollow.IntensifyFollowElementView$showQuickCommentAnimation$1;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dr7.a;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;

public final class IntensifyFollowElementView$showQuickCommentAnimation$1$a extends AnimatorListenerAdapter	// class@0017ed
{
    public final IntensifyFollowElementView$showQuickCommentAnimation$1 a;

    public void IntensifyFollowElementView$showQuickCommentAnimation$1$a(IntensifyFollowElementView$showQuickCommentAnimation$1 p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IntensifyFollowElementView$showQuickCommentAnimation$1$a.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       a.z(this.a.this$0).setVisibility(8);
       p0.height = 0;
       ViewGroup$LayoutParams layoutParams = a.v(this.a.this$0).getLayoutParams();
       Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
       layoutParams.topMargin = 0;
       return;
    }
}

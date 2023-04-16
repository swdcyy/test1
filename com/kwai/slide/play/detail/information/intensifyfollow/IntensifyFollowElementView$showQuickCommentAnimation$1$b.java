package com.kwai.slide.play.detail.information.intensifyfollow.IntensifyFollowElementView$showQuickCommentAnimation$1$b;
import android.animation.AnimatorListenerAdapter;
import com.kwai.slide.play.detail.information.intensifyfollow.IntensifyFollowElementView$showQuickCommentAnimation$1;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dr7.a;
import android.view.View;

public final class IntensifyFollowElementView$showQuickCommentAnimation$1$b extends AnimatorListenerAdapter	// class@0017ee
{
    public final IntensifyFollowElementView$showQuickCommentAnimation$1 a;

    public void IntensifyFollowElementView$showQuickCommentAnimation$1$b(IntensifyFollowElementView$showQuickCommentAnimation$1 p0){
       this.a = p0;
       super();
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IntensifyFollowElementView$showQuickCommentAnimation$1$b.class, "1")) {
          return;
       }
       a.A(this.a.this$0).setAlpha(0x3f800000);
       return;
    }
}

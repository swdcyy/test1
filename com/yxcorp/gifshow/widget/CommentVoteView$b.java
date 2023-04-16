package com.yxcorp.gifshow.widget.CommentVoteView$b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.widget.CommentVoteView;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Float;
import android.widget.FrameLayout;
import java.lang.NullPointerException;

public final class CommentVoteView$b implements ValueAnimator$AnimatorUpdateListener	// class@001805
{
    public final CommentVoteView a;

    public void CommentVoteView$b(CommentVoteView p0){
       this.a = p0;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, CommentVoteView$b.class, "1")) {
          return;
       }
       CommentVoteView$b ta = this.a;
       a.o(p0, "it");
       p0 = p0.getAnimatedValue();
       if (p0 != null) {
          ta.i = p0.floatValue();
          this.a.invalidate();
          PatchProxy.onMethodExit(CommentVoteView$b.class, "1");
          return;
       }else {
          PatchProxy.onMethodExit(CommentVoteView$b.class, "1");
          throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
       }
    }
}

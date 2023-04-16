package com.kuaishou.live.lite.commentnotice.commonnoticeItem.LiveLiteBaseCommentNoticeViewController$b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.graphics.drawable.Drawable;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Integer;

public final class LiveLiteBaseCommentNoticeViewController$b implements ValueAnimator$AnimatorUpdateListener	// class@000845
{
    public final Drawable a;

    public void LiveLiteBaseCommentNoticeViewController$b(Drawable p0){
       this.a = p0;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteBaseCommentNoticeViewController$b.class, "1")) {
          return;
       }
       LiveLiteBaseCommentNoticeViewController$b ta = this.a;
       a.o(ta, "background");
       a.o(p0, "it");
       p0 = p0.getAnimatedValue();
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.Int");
       ta.setAlpha(p0.intValue());
       return;
    }
}

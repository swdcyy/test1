package com.kuaishou.live.lite.commentnotice.commonnoticeItem.LiveLiteBaseCommentNoticeViewController$d;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.lite.commentnotice.commonnoticeItem.LiveLiteBaseCommentNoticeViewController;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.cardview.widget.CardView;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import android.view.ViewGroup$MarginLayoutParams;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import qrd.l1;
import java.lang.NullPointerException;

public final class LiveLiteBaseCommentNoticeViewController$d implements ValueAnimator$AnimatorUpdateListener	// class@000847
{
    public final LiveLiteBaseCommentNoticeViewController a;

    public void LiveLiteBaseCommentNoticeViewController$d(LiveLiteBaseCommentNoticeViewController p0){
       this.a = p0;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LiveLiteBaseCommentNoticeViewController$d.class, "1")) {
          return;
       }
       CardView uCardView = LiveLiteBaseCommentNoticeViewController.W2(this.a);
       ViewGroup$LayoutParams layoutParams = LiveLiteBaseCommentNoticeViewController.W2(this.a).getLayoutParams();
       if (layoutParams != null) {
          a.o(p0, "it");
          p0 = p0.getAnimatedValue();
          if (p0 != null) {
             layoutParams.width = p0.intValue();
             uCardView.setLayoutParams(layoutParams);
             PatchProxy.onMethodExit(LiveLiteBaseCommentNoticeViewController$d.class, "1");
             return;
          }else {
             PatchProxy.onMethodExit(LiveLiteBaseCommentNoticeViewController$d.class, "1");
             throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
          }
       }else {
          PatchProxy.onMethodExit(LiveLiteBaseCommentNoticeViewController$d.class, "1");
          throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
       }
    }
}

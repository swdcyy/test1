package com.kuaishou.live.lite.bottombubble.LiveLiteBottomBubbleViewController$bottomBubbleService$1$a;
import android.animation.Animator$AnimatorListener;
import com.kuaishou.live.lite.bottombubble.LiveLiteBottomBubbleViewController$bottomBubbleService$1;
import n93.a;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.bottombubble.LiveLiteBottomBubbleViewController;

public final class LiveLiteBottomBubbleViewController$bottomBubbleService$1$a implements Animator$AnimatorListener	// class@001eda
{
    public final LiveLiteBottomBubbleViewController$bottomBubbleService$1 a;
    public final a b;

    public void LiveLiteBottomBubbleViewController$bottomBubbleService$1$a(LiveLiteBottomBubbleViewController$bottomBubbleService$1 p0,a p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LiveLiteBottomBubbleViewController$bottomBubbleService$1$a.class, "3")) {
          return;
       }
       a.p(p0, "animator");
       PatchProxy.onMethodExit(LiveLiteBottomBubbleViewController$bottomBubbleService$1$a.class, "3");
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LiveLiteBottomBubbleViewController$bottomBubbleService$1$a.class, "2")) {
          return;
       }
       a.p(p0, "animator");
       this.a.a.W2(this.b);
       PatchProxy.onMethodExit(LiveLiteBottomBubbleViewController$bottomBubbleService$1$a.class, "2");
       return;
    }
    public void onAnimationRepeat(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LiveLiteBottomBubbleViewController$bottomBubbleService$1$a.class, "1")) {
          return;
       }
       a.p(p0, "animator");
       PatchProxy.onMethodExit(LiveLiteBottomBubbleViewController$bottomBubbleService$1$a.class, "1");
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LiveLiteBottomBubbleViewController$bottomBubbleService$1$a.class, "4")) {
          return;
       }
       a.p(p0, "animator");
       PatchProxy.onMethodExit(LiveLiteBottomBubbleViewController$bottomBubbleService$1$a.class, "4");
       return;
    }
}

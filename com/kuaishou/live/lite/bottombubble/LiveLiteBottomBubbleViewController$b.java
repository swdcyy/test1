package com.kuaishou.live.lite.bottombubble.LiveLiteBottomBubbleViewController$b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.lite.bottombubble.LiveLiteBottomBubbleViewController;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Float;
import ip3.a;
import vb3.f;
import java.lang.NullPointerException;

public final class LiveLiteBottomBubbleViewController$b implements ValueAnimator$AnimatorUpdateListener	// class@001ed9
{
    public final LiveLiteBottomBubbleViewController a;
    public final float b;

    public void LiveLiteBottomBubbleViewController$b(LiveLiteBottomBubbleViewController p0,float p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LiveLiteBottomBubbleViewController$b.class, "1")) {
          return;
       }
       a.o(p0, "it");
       p0 = p0.getAnimatedValue();
       if (p0 != null) {
          float f = this.b - p0.floatValue();
          f uof = this.a.p.get();
          if (uof != null) {
             uof.a((int)f);
          }
          PatchProxy.onMethodExit(LiveLiteBottomBubbleViewController$b.class, "1");
          return;
       }else {
          PatchProxy.onMethodExit(LiveLiteBottomBubbleViewController$b.class, "1");
          throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
       }
    }
}

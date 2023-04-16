package com.kuaishou.live.lite.interactivemessage.LiveLiteInteractiveMessageViewController$c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.lite.interactivemessage.LiveLiteInteractiveMessageViewController;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.view.View;

public final class LiveLiteInteractiveMessageViewController$c implements ValueAnimator$AnimatorUpdateListener	// class@0009c1
{
    public final LiveLiteInteractiveMessageViewController a;

    public void LiveLiteInteractiveMessageViewController$c(LiveLiteInteractiveMessageViewController p0){
       this.a = p0;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteInteractiveMessageViewController$c.class, "1")) {
          return;
       }
       LiveLiteInteractiveMessageViewController$c ta = this.a;
       ViewGroup viewGroup = LiveLiteInteractiveMessageViewController.V2(ta);
       a.o(p0, "it");
       p0 = p0.getAnimatedValue();
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.Int");
       int i = p0.intValue();
       Objects.requireNonNull(ta);
       if (!PatchProxy.isSupport(LiveLiteInteractiveMessageViewController.class) || !PatchProxy.applyVoidTwoRefs(viewGroup, Integer.valueOf(i), ta, LiveLiteInteractiveMessageViewController.class, "15")) {
          ViewGroup$LayoutParams layoutParams = viewGroup.getLayoutParams();
          if (layoutParams != null) {
             layoutParams.height = i;
             viewGroup.setLayoutParams(layoutParams);
          }
       }
       return;
    }
}

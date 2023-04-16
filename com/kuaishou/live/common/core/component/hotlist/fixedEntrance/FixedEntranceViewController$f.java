package com.kuaishou.live.common.core.component.hotlist.fixedEntrance.FixedEntranceViewController$f;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.common.core.component.hotlist.fixedEntrance.FixedEntranceViewController;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import qrd.l1;

public final class FixedEntranceViewController$f implements ValueAnimator$AnimatorUpdateListener	// class@001354
{
    public final FixedEntranceViewController a;

    public void FixedEntranceViewController$f(FixedEntranceViewController p0){
       this.a = p0;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FixedEntranceViewController$f.class, "1")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = FixedEntranceViewController.V2(this.a).getLayoutParams();
       Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
       a.o(p0, "it");
       p0 = p0.getAnimatedValue();
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.Int");
       layoutParams.width = (p0.intValue() + layoutParams.leftMargin) + layoutParams.rightMargin;
       FixedEntranceViewController.V2(this.a).setLayoutParams(layoutParams);
       return;
    }
}

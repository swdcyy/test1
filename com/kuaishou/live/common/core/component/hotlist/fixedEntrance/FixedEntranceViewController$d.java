package com.kuaishou.live.common.core.component.hotlist.fixedEntrance.FixedEntranceViewController$d;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import java.util.List;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import android.view.View;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Float;

public final class FixedEntranceViewController$d implements ValueAnimator$AnimatorUpdateListener	// class@001352
{
    public final List a;

    public void FixedEntranceViewController$d(List p0){
       this.a = p0;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FixedEntranceViewController$d.class, "1")) {
          return;
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          a.o(p0, "it");
          Object animatedValu = p0.getAnimatedValue();
          Objects.requireNonNull(animatedValu, "null cannot be cast to non-null type kotlin.Float");
          iterator.next().setAlpha(animatedValu.floatValue());
       }
       return;
    }
}

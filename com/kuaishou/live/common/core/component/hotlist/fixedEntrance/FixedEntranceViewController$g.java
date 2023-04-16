package com.kuaishou.live.common.core.component.hotlist.fixedEntrance.FixedEntranceViewController$g;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.common.core.component.hotlist.fixedEntrance.FixedEntranceViewController;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.graphics.drawable.Drawable;
import java.util.Objects;
import android.graphics.drawable.GradientDrawable;
import kotlin.jvm.internal.a;
import java.lang.Integer;

public final class FixedEntranceViewController$g implements ValueAnimator$AnimatorUpdateListener	// class@001355
{
    public final FixedEntranceViewController a;

    public void FixedEntranceViewController$g(FixedEntranceViewController p0){
       this.a = p0;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FixedEntranceViewController$g.class, "1")) {
          return;
       }
       Drawable background = FixedEntranceViewController.X2(this.a).getBackground();
       Objects.requireNonNull(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
       a.o(p0, "it");
       p0 = p0.getAnimatedValue();
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.Int");
       background.setColor(p0.intValue());
       return;
    }
}

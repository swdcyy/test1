package com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.panel.SubtitlePanelFragment$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.View;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Integer;

public final class SubtitlePanelFragment$a implements ValueAnimator$AnimatorUpdateListener	// class@000aec
{
    public final View a;

    public void SubtitlePanelFragment$a(View p0){
       this.a = p0;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SubtitlePanelFragment$a.class, "1")) {
          return;
       }
       a.o(p0, "it");
       p0 = p0.getAnimatedValue();
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.Int");
       this.a.getLayoutParams().height = p0.intValue();
       this.a.requestLayout();
       return;
    }
}

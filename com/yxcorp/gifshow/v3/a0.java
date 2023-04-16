package com.yxcorp.gifshow.v3.a0;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.View;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Float;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.yxcorp.gifshow.v3.SocialSimpleEditorActivityViewBinder;
import com.yxcorp.gifshow.v3.SocialSimpleEditorActivityViewBinder$a;
import lnc.a1;

public final class a0 implements ValueAnimator$AnimatorUpdateListener	// class@000d28
{
    public final View a;

    public void a0(View p0){
       this.a = p0;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a0.class, "1")) {
          return;
       }
       a.o(p0, "it");
       p0 = p0.getAnimatedValue();
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.Float");
       Drawable background = this.a.getBackground();
       Objects.requireNonNull(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
       background.setStroke((int)((float)SocialSimpleEditorActivityViewBinder.K.c() * p0.floatValue()), a1.a(R.color.arg_RES_7f0620c7));
       this.a.setBackground(background);
       return;
    }
}

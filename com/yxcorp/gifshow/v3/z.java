package com.yxcorp.gifshow.v3.z;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.View;
import android.graphics.RectF;
import com.yxcorp.gifshow.model.RectInfo;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Float;
import com.yxcorp.gifshow.v3.z$a;
import android.view.ViewOutlineProvider;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

public final class z implements ValueAnimator$AnimatorUpdateListener	// class@00167f
{
    public final View a;
    public final RectF b;
    public final RectInfo c;
    public final View d;

    public void z(View p0,RectF p1,RectInfo p2,View p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z.class, "1")) {
          return;
       }
       a.o(p0, "it");
       p0 = p0.getAnimatedValue();
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.Float");
       float f = p0.floatValue();
       this.a.setOutlineProvider(new z$a(this, f));
       this.a.setClipToOutline(true);
       Drawable background = this.d.getBackground();
       Objects.requireNonNull(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
       background.setCornerRadius(((this.c.getRadiusOuter() * 0x3f800000) * f));
       this.d.setBackground(background);
       return;
    }
}

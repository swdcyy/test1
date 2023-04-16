package com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$i;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import android.graphics.drawable.Drawable;
import kotlin.TypeCastException;

public final class AlbumSelectedContainer$i implements ValueAnimator$AnimatorUpdateListener	// class@001aa0
{
    public final GradientDrawable a;
    public final View b;

    public void AlbumSelectedContainer$i(GradientDrawable p0,View p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumSelectedContainer$i.class, "1")) {
          return;
       }
       a.h(p0, "it");
       p0 = p0.getAnimatedValue();
       if (p0 == null) {
          throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
       }
       int i = p0.intValue();
       AlbumSelectedContainer$i ta = this.a;
       if (ta != null) {
          ta.setColor(i);
       }
       this.b.setBackgroundDrawable(this.a);
       return;
    }
}

package com.kwai.slide.play.detail.utils.b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View;
import java.lang.Long;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import com.kwai.slide.play.detail.utils.a;
import java.lang.Integer;
import com.kwai.slide.play.detail.utils.c;
import android.animation.ValueAnimator;
import android.animation.ObjectAnimator;
import bt7.g;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import th0.i;
import android.animation.TimeInterpolator;
import bt7.j;
import android.animation.Animator$AnimatorListener;

public class b implements ViewTreeObserver$OnGlobalLayoutListener	// class@001884
{
    public final View b;
    public final int c;
    public final Long d;

    public void b(View p0,int p1,Long p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       if (!this.b.getWidth()) {
          return;
       }
       this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       int bottom = this.b.getBottom();
       b tb = this.b;
       b tc = this.c;
       long l = this.d.longValue();
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidFourRefs(tb, Integer.valueOf(tc), Integer.valueOf(bottom), Long.valueOf(l), null, a.class, "3")) {
          c.a(tb);
          ValueAnimator valueAnimato = ObjectAnimator.ofFloat(new float[2]{0,0x3f800000});
          valueAnimato.addUpdateListener(new g(tb, tc, bottom));
          valueAnimato.setDuration(l);
          valueAnimato.setInterpolator(new i());
          valueAnimato.addListener(new j(tb));
          valueAnimato.start();
          tb.setTag(R.id.slide_play_screen_clear_animation_tag, valueAnimato);
       }
       return;
    }
}

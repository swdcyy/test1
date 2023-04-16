package com.kwai.slide.play.detail.utils.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.slide.play.detail.utils.c;
import android.animation.ValueAnimator;
import android.animation.ObjectAnimator;
import bt7.h;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import th0.i;
import android.animation.TimeInterpolator;
import com.kwai.slide.play.detail.utils.a$a;
import android.animation.Animator$AnimatorListener;

public final class a	// class@001883
{

    public void a(){
       super();
    }
    public static void a(View p0,boolean p1,boolean p2){
       long l;
       ValueAnimator valueAnimato;
       long l1;
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), null, a.class, "1")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       c.a(p0);
       int i = 2;
       int i1 = 0;
       if (p1) {
          if (p2) {
             l = 150;
          }else {
             l1 = 500;
             l = i1;
          }
          valueAnimato = ObjectAnimator.ofFloat(new float[i]{0,0x3f800000});
          p0.setVisibility(0);
          p0.setAlpha(0);
       }else if(p2){
          l = 250;
       }else {
          l = 200;
       }
       valueAnimato = ObjectAnimator.ofFloat(new float[i]{0x3f800000,0});
       l1 = l;
       l = i1;
       valueAnimato.addUpdateListener(new h(p2, p0));
       valueAnimato.setDuration(350);
       valueAnimato.setStartDelay(l);
       valueAnimato.setInterpolator(new i());
       valueAnimato.addListener(new a$a(p1, p0));
       valueAnimato.start();
       p0.setTag(R.id.slide_play_screen_clear_animation_tag, valueAnimato);
       return;
    }
}

package com.yxcorp.gifshow.activity.share.presenter.z2;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.activity.share.presenter.w2;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import java.util.Objects;
import java.lang.Integer;
import android.animation.ValueAnimator;
import android.animation.ObjectAnimator;
import com.yxcorp.gifshow.activity.share.presenter.p2;
import android.animation.TimeInterpolator;
import zw8.m5;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import zw8.s5;

public class z2 implements Animator$AnimatorListener	// class@001461
{
    public final int a;
    public final int b;
    public final int c;
    public final w2 d;

    public void z2(w2 p0,int p1,int p2,int p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z2.class, "2")) {
          return;
       }
       this.d.F.setAlpha(0);
       this.d.S8(this.a, this.b, this.c);
       p0.i1 = null;
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z2.class, "1")) {
          return;
       }
       this.d.F.setAlpha(0);
       z2 td = this.d;
       z2 ta = this.a;
       z2 tb = this.b;
       z2 tc = this.c;
       Objects.requireNonNull(td);
       if (!PatchProxy.isSupport(w2.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(ta), Integer.valueOf(tb), Integer.valueOf(tc), td, w2.class, "22")) {
          int[] ointArray = new int[]{td.D.getHeight() - td.X0,tb};
          ValueAnimator valueAnimato = ObjectAnimator.ofInt(ointArray);
          td.j1 = valueAnimato;
          valueAnimato.setDuration(200);
          td.j1.setInterpolator(p2.a);
          td.j1.addUpdateListener(new m5(td, ta, tb, tc));
          td.j1.addListener(new s5(td, ta, tb, tc));
          td.j1.start();
       }
       td.i1 = null;
       return;
    }
    public void onAnimationRepeat(Animator p0){
    }
    public void onAnimationStart(Animator p0){
    }
}

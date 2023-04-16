package com.kuaishou.live.gzone.barrage.p$c;
import android.view.View$OnLayoutChangeListener;
import com.kuaishou.live.gzone.barrage.p;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.n;
import t02.a0;
import jv1.b;
import lnc.a1;
import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import android.animation.AnimatorSet;
import android.animation.Animator;

public class p$c implements View$OnLayoutChangeListener	// class@001c45
{
    public final p b;

    public void p$c(p p0){
       this.b = p0;
       super();
    }
    public void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       float f;
       if (PatchProxy.isSupport(p$c.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Integer.valueOf(p8);
          if (PatchProxy.applyVoid(objArray, this, p$c.class, "1")) {
             return;
          }
       }
       p0.removeOnLayoutChangeListener(this.b.D);
       p1 = n.k(this.b.getActivity());
       int[] ointArray = new int[2];
       this.b.w.getLocationInWindow(ointArray);
       p3 = (p1 - p0.getWidth()) / 2;
       p4 = 3000;
       p5 = (this.b.s.x.H2())? a1.e(114.00f): (int)(((this.b.u.getY() + (float)this.b.u.getHeight()) - (float)a1.e(84.00f)) - (float)p0.getHeight());
       p0.setTranslationY((float)p5);
       float[] uofloatArray = new float[]{(float)p1,f};
       f = (float)p3;
       long l = (long)p4;
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(p0, "translationX", uofloatArray).setDuration(l);
       objectAnimat.setInterpolator(new LinearInterpolator());
       uofloatArray = new float[]{f,(float)((- p0.getWidth()) - ointArray[0])};
       ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(p0, "translationX", uofloatArray).setDuration(l);
       objectAnimat1.setInterpolator(new LinearInterpolator());
       objectAnimat1.setStartDelay(3000);
       f.A = new AnimatorSet();
       Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1};
       this.b.A.playSequentially(uAnimatorArr);
       this.b.A.start();
       return;
    }
}

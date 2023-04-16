package com.kuaishou.live.common.core.component.like.service.d;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.common.core.component.like.service.LiveHeartParticleServiceImpl;
import android.widget.ImageView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.AnimatorSet;
import android.view.View;
import android.util.Property;
import android.animation.ObjectAnimator;
import com.kuaishou.live.common.core.component.like.service.d$a;
import android.animation.Animator$AnimatorListener;

public class d extends AnimatorListenerAdapter	// class@00147d
{
    public final ImageView a;
    public final LiveHeartParticleServiceImpl b;

    public void d(LiveHeartParticleServiceImpl p0,ImageView p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       AnimatorSet uAnimatorSet = new AnimatorSet();
       d ta = this.a;
       float[] uofloatArray = new float[]{ta.getScaleX(),0x3f4ccccd};
       d ta1 = this.a;
       float[] uofloatArray1 = new float[]{ta1.getScaleY(),0x3f4ccccd};
       d ta2 = this.a;
       uofloatArray1 = new float[]{ta2.getRotation(),0xc1200000};
       uAnimatorSet.setDuration(200);
       uAnimatorSet.addListener(new d$a(this));
       Animator[] uAnimatorArr = new Animator[]{ObjectAnimator.ofFloat(ta, View.SCALE_X, uofloatArray),ObjectAnimator.ofFloat(ta1, View.SCALE_Y, uofloatArray1),ObjectAnimator.ofFloat(ta2, View.ROTATION, uofloatArray1)};
       uAnimatorSet.playTogether(uAnimatorArr);
       uAnimatorSet.start();
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       super.onAnimationStart(p0);
       this.a.bringToFront();
       return;
    }
}

package com.kuaishou.live.gzone.barrage.i$a;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import com.kuaishou.live.gzone.barrage.i;
import java.lang.Object;
import android.view.View;
import android.animation.Animator$AnimatorListener;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import android.animation.Animator;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;

public class i$a implements PopupInterface$c	// class@001c37
{
    public final i a;

    public void i$a(i p0){
       this.a = p0;
       super();
    }
    public void a(View p0,Animator$AnimatorListener p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i$a.class, "1")) {
          return;
       }
       float[] uofloatArray = new float[]{(float)p0.getWidth(),0};
       AnimatorSet uAnimatorSet = new AnimatorSet();
       Animator[] uAnimatorArr = new Animator[]{ObjectAnimator.ofFloat(p0, View.TRANSLATION_X, uofloatArray)};
       uAnimatorSet.playTogether(uAnimatorArr);
       uAnimatorSet.setDuration(300);
       uAnimatorSet.setInterpolator(new DecelerateInterpolator(0x3fc00000));
       uAnimatorSet.addListener(p1);
       uAnimatorSet.start();
       return;
    }
}

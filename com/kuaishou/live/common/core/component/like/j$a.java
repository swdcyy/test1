package com.kuaishou.live.common.core.component.like.j$a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.common.core.component.like.j;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.AnimatorSet;
import com.kuaishou.live.common.core.component.like.i;
import android.view.View;
import android.util.Property;
import android.animation.ObjectAnimator;
import com.kuaishou.live.common.core.component.like.j$a$a;
import android.animation.Animator$AnimatorListener;

public class j$a extends AnimatorListenerAdapter	// class@00146c
{
    public final j a;

    public void j$a(j p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$a.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       AnimatorSet uAnimatorSet = new AnimatorSet();
       uAnimatorSet.addListener(new j$a$a(this));
       Animator[] uAnimatorArr = new Animator[]{ObjectAnimator.ofFloat(this.a.a.B, View.SCALE_X, new float[2]{0x3f99999a,0x3f800000}).setDuration(200),ObjectAnimator.ofFloat(this.a.a.B, View.SCALE_Y, new float[2]{0x3f99999a,0x3f800000}).setDuration(200),ObjectAnimator.ofFloat(this.a.a.B, View.ROTATION, new float[2]{0,0x41800000}).setDuration(100)};
       uAnimatorSet.playTogether(uAnimatorArr);
       uAnimatorSet.start();
       return;
    }
}

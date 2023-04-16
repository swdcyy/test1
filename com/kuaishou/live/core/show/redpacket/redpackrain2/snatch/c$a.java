package com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.c$a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.c;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.e;
import android.view.View;
import android.animation.ObjectAnimator;
import com.kuaishou.live.common.core.basic.degrade.j;
import android.util.Property;
import android.animation.AnimatorSet;

public class c$a extends AnimatorListenerAdapter	// class@000f1f
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
          return;
       }
       super.onAnimationStart(p0);
       c b = this.a.b;
       Objects.requireNonNull(b);
       if (!PatchProxy.applyVoid(null, b, e.class, "25")) {
          AnimatorSet uAnimatorSet = new AnimatorSet();
          b.t = uAnimatorSet;
          Animator[] uAnimatorArr = new Animator[]{j.a(b.o, new float[2]{0,0x3f800000}),j.a(b.p, new float[2]{0,0x3f800000}),j.a(b.i, new float[2]{0,0x3f800000}),ObjectAnimator.ofFloat(b.h, View.SCALE_Y, new float[2]{0x3f733333,0x3f800000}),ObjectAnimator.ofFloat(b.o, View.SCALE_X, new float[2]{0x3f666666,0x3f800000}),ObjectAnimator.ofFloat(b.o, View.SCALE_Y, new float[2]{0x3f666666,0x3f800000})};
          uAnimatorSet.playTogether(uAnimatorArr);
          b.t.setDuration(180);
          b.t.setStartDelay(60);
          b.t.start();
       }
       return;
    }
}

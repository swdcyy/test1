package com.kwai.feature.component.photofeatures.reward.rank.RewardRankFragment$b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kwai.feature.component.photofeatures.reward.rank.RewardRankFragment;
import android.view.View;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Float;
import java.lang.NullPointerException;

public final class RewardRankFragment$b implements ValueAnimator$AnimatorUpdateListener	// class@001261
{
    public final RewardRankFragment a;
    public final float b;
    public final View c;
    public final int d;

    public void RewardRankFragment$b(RewardRankFragment p0,float p1,View p2,int p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, RewardRankFragment$b.class, "1")) {
          return;
       }
       a.o(p0, "animator");
       p0 = p0.getAnimatedValue();
       if (p0 != null) {
          float f = p0.floatValue();
          RewardRankFragment l = this.a.l;
          if (l != null && (double)f - 0x3fe0000000000000 <= 0) {
             l.setAlpha(((float)2 * f));
          }
          this.c.setTranslationY(((float)this.d * ((float)1 - f)));
          PatchProxy.onMethodExit(RewardRankFragment$b.class, "1");
          return;
       }else {
          PatchProxy.onMethodExit(RewardRankFragment$b.class, "1");
          throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
       }
    }
}

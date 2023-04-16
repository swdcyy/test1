package com.kwai.feature.component.photofeatures.reward.rank.RewardRankFragment$c;
import android.animation.AnimatorListenerAdapter;
import com.kwai.feature.component.photofeatures.reward.rank.RewardRankFragment;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class RewardRankFragment$c extends AnimatorListenerAdapter	// class@001262
{
    public final RewardRankFragment a;
    public final float b;
    public final View c;
    public final int d;

    public void RewardRankFragment$c(RewardRankFragment p0,float p1,View p2,int p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, RewardRankFragment$c.class, "1")) {
          return;
       }
       a.p(p0, "animation");
       this.a.dh();
       PatchProxy.onMethodExit(RewardRankFragment$c.class, "1");
       return;
    }
}

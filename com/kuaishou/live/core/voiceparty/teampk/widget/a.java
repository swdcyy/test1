package com.kuaishou.live.core.voiceparty.teampk.widget.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.core.voiceparty.teampk.widget.VoicePartyTeamPkScoreView;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.util.Objects;
import java.lang.Integer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import cw2.b;
import com.airbnb.lottie.LottieAnimationView;
import java.lang.Runnable;
import android.widget.FrameLayout;

public final class a implements ValueAnimator$AnimatorUpdateListener	// class@001949
{
    public final VoicePartyTeamPkScoreView a;
    public final ViewGroup$LayoutParams b;
    public final View c;
    public final boolean d;
    public final int e;
    public final int f;

    public void a(VoicePartyTeamPkScoreView p0,ViewGroup$LayoutParams p1,View p2,boolean p3,int p4,int p5){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       a ta = this.a;
       a tb = this.b;
       a te = this.e;
       a tf = this.f;
       Objects.requireNonNull(ta);
       int i = p0.getAnimatedValue().intValue();
       tb.width = i;
       this.c.setLayoutParams(tb);
       if (this.d != null) {
          VoicePartyTeamPkScoreView d = ta.d;
          if (d != null && (!PatchProxy.isSupport(VoicePartyTeamPkScoreView.class) || !PatchProxy.applyVoidFourRefs(d, Integer.valueOf(i), Integer.valueOf(te), Integer.valueOf(tf), ta, VoicePartyTeamPkScoreView.class, "13"))) {
             ta.post(new b(i, d, tf, te));
          }
       }
       return;
    }
}

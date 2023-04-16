package com.kuaishou.live.core.voiceparty.micseats.pendant.VideoUserStatePendantViewController$a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.core.voiceparty.micseats.pendant.VideoUserStatePendantViewController;
import com.kuaishou.live.widget.LiveLottieAnimationView;
import android.animation.Animator;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.VideoUserStatePendantViewController$a$a;
import com.airbnb.lottie.LottieAnimationView;
import java.lang.Runnable;
import ekd.k1;

public final class VideoUserStatePendantViewController$a extends AnimatorListenerAdapter	// class@001766
{
    public final VideoUserStatePendantViewController a;
    public final LiveLottieAnimationView b;

    public void VideoUserStatePendantViewController$a(VideoUserStatePendantViewController p0,LiveLottieAnimationView p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onAnimationStart(Animator p0,boolean p1){
       if (PatchProxy.isSupport(VideoUserStatePendantViewController$a.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, VideoUserStatePendantViewController$a.class, "1")) {
          return;
       }
       a.p(p0, "animation");
       k1.r(new VideoUserStatePendantViewController$a$a(this), this.b.getDuration());
       return;
    }
}

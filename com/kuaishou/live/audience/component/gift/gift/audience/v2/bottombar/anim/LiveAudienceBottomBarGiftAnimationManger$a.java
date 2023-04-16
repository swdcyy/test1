package com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.LiveAudienceBottomBarGiftAnimationManger$a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.LiveAudienceBottomBarGiftAnimationManger;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class LiveAudienceBottomBarGiftAnimationManger$a extends AnimatorListenerAdapter	// class@000afe
{
    public final LiveAudienceBottomBarGiftAnimationManger a;

    public void LiveAudienceBottomBarGiftAnimationManger$a(LiveAudienceBottomBarGiftAnimationManger p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceBottomBarGiftAnimationManger$a.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.h();
       return;
    }
}

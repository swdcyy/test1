package com.kuaishou.live.common.core.component.gift.domain.giftguide.view.LiveGuideGiftAnimationView$a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.common.core.component.gift.domain.giftguide.view.LiveGuideGiftAnimationView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.gift.domain.giftguide.view.LiveGuideGiftAnimationView$b;

public class LiveGuideGiftAnimationView$a extends AnimatorListenerAdapter	// class@00124f
{
    public final LiveGuideGiftAnimationView a;

    public void LiveGuideGiftAnimationView$a(LiveGuideGiftAnimationView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGuideGiftAnimationView$a.class, "1")) {
          return;
       }
       LiveGuideGiftAnimationView p = this.a.p;
       if (p != null) {
          p.a();
       }
       return;
    }
}

package com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.handleview.LiveAudienceGiftBoxHandleView$d;
import ekd.f$j;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.handleview.LiveAudienceGiftBoxHandleView;
import android.animation.Animator;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import uz0.c;
import java.lang.Runnable;
import e93.f;

public class LiveAudienceGiftBoxHandleView$d extends f$j	// class@000b42
{
    public final LiveAudienceGiftBoxHandleView a;

    public void LiveAudienceGiftBoxHandleView$d(LiveAudienceGiftBoxHandleView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0,boolean p1){
       if (PatchProxy.isSupport(LiveAudienceGiftBoxHandleView$d.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, LiveAudienceGiftBoxHandleView$d.class, "1")) {
          return;
       }
       this.a.d();
       f.k("playHandleViewGuideAnimation", new c(this), this.a, 3000);
       return;
    }
}

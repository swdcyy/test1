package com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.handleview.LiveAudienceGiftBoxHandleView$c;
import android.animation.Animator$AnimatorListener;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.handleview.LiveAudienceGiftBoxHandleView;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.LinearLayout;

public class LiveAudienceGiftBoxHandleView$c implements Animator$AnimatorListener	// class@000b41
{
    public final LiveAudienceGiftBoxHandleView a;

    public void LiveAudienceGiftBoxHandleView$c(LiveAudienceGiftBoxHandleView p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceGiftBoxHandleView$c.class, "2")) {
          return;
       }
       this.a.d.setVisibility(8);
       return;
    }
    public void onAnimationRepeat(Animator p0){
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceGiftBoxHandleView$c.class, "1")) {
          return;
       }
       this.a.d.setVisibility(0);
       return;
    }
}

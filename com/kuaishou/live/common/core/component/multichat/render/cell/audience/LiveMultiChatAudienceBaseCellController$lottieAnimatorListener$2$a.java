package com.kuaishou.live.common.core.component.multichat.render.cell.audience.LiveMultiChatAudienceBaseCellController$lottieAnimatorListener$2$a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.common.core.component.multichat.render.cell.audience.LiveMultiChatAudienceBaseCellController$lottieAnimatorListener$2;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.multichat.render.cell.audience.LiveMultiChatAudienceBaseCellController;

public final class LiveMultiChatAudienceBaseCellController$lottieAnimatorListener$2$a extends AnimatorListenerAdapter	// class@0014e0
{
    public final LiveMultiChatAudienceBaseCellController$lottieAnimatorListener$2 a;

    public void LiveMultiChatAudienceBaseCellController$lottieAnimatorListener$2$a(LiveMultiChatAudienceBaseCellController$lottieAnimatorListener$2 p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiChatAudienceBaseCellController$lottieAnimatorListener$2$a.class, "1")) {
          return;
       }
       this.a.this$0.N3(8, true);
       return;
    }
}

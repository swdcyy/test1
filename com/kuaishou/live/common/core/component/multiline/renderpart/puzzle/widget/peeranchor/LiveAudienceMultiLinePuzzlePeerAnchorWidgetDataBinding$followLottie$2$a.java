package com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.widget.peeranchor.LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding$followLottie$2$a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.widget.peeranchor.LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding$followLottie$2;
import com.kuaishou.live.core.basic.widget.LiveKidLottieAnimationView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.widget.peeranchor.LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding;
import kr1.b;

public final class LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding$followLottie$2$a extends AnimatorListenerAdapter	// class@0015b8
{
    public final LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding$followLottie$2 a;
    public final LiveKidLottieAnimationView b;

    public void LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding$followLottie$2$a(LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding$followLottie$2 p0,LiveKidLottieAnimationView p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding$followLottie$2$a.class, "1")) {
          return;
       }
       this.b.setVisibility(8);
       this.a.this$0.m.c();
       return;
    }
}

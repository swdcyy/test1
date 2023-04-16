package com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.widget.peeranchor.LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding$followLottie$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.widget.peeranchor.LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding;
import com.kuaishou.live.core.basic.widget.LiveKidLottieAnimationView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import ekd.m1;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.widget.peeranchor.LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding$followLottie$2$a;
import android.animation.Animator$AnimatorListener;
import com.airbnb.lottie.LottieAnimationView;

public final class LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding$followLottie$2 extends Lambda implements a	// class@0015b9
{
    public final LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding this$0;

    public void LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding$followLottie$2(LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding p0){
       this.this$0 = p0;
       super(0);
    }
    public final LiveKidLottieAnimationView invoke(){
       View obj = PatchProxy.apply(null, this, LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding$followLottie$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = m1.f(this.this$0.i, R.id.multi_line_peer_follow_button);
       a.o(obj, "ViewBindUtils.bindWidget¡­_line_peer_follow_button\)");
       obj.a(new LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding$followLottie$2$a(this, obj));
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}

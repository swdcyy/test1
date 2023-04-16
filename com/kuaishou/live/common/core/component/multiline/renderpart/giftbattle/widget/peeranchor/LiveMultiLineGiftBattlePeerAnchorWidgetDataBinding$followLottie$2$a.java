package com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.widget.peeranchor.LiveMultiLineGiftBattlePeerAnchorWidgetDataBinding$followLottie$2$a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.widget.peeranchor.LiveMultiLineGiftBattlePeerAnchorWidgetDataBinding$followLottie$2;
import com.kuaishou.live.core.basic.widget.LiveKidLottieAnimationView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.widget.peeranchor.LiveMultiLineGiftBattlePeerAnchorWidgetDataBinding;
import kr1.b;

public final class LiveMultiLineGiftBattlePeerAnchorWidgetDataBinding$followLottie$2$a extends AnimatorListenerAdapter	// class@00157a
{
    public final LiveMultiLineGiftBattlePeerAnchorWidgetDataBinding$followLottie$2 a;
    public final LiveKidLottieAnimationView b;

    public void LiveMultiLineGiftBattlePeerAnchorWidgetDataBinding$followLottie$2$a(LiveMultiLineGiftBattlePeerAnchorWidgetDataBinding$followLottie$2 p0,LiveKidLottieAnimationView p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiLineGiftBattlePeerAnchorWidgetDataBinding$followLottie$2$a.class, "1")) {
          return;
       }
       this.b.setVisibility(8);
       this.a.this$0.g.c();
       return;
    }
}

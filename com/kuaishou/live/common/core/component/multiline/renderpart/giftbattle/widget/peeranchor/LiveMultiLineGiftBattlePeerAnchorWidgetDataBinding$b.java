package com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.widget.peeranchor.LiveMultiLineGiftBattlePeerAnchorWidgetDataBinding$b;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.widget.peeranchor.LiveMultiLineGiftBattlePeerAnchorWidgetDataBinding;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.live.core.basic.widget.LiveKidLottieAnimationView;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import sq1.f$d;
import sq1.f;
import j83.b;
import kr1.b;

public final class LiveMultiLineGiftBattlePeerAnchorWidgetDataBinding$b implements Observer	// class@001575
{
    public final LiveMultiLineGiftBattlePeerAnchorWidgetDataBinding b;

    public void LiveMultiLineGiftBattlePeerAnchorWidgetDataBinding$b(LiveMultiLineGiftBattlePeerAnchorWidgetDataBinding p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiLineGiftBattlePeerAnchorWidgetDataBinding$b.class, "1")) {
       }else {
          LiveMultiLineGiftBattlePeerAnchorWidgetDataBinding$b tb = this.b;
          a.o(p0, "isFollowed");
          boolean b = p0.booleanValue();
          LiveMultiLineGiftBattlePeerAnchorWidgetDataBinding d = this.b.d;
          Objects.requireNonNull(tb);
          LiveMultiLineGiftBattlePeerAnchorWidgetDataBinding liveMultiLin = LiveMultiLineGiftBattlePeerAnchorWidgetDataBinding.class;
          if (!PatchProxy.isSupport(liveMultiLin) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(b), d, tb, liveMultiLin, "2")) {
             if (b == true) {
                if (!tb.a().getVisibility() && !tb.a().p()) {
                   tb.a().s();
                }
             }else if(!b){
                tb.a().f();
                d.g(f$d.a);
                tb.a().setVisibility(0);
                tb.a().setProgress(0);
                tb.g.c();
             }
          }
       }
       return;
    }
}

package com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.widget.peeranchor.LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding$c;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.widget.peeranchor.LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding;
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

public final class LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding$c implements Observer	// class@0015b5
{
    public final LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding b;

    public void LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding$c(LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding$c.class, "1")) {
       }else {
          LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding$c tb = this.b;
          a.o(p0, "isFollowed");
          boolean b = p0.booleanValue();
          Objects.requireNonNull(tb);
          LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding liveAudience = LiveAudienceMultiLinePuzzlePeerAnchorWidgetDataBinding.class;
          if (!PatchProxy.isSupport(liveAudience) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tb, liveAudience, "8")) {
             if (b == true) {
                if (!tb.a().getVisibility() && !tb.a().p()) {
                   tb.a().s();
                }
             }else if(!b){
                tb.a().f();
                tb.j.g(f$d.a);
                tb.a().setVisibility(0);
                tb.a().setProgress(0);
                tb.m.c();
             }
          }
       }
       return;
    }
}

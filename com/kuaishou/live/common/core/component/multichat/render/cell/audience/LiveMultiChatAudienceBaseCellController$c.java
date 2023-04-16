package com.kuaishou.live.common.core.component.multichat.render.cell.audience.LiveMultiChatAudienceBaseCellController$c;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multichat.render.cell.audience.LiveMultiChatAudienceBaseCellController;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;

public final class LiveMultiChatAudienceBaseCellController$c implements Observer	// class@0014de
{
    public final LiveMultiChatAudienceBaseCellController b;

    public void LiveMultiChatAudienceBaseCellController$c(LiveMultiChatAudienceBaseCellController p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiChatAudienceBaseCellController$c.class, "1")) {
       }else if(this.b.G3()){
          LiveMultiChatAudienceBaseCellController$c tb = this.b;
          a.o(p0, "it");
          boolean b = p0.booleanValue();
          Objects.requireNonNull(tb);
          LiveMultiChatAudienceBaseCellController liveMultiCha = LiveMultiChatAudienceBaseCellController.class;
          if (!PatchProxy.isSupport(liveMultiCha) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tb, liveMultiCha, "14")) {
             String str = "audienceMultiChatFollowLottie";
             if (b == true) {
                b = tb.H;
                if (b == null) {
                   a.S(str);
                }
                if (!b.getVisibility()) {
                   b = tb.H;
                   if (b == null) {
                      a.S(str);
                   }
                   b.s();
                }
             }else if(!b){
                b = tb.H;
                if (b == null) {
                   a.S(str);
                }
                if (b.getVisibility() == 8) {
                   b = tb.H;
                   if (b == null) {
                      a.S(str);
                   }
                   b.setProgress(0);
                   tb.N3(0, true);
                }
             }
          }
       }
       return;
    }
}

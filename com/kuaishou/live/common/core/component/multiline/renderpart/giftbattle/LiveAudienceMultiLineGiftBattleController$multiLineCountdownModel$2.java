package com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.LiveAudienceMultiLineGiftBattleController$multiLineCountdownModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.LiveAudienceMultiLineGiftBattleController;
import is1.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.model.LiveMultiLineGiftBattleModel;
import com.kuaishou.protobuf.livestream.nano.LiveScoreLineChatTimeLine;
import java.lang.Long;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.LiveAudienceMultiLineGiftBattleController$multiLineCountdownModel$2$1;
import sq1.a;
import java.lang.Runnable;

public final class LiveAudienceMultiLineGiftBattleController$multiLineCountdownModel$2 extends Lambda implements a	// class@001564
{
    public final LiveAudienceMultiLineGiftBattleController this$0;

    public void LiveAudienceMultiLineGiftBattleController$multiLineCountdownModel$2(LiveAudienceMultiLineGiftBattleController p0){
       this.this$0 = p0;
       super(0);
    }
    public final c invoke(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiLineGiftBattleController$multiLineCountdownModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       LiveScoreLineChatTimeLine liveScoreLin = this.this$0.V2().a0();
       Long longx = (liveScoreLin != null)? Long.valueOf(liveScoreLin.exceedDeadlineBuffer): null;
       return new c(longx, new LiveAudienceMultiLineGiftBattleController$multiLineCountdownModel$2$1(this.this$0.w), null);
    }
    public Object invoke(){
       return this.invoke();
    }
}

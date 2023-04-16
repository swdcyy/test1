package com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.LiveAudienceMultiLineGiftBattleController$giftBattleModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.LiveAudienceMultiLineGiftBattleController;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.model.LiveMultiLineGiftBattleModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lq1.c;
import hf3.a;

public final class LiveAudienceMultiLineGiftBattleController$giftBattleModel$2 extends Lambda implements a	// class@001562
{
    public final LiveAudienceMultiLineGiftBattleController this$0;

    public void LiveAudienceMultiLineGiftBattleController$giftBattleModel$2(LiveAudienceMultiLineGiftBattleController p0){
       this.this$0 = p0;
       super(0);
    }
    public final LiveMultiLineGiftBattleModel invoke(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiLineGiftBattleController$giftBattleModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       LiveAudienceMultiLineGiftBattleController$giftBattleModel$2 tthis$0 = this.this$0;
       return new LiveMultiLineGiftBattleModel(tthis$0.p, tthis$0.s, tthis$0.t);
    }
    public Object invoke(){
       return this.invoke();
    }
}

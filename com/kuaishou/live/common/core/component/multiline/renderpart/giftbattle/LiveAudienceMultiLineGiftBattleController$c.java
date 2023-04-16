package com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.LiveAudienceMultiLineGiftBattleController$c;
import com.kuaishou.live.common.core.component.gift.gift.righttopbanner.panel.ILiveDefaultSelectGiftIdInterceptor;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.LiveAudienceMultiLineGiftBattleController;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.model.LiveMultiLineGiftBattleModel;
import java.lang.Integer;
import qk1.a;
import mk1.f;
import mk1.b;
import android.util.Pair;
import ql1.a;
import java.lang.Number;
import com.kuaishou.live.common.core.component.gift.gift.righttopbanner.panel.ILiveDefaultSelectGiftIdInterceptor$Priority;

public final class LiveAudienceMultiLineGiftBattleController$c implements ILiveDefaultSelectGiftIdInterceptor	// class@001561
{
    public final LiveAudienceMultiLineGiftBattleController a;

    public void LiveAudienceMultiLineGiftBattleController$c(LiveAudienceMultiLineGiftBattleController p0){
       this.a = p0;
       super();
    }
    public boolean a(GiftTab p0){
       p0 = PatchProxy.applyOneRefs(p0, this, LiveAudienceMultiLineGiftBattleController$c.class, "4");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       Integer integer = this.a.V2().T();
       boolean i = (integer != null)? integer.intValue(): -1;
       i = (i > 0)? true: false;
       return i;
    }
    public Pair b(a p0,GiftTab p1,f p2,b p3){
       return a.a(this, p0, p1, p2, p3);
    }
    public GiftTab c(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiLineGiftBattleController$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.V2().Y();
    }
    public int d(){
       Integer obj = PatchProxy.apply(null, this, LiveAudienceMultiLineGiftBattleController$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a.V2().T();
       int i = (obj != null)? obj.intValue(): -1;
       return i;
    }
    public int getPriority(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiLineGiftBattleController$c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ILiveDefaultSelectGiftIdInterceptor$Priority.GIFT_BATTLE.getPriority();
    }
}

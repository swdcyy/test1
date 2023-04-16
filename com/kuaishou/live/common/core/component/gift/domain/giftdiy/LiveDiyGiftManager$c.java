package com.kuaishou.live.common.core.component.gift.domain.giftdiy.LiveDiyGiftManager$c;
import mq5.h;
import com.kuaishou.live.common.core.component.gift.domain.giftdiy.LiveDiyGiftManager;
import java.lang.Object;
import com.kwai.feature.api.live.base.service.livestop.LiveAudienceEndReason;
import mq5.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class LiveDiyGiftManager$c implements h	// class@001238
{
    public final LiveDiyGiftManager b;

    public void LiveDiyGiftManager$c(LiveDiyGiftManager p0){
       this.b = p0;
       super();
    }
    public void fa(LiveAudienceEndReason p0){
       g.a(this, p0);
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, LiveDiyGiftManager$c.class, "1")) {
          return;
       }
       this.b.f(3);
       return;
    }
}

package com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftBoxConfig$a;
import java.lang.Object;
import nsd.u;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftBoxConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveAudienceGiftConfig;
import java.lang.reflect.Type;
import wg3.a;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftBoxConfig$ScrollMode;
import z1.k;

public final class LiveGiftBoxConfig$a	// class@0011d3
{

    public void LiveGiftBoxConfig$a(){
       super();
    }
    public void LiveGiftBoxConfig$a(u p0){
       super();
    }
    public final LiveGiftBoxConfig a(){
       boolean b;
       LiveConfigStartupResponse$LiveAudienceGiftConfig obj = PatchProxy.apply(null, this, LiveGiftBoxConfig$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.s(LiveConfigStartupResponse$LiveAudienceGiftConfig.class);
       LiveGiftBoxConfig$ScrollMode lIST_VERTICA = (obj != null && obj.mEnableGiftListVerticalScrollMode == 1)? LiveGiftBoxConfig$ScrollMode.LIST_VERTICAL: LiveGiftBoxConfig$ScrollMode.PAGER_HORIZONTAL;
       LiveConfigStartupResponse$LiveAudienceGiftConfig liveAudience = a.s(LiveConfigStartupResponse$LiveAudienceGiftConfig.class);
       liveAudience = (liveAudience != null)? liveAudience.mEnableGiftListSort: false;
       return new LiveGiftBoxConfig(lIST_VERTICA, liveAudience, null);
    }
}

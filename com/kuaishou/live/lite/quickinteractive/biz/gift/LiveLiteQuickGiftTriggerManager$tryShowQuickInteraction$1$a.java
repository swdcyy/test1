package com.kuaishou.live.lite.quickinteractive.biz.gift.LiveLiteQuickGiftTriggerManager$tryShowQuickInteraction$1$a;
import ok.x;
import com.kuaishou.live.lite.quickinteractive.biz.gift.LiveLiteQuickGiftTriggerManager$tryShowQuickInteraction$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.quickinteractive.biz.gift.LiveLiteQuickGiftTriggerManager;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import or5.b;
import kotlin.jvm.internal.a;

public final class LiveLiteQuickGiftTriggerManager$tryShowQuickInteraction$1$a implements x	// class@000abe
{
    public final LiveLiteQuickGiftTriggerManager$tryShowQuickInteraction$1 b;

    public void LiveLiteQuickGiftTriggerManager$tryShowQuickInteraction$1$a(LiveLiteQuickGiftTriggerManager$tryShowQuickInteraction$1 p0){
       this.b = p0;
       super();
    }
    public Object get(){
       String str = PatchProxy.applyWithListener(null, this, LiveLiteQuickGiftTriggerManager$tryShowQuickInteraction$1$a.class, "1");
       if (str != PatchProxyResult.class) {
       }else {
          LiveStreamFeedWrapper liveStreamFe = this.b.this$0.p.r5();
          a.o(liveStreamFe, "liteAudienceInfoManager.liveStreamFeedWrapper");
          str = liveStreamFe.getLiveStreamId();
          PatchProxy.onMethodExit(LiveLiteQuickGiftTriggerManager$tryShowQuickInteraction$1$a.class, "1");
       }
       return str;
    }
}

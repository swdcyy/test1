package com.kuaishou.live.common.core.component.gift.domain.effect.model.self.LiveGiftEffectSelfMockModel$resolveAfterGiftSendResponse$3;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.gift.domain.effect.model.self.LiveGiftEffectSelfMockModel;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$ToAudienceGiftFeed;
import com.kuaishou.live.common.core.component.gift.data.message.LiveGiftToAudienceMessage;
import mi1.a;
import com.kuaishou.live.core.show.gift.GiftMessage;

public final class LiveGiftEffectSelfMockModel$resolveAfterGiftSendResponse$3 extends Lambda implements l	// class@0011be
{
    public final LiveSendGiftBaseTraceInfo $traceInfo;
    public final LiveGiftEffectSelfMockModel this$0;

    public void LiveGiftEffectSelfMockModel$resolveAfterGiftSendResponse$3(LiveGiftEffectSelfMockModel p0,LiveSendGiftBaseTraceInfo p1){
       this.this$0 = p0;
       this.$traceInfo = p1;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(byte[] p0){
       boolean b;
       LiveGiftEffectSelfMockModel$resolveAfterGiftSendResponse$3 obj = PatchProxy.applyOneRefs(p0, this, LiveGiftEffectSelfMockModel$resolveAfterGiftSendResponse$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "byteArray");
       LiveStreamMessages$ToAudienceGiftFeed toAudienceGi = LiveStreamMessages$ToAudienceGiftFeed.parseFrom(p0);
       if (toAudienceGi != null) {
          obj = this.this$0;
          LiveGiftToAudienceMessage liveGiftToAu = obj.n.b(toAudienceGi);
          a.o(liveGiftToAu, "giftMessageTransformer.f¡­udienceGiftFeed\(giftFeed\)");
          obj.h(liveGiftToAu, "LiveGiftEffectSelfModel[resolveAfterGiftSendResponse]toAudienceGiftFeed", this.$traceInfo);
          b = true;
       }else {
          b = false;
       }
       return b;
    }
}

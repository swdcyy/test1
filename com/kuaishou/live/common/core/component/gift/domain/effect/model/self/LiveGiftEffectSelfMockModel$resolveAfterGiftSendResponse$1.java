package com.kuaishou.live.common.core.component.gift.domain.effect.model.self.LiveGiftEffectSelfMockModel$resolveAfterGiftSendResponse$1;
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
import com.kuaishou.livestream.message.nano.LiveStreamMessages$GiftFeed;
import com.kuaishou.live.core.show.gift.GiftMessage;
import mi1.a;

public final class LiveGiftEffectSelfMockModel$resolveAfterGiftSendResponse$1 extends Lambda implements l	// class@0011bc
{
    public final LiveSendGiftBaseTraceInfo $traceInfo;
    public final LiveGiftEffectSelfMockModel this$0;

    public void LiveGiftEffectSelfMockModel$resolveAfterGiftSendResponse$1(LiveGiftEffectSelfMockModel p0,LiveSendGiftBaseTraceInfo p1){
       this.this$0 = p0;
       this.$traceInfo = p1;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(byte[] p0){
       boolean b;
       LiveGiftEffectSelfMockModel$resolveAfterGiftSendResponse$1 obj = PatchProxy.applyOneRefs(p0, this, LiveGiftEffectSelfMockModel$resolveAfterGiftSendResponse$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "byteArray");
       LiveStreamMessages$GiftFeed giftFeed = LiveStreamMessages$GiftFeed.parseFrom(p0);
       if (giftFeed != null) {
          obj = this.this$0;
          GiftMessage giftMessage = obj.n.a(giftFeed);
          a.o(giftMessage, "giftMessageTransformer.fromGiftFeed\(giftFeed\)");
          obj.h(giftMessage, "LiveGiftEffectSelfModel[resolveAfterGiftSendResponse]normalGiftFeed", this.$traceInfo);
          b = true;
       }else {
          b = false;
       }
       return b;
    }
}

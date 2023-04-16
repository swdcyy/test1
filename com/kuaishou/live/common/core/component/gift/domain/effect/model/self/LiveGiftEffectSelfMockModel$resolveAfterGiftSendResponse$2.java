package com.kuaishou.live.common.core.component.gift.domain.effect.model.self.LiveGiftEffectSelfMockModel$resolveAfterGiftSendResponse$2;
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
import com.kuaishou.livestream.message.nano.LiveStreamMessages$BroadcastGiftFeed;
import com.kuaishou.live.common.core.component.gift.data.message.BroadcastGiftMessage;
import mi1.a;
import java.util.Objects;
import fi1.a;
import ei1.a;
import java.lang.StringBuilder;
import java.util.List;
import com.kuaishou.android.live.log.b;
import di1.a;
import com.kuaishou.livestream.message.nano.LiveCommonEffectInfo;
import com.kuaishou.live.core.show.gift.GiftMessage;
import java.util.concurrent.CopyOnWriteArraySet;
import com.kuaishou.live.common.core.component.gift.base.model.Model;

public final class LiveGiftEffectSelfMockModel$resolveAfterGiftSendResponse$2 extends Lambda implements l	// class@0011bd
{
    public final LiveSendGiftBaseTraceInfo $traceInfo;
    public final LiveGiftEffectSelfMockModel this$0;

    public void LiveGiftEffectSelfMockModel$resolveAfterGiftSendResponse$2(LiveGiftEffectSelfMockModel p0,LiveSendGiftBaseTraceInfo p1){
       this.this$0 = p0;
       this.$traceInfo = p1;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(byte[] p0){
       LiveGiftEffectSelfMockModel p;
       String str;
       Object obj = this;
       LiveStreamMessages$BroadcastGiftFeed obj1 = p0;
       Object obj2 = PatchProxy.applyOneRefs(obj1, obj, LiveGiftEffectSelfMockModel$resolveAfterGiftSendResponse$2.class, "1");
       if (obj2 != PatchProxyResult.class) {
          return obj2.booleanValue();
       }
       a.p(obj1, "byteArray");
       obj1 = LiveStreamMessages$BroadcastGiftFeed.parseFrom(p0);
       boolean b = true;
       if (obj1 != null) {
          LiveGiftEffectSelfMockModel$resolveAfterGiftSendResponse$2 this$0 = obj.this$0;
          BroadcastGiftMessage uBroadcastGi = this$0.n.c(obj1);
          a.o(uBroadcastGi, "giftMessageTransformer.f¡­oadcastGiftFeed\(giftFeed\)");
          LiveGiftEffectSelfMockModel$resolveAfterGiftSendResponse$2 $traceInfo = obj.$traceInfo;
          Objects.requireNonNull(this$0);
          if (!PatchProxy.applyVoidThreeRefs(uBroadcastGi, "LiveGiftEffectSelfModel[resolveAfterGiftSendResponse][broadcastGiftFeed]", $traceInfo, this$0, LiveGiftEffectSelfMockModel.class, "8")) {
             a.p(uBroadcastGi, "broadcastGiftMessage");
             a.p("LiveGiftEffectSelfModel[resolveAfterGiftSendResponse][broadcastGiftFeed]", "source");
             a.p($traceInfo, "traceInfo");
             int i = this$0.o.b(uBroadcastGi);
             if (i != b) {
                p = this$0.p;
                if (p != null) {
                   p.b($traceInfo, true, this$0.j, i, "LiveGiftEffectSelfModel[resolveAfterGiftSendResponse][broadcastGiftFeed]");
                }
                b.P(this$0.i, "[showBroadcastGiftEffect]: filter illegal gift "+uBroadcastGi);
             }else {
                LiveGiftEffectSelfMockModel j = this$0.j;
                a uoa = new a(null, null, uBroadcastGi, j);
                p = this$0.p;
                if (p != null) {
                   str = "LiveGiftEffectSelfModel[resolveAfterGiftSendResponse][broadcastGiftFeed]";
                   p.b($traceInfo, true, j, 1, "LiveGiftEffectSelfModel[resolveAfterGiftSendResponse][broadcastGiftFeed]");
                }else {
                   str = "LiveGiftEffectSelfModel[resolveAfterGiftSendResponse][broadcastGiftFeed]";
                }
                this$0.l.add(uBroadcastGi.mMergeKey);
                this$0.d(str, uoa);
             }
          }
       }else {
          b = false;
       }
       return b;
    }
}

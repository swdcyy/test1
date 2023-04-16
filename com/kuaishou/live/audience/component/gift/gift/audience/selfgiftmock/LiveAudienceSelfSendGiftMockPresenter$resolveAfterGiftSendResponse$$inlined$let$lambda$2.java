package com.kuaishou.live.audience.component.gift.gift.audience.selfgiftmock.LiveAudienceSelfSendGiftMockPresenter$resolveAfterGiftSendResponse$$inlined$let$lambda$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.audience.component.gift.gift.audience.selfgiftmock.LiveAudienceSelfSendGiftMockPresenter;
import lm1.i;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$BroadcastGiftFeed;
import java.util.Objects;
import lm1.h;
import com.kuaishou.live.common.core.component.gift.data.message.BroadcastGiftMessage;
import da1.c;
import com.kuaishou.live.basic.model.QLiveMessage;
import t02.a0;
import ik1.b0;

public final class LiveAudienceSelfSendGiftMockPresenter$resolveAfterGiftSendResponse$$inlined$let$lambda$2 extends Lambda implements l	// class@000af3
{
    public final i $context$inlined;
    public final LiveAudienceSelfSendGiftMockPresenter this$0;

    public void LiveAudienceSelfSendGiftMockPresenter$resolveAfterGiftSendResponse$$inlined$let$lambda$2(LiveAudienceSelfSendGiftMockPresenter p0,i p1){
       this.this$0 = p0;
       this.$context$inlined = p1;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(byte[] p0){
       boolean b;
       LiveAudienceSelfSendGiftMockPresenter$resolveAfterGiftSendResponse$$inlined$let$lambda$2 obj = PatchProxy.applyOneRefsWithListener(p0, this, LiveAudienceSelfSendGiftMockPresenter$resolveAfterGiftSendResponse$$inlined$let$lambda$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "byteArray");
       LiveStreamMessages$BroadcastGiftFeed uBroadcastGi = LiveStreamMessages$BroadcastGiftFeed.parseFrom(p0);
       if (uBroadcastGi != null) {
          obj = this.this$0;
          LiveAudienceSelfSendGiftMockPresenter$resolveAfterGiftSendResponse$$inlined$let$lambda$2 t$context$in = this.$context$inlined;
          Objects.requireNonNull(obj);
          if (!PatchProxy.applyVoidTwoRefs(t$context$in, uBroadcastGi, obj, LiveAudienceSelfSendGiftMockPresenter.class, "14")) {
             h oh = new h(t$context$in, c.a(uBroadcastGi), 2);
             LiveAudienceSelfSendGiftMockPresenter r = obj.r;
             if (r == null) {
                a.S("mCallerContext");
             }
             r.c2.k(oh);
          }
          b = true;
       }else {
          b = false;
       }
       PatchProxy.onMethodExit(LiveAudienceSelfSendGiftMockPresenter$resolveAfterGiftSendResponse$$inlined$let$lambda$2.class, "1");
       return b;
    }
}

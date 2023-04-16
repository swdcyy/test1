package com.kuaishou.live.audience.component.gift.gift.audience.selfgiftmock.LiveAudienceSelfSendGiftMockPresenter$resolveAfterGiftSendResponse$$inlined$let$lambda$1;
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
import com.kuaishou.livestream.message.nano.LiveStreamMessages$GiftFeed;
import java.util.Objects;
import lm1.h;
import com.kuaishou.live.core.show.gift.GiftMessage;
import da1.c;
import com.kuaishou.live.basic.model.QLiveMessage;
import t02.a0;
import ik1.b0;

public final class LiveAudienceSelfSendGiftMockPresenter$resolveAfterGiftSendResponse$$inlined$let$lambda$1 extends Lambda implements l	// class@000af2
{
    public final i $context$inlined;
    public final LiveAudienceSelfSendGiftMockPresenter this$0;

    public void LiveAudienceSelfSendGiftMockPresenter$resolveAfterGiftSendResponse$$inlined$let$lambda$1(LiveAudienceSelfSendGiftMockPresenter p0,i p1){
       this.this$0 = p0;
       this.$context$inlined = p1;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(byte[] p0){
       boolean b;
       LiveAudienceSelfSendGiftMockPresenter$resolveAfterGiftSendResponse$$inlined$let$lambda$1 obj = PatchProxy.applyOneRefsWithListener(p0, this, LiveAudienceSelfSendGiftMockPresenter$resolveAfterGiftSendResponse$$inlined$let$lambda$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "byteArray");
       LiveStreamMessages$GiftFeed giftFeed = LiveStreamMessages$GiftFeed.parseFrom(p0);
       if (giftFeed != null) {
          obj = this.this$0;
          LiveAudienceSelfSendGiftMockPresenter$resolveAfterGiftSendResponse$$inlined$let$lambda$1 t$context$in = this.$context$inlined;
          Objects.requireNonNull(obj);
          if (!PatchProxy.applyVoidTwoRefs(t$context$in, giftFeed, obj, LiveAudienceSelfSendGiftMockPresenter.class, "13")) {
             h oh = new h(t$context$in, c.f(giftFeed), 2);
             LiveAudienceSelfSendGiftMockPresenter r = obj.r;
             if (r == null) {
                a.S("mCallerContext");
             }
             r.c2.n(oh);
          }
          b = true;
       }else {
          b = false;
       }
       PatchProxy.onMethodExit(LiveAudienceSelfSendGiftMockPresenter$resolveAfterGiftSendResponse$$inlined$let$lambda$1.class, "1");
       return b;
    }
}

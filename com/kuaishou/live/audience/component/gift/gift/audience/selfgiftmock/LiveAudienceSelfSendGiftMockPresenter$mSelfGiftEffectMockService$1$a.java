package com.kuaishou.live.audience.component.gift.gift.audience.selfgiftmock.LiveAudienceSelfSendGiftMockPresenter$mSelfGiftEffectMockService$1$a;
import erd.g;
import com.kuaishou.live.audience.component.gift.gift.audience.selfgiftmock.LiveAudienceSelfSendGiftMockPresenter$mSelfGiftEffectMockService$1;
import lm1.i;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import com.kuaishou.live.core.show.gift.gift.audience.model.LiveAfterGiftSendInfoResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.StringBuilder;
import com.kuaishou.live.audience.component.gift.gift.audience.selfgiftmock.LiveAudienceSelfSendGiftMockPresenter;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.kuaishou.live.audience.component.gift.gift.audience.selfgiftmock.LiveAudienceSelfSendGiftMockPresenter$resolveAfterGiftSendResponse$$inlined$let$lambda$1;
import msd.l;
import com.kuaishou.live.audience.component.gift.gift.audience.selfgiftmock.LiveAudienceSelfSendGiftMockPresenter$resolveAfterGiftSendResponse$$inlined$let$lambda$2;
import com.kuaishou.live.audience.component.gift.gift.audience.selfgiftmock.LiveAudienceSelfSendGiftMockPresenter$resolveAfterGiftSendResponse$$inlined$let$lambda$3;
import java.util.Set;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import lk1.a$a;
import qrd.l1;
import crd.b;
import rm1.b;

public final class LiveAudienceSelfSendGiftMockPresenter$mSelfGiftEffectMockService$1$a implements g	// class@000aee
{
    public final LiveAudienceSelfSendGiftMockPresenter$mSelfGiftEffectMockService$1 b;
    public final i c;
    public final Ref$ObjectRef d;

    public void LiveAudienceSelfSendGiftMockPresenter$mSelfGiftEffectMockService$1$a(LiveAudienceSelfSendGiftMockPresenter$mSelfGiftEffectMockService$1 p0,i p1,Ref$ObjectRef p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       String normalGiftFe1;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceSelfSendGiftMockPresenter$mSelfGiftEffectMockService$1$a.class, "1")) {
       }else {
          LiveLogTag lIVE_SELF_GI = LiveLogTag.LIVE_SELF_GIFT_MOCK;
          b.Z(lIVE_SELF_GI, "requestAfterGiftSendInfoSucceed");
          char c = '[';
          int i = 1;
          this.b.c.V8(this.c, "CLIENT_AFTER_SEND_REQUEST_RESULT", c+this.b.c.p+"][LiveSelfGiftEffectMockService]"+"request success", i);
          LiveAudienceSelfSendGiftMockPresenter$mSelfGiftEffectMockService$1 c1 = this.b.c;
          LiveAudienceSelfSendGiftMockPresenter$mSelfGiftEffectMockService$1$a tc = this.c;
          Objects.requireNonNull(c1);
          if (!PatchProxy.applyVoidTwoRefs(tc, p0, c1, LiveAudienceSelfSendGiftMockPresenter.class, "11") && p0 != null) {
             String normalGiftFe = p0.getNormalGiftFeed();
             LiveAudienceSelfSendGiftMockPresenter$resolveAfterGiftSendResponse$$inlined$let$lambda$1 oresolveAfte = (normalGiftFe == null || !normalGiftFe.length())? 1: null;
             if (!oresolveAfte) {
                normalGiftFe1 = p0.getNormalGiftFeed();
                a.m(normalGiftFe1);
                c1.P8(normalGiftFe1, "normalGiftFeed", new LiveAudienceSelfSendGiftMockPresenter$resolveAfterGiftSendResponse$$inlined$let$lambda$1(c1, tc));
             }else {
                normalGiftFe = p0.getBroadcastGiftFeed();
                LiveAudienceSelfSendGiftMockPresenter$resolveAfterGiftSendResponse$$inlined$let$lambda$2 oresolveAfte1 = (normalGiftFe == null || !normalGiftFe.length())? 1: null;
                if (!oresolveAfte1) {
                   normalGiftFe1 = p0.getBroadcastGiftFeed();
                   a.m(normalGiftFe1);
                   c1.P8(normalGiftFe1, "broadcastGiftFeed", new LiveAudienceSelfSendGiftMockPresenter$resolveAfterGiftSendResponse$$inlined$let$lambda$2(c1, tc));
                }else {
                   normalGiftFe = p0.getToAudienceGiftFeed();
                   if (normalGiftFe != null && normalGiftFe.length()) {
                      i = 0;
                   }
                   if (!i) {
                      normalGiftFe1 = p0.getToAudienceGiftFeed();
                      a.m(normalGiftFe1);
                      c1.P8(normalGiftFe1, "toAudienceGiftFeed", new LiveAudienceSelfSendGiftMockPresenter$resolveAfterGiftSendResponse$$inlined$let$lambda$3(c1, tc));
                   }else {
                      c1.S8(tc, "CLIENT_MOCK_RESULT", c+c1.p+"][handleGiftSendResultEvent]empty feed", 616);
                      b.Z(lIVE_SELF_GI, "resolveAfterGiftSendResponseFailed for invalid response");
                   }
                }
             }
          }
          Set set = this.b.r();
          ArrayList uArrayList = new ArrayList(u.Y(set, 10));
          Iterator iterator = set.iterator();
          while (iterator.hasNext()) {
             a$a uoa = iterator.next();
             if (p0 != null) {
                uoa.a(p0);
             }
             uArrayList.add(l1.a);
          }
          this.b.c.v.a(this.d.element);
       }
       return;
    }
}

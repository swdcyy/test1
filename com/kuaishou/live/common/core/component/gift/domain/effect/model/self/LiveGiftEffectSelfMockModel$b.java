package com.kuaishou.live.common.core.component.gift.domain.effect.model.self.LiveGiftEffectSelfMockModel$b;
import erd.g;
import com.kuaishou.live.common.core.component.gift.domain.effect.model.self.LiveGiftEffectSelfMockModel;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import com.kuaishou.live.core.show.gift.gift.audience.model.LiveAfterGiftSendInfoResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kuaishou.android.live.log.b;
import java.lang.Throwable;
import ei1.a;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.common.core.component.gift.domain.effect.model.self.LiveGiftEffectSelfMockModel$resolveAfterGiftSendResponse$1;
import msd.l;
import com.kuaishou.live.common.core.component.gift.domain.effect.model.self.LiveGiftEffectSelfMockModel$resolveAfterGiftSendResponse$2;
import com.kuaishou.live.common.core.component.gift.domain.effect.model.self.LiveGiftEffectSelfMockModel$resolveAfterGiftSendResponse$3;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Integer;
import mi1.b;
import mi1.b$a;
import com.kuaishou.livestream.message.nano.LiveCommonEffectInfo;
import java.util.concurrent.CopyOnWriteArraySet;
import di1.a;
import com.kuaishou.live.core.show.gift.GiftMessage;
import com.kuaishou.live.common.core.component.gift.data.message.BroadcastGiftMessage;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import crd.b;

public final class LiveGiftEffectSelfMockModel$b implements g	// class@0011ba
{
    public final LiveGiftEffectSelfMockModel b;
    public final LiveSendGiftBaseTraceInfo c;
    public final Ref$ObjectRef d;

    public void LiveGiftEffectSelfMockModel$b(LiveGiftEffectSelfMockModel p0,LiveSendGiftBaseTraceInfo p1,Ref$ObjectRef p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       boolean b;
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftEffectSelfMockModel$b.class, "1")) {
       }else {
          b.P(this.b.i, "[requestMockSelfGiftEffect] succeed");
          LiveGiftEffectSelfMockModel p = this.b.p;
          Throwable throwable = null;
          b = true;
          if (p != null) {
             p.a(this.c, b, throwable);
          }
          LiveGiftEffectSelfMockModel$b tb = this.b;
          a.o(p0, "response");
          LiveGiftEffectSelfMockModel$b tc = this.c;
          Objects.requireNonNull(tb);
          LiveGiftEffectSelfMockModel liveGiftEffe = LiveGiftEffectSelfMockModel.class;
          if (!PatchProxy.applyVoidTwoRefs(p0, tc, tb, liveGiftEffe, "4")) {
             if (!TextUtils.x(p0.getNormalGiftFeed())) {
                tb.e(p0.getNormalGiftFeed(), "afterSendNormalGiftFeed", new LiveGiftEffectSelfMockModel$resolveAfterGiftSendResponse$1(tb, tc));
             }else if(!TextUtils.x(p0.getBroadcastGiftFeed())){
                tb.e(p0.getBroadcastGiftFeed(), "afterSendBroadcastGiftFeed", new LiveGiftEffectSelfMockModel$resolveAfterGiftSendResponse$2(tb, tc));
             }else if(!TextUtils.x(p0.getToAudienceGiftFeed())){
                tb.e(p0.getToAudienceGiftFeed(), "afterSendtToAudienceGiftFeed", new LiveGiftEffectSelfMockModel$resolveAfterGiftSendResponse$3(tb, tc));
             }else {
                a obj = PatchProxy.applyOneRefs(p0, tb, liveGiftEffe, "5");
                if (obj != PatchProxyResult.class) {
                   b = obj.booleanValue();
                }else {
                   String effectInfoPB = p0.getEffectInfoPBString();
                   if (p0.getEffectInfoType() != null) {
                      p0 = p0.getEffectInfoType();
                      a.m(p0);
                      i = p0.intValue();
                   }else {
                      i = 0;
                   }
                   if (TextUtils.x(effectInfoPB) || i != b) {
                      b.T(tb.i, "[handleAfterSendCommonEffectInfo]", "effectInfo", effectInfoPB, "effectInfoType", Integer.valueOf(i));
                   }else {
                      a.m(effectInfoPB);
                      i = b.a.b(effectInfoPB);
                      if (i == null) {
                         b.P(tb.i, "[handleAfterSendCommonEffectInfo][parseString2Bytes error]");
                      }else {
                         i = LiveCommonEffectInfo.parseFrom(i);
                         tb.l.add(i.mergeKey);
                         obj = new a(i, throwable, throwable, tb.j);
                         tb.d("AfterSendCommonEffectInfo", obj);
                      }
                   }
                   b = false;
                }
                if (!b) {
                   LiveGiftEffectSelfMockModel p1 = tb.p;
                   if (p1 != null) {
                      p1.b(tc, true, tb.j, 616, "LiveGiftEffectSelfModel[resolveAfterGiftSendResponse][failed: empty effect msg]");
                   }
                   b.P(tb.i, "resolveAfterGiftSendResponseFailed for invalid response");
                }
             }
          }
          this.b.f(this.d.element);
       }
       return;
    }
}

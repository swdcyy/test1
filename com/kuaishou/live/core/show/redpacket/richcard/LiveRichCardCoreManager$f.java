package com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$f;
import erd.g;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager;
import java.lang.Object;
import com.kuaishou.live.core.show.redpacket.richcard.http.RecoRoomInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager;
import pp.c;
import java.util.List;
import com.kuaishou.android.live.log.b;
import uw1.m;
import ei2.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.StringBuilder;
import java.lang.Integer;
import com.kwai.feature.api.live.base.model.LiveAudienceParam$a;
import tkd.b;
import tkd.d;
import os5.l;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import android.app.Activity;
import yh2.d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import b12.a;
import uw1.f;

public final class LiveRichCardCoreManager$f implements g	// class@000f46
{
    public final LiveRichCardCoreManager b;

    public void LiveRichCardCoreManager$f(LiveRichCardCoreManager p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRichCardCoreManager$f.class, "1")) {
       }else {
          LiveRichCardStateManager h = LiveRichCardStateManager.h;
          c uoc = h.f();
          uoc.appendTag(this.b.m());
          c uoc1 = uoc;
          b.U(uoc1, "[jumpToRecoRoom] 开始跳转，路由：", "url", p0.getJumpUrl(), "liveStreamId", p0.getLiveStreamId(), "cur liveStream", this.b.j());
          this.b.l().D0();
          this.b.j.a();
          if (this.b.L != null && !TextUtils.x(p0.getLiveStreamId())) {
             LiveRichCardCoreManager$f tb = this.b;
             a.o(p0, "info");
             Objects.requireNonNull(tb);
             if (!PatchProxy.applyVoidOneRefs(p0, tb, LiveRichCardCoreManager.class, "30")) {
                c uoc2 = h.f();
                uoc2.appendTag(tb.a);
                c uoc3 = uoc2;
                b.V(uoc3, "startLivePlayActivityWithoutSlide， recommendReason = "+p0+".recommendReason", "activity", tb.L, "target liveStreamId", p0.getLiveStreamId(), "sourceType", p0.getSourceType(), "sourceUrl", p0.getSourceUrl());
                if (tb.L != null && p0.getSourceType() != null) {
                   LiveAudienceParam$a uoa = new LiveAudienceParam$a();
                   uoa.i(p0.getLiveStreamId());
                   uoa.g(p0.getSourceType().intValue());
                   uoa.h(p0.getSourceUrl());
                   uoa.l(p0.getRecommendReason());
                   d.a(-1492894991).m1(tb.L, uoa.a());
                   p0 = PatchProxy.apply(null, null, d.class, "2");
                   b = (p0 != PatchProxyResult.class)? p0.booleanValue(): a.t().u("SOURCE_LIVE").d("disableUseLimitService", true);
                   if (!b) {
                      tb.R.ne(tb.L);
                   }
                }
             }
          }else {
             b.S(h.f().appendTag(this.b.m()), "[jumpToRecoRoom] 跳转失败，直播间有问题", "url", p0.getJumpUrl());
             p0.v = false;
             d.a("跳转失败, 直播间有问题");
          }
          this.b.w(null);
       }
       return;
    }
}

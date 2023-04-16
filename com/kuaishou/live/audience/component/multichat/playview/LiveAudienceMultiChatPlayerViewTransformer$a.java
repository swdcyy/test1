package com.kuaishou.live.audience.component.multichat.playview.LiveAudienceMultiChatPlayerViewTransformer$a;
import aq5.b;
import com.kuaishou.live.audience.component.multichat.playview.LiveAudienceMultiChatPlayerViewTransformer;
import java.lang.Object;
import aq5.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.d;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.livestage.LiveStageInit;
import ee1.a;
import java.lang.StringBuilder;
import com.kwai.video.waynelive.LivePlayerController;
import com.kuaishou.live.livestage.basic.LayoutConfig;

public final class LiveAudienceMultiChatPlayerViewTransformer$a implements b	// class@000ba5
{
    public final LiveAudienceMultiChatPlayerViewTransformer b;

    public void LiveAudienceMultiChatPlayerViewTransformer$a(LiveAudienceMultiChatPlayerViewTransformer p0){
       this.b = p0;
       super();
    }
    public final void e6(a p0,boolean p1){
       LiveAudienceMultiChatPlayerViewTransformer$a uoa = LiveAudienceMultiChatPlayerViewTransformer$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       a.p(p0, "bizRelation");
       if (p0 == AudienceBizRelation.CHAT_VIDEO_STATUS_VIEW) {
          LiveAudienceMultiChatPlayerViewTransformer$a tb = this.b;
          if (tb.c != p1) {
             tb.c = p1;
             boolean b = tb.r.r2(AudienceBizRelation.VOICE_PARTY);
             Object[] objArray = new Object[]{"isInVoiceParty",Boolean.valueOf(b),"enabled",Boolean.valueOf(p1)};
             int i = 0;
             this.b.j("handleChatBizStatus by biz status changed", objArray);
             if (!b) {
                tb = this.b;
                Objects.requireNonNull(tb);
                Object obj = PatchProxy.apply(null, tb, LiveAudienceMultiChatPlayerViewTransformer.class, "24");
                if (obj != PatchProxyResult.class) {
                   b = obj.booleanValue();
                }else if(tb.c != null && LiveStageInit.e.a()){
                   int i1 = tb.n.j();
                   Object[] objArray1 = new Object[i];
                   tb.j("rtc state "+i1, objArray1);
                   if (i1 == 2) {
                      b = false;
                   }
                }
                b = true;
                if (b) {
                   tb = this.b;
                   if (tb.m.getCurrentLiveStreamType() == 4) {
                      i = true;
                   }
                   tb.h(p1, i, this.b.e);
                }
             }
          }
       }
       return;
    }
}

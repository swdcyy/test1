package com.kuaishou.live.common.core.component.multichat.audience.core.LiveAudienceMultiChatCoreModel$b;
import uz1.a;
import com.kuaishou.live.common.core.component.multichat.audience.core.LiveAudienceMultiChatCoreModel;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.protobuf.livestream.nano.LiveMultiChatStart;
import up1.e;
import up1.b;
import lh3.b;
import kotlin.jvm.internal.a;
import java.util.Objects;
import sz1.e;
import com.kuaishou.live.livestage.g;
import je3.i;
import u71.a;
import op1.b;
import com.kuaishou.live.livestage.f;
import com.kuaishou.live.livestage.f$a$b;
import com.kuaishou.live.livestage.f$b;
import com.kuaishou.live.livestage.f$a;
import fe3.b;
import com.kuaishou.live.livestage.videopipe.renderarea.ui.RenderAreaView;
import ip1.a;
import re3.c;
import com.kuaishou.live.livestage.VideoRenderMode;
import ee3.d0;
import com.kwai.robust.PatchProxyResult;
import je3.b;
import u71.c;
import rd1.e0;
import xo1.c;
import ge3.i;
import wp1.c;
import com.kuaishou.live.basic.model.StreamType;
import ee3.e;
import jp1.d;
import re3.e;
import com.kuaishou.live.common.core.component.multichat.audience.core.LiveAudienceMultiChatCoreModel$initLiveStage$3;
import msd.l;
import com.kuaishou.live.common.multiinteract.biz.adapter.BizEndReason;
import kp1.a;
import w12.a;

public final class LiveAudienceMultiChatCoreModel$b implements a	// class@0014bf
{
    public final LiveAudienceMultiChatCoreModel a;

    public void LiveAudienceMultiChatCoreModel$b(LiveAudienceMultiChatCoreModel p0){
       this.a = p0;
       super();
    }
    public void a(int p0,String p1){
       boolean b;
       LiveAudienceMultiChatCoreModel$b uob = LiveAudienceMultiChatCoreModel$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "1")) {
          return;
       }
       LiveCommonLogTag nEW_MULTI_CH = LiveCommonLogTag.NEW_MULTI_CHAT;
       String str = "InteractiveSdk onBizStart";
       b.c0(nEW_MULTI_CH, str, "biz", Integer.valueOf(p0));
       int i = 1;
       if (p0 == i) {
          this.a.x(e.a(p1, "onBizStart"));
          LiveAudienceMultiChatCoreModel$b ta = this.a;
          LiveMultiChatStart liveMultiCha = ta.j();
          liveMultiCha = (liveMultiCha != null)? liveMultiCha.enableUpdateLayoutTheme: false;
          ta.z(liveMultiCha);
          if (!this.a.u()) {
             b.Z(nEW_MULTI_CH, "InteractiveSdk enableUpdateLayoutTheme return");
             return;
          }else {
             b.c0(nEW_MULTI_CH, str, "commonLogParam", this.a.l());
             ta = this.a;
             liveMultiCha = ta.q().getBizId();
             if (liveMultiCha == null) {
                liveMultiCha = "";
             }
             a.o(liveMultiCha, "rtcManager.bizId ?: \"\"");
             Objects.requireNonNull(ta);
             if (!PatchProxy.applyVoidOneRefs(liveMultiCha, ta, LiveAudienceMultiChatCoreModel.class, "3")) {
                g og = ta.p().vi();
                i oi = ta.p().Rf();
                b.e0(nEW_MULTI_CH, "LiveStage initLiveStage", "liveStage", ta.n, "stageManager", og, "commonLogParam", ta.l());
                if (ta.n == null && (og != null && oi != null)) {
                   LiveAudienceMultiChatCoreModel v = ta.v;
                   a uoa = null;
                   if (v != null) {
                      v.d(uoa);
                   }
                   f$a$b uoa$b = f.s.b().x(oi).b(new b(i, liveMultiCha)).w(ta.s.c()).A(VideoRenderMode.ALWAYS).y(ta.o);
                   c uoc = PatchProxy.apply(uoa, ta, LiveAudienceMultiChatCoreModel.class, "12");
                   if (uoc != PatchProxyResult.class) {
                   }else {
                      v = ta.v;
                      if (v != null) {
                         uoc = v.e();
                         if (uoc != null) {
                         label_00fc :
                            a.o(uoc, "cameraParams");
                            uoc = new c(uoc);
                         }
                      }
                      uoc = e0.a(i);
                      goto label_00fc ;
                   }
                   uoa$b = uoa$b.d(uoc);
                   LiveAudienceMultiChatCoreModel v1 = ta.v;
                   if (v1 != null) {
                      i oi1 = v1.h();
                      if (oi1 != null) {
                         f$a$b uoa$b1 = uoa$b.a(oi1);
                      }
                   }
                   if (ta.s.V0() == StreamType.AUDIO.toInt()) {
                      uoa$b.C(e.d);
                   }else {
                      uoa$b.C(e.a);
                   }
                   ta.n = uoa$b.c();
                   ta.s.c().setPositionCalculator(new d(ta));
                   ta.E();
                   ta.s.c().setPlayerViewVisibilityObserver(new LiveAudienceMultiChatCoreModel$initLiveStage$3(ta));
                   LiveAudienceMultiChatCoreModel n = ta.n;
                   a.m(n);
                   og.e(n);
                }
             }
          }
       }
    label_0163 :
       return;
    }
    public void b(int p0,String p1,BizEndReason p2){
       if (PatchProxy.isSupport(LiveAudienceMultiChatCoreModel$b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, LiveAudienceMultiChatCoreModel$b.class, "2")) {
          return;
       }
       a.p(p2, "bizEndReason");
       if (p0 == 1) {
          b.c0(LiveCommonLogTag.NEW_MULTI_CHAT, "InteractiveSdk onBizEnd", "commonLogParam", this.a.l());
          this.a.v0(9);
          this.a.D().n(0);
          this.a.c();
       }
       return;
    }
}

package com.kuaishou.live.common.core.component.multichat.audience.core.LiveAudienceMultiChatCoreModel$a;
import ee3.d0;
import com.kuaishou.live.common.core.component.multichat.audience.core.LiveAudienceMultiChatCoreModel;
import java.lang.Object;
import ee3.b0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import fe3.b;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import java.lang.Integer;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Objects;
import kp1.a;
import com.kuaishou.live.common.core.component.multichat.core.statemachine.MultiChatState;
import ee1.a;
import java.util.List;
import up1.b;
import w12.a;

public final class LiveAudienceMultiChatCoreModel$a implements d0	// class@0014be
{
    public final LiveAudienceMultiChatCoreModel a;

    public void LiveAudienceMultiChatCoreModel$a(LiveAudienceMultiChatCoreModel p0){
       this.a = p0;
       super();
    }
    public final void a(b0 p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiChatCoreModel$a.class, str)) {
          return;
       }
       a.p(p0, "avStatus");
       LiveCommonLogTag nEW_MULTI_CH = LiveCommonLogTag.NEW_MULTI_CHAT;
       b.c0(nEW_MULTI_CH, "LiveStage AVStatusCallback", "biz", Integer.valueOf(p0.a.b().b()));
       LiveAudienceMultiChatCoreModel$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, LiveAudienceMultiChatCoreModel.class, str) && p0.a.b().b() == 1) {
          int i = ta.t.j();
          b.f0(nEW_MULTI_CH, "LiveStage AVStatusCallback", "StageStatus", p0, "currentState", ta.D().u(), "rtcCurrentState", Integer.valueOf(i), "commonLogParam", ta.l());
          ta.A(p0.b, p0.a);
          if (2 == i) {
             ta.D().n(3);
          }else {
             ta.D().n(1);
          }
       }
       return;
    }
}

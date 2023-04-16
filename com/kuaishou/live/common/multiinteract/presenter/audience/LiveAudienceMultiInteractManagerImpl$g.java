package com.kuaishou.live.common.multiinteract.presenter.audience.LiveAudienceMultiInteractManagerImpl$g;
import mq5.h;
import com.kuaishou.live.common.multiinteract.presenter.audience.LiveAudienceMultiInteractManagerImpl;
import java.lang.Object;
import com.kwai.feature.api.live.base.service.livestop.LiveAudienceEndReason;
import mq5.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import sz1.m;
import kotlin.jvm.internal.a;
import lh3.b;
import xg3.a;
import com.kuaishou.live.multiinteract.rtc.b;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatRoomInfo;
import nh3.b;
import f02.a;
import sz1.a;

public final class LiveAudienceMultiInteractManagerImpl$g implements h	// class@0017f5
{
    public final LiveAudienceMultiInteractManagerImpl b;

    public void LiveAudienceMultiInteractManagerImpl$g(LiveAudienceMultiInteractManagerImpl p0){
       this.b = p0;
       super();
    }
    public void fa(LiveAudienceEndReason p0){
       g.a(this, p0);
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceMultiInteractManagerImpl$g.class, "1")) {
          return;
       }
       m k = this.b.k;
       a.o(k, "liveInteractController");
       b uob = k.d();
       a.o(uob, "liveInteractController.liveInteractRtcManager");
       SCInteractiveChatRoomInfo sCInteractiv = uob.b();
       if (sCInteractiv != null) {
          a.o(sCInteractiv, "liveInteractController.l¡­: return@LiveStopListener");
          LiveAudienceMultiInteractManagerImpl k1 = this.b.K;
          if (k1 != null) {
             uob = a.j(sCInteractiv);
             a.o(uob, "LiveMultiLineConvertUtil¡­InfoPb2RoomInfo\(roomInfo\)");
             k1.b(uob);
          }
       }
       return;
    }
}

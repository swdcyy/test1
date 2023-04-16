package com.kuaishou.live.lite.adapter.component.multiinteract.LiveLiteMultiInteractManagerImpl$h;
import mq5.h;
import com.kuaishou.live.lite.adapter.component.multiinteract.LiveLiteMultiInteractManagerImpl;
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

public final class LiveLiteMultiInteractManagerImpl$h implements h	// class@001dff
{
    public final LiveLiteMultiInteractManagerImpl b;

    public void LiveLiteMultiInteractManagerImpl$h(LiveLiteMultiInteractManagerImpl p0){
       this.b = p0;
       super();
    }
    public void fa(LiveAudienceEndReason p0){
       g.a(this, p0);
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, LiveLiteMultiInteractManagerImpl$h.class, "1")) {
          return;
       }
       m k = this.b.k;
       a.o(k, "liveInteractController");
       b uob = k.d();
       a.o(uob, "liveInteractController.liveInteractRtcManager");
       SCInteractiveChatRoomInfo sCInteractiv = uob.b();
       if (sCInteractiv != null) {
          a.o(sCInteractiv, "liveInteractController.l¡­: return@LiveStopListener");
          LiveLiteMultiInteractManagerImpl e = this.b.E;
          if (e != null) {
             uob = a.j(sCInteractiv);
             a.o(uob, "LiveMultiLineConvertUtil¡­InfoPb2RoomInfo\(roomInfo\)");
             e.b(uob);
          }
       }
       return;
    }
}

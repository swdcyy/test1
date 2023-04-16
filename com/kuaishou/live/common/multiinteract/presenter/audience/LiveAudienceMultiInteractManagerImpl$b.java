package com.kuaishou.live.common.multiinteract.presenter.audience.LiveAudienceMultiInteractManagerImpl$b;
import lh3.i0;
import com.kuaishou.live.common.multiinteract.presenter.audience.LiveAudienceMultiInteractManagerImpl;
import java.lang.Object;
import nh3.a;
import lh3.h0;
import java.lang.Throwable;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatClosed;
import com.kuaishou.live.multiinteract.rtc.RtcCloseReason;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import sz1.m;
import lh3.b;
import xg3.a;
import com.kuaishou.live.multiinteract.rtc.b;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatRoomInfo;
import nh3.b;
import f02.a;
import sz1.a;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatSwitchBiz;
import nh3.c;
import xp5.i;
import com.kwai.framework.model.user.UserInfo;
import xp5.g;
import lp3.e;
import lp3.a;
import lp3.c;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;

public final class LiveAudienceMultiInteractManagerImpl$b implements i0	// class@0017f0
{
    public final LiveAudienceMultiInteractManagerImpl a;

    public void LiveAudienceMultiInteractManagerImpl$b(LiveAudienceMultiInteractManagerImpl p0){
       this.a = p0;
       super();
    }
    public void o(a p0){
       h0.e(this, p0);
    }
    public void p(int p0,int p1){
       h0.b(this, p0, p1);
    }
    public void q(int p0,boolean p1,Throwable p2){
       h0.i(this, p0, p1, p2);
    }
    public void r(int p0){
       h0.a(this, p0);
    }
    public void s(SCInteractiveChatClosed p0,RtcCloseReason p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAudienceMultiInteractManagerImpl$b.class, "4")) {
          return;
       }
       a.p(p1, "reason");
       m k = this.a.k;
       a.o(k, "liveInteractController");
       b uob = k.d();
       a.o(uob, "liveInteractController.liveInteractRtcManager");
       SCInteractiveChatRoomInfo sCInteractiv = uob.b();
       if (sCInteractiv != null) {
          a.o(sCInteractiv, "liveInteractController.l\x20\x02iveChatRoomInfo ?: return\x00");
          LiveAudienceMultiInteractManagerImpl k1 = this.a.K;
          if (k1 != null) {
             uob = a.j(sCInteractiv);
             a.o(uob, "LiveMultiLineConvertUtil¡­InfoPb2RoomInfo\(roomInfo\)");
             k1.d(uob);
          }
       }
       return;
    }
    public void t(int p0){
       h0.j(this, p0);
    }
    public void u(SCInteractiveChatSwitchBiz p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiInteractManagerImpl$b.class, "3")) {
          return;
       }
       m k = this.a.k;
       a.o(k, "liveInteractController");
       b uob = k.d();
       a.o(uob, "liveInteractController.liveInteractRtcManager");
       SCInteractiveChatRoomInfo sCInteractiv = uob.b();
       if (sCInteractiv != null) {
          a.o(sCInteractiv, "liveInteractController.l\x20\x02iveChatRoomInfo ?: return\x00");
          LiveAudienceMultiInteractManagerImpl k1 = this.a.K;
          if (k1 != null) {
             uob = a.j(sCInteractiv);
             a.o(uob, "LiveMultiLineConvertUtil¡­InfoPb2RoomInfo\(roomInfo\)");
             k1.f(uob);
          }
       }
       return;
    }
    public void v(boolean p0,Throwable p1){
       h0.d(this, p0, p1);
    }
    public void w(c p0){
       i oi = i.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiInteractManagerImpl$b.class, "2")) {
          return;
       }
       a.p(p0, "userInfo");
       m e = this.a.e;
       String str = "liveInfoManager";
       a.o(e, str);
       if (a.g(p0.c().mId, e.d())) {
          LiveAudienceMultiInteractManagerImpl$b ta = this.a;
          c uoc = ta.Po().a(oi);
          a.o(uoc, "serviceManager.getServic¡­kageProvider::class.java\)");
          m e1 = this.a.e;
          a.o(e1, str);
          str = e1.d();
          c uoc1 = this.a.Po().a(oi);
          a.o(uoc1, "serviceManager.getServic¡­kageProvider::class.java\)");
          ClientContent$LiveStreamPackage liveStreamPa = uoc1.a();
          a.o(liveStreamPa, "serviceManager.getServic¡­s.java\).liveStreamPackage");
          m k = this.a.k;
          a.o(k, "liveInteractController");
          ta.K = new a(uoc.getPage(), str, liveStreamPa, k);
          LiveAudienceMultiInteractManagerImpl k1 = this.a.K;
          if (k1 != null) {
             k1.c();
          }
       }
       return;
    }
    public void x(SCInteractiveChatRoomInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiInteractManagerImpl$b.class, "1")) {
          return;
       }
       a.p(p0, "scInteractiveChatRoomInfo");
       b uob = a.j(p0);
       LiveAudienceMultiInteractManagerImpl k = this.a.K;
       if (k != null) {
          a.o(uob, "roomInfo");
          k.e(uob);
       }
       return;
    }
}

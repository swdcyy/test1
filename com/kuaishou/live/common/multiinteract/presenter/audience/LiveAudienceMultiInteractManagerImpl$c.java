package com.kuaishou.live.common.multiinteract.presenter.audience.LiveAudienceMultiInteractManagerImpl$c;
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
import com.kuaishou.live.livestage.g;
import je3.i;
import java.lang.Integer;
import lp3.e;
import lp3.a;
import ee1.a;
import lp3.c;
import tr.a;
import qp1.a;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.aryainstance.config.SnowConfig;
import ex1.b;
import com.kwai.framework.model.user.QCurrentUser;
import o56.a;
import i91.m;
import tr.d;
import tr.c;
import cw4.b;
import java.util.Objects;
import brd.a0;
import va1.q0;
import b02.c;
import b02.d;
import erd.g;
import crd.b;
import crd.a;
import xp5.g;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatSwitchBiz;
import n91.f;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatRoomInfo;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatBizIdentity;
import com.kuaishou.live.common.core.component.livestage.LiveStageInit;
import d02.d;
import lh3.b;
import hh3.d;
import brd.t;
import xo1.i;
import com.kuaishou.live.common.multiinteract.presenter.audience.LiveAudienceMultiInteractManagerImpl$initStageManagerIfNeed$1;
import xo1.a;
import msd.a;
import xo1.f;
import d02.a;
import d02.b;
import com.kwai.video.waynelive.LivePlayerController;
import com.kuaishou.live.common.core.component.livestage.a;
import com.kuaishou.live.common.core.component.livestage.LiveStageRenderViewFactory;
import msd.l;
import com.kuaishou.live.common.core.component.livestage.LiveStageRenderViewFactory$a;
import b02.a;
import b02.b;
import ee3.g;
import oe3.f;
import je3.k;
import je3.g;
import je3.c;
import je3.n;
import ee3.f;
import ee3.z;
import com.kuaishou.live.livestage.g$a;
import nh3.c;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatRoomInfo;

public final class LiveAudienceMultiInteractManagerImpl$c implements i0	// class@0017f1
{
    public final LiveAudienceMultiInteractManagerImpl a;

    public void LiveAudienceMultiInteractManagerImpl$c(LiveAudienceMultiInteractManagerImpl p0){
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAudienceMultiInteractManagerImpl$c.class, "2")) {
          return;
       }
       a.p(p1, "reason");
       m n = this.a.n;
       if (n != null) {
          n.release();
       }
       LiveAudienceMultiInteractManagerImpl$c ta = this.a;
       ta.n = null;
       n = ta.o;
       if (n != null) {
          n.release();
       }
       n.o = null;
       return;
    }
    public void t(int p0){
       LiveAudienceMultiInteractManagerImpl$c uoc = LiveAudienceMultiInteractManagerImpl$c.class;
       String str = "1";
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, str)) {
          return;
       }
       c uoc1 = this.a.Po().a(a.class);
       a.o(uoc1, "serviceManager.getServic¡­veRTCManager::class.java\)");
       int i = 1;
       if (p0 == i) {
          a uoa = a.e();
          SnowConfig snowConfig = PatchProxy.apply(null, null, a.class, str);
          if (snowConfig != PatchProxyResult.class) {
          }else {
             SnowConfig snowConfig1 = new SnowConfig();
             snowConfig1.videoTargetHeight = 320;
             snowConfig1.videoTargetWidth = 180;
             snowConfig1.appName = "kuaishou_android";
             QCurrentUser qCurrentUser = QCurrentUser.me();
             a.o(qCurrentUser, "QCurrentUser.me\(\)");
             snowConfig1.appUserId = qCurrentUser.getId();
             snowConfig1.deviceId = a.a;
             snowConfig1.appVersion = a.m;
             snowConfig1.isAnchor = false;
             snowConfig1.videoInitBitrateKbps = 225;
             snowConfig1.videoMinBitrateKbps = 100;
             snowConfig1.videoMaxBitrateKbps = 275;
             snowConfig1.videoEnableCrop = i;
             snowConfig1.videoEncConfig = b.d();
             snowConfig1.aryaConfig = b.c();
             snowConfig1.enableVideoFrameByteBufferObjectPoolOpt = m.c();
             snowConfig = snowConfig1;
          }
          uoc1.Zf(c.b(uoa, snowConfig), null);
          LiveAudienceMultiInteractManagerImpl$c ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoidOneRefs(uoc1, ta, LiveAudienceMultiInteractManagerImpl.class, "9")) {
             ta.G.c(q0.a().R(new c(uoc1), d.b));
          }
       }
       c uoc2 = this.a.Po().a(g.class);
       a.o(uoc2, "serviceManager.getServic¡­eInfoManager::class.java\)");
       b.a(uoc2.V0());
       return;
    }
    public void u(SCInteractiveChatSwitchBiz p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiInteractManagerImpl$c.class, "3")) {
          return;
       }
       LiveAudienceMultiInteractManagerImpl$c ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, LiveAudienceMultiInteractManagerImpl.class, "5") && ta.n == null) {
          c uoc = ta.Po().a(f.class);
          a.o(uoc, "serviceManager.getServic¡­TimeProvider::class.java\)");
          int i = 1;
          if (p0 != null) {
             SCInteractiveChatSwitchBiz roomInfo = p0.roomInfo;
             if (roomInfo != null) {
                InteractiveChatRoomInfo bizIdentity = roomInfo.bizIdentity;
                if (bizIdentity != null && bizIdentity.bizType == i) {
                   b = true;
                label_0046 :
                   if (p0 != null) {
                      p0 = p0.roomInfo;
                      if (p0 != null) {
                         InteractiveChatRoomInfo bizIdentity1 = p0.bizIdentity;
                         if (bizIdentity1 != null && bizIdentity1.bizType == i) {
                         label_0056 :
                            b uob = ta.gc();
                            a.o(uob, "liveInteractRtcManager");
                            d uod = ta.Sj();
                            a.o(uod, "liveInteractMediaProcessor");
                            m s = ta.s;
                            a.o(s, "mBizSwitchObservable");
                            d uod1 = new d(uob, uod, s);
                            ta.o = uod1;
                            a uoa = ta.y.c();
                            a.m(uoa);
                            a uoa1 = ta.y.c();
                            a.m(uoa1);
                            a uoa2 = ta.y.c();
                            a.m(uoa2);
                            ta.n = g.a.c(uod1, new i(ta.m, null, new LiveAudienceMultiInteractManagerImpl$initStageManagerIfNeed$1(ta)), new f(uoa.a()), ta.y.b(), LiveStageRenderViewFactory.e.d(uoa1.b(), uoa2.c()), new a(uoc), b.a, new g(ta.H), new f(b, (LiveStageInit.e.a() & i)));
                         }
                      }
                   }
                   i = 0;
                   goto label_0056 ;
                }
             }
          }
          b = LiveStageInit.c;
          goto label_0046 ;
       }
       return;
    }
    public void v(boolean p0,Throwable p1){
       h0.d(this, p0, p1);
    }
    public void w(c p0){
       h0.c(this, p0);
    }
    public void x(SCInteractiveChatRoomInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiInteractManagerImpl$c.class, "4")) {
          return;
       }
       a.p(p0, "scInteractiveChatRoomInfo");
       this.a.Vo();
       return;
    }
}

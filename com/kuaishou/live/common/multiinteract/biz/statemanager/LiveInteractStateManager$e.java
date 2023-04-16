package com.kuaishou.live.common.multiinteract.biz.statemanager.LiveInteractStateManager$e;
import lh3.i0;
import com.kuaishou.live.common.multiinteract.biz.statemanager.LiveInteractStateManager;
import java.lang.Object;
import nh3.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.List;
import java.util.Iterator;
import nh3.c;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import xz1.b;
import w12.a;
import java.lang.Integer;
import java.lang.Throwable;
import lh3.h0;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatClosed;
import com.kuaishou.live.multiinteract.rtc.RtcCloseReason;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatSwitchBiz;
import lh3.b;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatRoomInfo;

public final class LiveInteractStateManager$e implements i0	// class@0017eb
{
    public final LiveInteractStateManager a;

    public void LiveInteractStateManager$e(LiveInteractStateManager p0){
       this.a = p0;
       super();
    }
    public void o(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveInteractStateManager$e.class, "3")) {
          return;
       }
       a.p(p0, "interactLeaveInfos");
       Iterator iterator = p0.b().iterator();
       while (iterator.hasNext()) {
          c uoc = iterator.next();
          a.o(uoc, "leaveUser");
          QCurrentUser qCurrentUser = QCurrentUser.me();
          a.o(qCurrentUser, "QCurrentUser.me\(\)");
          if ((uoc.c().mId).equals(qCurrentUser.getId())) {
             b.S(LiveLogTag.LIVE_MULTI_INTERACT.appendTag("LiveInteractStateManager"), "updateState", "moduleName", "onLeaveRoom");
             this.a.T().n(0);
          }
       }
       return;
    }
    public void p(int p0,int p1){
       LiveInteractStateManager$e uoe = LiveInteractStateManager$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoe, "2")) {
          return;
       }
       this.a.U("onEnterRoomFailed", Integer.valueOf(p0));
       return;
    }
    public void q(int p0,boolean p1,Throwable p2){
       h0.i(this, p0, p1, p2);
    }
    public void r(int p0){
       h0.a(this, p0);
    }
    public void s(SCInteractiveChatClosed p0,RtcCloseReason p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveInteractStateManager$e.class, "4")) {
          return;
       }
       b.S(LiveLogTag.LIVE_MULTI_INTERACT.appendTag("LiveInteractStateManager"), "updateState", "moduleName", "onRTCRoomClosed");
       this.a.T().n(0);
       return;
    }
    public void t(int p0){
       h0.j(this, p0);
    }
    public void u(SCInteractiveChatSwitchBiz p0){
       h0.h(this, p0);
    }
    public void v(boolean p0,Throwable p1){
       h0.d(this, p0, p1);
    }
    public void w(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveInteractStateManager$e.class, "1")) {
          return;
       }
       a.p(p0, "userInfo");
       QCurrentUser qCurrentUser = QCurrentUser.me();
       String str = "QCurrentUser.me\(\)";
       a.o(qCurrentUser, str);
       if ((p0.c().mId).equals(qCurrentUser.getId())) {
          qCurrentUser = QCurrentUser.me();
          a.o(qCurrentUser, str);
          if (this.a.j.a(qCurrentUser.getId())) {
             this.a.U("onEnterRoomSuccess", null);
          }
       }
       return;
    }
    public void x(SCInteractiveChatRoomInfo p0){
       h0.g(this, p0);
    }
}

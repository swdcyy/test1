package com.kuaishou.live.common.core.component.multichat.audience.core.LiveAudienceMultiChatCoreModel$c;
import lh3.i0;
import com.kuaishou.live.common.core.component.multichat.audience.core.LiveAudienceMultiChatCoreModel;
import java.lang.Object;
import nh3.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import lh3.b;
import up1.b;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatRoomInfo;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatRoomInfo;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatBizIdentity;
import java.lang.Integer;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import nh3.c;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.framework.model.user.UserInfo;
import kp1.a;
import com.kuaishou.live.common.core.component.multichat.core.statemachine.MultiChatState;
import w12.a;
import java.util.concurrent.CopyOnWriteArrayList;
import up1.d;
import lh3.h0;
import java.lang.Throwable;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatClosed;
import com.kuaishou.live.multiinteract.rtc.RtcCloseReason;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatSwitchBiz;
import java.lang.CharSequence;
import android.text.TextUtils;
import ee1.a;
import java.lang.Boolean;

public final class LiveAudienceMultiChatCoreModel$c implements i0	// class@0014c0
{
    public final LiveAudienceMultiChatCoreModel a;

    public void LiveAudienceMultiChatCoreModel$c(LiveAudienceMultiChatCoreModel p0){
       this.a = p0;
       super();
    }
    public void o(a p0){
       Integer integer;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiChatCoreModel$c.class, "2")) {
          return;
       }
       a.p(p0, "interactLeaveInfos");
       SCInteractiveChatRoomInfo sCInteractiv = this.a.q().b();
       LiveCommonLogTag liveCommonLo = null;
       if (sCInteractiv != null) {
          sCInteractiv = sCInteractiv.roomInfo;
          if (sCInteractiv != null) {
             InteractiveChatRoomInfo bizIdentity = sCInteractiv.bizIdentity;
             if (bizIdentity != null) {
                integer = Integer.valueOf(bizIdentity.bizType);
             label_002d :
                b.d0(LiveCommonLogTag.NEW_MULTI_CHAT, "InteractiveSdk onLeaveRoom", "biz", integer, "interactLeaveInfos", p0);
                if (this.a.u()) {
                   String str = 1;
                   if (integer != null && integer.intValue() == str) {
                      List list = p0.b();
                      a.o(list, "interactLeaveInfos.leavedUsers");
                      Iterator iterator = list.iterator();
                      while (true) {
                         if (iterator.hasNext()) {
                            Object obj = iterator.next();
                            Object obj1 = obj;
                            QCurrentUser qCurrentUser = QCurrentUser.me();
                            a.o(qCurrentUser, "QCurrentUser.me\(\)");
                            a.o(obj1, "interactUser");
                            if ((qCurrentUser.getId()).equals(obj1.c().mId)) {
                               liveCommonLo = obj;
                            }
                         }
                         if (liveCommonLo != null) {
                            b.d0(LiveCommonLogTag.NEW_MULTI_CHAT, "InteractiveSdk onLeaveRoom", "currentState", this.a.D().u(), "commonLogParam", this.a.l());
                            this.a.D().n(2);
                            iterator = this.a.n().iterator();
                            while (iterator.hasNext()) {
                               iterator.next().o(p0);
                            }
                         }
                      }
                   }
                }
                return;
             }
          }
       }
       integer = liveCommonLo;
       goto label_002d ;
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
       h0.f(this, p0, p1);
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
       Integer integer;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiChatCoreModel$c.class, "1")) {
          return;
       }
       a.p(p0, "userInfo");
       SCInteractiveChatRoomInfo sCInteractiv = this.a.q().b();
       if (sCInteractiv != null) {
          sCInteractiv = sCInteractiv.roomInfo;
          if (sCInteractiv != null) {
             InteractiveChatRoomInfo bizIdentity = sCInteractiv.bizIdentity;
             if (bizIdentity != null) {
                integer = Integer.valueOf(bizIdentity.bizType);
             label_002c :
                QCurrentUser mE = QCurrentUser.ME;
                a.o(mE, "QCurrentUser.ME");
                boolean b = TextUtils.equals(p0.c().mId, mE.getId());
                boolean b1 = (this.a.t.j() == 2 && b)? true: false;
                LiveCommonLogTag nEW_MULTI_CH = LiveCommonLogTag.NEW_MULTI_CHAT;
                b.f0(nEW_MULTI_CH, "InteractiveSdk onEnterRoomSuccess", "userInfo", p0, "biz", integer, "isCurrentUser", Boolean.valueOf(b), "isCurrentUserInLocalRtcRoom", Boolean.valueOf(b1));
                if (integer != null && (integer.intValue() == 1 && (b1 && this.a.u()))) {
                   b.d0(nEW_MULTI_CH, "InteractiveSdk onEnterRoomSuccess", "currentState", this.a.D().u(), "commonLogParam", this.a.l());
                   this.a.D().n(4);
                }
             label_00a4 :
                return;
             }
          }
       }
       integer = null;
       goto label_002c ;
    }
    public void x(SCInteractiveChatRoomInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceMultiChatCoreModel$c.class, "3")) {
          return;
       }
       a.p(p0, "scInteractiveChatRoomInfo");
       SCInteractiveChatRoomInfo roomInfo = p0.roomInfo;
       if (roomInfo != null) {
          InteractiveChatRoomInfo bizIdentity = roomInfo.bizIdentity;
          if (bizIdentity != null && bizIdentity.bizType == 1) {
             b.Z(LiveCommonLogTag.NEW_MULTI_CHAT, "InteractiveSdk onReceivedRoomInfo");
             this.a.C(p0);
          }
       }
       return;
    }
}

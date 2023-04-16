package com.kuaishou.live.common.multiinteract.biz.adapter.a$a;
import lh3.i0;
import com.kuaishou.live.common.multiinteract.biz.adapter.a;
import java.lang.Object;
import nh3.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.List;
import java.util.Iterator;
import nh3.c;
import com.kwai.framework.model.user.UserInfo;
import xp5.g;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.live.multiinteract.rtc.RtcLeaveReason;
import lh3.j;
import com.kuaishou.live.multiinteract.rtc.RtcCloseReason;
import kotlin.jvm.internal.a;
import lh3.i;
import java.lang.Enum;
import kotlin.NoWhenBranchMatchedException;
import lh3.c;
import lh3.h0;
import java.lang.Throwable;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatClosed;
import com.kuaishou.live.common.multiinteract.biz.adapter.b;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatSwitchBizExtraInfo;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatSwitchBiz;
import java.lang.Integer;
import com.kuaishou.android.live.log.c$b;
import com.kuaishou.android.live.log.c;
import msd.a;
import mh3.d;
import gh3.a$a;
import lh3.b;
import gh3.a;
import uz1.d;
import z1.a;
import oh3.a;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatRoomInfo;

public class a$a implements i0	// class@0017e3
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void o(a p0){
       boolean b;
       RtcCloseReason aNCHOR_INITI;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "3")) {
          return;
       }
       a$a ta = this.a;
       Objects.requireNonNull(ta);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (!PatchProxy.applyVoidOneRefs(p0, ta, uoa, "6")) {
          Iterator obj = PatchProxy.applyOneRefs(p0, ta, uoa, "7");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else {
             obj = p0.b().iterator();
             while (true) {
                if (obj.hasNext()) {
                   c uoc = obj.next();
                   String str = "true";
                   String str1 = "shouldDestroyRtcRoom";
                   if ((uoc.c().mId).equals(ta.d.d())) {
                      b.S(LiveLogTag.LIVE_MULTI_INTERACT.appendTag("LiveInteractBizAdapterProcessorImpl"), str1, "isAnchor", str);
                   }else {
                      if ((uoc.c().mId).equals(QCurrentUser.me().getId()) && p0.c() == RtcLeaveReason.ROOM_CLOSE_BY_HEARTBEAT_ERROR) {
                         b.S(LiveLogTag.LIVE_MULTI_INTERACT.appendTag("LiveInteractBizAdapterProcessorImpl"), str1, "isMySelfGuestLeave & heartbeat closed", str);
                      }
                   }
                   b = true;
                }else {
                   b = false;
                }
             }
          }
          if (b) {
             uoa = ta.c;
             RtcLeaveReason rtcLeaveReas = p0.c();
             RtcCloseReason rtcCloseReas = PatchProxy.applyOneRefs(rtcLeaveReas, null, j.class, "1");
             if (rtcCloseReas != patchProxyRe) {
             }else {
                a.p(rtcLeaveReas, "leaveReason");
                switch (i.a[rtcLeaveReas.ordinal()]){
                    case 1:
                      aNCHOR_INITI = RtcCloseReason.ANCHOR_INITIATIVE_LEAVE;
                      break;
                    case 2:
                      aNCHOR_INITI = RtcCloseReason.ANCHOR_SC_LEAVE_MSG;
                      break;
                    case 3:
                      aNCHOR_INITI = RtcCloseReason.ANCHOR_ARYA_STOP;
                      break;
                    case 4:
                      aNCHOR_INITI = RtcCloseReason.ANCHOR_HEART_BEAT_ERROR;
                      break;
                    case 5:
                      aNCHOR_INITI = RtcCloseReason.ANCHOR_READY_FAIL;
                      break;
                    case 6:
                      aNCHOR_INITI = RtcCloseReason.CLOSE_HEARTBEAT_API;
                      break;
                    default:
                      throw new NoWhenBranchMatchedException();
                }
                rtcCloseReas = aNCHOR_INITI;
             }
             uoa.p(rtcCloseReas);
          }
          Iterator iterator = p0.b().iterator();
          while (iterator.hasNext()) {
             if ((iterator.next().c().mId).equals(QCurrentUser.me().getId())) {
                ta.c.k();
             }else {
                continue ;
             }
          }
       }
       return;
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$a.class, "2")) {
          return;
       }
       a$a uoa = (p1 != RtcCloseReason.STREAM_TYPE_CHANGE)? 1: null;
       if (uoa) {
          uoa.b = true;
       }
       this.a.S(p0.endExtraInfoPb);
       return;
    }
    public void t(int p0){
       h0.j(this, p0);
    }
    public void u(SCInteractiveChatSwitchBiz p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       b.Q(LiveLogTag.LIVE_MULTI_INTERACT.appendTag("LiveInteractBizAdapterProcessorImpl"), "onReceivedSwitchBizInfo", c.k("currentBiz", Integer.valueOf(this.a.e), "currentBizId", this.a.f));
       this.a.S(p0.endExtraInfo);
       this.a.h.invoke();
       a$a ta = this.a;
       Objects.requireNonNull(ta);
       a uoa = a.class;
       if (!PatchProxy.applyVoidOneRefs(p0, ta, uoa, "3")) {
          ta.i.g(p0.startExtraInfo.bizType);
          SCInteractiveChatSwitchBiz startExtraIn = p0.startExtraInfo;
          ta.e = startExtraIn.bizType;
          ta.f = startExtraIn.bizId;
          a j = ta.j;
          a$a uoa1 = PatchProxy.apply(null, ta, uoa, "2");
          if (uoa1 != PatchProxyResult.class) {
          }else {
             uoa1 = new a$a();
             uoa1.a = ta.e;
             uoa1.b = ta.f;
             uoa1.c = ta.b.f();
             uoa1.d = ta.b.I1(QCurrentUser.me().getId());
          }
          j.e(uoa1);
          ta.Q(new d(p0));
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
       h0.g(this, p0);
    }
}

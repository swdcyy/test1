package com.kuaishou.live.common.multiinteract.biz.adapter.a;
import uz1.b;
import oh3.a;
import mh3.d;
import gh3.a;
import lh3.b;
import lh3.c;
import xp5.g;
import msd.a;
import ih3.b;
import com.kuaishou.live.common.multiinteract.biz.adapter.a$a;
import com.kuaishou.live.multiinteract.rtc.b;
import lh3.i0;
import com.kuaishou.live.common.multiinteract.biz.adapter.b;
import java.lang.String;
import lh3.g;
import uz1.e;
import uz1.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatSwitchBizExtraInfo;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Integer;
import com.kuaishou.android.live.log.c$b;
import com.kuaishou.android.live.log.c;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.multiinteract.biz.adapter.BizEndReason;
import uz1.c;
import z1.a;
import com.kuaishou.protobuf.livestage.nano.LiveStageProto$LayoutConfig;
import java.util.Objects;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.List;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import com.kuaishou.live.multiinteract.rtc.RtcCloseReason;

public class a extends a implements b	// class@0017e4
{
    public final b b;
    public final c c;
    public final g d;
    public int e;
    public String f;
    public final e g;
    public final a h;
    public final d i;
    public final a j;
    public final b k;
    public final i0 l;

    public void a(d p0,a p1,b p2,c p3,g p4,a p5,b p6){
       super();
       this.e = 0;
       this.f = "";
       a$a uoa = new a$a(this);
       this.l = uoa;
       this.i = p0;
       this.j = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       p2.m(uoa);
       this.h = p5;
       b uob = new b(p4.d());
       this.k = uob;
       p3.j(uob);
       e uoe = new e(this, p3);
       this.g = uoe;
       this.M(uoe);
    }
    public String F(){
       return this.f;
    }
    public void M(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "12")) {
          return;
       }
       this.O(p0);
       return;
    }
    public void S(InteractiveChatSwitchBizExtraInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       InteractiveChatSwitchBizExtraInfo interactiveC = null;
       if (p0 != null) {
          b.a0(LiveLogTag.LIVE_MULTI_INTERACT, "dispatchBizEnd", c.m("currentBiz", Integer.valueOf(this.e), "currentBizId", this.f, "endBiz", Integer.valueOf(p0.bizType), "endBizId", p0.bizId));
          if (p0.bizType == this.e && (p0.bizId).equals(this.f)) {
             interactiveC = p0.extraInfoPb;
          }
          this.T(interactiveC, BizEndReason.Other);
       }else {
          b.B(LiveLogTag.LIVE_MULTI_INTERACT, "close endExtra is null, end current biz");
          this.T(interactiveC, BizEndReason.Other);
       }
       return;
    }
    public final void T(String p0,BizEndReason p1){
       a uoa = a.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoa, "5")) {
          return;
       }
       a te = this.e;
       if (te == null) {
          return;
       }
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(te), p0, p1, this, a.class, "4")) {
          this.Q(new c(te, p0, p1));
       }
       this.e = 0;
       this.f = "";
       return;
    }
    public void U(LiveStageProto$LayoutConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "9")) {
          return;
       }
       a tg = this.g;
       Objects.requireNonNull(tg);
       if (!PatchProxy.applyVoidOneRefs(p0, tg, e.class, "2")) {
          b.a0(LiveLogTag.LIVE_MULTI_INTERACT, "receive sei biz", c.m("currentBizId", tg.b.F(), "currentBizType", Integer.valueOf(tg.b.n()), "seiBizId", p0.bizId, "seiBizType", Integer.valueOf(p0.bizType)));
          if (tg.b.F() != null && (tg.b.n() == p0.bizType && TextUtils.n(tg.b.F(), p0.bizId))) {
             tg.a = true;
          }
       }
       return;
    }
    public void V(int p0){
       int b;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "8")) {
          return;
       }
       uoa = this.g;
       Objects.requireNonNull(uoa);
       e uoe = e.class;
       if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), uoa, uoe, "1")) {
          LiveLogTag lIVE_MULTI_I = LiveLogTag.LIVE_MULTI_INTERACT;
          lIVE_MULTI_I.appendTag("LiveInteractSeiBizMatchController");
          b.Q(lIVE_MULTI_I, "onStreamTypeChange", c.l("streamType", Integer.valueOf(p0), "currentBiz", Integer.valueOf(uoa.b.n()), "isSeiBizIdMatched", Boolean.valueOf(uoa.a)));
          if (uoa.a == null) {
             Object obj = PatchProxy.apply(null, uoa, uoe, "3");
             b = (obj != PatchProxyResult.class)? obj.booleanValue(): a.t().u("SOURCE_LIVE").d("enable_sei_match_stream_type_detect", 1);
             if (b) {
                lIVE_MULTI_I.appendTag("LiveInteractSeiBizMatchController");
                b.r(lIVE_MULTI_I, "onStreamTypeChange didn\'t match");
             }
          }
          b = 4;
          if (p0 != b) {
             if (uoa.b.n() == 1 && p0 == 1) {
                lIVE_MULTI_I.appendTag("LiveInteractSeiBizMatchController");
                b.P(lIVE_MULTI_I, "meet multiChat compatible streamType");
             }else if(uoa.b.n() == b && p0 == 2){
                lIVE_MULTI_I.appendTag("LiveInteractSeiBizMatchController");
                b.P(lIVE_MULTI_I, "meet multiPk compatible streamType");
             }else {
                lIVE_MULTI_I.appendTag("LiveInteractSeiBizMatchController");
                b.P(lIVE_MULTI_I, "interactRoomDestroy by streamTypeChange");
                uoa.c.p(RtcCloseReason.STREAM_TYPE_CHANGE);
             }
          }
       }
       return;
    }
    public void i(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "13")) {
          return;
       }
       this.R(p0);
       return;
    }
    public int n(){
       return this.e;
    }
}

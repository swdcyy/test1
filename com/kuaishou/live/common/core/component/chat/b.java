package com.kuaishou.live.common.core.component.chat.b;
import rd1.o;
import xv4.h;
import lp3.a;
import java.util.HashSet;
import crd.a;
import java.lang.Object;
import java.util.ArrayList;
import rd1.p;
import rd1.t;
import rd1.s;
import rd1.q;
import rd1.r;
import com.kuaishou.live.common.core.component.chat.b$a;
import rd1.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import lp3.e;
import xp5.g;
import lp3.c;
import v51.a;
import hf3.a;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveChatCallV2;
import lf3.g;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveChatCall;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveChatReady;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveChatEnded;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveChatGuestGiftInfo;
import ekd.k1;
import java.lang.Integer;
import com.kuaishou.live.common.core.component.chat.LiveAudienceChatService;
import com.kuaishou.live.common.core.component.chat.LiveAudienceChatService$ChatState;
import java.util.Iterator;
import java.util.Set;
import rd1.i;
import rd1.g0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ee1.a;
import ex1.b;
import java.lang.CharSequence;
import android.text.TextUtils;
import tr.a;
import com.kuaishou.aryainstance.config.SnowConfig;
import com.kwai.framework.model.user.QCurrentUser;
import o56.a;
import w51.a;
import com.kuaishou.live.common.core.basic.arya.LiveSnowManager;
import tr.d;
import tr.c;
import cw4.b;
import brd.a0;
import va1.q0;
import ox0.s;
import com.kuaishou.live.common.core.component.chat.a;
import erd.g;
import crd.b;
import xv4.i;
import com.kuaishou.live.common.core.component.chat.model.ChatInfo;
import xd1.c;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.basic.heartbeat.b;
import com.kuaishou.live.common.core.component.chat.model.ChatInfo$RoleType;
import rd1.z;
import xd1.e;
import brd.t;
import io.reactivex.internal.functions.Functions;
import sfc.a;
import o91.c;
import com.kwai.framework.model.user.UserInfo;
import lu7.f;
import java.util.Map;
import ae1.a;
import com.kuaishou.live.basic.api.LiveApiParams$MediaType;
import java.lang.Enum;
import cjd.e;
import erd.o;
import rd1.u;
import com.kuaishou.live.common.core.component.chat.b$b;

public class b extends a implements o, h	// class@00103a
{
    public final Set d;
    public final a e;
    public final Object f;
    public int g;
    public g h;
    public a i;
    public ChatInfo j;
    public final List k;
    public int l;
    public final g m;
    public final g n;
    public final g o;
    public final g p;
    public final g q;
    public final i r;

    public void b(){
       super();
       this.d = new HashSet();
       this.e = new a();
       this.f = new Object();
       this.k = new ArrayList();
       this.l = 0;
       this.m = new p(this);
       this.n = new t(this);
       this.o = new s(this);
       this.p = new q(this);
       this.q = new r(this);
       this.r = new b$a(this);
    }
    public void H1(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "15")) {
          return;
       }
       this.k.remove(p0);
       return;
    }
    public void Qo(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.h = this.Po().a(g.class);
       a uoa = this.Po().a(a.class).u();
       this.i = uoa;
       uoa.u0(745, LiveStreamMessages$SCLiveChatCallV2.class, this.m);
       this.i.u0(320, LiveStreamMessages$SCLiveChatCall.class, this.n);
       this.i.u0(323, LiveStreamMessages$SCLiveChatReady.class, this.o);
       this.i.u0(325, LiveStreamMessages$SCLiveChatEnded.class, this.p);
       this.i.u0(812, LiveStreamMessages$SCLiveChatGuestGiftInfo.class, this.q);
       return;
    }
    public void Ro(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.i.o(745, this.m);
       this.i.o(320, this.n);
       this.i.o(323, this.o);
       this.i.o(325, this.p);
       this.i.o(812, this.q);
       this.e.dispose();
       k1.n(this);
       return;
    }
    public final void So(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "26")) {
          return;
       }
       this.Po().a(LiveAudienceChatService.class).Gj(LiveAudienceChatService$ChatState.END);
       Iterator iterator = this.d.iterator();
       while (iterator.hasNext()) {
          iterator.next().Yd(p0);
       }
       return;
    }
    public final boolean To(String p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       a obj = PatchProxy.applyOneRefs(p0, this, uob, "18");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.Po().a(a.class);
       String str = b.c();
       s os = 1;
       a uoa = null;
       b = (!obj.j() && !TextUtils.isEmpty(p0))? true: false;
       if (b) {
          String str1 = b.d();
          a uoa1 = a.e();
          SnowConfig snowConfig = PatchProxy.applyTwoRefs(str, str1, this, uob, "21");
          if (snowConfig != patchProxyRe) {
          }else {
             snowConfig = new SnowConfig();
             snowConfig.videoTargetHeight = 320;
             snowConfig.videoTargetWidth = 180;
             snowConfig.appName = "kuaishou_android";
             snowConfig.appUserId = QCurrentUser.me().getId();
             snowConfig.deviceId = a.a;
             snowConfig.appVersion = a.m;
             snowConfig.isAnchor = uoa;
             snowConfig.videoInitBitrateKbps = 225;
             snowConfig.videoMinBitrateKbps = 100;
             snowConfig.videoMaxBitrateKbps = 275;
             snowConfig.videoEnableCrop = os;
             snowConfig.videoEncConfig = str1;
             snowConfig.aryaConfig = str;
             if (a.o()) {
                snowConfig.dumpEnableFlag = 0xffffffff;
                snowConfig.dumpPath = LiveSnowManager.a;
             }
          }
          obj.Zf(c.b(uoa1, snowConfig), null);
          if (!PatchProxy.applyVoidOneRefs(obj, this, uob, "20")) {
             this.e.c(q0.a().R(new s(obj), a.b));
          }
          obj.E2(this);
          obj.p2(this.r);
          obj.Fc("BIZ_KEY_SINGLE_CHAT", p0, null);
          b.a(this.h.V0());
       }
       return b;
    }
    public final void Uo(ChatInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "25")) {
          return;
       }
       this.j = p0;
       this.Po().a(LiveAudienceChatService.class).E5(this.j);
       return;
    }
    public void Y5(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "10")) {
          return;
       }
       this.d.remove(p0);
       return;
    }
    public void c8(int p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob, "19")) {
          return;
       }
       b.d0(LiveLogTag.CHAT, "onRTCStateChange", "mRTCState", Integer.valueOf(this.l), "idleReason", Integer.valueOf(p1));
       this.l = p0;
       if (!p0) {
          this.close(13);
       }
       return;
    }
    public void close(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "16")) {
          return;
       }
       b.d0(LiveLogTag.CHAT, "close", "endReason", Integer.valueOf(p0), "mChatInfo", this.j);
       this.Po().a(b.class).nd();
       uob = this.j;
       if (uob != null) {
          int i = 11;
          if (uob.b == ChatInfo$RoleType.GUEST) {
             if (p0 == i) {
                p0 = 7;
             }
             this.So(p0);
             if (p0 != 9 && (p0 == 12 || p0 == 15)) {
                e.a().o(this.h.getLiveStreamId(), this.j.e).subscribe(Functions.d(), new a());
             }
             a uoa = this.Po().a(a.class);
             uob = this.f;
             _monitor_enter(uob);
             uoa.Y2(this.r);
             uoa.L4(this);
             uoa.ab("BIZ_KEY_SINGLE_CHAT", true);
             _monitor_exit(uob);
             this.Po().a(c.class).l2();
             this.g = 0;
             this.l = 0;
             this.Uo(null);
          }else if(p0 == i){
             this.So(p0);
             this.Uo(null);
          }
       }
       return;
    }
    public void i5(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "9")) {
          return;
       }
       this.d.add(p0);
       return;
    }
    public void jd(int p0,boolean p1,String p2){
       t ot;
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Boolean.valueOf(p1), p2, this, b.class, "12")) {
          return;
       }
       b tj = this.j;
       if (tj != null && tj.b == ChatInfo$RoleType.AUDIENCE) {
          this.close(11);
       }
       if (this.j == null) {
          this.Uo(new ChatInfo(ChatInfo$RoleType.GUEST));
          this.j.n(f.p(QCurrentUser.me()), 4);
       }
       this.j.d().f = p0;
       b.e0(LiveLogTag.CHAT, "acceptInvitation", "mChatInfo", this.j, "isInvited", Boolean.valueOf(p1), "liveChatId", p2);
       if (p1) {
          z oz = e.a();
          p2 = this.h.getLiveStreamId();
          LiveApiParams$MediaType vIDEO = (p0 == 2)? LiveApiParams$MediaType.VIDEO: LiveApiParams$MediaType.AUDIO;
          ot = oz.t(p2, vIDEO.name());
       }else {
          ot = e.a().k(this.h.getLiveStreamId(), p2);
       }
       this.Po().a(b.class).re();
       this.e.c(ot.map(new e()).subscribe(new u(this), new b$b(this)));
       return;
    }
    public ChatInfo p(){
       return this.j;
    }
    public void p9(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "11")) {
          return;
       }
       if (p0 == 3) {
          this.e.c(e.a().r(this.h.getLiveStreamId()).subscribe(Functions.d(), new a()));
       }
       this.close(p0);
       return;
    }
    public void r1(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "14")) {
          return;
       }
       this.k.add(p0);
       return;
    }
}

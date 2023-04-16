package com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$b;
import nsd.u;
import androidx.lifecycle.LifecycleOwner;
import android.app.Activity;
import z1.k;
import uw1.m;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketService;
import vq5.d;
import o63.a;
import b12.a;
import java.lang.String;
import mq5.b;
import wu1.g;
import xp5.i;
import kq5.b;
import msd.a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import java.util.HashSet;
import com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager;
import bi2.e;
import bi2.d;
import com.kuaishou.live.core.show.redpacket.richcard.handler.KrnDialogHandler;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$j;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$c;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$k;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$i;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$richCardDetailKrnInfoListener$1;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$h;
import ei2.a;
import zh2.b;
import ei2.b;
import com.kuaishou.live.core.show.redpacket.richcard.handler.RichCardEffectHandler;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$a;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$2;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$3;
import uw1.f;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Map;
import com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$LiveTreasureBoxShow;
import erd.g;
import java.lang.Integer;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.follow.cache.c;
import lnc.i3;
import java.lang.Number;
import y41.i$a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import y41.i;
import yh2.d;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$l;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$m;
import java.lang.Long;
import java.lang.Runnable;
import ekd.k1;
import crd.b;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$tryStartAutoGrab$$inlined$let$lambda$1;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$tryStartAutoGrab$1$2;
import msd.l;
import ah1.c;
import com.kuaishou.live.core.show.redpacket.richcard.core.model.PendantData$a;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import bi2.g;
import com.kuaishou.live.core.show.redpacket.richcard.core.model.PendantData;
import com.kuaishou.live.core.show.redpacket.richcard.http.PendantConfig;
import wu1.a$a;
import com.kwai.feature.api.live.merchant.top.LiveTopPendantTempPlayService$LiveTempPlayPendantBizPriority;
import java.lang.Enum;
import com.kwai.feature.api.live.merchant.top.LiveTopPendantTempPlayService$LiveTempPlayRightPendantLayoutOrder;
import wu1.a;
import bi2.f;
import java.lang.Throwable;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$d;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$e;
import yh2.c;
import erd.a;
import uw1.c;
import com.kuaishou.live.core.show.activityredpacket.condition.LiveActivityRedPacketReserveQualificationManager;
import com.kuaishou.live.core.show.redpacket.richcard.http.RichCardInfo;
import com.kuaishou.live.core.show.redpacket.richcard.http.UsingCardInfo;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$exitAndShowDialog$1;
import com.kuaishou.krn.event.a;
import oj0.a;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$observeModel$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.core.show.redpacket.richcard.vc.LiveRichCardPendantVC$observePendantInfo$1;
import ai2.b;
import com.kuaishou.live.core.show.redpacket.richcard.http.RecoRoomInfo;
import ai2.f;
import io.reactivex.g;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$f;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$g;
import com.kuaishou.live.core.show.redpacket.richcard.blackarticle.LiveRichCardUsedVM$a$b;
import com.kuaishou.live.core.show.redpacket.richcard.blackarticle.LiveRichCardUsedVM$a;
import com.kuaishou.live.core.show.redpacket.richcard.blackarticle.LiveRichCardUsedVM;
import com.kuaishou.live.core.show.redpacket.container.LiveRedPacketContainerDialogFragment;
import uw1.d;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$startAutoJumpTimer$1;
import com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$startAutoJumpTimer$2;

public final class LiveRichCardCoreManager	// class@000f5a
{
    public b A;
    public b B;
    public b C;
    public Integer D;
    public final LiveRichCardCoreManager$j E;
    public final Runnable F;
    public final Runnable G;
    public final d H;
    public final a I;
    public final c$b J;
    public final LifecycleOwner K;
    public final Activity L;
    public final k M;
    public final m N;
    public final LiveActivityRedPacketService O;
    public final d P;
    public final a Q;
    public final a R;
    public final String S;
    public final String T;
    public final String U;
    public final k V;
    public final k W;
    public final b X;
    public final g Y;
    public final i Z;
    public final String a;
    public final a a0;
    public final long b;
    public final b b0;
    public final long c;
    public final a c0;
    public final long d;
    public final long e;
    public final long f;
    public f g;
    public final HashSet h;
    public a i;
    public b j;
    public RichCardEffectHandler k;
    public final HashSet l;
    public b m;
    public b n;
    public final e o;
    public final d p;
    public final KrnDialogHandler q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public LiveTreasureBoxMessage$LiveTreasureBoxShow w;
    public String x;
    public b y;
    public b z;
    public static final LiveRichCardCoreManager$b d0;

    static {
       LiveRichCardCoreManager.d0 = new LiveRichCardCoreManager$b(null);
    }
    public void LiveRichCardCoreManager(LifecycleOwner p0,Activity p1,k p2,m p3,LiveActivityRedPacketService p4,d p5,a p6,a p7,String p8,String p9,String p10,k p11,k p12,b p13,g p14,i p15,a p16,b p17,a p18){
       RichCardEffectHandler obj = p0;
       Object obj1 = p2;
       Object obj2 = p3;
       g obj3 = p4;
       e obj4 = p5;
       Object obj5 = p6;
       LiveRichCardCoreManager$j obj6 = p7;
       Object obj7 = p8;
       Object obj8 = p9;
       Object obj9 = p10;
       Object obj10 = p11;
       Object obj11 = p12;
       Object obj12 = p15;
       Object obj13 = p16;
       a.p(obj, "lifecycleOwner");
       a.p(obj1, "redPacketDiaLogFragment");
       a.p(obj2, "redPacketContainerService");
       a.p(obj3, "activityRedPacketService");
       a.p(obj4, "routerManager");
       a.p(obj5, "liveJsBridgeService");
       a.p(obj6, "liveLimitService");
       a.p(obj7, "visitorId");
       a.p(obj8, "anchorId");
       a.p(obj9, "liveStream");
       a.p(obj10, "refer");
       a.p(obj11, "curServerTime");
       a.p(obj12, "logPackageProvider");
       a.p(obj13, "jsBridgeService");
       a.p(p17, "fragmentLifeCycleService");
       Object obj14 = p18;
       a.p(obj14, "isCurrentFragmentOnScreen");
       super();
       LifecycleOwner lifecycleOwn = this;
       lifecycleOwn.K = obj;
       lifecycleOwn.L = p1;
       lifecycleOwn.M = obj1;
       lifecycleOwn.N = obj2;
       lifecycleOwn.O = obj3;
       lifecycleOwn.P = obj4;
       lifecycleOwn.Q = obj5;
       lifecycleOwn.R = obj6;
       lifecycleOwn.S = obj7;
       lifecycleOwn.T = obj8;
       lifecycleOwn.U = obj9;
       lifecycleOwn.V = obj10;
       lifecycleOwn.W = obj11;
       lifecycleOwn.X = p13;
       obj3 = p14;
       lifecycleOwn.Y = obj3;
       lifecycleOwn.Z = obj12;
       lifecycleOwn.a0 = obj13;
       lifecycleOwn.b0 = p17;
       lifecycleOwn.c0 = obj14;
       lifecycleOwn.a = "LiveRichCardCoreManager"+"[liveStreamId = "+obj9+']';
       lifecycleOwn.b = 1000;
       lifecycleOwn.c = 3000;
       lifecycleOwn.d = 100;
       lifecycleOwn.e = 1000;
       lifecycleOwn.f = 3;
       lifecycleOwn.h = new HashSet();
       lifecycleOwn.l = new HashSet();
       obj4 = LiveRichCardStateManager.h.e();
       lifecycleOwn.o = obj4;
       lifecycleOwn.p = new d(obj4);
       lifecycleOwn.q = new KrnDialogHandler(obj13, obj4);
       obj6 = new LiveRichCardCoreManager$j(lifecycleOwn);
       lifecycleOwn.E = obj6;
       lifecycleOwn.F = new LiveRichCardCoreManager$c(lifecycleOwn);
       lifecycleOwn.G = new LiveRichCardCoreManager$k(lifecycleOwn);
       lifecycleOwn.H = new LiveRichCardCoreManager$i(lifecycleOwn);
       lifecycleOwn.I = new LiveRichCardCoreManager$richCardDetailKrnInfoListener$1(lifecycleOwn);
       lifecycleOwn.J = new LiveRichCardCoreManager$h(lifecycleOwn);
       lifecycleOwn.i = new a(obj1, obj2, obj6, obj4);
       lifecycleOwn.j = new b(p0, obj3, obj9);
       obj = new RichCardEffectHandler(p1, obj2, p6, new LiveRichCardCoreManager$a(lifecycleOwn), p8, p10, new LiveRichCardCoreManager$2(lifecycleOwn), new LiveRichCardCoreManager$3(lifecycleOwn));
       lifecycleOwn.k = obj10;
    }
    public static final a a(LiveRichCardCoreManager p0){
       p0 = p0.i;
       if (p0 == null) {
          a.S("richCardDetailManager");
       }
       return p0;
    }
    public static f e(LiveRichCardCoreManager p0,String p1,boolean p2,int p3,Object p4){
       List obj;
       Object obj1;
       if (p3 & 0x02) {
          p2 = true;
       }
       Objects.requireNonNull(p0);
       LiveRichCardCoreManager liveRichCard = LiveRichCardCoreManager.class;
       if (PatchProxy.isSupport(liveRichCard)) {
          obj = PatchProxy.applyTwoRefs(p1, Boolean.valueOf(p2), p0, liveRichCard, "10");
          if (obj != PatchProxyResult.class) {
          }
       }
       a.p(p1, "redPacketId");
       obj = p0.N.m();
       a.o(obj, "redPacketContainerServic…howingRedPacketHolderList");
       Iterator iterator = obj.iterator();
       while (true) {
          if (iterator.hasNext()) {
             obj1 = iterator.next();
             Object obj2 = obj1;
             a.o(obj2, "it");
             obj2 = (TextUtils.n(obj2.a(), p1) && p0.p(obj2.i()))? 1: null;
             if (!obj2) {
                continue ;
             }
          }else {
             obj1 = 0;
          }
          obj = obj1;
          break ;
       }
       return obj;
    }
    public static String g(LiveRichCardCoreManager p0,Map p1,int p2,Object p3){
       Objects.requireNonNull(p0);
       String str = null;
       p1 = PatchProxy.applyOneRefs(str, p0, LiveRichCardCoreManager.class, "21");
       if (p1 != PatchProxyResult.class) {
       }else {
          String str1 = "activity_biz";
          p3 = p0.g;
          if (p3 != null) {
             p3 = p3.i();
             if (p3 != null) {
                p3 = p3.get(str1);
                if (p3 != null) {
                label_002a :
                   if (p3 != null) {
                      str = p3;
                   }else {
                      p0 = p0.w;
                      if (p0 != null) {
                         LiveTreasureBoxMessage$LiveTreasureBoxShow extraMessage = p0.extraMessage;
                         if (extraMessage != null) {
                            str = extraMessage.get(str1);
                         }
                      }
                   }
                   str1 = str;
                }
             }
          }
          p3 = p0.x;
          goto label_002a ;
       }
       return p1;
    }
    public static void s(LiveRichCardCoreManager p0,String p1,int p2,Object p3){
       p0.r(null);
    }
    public final void A(g p0,g p1,int p2){
       if (PatchProxy.isSupport(LiveRichCardCoreManager.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, LiveRichCardCoreManager.class, "23")) {
          return;
       }
       LiveRichCardStateManager h = LiveRichCardStateManager.h;
       b.P(h.f().appendTag(this.a), "[followUser] 自动关注");
       String obj = null;
       if (c.b().c(this.T)) {
          b.P(h.f().appendTag(this.a), "[followUser] 已经关注了");
          p0.accept(obj);
          return;
       }else {
          i3 oi3 = i3.f();
          LiveRichCardCoreManager tg = this.g;
          String str = (tg != null)? tg.a(): obj;
          oi3.d("id", str);
          tg = this.g;
          Integer integer = (tg != null)? Integer.valueOf(tg.g()): obj;
          oi3.c("type", integer);
          oi3.d("followMode", "autoOpen");
          i3 oi31 = i3.f();
          oi31.d("activity_name", LiveRichCardCoreManager.g(this, obj, 1, obj));
          i3 oi32 = i3.f();
          oi32.d("activity_name", LiveRichCardCoreManager.g(this, obj, 1, obj));
          obj = oi32.e();
          i3 oi33 = i3.f();
          oi33.d("userFollowExtraParams", oi31.e());
          oi33.d("liveActivityExtraInfo", obj);
          oi33.d("liveRedpacketParams", oi3.e());
          String str1 = oi33.e();
          i$a uoa = new i$a(this.L, this.U).p(this.T);
          uoa.m(this.V.get());
          uoa.n(p2);
          uoa.b(str1);
          uoa.j(p0);
          uoa.i(p1).a().c();
          return;
       }
    }
    public final void B(){
       if (PatchProxy.applyVoid(null, this, LiveRichCardCoreManager.class, "19")) {
          return;
       }
       if (this.k.b()) {
          b.P(LiveRichCardStateManager.h.f().appendTag(this.a), "[tryShowRedPacket]正在展示特效，不弹红包了");
          return;
       }else {
          LiveRichCardCoreManager tg = this.g;
          if (tg != null) {
             String str = tg.a();
             if (str != null) {
                if (this.h.contains(str)) {
                   d.a("红包已经自动弹出过了");
                   return;
                }else {
                   this.h.add(str);
                   b.S(LiveRichCardStateManager.h.f().appendTag(this.a), "[tryShowRedPacket]", "自动弹红包锚定id", str);
                   d.a("开始自动弹红包，不是自动抢的弹出");
                   this.x(false);
                   if (this.o.g()) {
                      d.a("开始自动关注");
                      this.A(new LiveRichCardCoreManager$l(this), new LiveRichCardCoreManager$m(this), 139);
                   }
                }
             }
          }
          return;
       }
    }
    public final void C(){
       boolean b;
       long l1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveRichCardCoreManager.class, "20")) {
          return;
       }
       LiveRichCardStateManager h = LiveRichCardStateManager.h;
       c uoc = h.f();
       uoc.appendTag(this.a);
       c uoc1 = uoc;
       LiveRichCardCoreManager tg = this.g;
       String str = (tg != null)? tg.a(): objArray;
       tg = this.g;
       Long longx = (tg != null)? Long.valueOf(tg.getOpenTime()): objArray;
       b.V(uoc1, "[tryStartAutoGrabCountDown]", "holder_Id", str, "holder.openTime", longx, "curServerTime", this.W.get(), "isInAutoGrabing", Boolean.valueOf(this.v));
       if (this.v != null) {
          return;
       }else {
          tg = this.g;
          b = true;
          if (tg != null) {
             a.m(tg);
             if (this.l.contains(tg.a())) {
                d.a("开始倒计时失败，没有可用的红包");
                b.P(h.f().appendTag(this.a), "[tryStartAutoGrabCountDown]开始倒计时失败，没有可用的红包， 跳转直播间");
                this.v = b;
                this.y(this.i());
                return;
             }
          }
          tg = this.g;
          String str1 = "curServerTime.get\(\)";
          if (tg != null) {
             a.m(tg);
             StringBuilder obj = this.W.get();
             a.o(obj, str1);
             if (tg.getOpenTime() - obj.longValue() < 0) {
                tg = this.g;
                a.m(tg);
                long l = tg.b();
                obj = this.W.get();
                a.o(obj, str1);
                if (l - obj.longValue() > 0) {
                   this.c();
                   obj = "红包可抢且没有到过期时间，";
                   LiveRichCardCoreManager tg1 = this.g;
                   if (tg1 != null) {
                      objArray = tg1.a();
                   }
                   d.a(obj+objArray);
                   b.P(h.f().appendTag(this.a), "[tryStartAutoGrabCountDown]红包可抢且没有到过期时间， 自动弹出抢红包，并且更新挂件状态");
                   this.v = b;
                   k1.m(this.F);
                   k1.r(this.F, this.d);
                   return;
                }
             }
          }
          LiveRichCardCoreManager tg2 = this.g;
          if (tg2 != null) {
             a.m(tg2);
             Object obj1 = this.W.get();
             a.o(obj1, str1);
             if (tg2.b() - obj1.longValue() <= 0) {
                this.v = b;
                this.y(this.i());
                return;
             }
          }
          this.c();
          this.B();
          tg2 = this.g;
          if (tg2 != null) {
             this.v = b;
             LiveRichCardCoreManager tm = this.m;
             if (tm != null) {
                tm.dispose();
             }
             this.r = false;
             this.D(false);
             Map map = tg2.i();
             if (map != null) {
                String str2 = map.get("autoPopUpRedPackBeforeGrabTime");
                if (str2 != null) {
                   l1 = Long.parseLong(str2);
                label_0153 :
                   Object obj2 = this.W.get();
                   a.o(obj2, str1);
                   this.m = this.b((tg2.getOpenTime() - obj2.longValue()), new LiveRichCardCoreManager$tryStartAutoGrab$$inlined$let$lambda$1((l1 * this.b), this), LiveRichCardCoreManager$tryStartAutoGrab$1$2.INSTANCE);
                }
             }
             l1 = 3;
             goto label_0153 ;
          }
          return;
       }
    }
    public final void D(int p0){
       PendantData$a uoa1;
       PatchProxyResult patchProxyRe1;
       g og;
       g og1;
       int i1;
       PendantData$a uoa2;
       PendantData$a uoa3;
       PatchProxyResult patchProxyRe2;
       long l1;
       String obj2;
       PendantData$a uoa4;
       String willTransiti;
       PendantData pendantData;
       a$a uoa5;
       String activityId;
       a uoa6;
       Object obj = this;
       int i = p0;
       LiveRichCardCoreManager liveRichCard = LiveRichCardCoreManager.class;
       if (PatchProxy.isSupport(liveRichCard) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), obj, liveRichCard, "18")) {
          return;
       }
       d.a("设置挂件状态 "+i);
       liveRichCard = obj.g;
       String obj1 = null;
       if (liveRichCard == null) {
          b.P(LiveRichCardStateManager.h.f().appendTag(obj.a), "[updatePendantStatus] holder = null");
          obj.p.e("[updatePendantStatus], holder为空", obj1);
          obj.j.a();
          return;
       }else if(liveRichCard != null){
          try{
             LiveRichCardCoreManager p = obj.p;
             long openTime = liveRichCard.getOpenTime();
             long l = obj.W.get().longValue() + this.i();
             String str = liveRichCard.a();
             Objects.requireNonNull(p);
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             PendantData$a uoa = PendantData$a.class;
             if (PatchProxy.isSupport(d.class)) {
                uoa1 = uoa;
                patchProxyRe1 = patchProxyRe;
                if (!PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Long.valueOf(openTime), Long.valueOf(l), str, p, d.class, "1")) {
                }
             }else {
                uoa1 = uoa;
                patchProxyRe1 = patchProxyRe;
             }
          }catch(java.lang.Exception e0){
             b.y(LiveRichCardStateManager.h.f().appendTag("LivePendantModel"), "update error", e0);
          }
       }
    }
    public final b b(long p0,l p1,a p2){
       t obj;
       c uoc;
       if (PatchProxy.isSupport(LiveRichCardCoreManager.class)) {
          obj = PatchProxy.applyThreeRefs(Long.valueOf(p0), p1, p2, this, LiveRichCardCoreManager.class, "27");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       long l = 0;
       if (p0 - l < 0) {
          p0 = l;
       }
       obj = t.interval(l, 100, TimeUnit.MILLISECONDS).take(((p0 / (long)100) + 1)).observeOn(d.a);
       LiveRichCardCoreManager$d uod = new LiveRichCardCoreManager$d(p1, p0);
       LiveRichCardCoreManager$e b = LiveRichCardCoreManager$e.b;
       if (p2 != null) {
          uoc = new c(p2);
       }
       b uob = obj.subscribe(uod, b, uoc);
       a.o(uob, "Observable.interval\(0, 1…\n        onFinish\n      \)");
       return uob;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, LiveRichCardCoreManager.class, "22")) {
          return;
       }
       LiveRichCardCoreManager tg = this.g;
       if (tg instanceof c) {
          Objects.requireNonNull(tg, "null cannot be cast to non-null type com.kuaishou.live.common.core.component.redpacket.container.ILiveActivityRedPacketHolder");
          boolean b = tg.d();
          String str = tg.h();
          if (str != null) {
             a.o(str, "activityHolder.redPacketReservationId ?: return");
             if (b) {
                LiveActivityRedPacketReserveQualificationManager.d.d(str, "33", Long.valueOf(0));
             }
          }
       }
       return;
    }
    public final void d(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveRichCardCoreManager.class, "32")) {
          return;
       }
       this.N.D0();
       this.j.a();
       LiveRichCardCoreManager tA = this.A;
       if (tA != null) {
          tA.dispose();
       }
       LiveRichCardStateManager h = LiveRichCardStateManager.h;
       String str = LiveRichCardCoreManager.g(this, objArray, 1, objArray);
       if (str == null) {
          str = "";
       }
       String str1 = str;
       LiveRichCardCoreManager tS = this.S;
       LiveRichCardCoreManager tU = this.U;
       g og = this.o.a();
       if (og != null) {
          RichCardInfo richCardInfo = og.b();
          if (richCardInfo != null) {
             UsingCardInfo usingCardInf = richCardInfo.getUsingCardInfo();
             if (usingCardInf != null) {
                objArray = Long.valueOf(usingCardInf.getCardId());
             }
          }
       }
       this.A = h.c(str1, tS, tU, objArray, Integer.valueOf(2), new LiveRichCardCoreManager$exitAndShowDialog$1(this));
       return;
    }
    public final void f(String p0){
       f uof;
       String str2;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRichCardCoreManager.class, "24")) {
          return;
       }
       if (this.g != null && !this.q()) {
          LiveRichCardCoreManager tg = this.g;
          a.m(tg);
          if (!tg.c()) {
             c uoc = LiveRichCardStateManager.h.f();
             uoc.appendTag(this.a);
             c uoc1 = uoc;
             LiveRichCardCoreManager tg1 = this.g;
             a.m(tg1);
             b.T(uoc1, "[generateHolder], 不需要重新获取holder", "isRedPacketShowDeadlineExpire", Boolean.valueOf(this.q()), "hasGrabRedPacket", Boolean.valueOf(tg1.c()));
             return;
          }
       }
       List list = this.N.m();
       a.o(list, "list");
       Iterator iterator = list.iterator();
       while (true) {
          if (iterator.hasNext()) {
             uof = iterator.next();
             a.o(uof, "it");
             if (this.p(uof.i())) {
                long l = uof.b() - this.e;
                Object obj = this.W.get();
                String str = "curServerTime.get\(\)";
                a.o(obj, str);
                if (l - obj.longValue() > 0) {
                   obj = this.W.get();
                   a.o(obj, str);
                   String str1 = "activity_biz";
                   str2 = null;
                   if (uof.getOpenTime() - obj.longValue() > 0) {
                      this.g = uof;
                      Map map = uof.i();
                      if (map != null) {
                         str2 = map.get(str1);
                         break ;
                      }
                      break ;
                   }else {
                      this.g = uof;
                      Map map1 = uof.i();
                      if (map1 != null) {
                         str2 = map1.get(str1);
                      }
                      this.x = str2;
                      c uoc3 = LiveRichCardStateManager.h.f();
                      uoc3.appendTag(this.a);
                      b.T(uoc3, "[generateHolder], 获取到了可用的holder", "holder id", uof.a(), "source", p0);
                   }
                }
             }
          }else {
             b.S(LiveRichCardStateManager.h.f().appendTag(this.a), "[generateHolder], 没有可用的holder", "source", p0);
             return;
          }
       }
       this.x = str2;
       c uoc2 = LiveRichCardStateManager.h.f();
       uoc2.appendTag(this.a);
       b.T(uoc2, "[generateHolder], 获取到了可用的holder", "holder id", uof.a(), "source", p0);
       return;
    }
    public final f h(){
       return this.g;
    }
    public final long i(){
       long l;
       LiveRichCardCoreManager obj = PatchProxy.apply(null, this, LiveRichCardCoreManager.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.g;
       if (obj != null) {
          Map map = obj.i();
          if (map != null) {
             String str = map.get("autoJumpRoomCountdownTime");
             if (str != null) {
                l = Long.parseLong(str);
             label_002f :
                return (l * this.b);
             }
          }
       }
       l = this.f;
       goto label_002f ;
    }
    public final String j(){
       return this.U;
    }
    public final i k(){
       return this.Z;
    }
    public final m l(){
       return this.N;
    }
    public final String m(){
       return this.a;
    }
    public final void n(){
       LiveRichCardCoreManager liveRichCard = LiveRichCardCoreManager.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveRichCard, "7")) {
          return;
       }
       if (this.s != null) {
          return;
       }
       LiveRichCardCoreManager tD = this.D;
       g og = this.o.a();
       Integer integer = (og != null)? Integer.valueOf(og.d()): objArray;
       int i = 1;
       boolean b = false;
       if (a.g(tD, integer) ^ i) {
          this.u = b;
       }
       this.t = b;
       this.s = i;
       a.b().a("event_live_get_rich_dialog", this.I);
       if (!PatchProxy.applyVoid(objArray, this, liveRichCard, "15")) {
          this.o.b(this.K, new LiveRichCardCoreManager$observeModel$1(this));
          liveRichCard = this.j;
          LiveRichCardCoreManager tp = this.p;
          Objects.requireNonNull(liveRichCard);
          if (!PatchProxy.applyVoidOneRefs(tp, liveRichCard, b.class, "1")) {
             a.p(tp, "pendantInfoModel");
             tp.b(liveRichCard.c, new LiveRichCardPendantVC$observePendantInfo$1(liveRichCard));
          }
       }
       return;
    }
    public final a o(){
       return this.c0;
    }
    public final boolean p(Map p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveRichCardCoreManager.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0 != null) {
          String str = p0.get("autoGrabOpenFlag");
          if (str != null && Boolean.parseBoolean(str) == b) {
          label_0028 :
             return b;
          }
       }
       b = false;
       goto label_0028 ;
    }
    public final boolean q(){
       boolean b;
       LiveRichCardCoreManager obj = PatchProxy.apply(null, this, LiveRichCardCoreManager.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.g;
       if (obj != null) {
          a.m(obj);
          Object obj1 = this.W.get();
          a.o(obj1, "curServerTime.get\(\)");
          if ((obj.b() - this.e) - obj1.longValue() <= 0) {
             b = true;
          label_003a :
             return b;
          }
       }
       b = false;
       goto label_003a ;
    }
    public final void r(String p0){
       LiveRichCardCoreManager b;
       long l1;
       b obj1;
       RecoRoomInfo obj2;
       t ot;
       Object obj = this;
       String str = p0;
       if (PatchProxy.applyVoidOneRefs(str, obj, LiveRichCardCoreManager.class, "28")) {
          return;
       }
       String str1 = LiveRichCardCoreManager.g(obj, null, 1, null);
       LiveRichCardStateManager h = LiveRichCardStateManager.h;
       b.P(h.f().appendTag(obj.a), "[jumpToRecoRoom] 开始跳转直播间");
       d.a("开始跳转直播间");
       b = obj.B;
       if (b != null) {
          b.dispose();
       }
       b = obj.g;
       long l = 0;
       if (b != null) {
          Map map = b.i();
          if (map != null) {
             String str2 = map.get("autoJumpNextRoomDeadlineTime");
             if (str2 != null) {
                l1 = Long.parseLong(str2);
             label_004f :
                b = obj.g;
                if (b != null) {
                   map = b.i();
                   if (map != null) {
                      str2 = map.get("autoJumpNextRoomBeforeGrabTime");
                      if (str2 != null) {
                         l = Long.parseLong(str2);
                      }
                   }
                }
                long l2 = l * obj.b;
                if (str == null) {
                   str = (str1 != null)? str1: "";
                }
             label_0074 :
                LiveRichCardCoreManager u = obj.U;
                Objects.requireNonNull(h);
                PatchProxyResult patchProxyRe = PatchProxyResult.class;
                if (PatchProxy.isSupport(LiveRichCardStateManager.class)) {
                   obj1 = PatchProxy.applyFourRefs(Long.valueOf(l1), Long.valueOf(l2), str, u, h, LiveRichCardStateManager.class, "6");
                   if (obj1 != patchProxyRe) {
                   }else {
                   label_009b :
                      str2 = "activityBiz";
                      a.p(str, str2);
                      String str3 = "liveStreamId";
                      a.p(u, str3);
                      b e = LiveRichCardStateManager.e;
                      Objects.requireNonNull(e);
                      if (PatchProxy.isSupport(b.class)) {
                         obj2 = PatchProxy.applyFourRefs(Long.valueOf(l1), Long.valueOf(l2), str, u, e, b.class, "1");
                         if (obj2 != patchProxyRe) {
                            obj1 = obj2;
                         }
                      }
                      a.p(str, str2);
                      a.p(u, str3);
                      obj1 = e.a;
                      if (obj1 == null) {
                         ot = e.c(l1, l2, str, u);
                      }else {
                         LiveRichCardCoreManager liveRichCard = u;
                         a.m(obj1);
                         obj2 = e.a(obj1, l2, liveRichCard);
                         if (obj2 != null) {
                            ot = t.create(new f(obj2, obj1));
                            a.o(ot, "Observable.create {\n    ….remove\(roomInfo\)\n      }");
                         }else {
                            ot = e.c(l1, l2, str, liveRichCard);
                         }
                      }
                      obj1 = ot;
                   }
                }else {
                   goto label_009b ;
                }
                obj.B = obj1.subscribe(new LiveRichCardCoreManager$f(obj), new LiveRichCardCoreManager$g(obj, str1));
                return;
             }
          }
       }
       l1 = l;
       goto label_004f ;
    }
    public final void t(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveRichCardCoreManager.class, "1")) {
          return;
       }
       LiveRichCardCoreManager ti = this.i;
       if (ti == null) {
          a.S("richCardDetailManager");
       }
       Objects.requireNonNull(ti);
       if (!PatchProxy.applyVoid(objArray, ti, a.class, "7")) {
          a b = ti.b;
          if (b != null) {
             b.y0(LiveRichCardUsedVM$a$b.a);
          }
       }
       if (LiveRichCardStateManager.h.d()) {
          LiveRedPacketContainerDialogFragment liveRedPacke = this.M.get();
          if (liveRedPacke != null) {
             liveRedPacke.Dh();
          }
          ti = this.g;
          if (ti != null) {
             a.m(ti);
             this.N.i(ti.a(), false);
          }
          liveRedPacke = this.M.get();
          if (liveRedPacke != null) {
             liveRedPacke.S = true;
          }
       }
       return;
    }
    public final void u(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveRichCardCoreManager.class, "8")) {
          return;
       }
       b.S(LiveRichCardStateManager.h.f().appendTag(this.a), "[onLiveFragmentPaused] 暂停", "hasRelease", Boolean.valueOf(this.t));
       if (this.t != null) {
          return;
       }
       this.t = true;
       this.s = false;
       g og = this.o.a();
       if (og != null) {
          objArray = Integer.valueOf(og.d());
       }
       this.D = objArray;
       if (this.o.g()) {
          og = this.o.a();
          if (og != null) {
             RichCardInfo richCardInfo = og.b();
             if (richCardInfo != null) {
                UsingCardInfo usingCardInf = richCardInfo.getUsingCardInfo();
                if (usingCardInf != null && !usingCardInf.getCardCanUseRemainCount()) {
                   this.o.e("release");
                }
             }
          }
       }
       a.b().c("event_live_get_rich_dialog", this.I);
       this.v();
       this.o.c(this.K);
       LiveRichCardCoreManager tj = this.j;
       LiveRichCardCoreManager tp = this.p;
       Objects.requireNonNull(tj);
       if (!PatchProxy.applyVoidOneRefs(tp, tj, b.class, "2")) {
          a.p(tp, "pendantInfoModel");
          tp.c(tj.c);
       }
       k1.m(this.F);
       k1.m(this.G);
       if (this.o.g()) {
          this.N.D0();
       }
       return;
    }
    public final void v(){
       LiveRichCardCoreManager liveRichCard = LiveRichCardCoreManager.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveRichCard, "16")) {
          return;
       }
       this.D(-1);
       this.g = objArray;
       this.v = false;
       LiveRichCardCoreManager tm = this.m;
       if (tm != null) {
          tm.dispose();
       }
       if (!PatchProxy.applyVoid(objArray, this, liveRichCard, "26")) {
          b.P(LiveRichCardStateManager.h.f().appendTag(this.a), "[stopAutoJumpTimer] 停止直播间倒计时");
          liveRichCard = this.n;
          if (liveRichCard != null) {
             liveRichCard.dispose();
          }
          liveRichCard = this.i;
          if (liveRichCard == null) {
             a.S("richCardDetailManager");
          }
          liveRichCard.d(0);
       }
       return;
    }
    public final void w(f p0){
       this.g = null;
    }
    public final void x(boolean p0){
       LiveRichCardCoreManager liveRichCard = LiveRichCardCoreManager.class;
       if (PatchProxy.isSupport(liveRichCard) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveRichCard, "2")) {
          return;
       }
       if (this.g != null) {
          String str = null;
          if (LiveRichCardStateManager.h.d()) {
             p0 = this.N.p5();
             if (!p0) {
                LiveRichCardCoreManager tg = this.g;
                a.m(tg);
                this.N.j(tg.a(), str);
             }
             if (p0) {
                liveRichCard = this.g;
                a.m(liveRichCard);
                String str1 = liveRichCard.a();
                a.o(str1, "holder!!.redPacketId");
                this.H.c(str1);
             }
          }else if(p0){
             this.N.f(this.g);
          }else {
             this.N.D0();
             liveRichCard = this.g;
             a.m(liveRichCard);
             this.N.j(liveRichCard.a(), str);
          }
       }
       return;
    }
    public final void y(long p0){
       LiveRichCardCoreManager liveRichCard = LiveRichCardCoreManager.class;
       if (PatchProxy.isSupport(liveRichCard) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, liveRichCard, "25")) {
          return;
       }
       this.v = true;
       liveRichCard = this.n;
       if (liveRichCard != null) {
          liveRichCard.dispose();
       }
       b.P(LiveRichCardStateManager.h.f().appendTag(this.a), "[startAutoJumpTimer] 自动跳转直播间倒计时");
       d.a("自动跳转直播间倒计时 "+p0+" 秒");
       this.D(2);
       this.n = this.b(p0, new LiveRichCardCoreManager$startAutoJumpTimer$1(this), new LiveRichCardCoreManager$startAutoJumpTimer$2(this));
       return;
    }
    public final void z(){
       if (PatchProxy.applyVoid(null, this, LiveRichCardCoreManager.class, "14")) {
          return;
       }
       LiveRichCardCoreManager ti = this.i;
       if (ti == null) {
          a.S("richCardDetailManager");
       }
       ti.a();
       return;
    }
}

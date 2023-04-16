package com.kuaishou.live.core.show.redpacket.activity.LiveRedPacketActivityManager;
import p91.m;
import t02.a0;
import com.kuaishou.live.core.show.redpacket.activity.LiveRedPacketActivityManager$a;
import java.lang.Object;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import crd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hf3.a;
import com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$SCLiveTreasureBoxTokenReady;
import com.kuaishou.live.core.show.redpacket.activity.b;
import lf3.g;
import com.kuaishou.client.log.content.packages.nano.ClientContent$RedPackPackage;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import java.lang.Long;
import java.lang.Boolean;
import java.util.Map;
import yw1.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import qg2.c;
import qg2.b;
import com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.lang.Throwable;
import brd.w;
import cjd.e;
import erd.o;
import zfc.b;
import z12.x;
import og2.z;
import com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$LiveTreasureBoxTokenReady;
import io.reactivex.subjects.ReplaySubject;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.redpacket.model.LiveRedPacketActivityTokenResponse;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.live.core.show.redpacket.activity.a;
import og2.e0;
import y22.q;
import og2.g;
import mrd.c;
import og2.k;
import erd.g;
import crd.b;
import java.lang.StringBuilder;
import fg6.a;
import java.util.Objects;
import og2.f;
import com.google.gson.Gson;
import t45.d;
import brd.z;
import og2.e;
import com.gifshow.tuna.player.poi.e;
import og2.p;
import io.reactivex.internal.functions.Functions;
import ekd.q;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Runnable;
import ekd.k1;
import lnc.b9;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import ekd.j;
import va1.s0;
import aq5.d;
import fq5.b;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import og2.j;
import android.app.Activity;
import d61.y;

public class LiveRedPacketActivityManager	// class@000e51
{
    public final LinkedHashMap a;
    public final Map b;
    public final Map c;
    public a d;
    public final m e;
    public final a0 f;
    public final LiveRedPacketActivityManager$a g;

    public void LiveRedPacketActivityManager(m p0,a0 p1,LiveRedPacketActivityManager$a p2){
       super();
       this.a = new LinkedHashMap();
       this.b = new ConcurrentHashMap();
       this.c = new HashMap();
       this.d = new a();
       this.e = p0;
       this.f = p1;
       this.g = p2;
       if (PatchProxy.applyVoid(null, this, LiveRedPacketActivityManager.class, "1")) {
       }else {
          p0.u().u0(691, LiveTreasureBoxMessage$SCLiveTreasureBoxTokenReady.class, new b(this));
       }
       return;
    }
    public final ClientContent$RedPackPackage a(String p0,int p1){
       ClientContent$RedPackPackage obj;
       LiveRedPacketActivityManager liveRedPacke = LiveRedPacketActivityManager.class;
       if (PatchProxy.isSupport(liveRedPacke)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, liveRedPacke, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ClientContent$RedPackPackage();
       obj.redPackId = p0;
       obj.redPackType = p1;
       return obj;
    }
    public final t b(int p0,String p1,String p2,int p3,long p4,boolean p5){
       a uoa;
       String str;
       LiveRedPacketActivityManager liveRedPacke = this;
       object oobject = p2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveRedPacketActivityManager liveRedPacke1 = LiveRedPacketActivityManager.class;
       if (PatchProxy.isSupport(liveRedPacke1)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,oobject,Integer.valueOf(p3),Long.valueOf(p4),Boolean.valueOf(p5)};
          Object obj = PatchProxy.apply(objArray, this, liveRedPacke1, "15");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (PatchProxy.isSupport(liveRedPacke1)) {
          Object obj1 = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p2, this, liveRedPacke1, "27");
          if (obj1 != patchProxyRe) {
             uoa = obj1;
          label_006f :
             t ot = b.b().d(uoa, liveRedPacke.e.getLiveStreamId(), p2, p3, p1);
             if (LiveRichCardStateManager.h.a()) {
                ot = b.b().b(uoa, liveRedPacke.e.getLiveStreamId(), p2, p3, p1, p5);
             }
             TimeUnit mILLISECONDS = TimeUnit.MILLISECONDS;
             return ot.timeout(0x2710, mILLISECONDS, t.error(new TimeoutException())).map(new e()).retryWhen(new b(3, 1000)).delaySubscription(x.B(p4), mILLISECONDS);
          }
       }
       a uoa1 = liveRedPacke.b.get(this.d(p0, p2));
       uoa1 = (uoa1 != null && !TextUtils.x(uoa1.a))? uoa1.a: "n/live/treasureBox/grab";
       uoa = uoa1;
       goto label_006f ;
    }
    public final t c(z p0){
       t ot;
       Object obj = this;
       Object obj1 = p0;
       LiveLogTag obj2 = PatchProxy.applyOneRefs(obj1, obj, LiveRedPacketActivityManager.class, "16");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       ClientContent$RedPackPackage redPackPacka = obj.a(p0.a(), obj1.a.boxType);
       int i = 1;
       ReplaySubject replaySubjec = ReplaySubject.i(i);
       String str = "redPacketId";
       if (!obj.a.containsKey(p0.a())) {
          b.S(LiveLogTag.LIVE_RED_PACKET_ACTIVITY.appendTag("getPrefetchTokenObservable"), " error not containKey", str, p0.a());
          replaySubjec.onError(new Throwable("getPrefetchToken error cause not containKey"));
          return replaySubjec;
       }else if(p0.b()){
          b.S(LiveLogTag.LIVE_RED_PACKET_ACTIVITY.appendTag("getPrefetchTokenObservable"), " hasTokenPreFetchFail", str, p0.a());
          obj.f(i, redPackPacka);
          replaySubjec.onNext(obj1);
       }else if(obj1.b != null){
          obj2 = LiveLogTag.LIVE_RED_PACKET_ACTIVITY;
          obj2.appendTag("getPrefetchTokenObservable");
          LiveLogTag liveLogTag = obj2;
          b.T(liveLogTag, " token response exist", "tokenResponse", obj1.b.toString(), "redPacketId", p0.a());
          a.c(obj.e.a(), redPackPacka);
          replaySubjec.onNext(obj1);
       }else {
          z c = obj1.c;
          if (c != null && c.c != null) {
             b.S(LiveLogTag.LIVE_RED_PACKET_ACTIVITY.appendTag("getPrefetchTokenObservable"), " token is empty, preFetchTask is working£¬wait it!", str, p0.a());
             ot = obj1.c.d.take(1);
          }else {
             b.S(LiveLogTag.LIVE_RED_PACKET_ACTIVITY.appendTag("getPrefetchTokenObservable"), " token is empty, request token begin", str, p0.a());
             c = obj1.a;
             c = obj1.a;
             ot = q.g(obj.e(c.bizType, c.treasureBoxId), obj.e.getLiveStreamId(), p0.a(), c.boxType, c.maxRetryCount, c.maxRetryIntervalMills, 2000);
          }
          LiveRedPacketActivityManager liveRedPacke = this;
          z oz = p0;
          ReplaySubject replaySubjec1 = replaySubjec;
          g og = new g(liveRedPacke, oz, redPackPacka, "getPrefetchTokenObservable", replaySubjec1);
          k ok = new k(liveRedPacke, oz, "getPrefetchTokenObservable", redPackPacka, replaySubjec1);
          obj.d.c(ot.timeout(0x2710, TimeUnit.MILLISECONDS, t.error(new TimeoutException())).subscribe(v13, v14));
       }
       return replaySubjec;
    }
    public final String d(int p0,String p1){
       LiveRedPacketActivityManager liveRedPacke = LiveRedPacketActivityManager.class;
       if (PatchProxy.isSupport(liveRedPacke)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, liveRedPacke, "29");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return p0+"_"+p1;
    }
    public final String e(int p0,String p1){
       LiveRedPacketActivityManager liveRedPacke = LiveRedPacketActivityManager.class;
       if (PatchProxy.isSupport(liveRedPacke)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, liveRedPacke, "28");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a uoa = this.b.get(this.d(p0, p1));
       if (uoa != null && !TextUtils.x(uoa.c)) {
          return uoa.c;
       }else {
          return "n/live/treasureBox/token";
       }
    }
    public final void f(int p0,ClientContent$RedPackPackage p1){
       LiveRedPacketActivityManager liveRedPacke = LiveRedPacketActivityManager.class;
       if (PatchProxy.isSupport(liveRedPacke) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, liveRedPacke, "23")) {
          return;
       }
       a.b(this.e.a(), p1, 8, p0);
       return;
    }
    public final void g(String p0,String p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveRedPacketActivityManager.class, "20")) {
          return;
       }
       Gson a = a.a;
       Objects.requireNonNull(a);
       z c = d.c;
       p2 = t.just(p2).map(new f(a)).subscribeOn(c).observeOn(c);
       this.d.c(p2.subscribe(new e(p0, p1), e.b));
       return;
    }
    public final void h(z p0,String p1,int p2){
       if (PatchProxy.isSupport(LiveRedPacketActivityManager.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, LiveRedPacketActivityManager.class, "11")) {
          return;
       }
       z c = p0.c;
       if (c != null) {
          c.a();
       }
       this.d.c(this.c(p0).observeOn(d.a).subscribe(new p(this, p1, p0, p2), Functions.d()));
       return;
    }
    public void i(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveRedPacketActivityManager.class, "3")) {
          return;
       }
       if (!q.h(this.a)) {
          Iterator iterator = this.a.values().iterator();
          while (iterator.hasNext()) {
             z oz = iterator.next();
             if (oz == null || PatchProxy.applyVoid(objArray, oz, z.class, "2")) {
                continue ;
             }else {
                z c = oz.c;
                if (c != null) {
                   c.a();
                }
                c = oz.d;
                if (c != null) {
                   k1.m(c);
                }
                oz = oz.e;
                if (oz != null) {
                   k1.m(oz);
                }
             }
          }
       }
       this.a.clear();
       this.c.clear();
       b9.a(this.d);
       k1.n(this);
       b.Z(LiveLogTag.LIVE_RED_PACKET_ACTIVITY, "release");
       return;
    }
    public final void j(z p0,LiveRedPacketActivityTokenResponse p1){
       p0.b = p1;
    }
    public final void k(String p0,String p1,boolean p2,UserInfos$PicUrl[] p3,int p4){
       LiveRedPacketActivityManager liveRedPacke = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p3;
       LiveRedPacketActivityManager liveRedPacke1 = LiveRedPacketActivityManager.class;
       int i = 1;
       if (PatchProxy.isSupport(liveRedPacke1)) {
          Object[] objArray = new Object[]{oobject,oobject1,Boolean.valueOf(p2),oobject2,Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, liveRedPacke1, "18")) {
             return;
          }
       }
       if (p2 && !liveRedPacke.e.e()) {
          liveRedPacke1 = liveRedPacke.f;
          if (liveRedPacke1 != null && (liveRedPacke.g != null && !liveRedPacke1.c.getUser().isFollowingOrFollowRequesting())) {
             liveRedPacke.g.c(oobject2, p4);
             LiveLogTag lIVE_RED_PAC = LiveLogTag.LIVE_RED_PACKET_ACTIVITY;
             String str = (j.h(p3))? "": oobject2[0].url;
             b.d0(lIVE_RED_PAC, "onInterceptPopWebViewDialog cause not follow user", "redPackId", p0, "followHintPopDialogPictureUrls", str);
             return;
          }
       }
    label_0071 :
       if (TextUtils.x(p1)) {
          return;
       }else {
          HashMap hashMap = new HashMap();
          hashMap.put("treasureBoxId", p0);
          String str1 = s0.d(p1, hashMap);
          b.e0(LiveLogTag.LIVE_RED_PACKET_ACTIVITY, "showWebViewDialog", "realUrl", str1, "redPacketId", p0, "isForceFollowAnchor", Boolean.valueOf(p2));
          if (liveRedPacke.g != null) {
             LiveRedPacketActivityManager e = liveRedPacke.e;
             Object obj = PatchProxy.applyOneRefs(e, null, x.class, "28");
             if (obj != PatchProxyResult.class) {
                i = obj.booleanValue();
             }else if(e.A0() != null && (e.A0().r2(AudienceBizRelation.GIFT_COMBO) || (e.A0() != null && e.A0().r2(AudienceBizRelation.GIFT_BOX)))){
                i = false;
             }
             if (!i) {
                y.a(liveRedPacke.e.b().getActivity(), new j(this, str1), this, 100);
             }
          }
          return;
       }
    }
}

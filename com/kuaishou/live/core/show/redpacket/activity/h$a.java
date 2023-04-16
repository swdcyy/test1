package com.kuaishou.live.core.show.redpacket.activity.h$a;
import cx1.a;
import com.kuaishou.live.core.show.redpacket.activity.h;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.Objects;
import com.kuaishou.live.core.show.redpacket.activity.LiveRedPacketActivityManager;
import java.util.Map;
import yw1.a;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import io.reactivex.subjects.ReplaySubject;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Throwable;
import java.util.LinkedHashMap;
import og2.z;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import p91.m;
import y22.q;
import og2.a;
import mrd.c;
import erd.g;
import com.kuaishou.live.core.show.redpacket.activity.e;
import erd.r;
import com.kuaishou.live.core.show.redpacket.activity.d;
import erd.o;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import brd.w;
import og2.c;
import og2.o;
import com.kuaishou.live.core.show.redpacket.activity.f;
import com.kuaishou.live.core.show.redpacket.activity.c;
import og2.q;
import og2.r;
import crd.b;
import crd.a;
import t45.d;
import brd.z;
import og2.n;
import og2.m;
import com.kuaishou.live.common.core.component.redpacket.model.LiveRedPacketActivityTokenResponse;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import ekd.j;
import java.lang.Runnable;
import ekd.k1;
import ekd.q;
import java.util.HashMap;
import com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$LiveTreasureBoxTokenReady;
import java.lang.Long;
import fg6.a;
import com.google.gson.Gson;

public class h$a implements a	// class@000e5c
{
    public final h a;

    public void h$a(h p0){
       this.a = p0;
       super();
    }
    public void a(int p0,String p1){
       h$a uoa = h$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "6")) {
          return;
       }
       h u = this.a.u;
       if (u == null) {
          return;
       }
       Objects.requireNonNull(u);
       LiveRedPacketActivityManager liveRedPacke = LiveRedPacketActivityManager.class;
       if (!PatchProxy.isSupport(liveRedPacke) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, u, liveRedPacke, "26")) {
          u.b.remove(u.d(p0, p1));
       }
       return;
    }
    public void b(int p0,String p1,a p2){
       if (PatchProxy.isSupport(h$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, h$a.class, "5")) {
          return;
       }
       h u = this.a.u;
       if (u == null) {
          return;
       }
       Objects.requireNonNull(u);
       if (!PatchProxy.isSupport(LiveRedPacketActivityManager.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, u, LiveRedPacketActivityManager.class, "25")) {
          u.b.put(u.d(p0, p1), p2);
       }
       return;
    }
    public t c(int p0,String p1,int p2,boolean p3){
       t obj;
       String str = p1;
       int i = p2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(h$a.class)) {
          obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), p1, Integer.valueOf(p2), Boolean.valueOf(p3), this, h$a.class, "3");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       h u = this.a.u;
       if (u == null) {
          obj = null;
       }else {
          Objects.requireNonNull(u);
          if (PatchProxy.isSupport(LiveRedPacketActivityManager.class)) {
             obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), p1, Integer.valueOf(p2), Boolean.valueOf(p3), u, LiveRedPacketActivityManager.class, "13");
             if (obj != patchProxyRe) {
             }
          }
          int i1 = 1;
          ReplaySubject replaySubjec = ReplaySubject.i(i1);
          if (TextUtils.x(p1)) {
             replaySubjec.onError(new Throwable("EMPTY_RED_PACKET_ID"));
          }else {
             Object obj1 = u.a.get(str);
             LiveLogTag lIVE_ACTIVIT = LiveLogTag.LIVE_ACTIVITY_RED_PACKET;
             if (obj1 == null) {
                i1 = false;
             }
             b.d0(lIVE_ACTIVIT, "grabActivityRedPacket start", "tokenContext isExist", Boolean.valueOf(i1), "redPacketId", p1);
             obj = (obj1 == null)? q.g(u.e(p0, str), u.e.getLiveStreamId(), p1, p2, 3, 1000, 2000): u.c(obj1).doOnNext(new a(replaySubjec)).filter(e.b).map(d.b);
             c uoc = new c(u, p0, p1, p2, p3, replaySubjec);
             u.d.c(obj.timeout(0x2710, TimeUnit.MILLISECONDS, t.error(new TimeoutException())).doOnError(new c(str, replaySubjec)).doOnNext(new o(u, str, i, replaySubjec)).filter(f.b).flatMap(v15).subscribe(new q(replaySubjec), new r(replaySubjec)));
          }
          obj = replaySubjec.take(1).observeOn(d.a).doOnNext(new n(u, str, i)).doOnError(new m(u, str, i));
       }
       return obj;
    }
    public LiveRedPacketActivityTokenResponse d(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       h obj = PatchProxy.applyOneRefs(p0, this, h$a.class, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.a.u;
       LiveRedPacketActivityTokenResponse liveRedPacke = null;
       if (obj != null) {
          Objects.requireNonNull(obj);
          Object obj1 = PatchProxy.applyOneRefs(p0, obj, LiveRedPacketActivityManager.class, "12");
          if (obj1 != patchProxyRe) {
             liveRedPacke = obj1;
          }else if(TextUtils.x(p0) || obj.a.get(p0) == null){
             liveRedPacke = obj.a.get(p0).b;
          }
       }
       return liveRedPacke;
    }
    public void e(String p0,boolean p1,UserInfos$PicUrl[] p2,String p3,Map p4){
       Object obj = this;
       object oobject = p0;
       object oobject1 = p3;
       object oobject2 = p4;
       h$a uoa = h$a.class;
       int i = 4;
       int i1 = 5;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[i1];
          objArray[0] = oobject;
          objArray[1] = Boolean.valueOf(p1);
          objArray[2] = p2;
          objArray[3] = oobject1;
          objArray[i] = oobject2;
          if (PatchProxy.applyVoid(objArray, obj, uoa, "1")) {
             return;
          }
       }
       LiveLogTag lIVE_RED_PAC = LiveLogTag.LIVE_RED_PACKET_ACTIVITY;
       String str = (j.h(p2))? "": p2[0].url;
       LiveLogTag liveLogTag = lIVE_RED_PAC;
       b.e0(lIVE_RED_PAC, "service showRedPacketActivityDialog", "redPacketId", p0, "followAnchorTipsDialogPictureUrls", str, "jumpUrl", TextUtils.k(p3));
       h u = obj.a.u;
       if (u != null) {
          Objects.requireNonNull(u);
          LiveRedPacketActivityManager liveRedPacke = LiveRedPacketActivityManager.class;
          if (PatchProxy.isSupport(liveRedPacke)) {
             Object[] objArray1 = new Object[]{oobject,Boolean.valueOf(p1),p2,oobject1,oobject2};
             if (!PatchProxy.applyVoid(objArray1, u, liveRedPacke, "17")) {
             }
          }else if(TextUtils.x(p0)){
             z oz = u.a.get(oobject);
             if (oz != null) {
                b.c0(liveLogTag, "showWebViewDialogIfNecessary error not containKey", "redPacketId", oobject);
                if (!PatchProxy.applyVoid(null, oz, z.class, "3")) {
                   k1.m(oz.d);
                }
                u.h(oz, oobject1, 1);
             }else if(!q.h(p4)){
                u.c.put(oobject, oobject2);
             }
             u.k(p0, p3, p1, p2, 1);
          }
       }
    label_00ca :
       return;
    }
    public Map f(String p0){
       HashMap hashMap;
       z b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       h obj = PatchProxy.applyOneRefs(p0, this, h$a.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.a.u;
       if (obj == null) {
          hashMap = new HashMap();
       }else {
          Objects.requireNonNull(obj);
          LiveRedPacketActivityManager liveRedPacke = LiveRedPacketActivityManager.class;
          HashMap hashMap1 = PatchProxy.applyOneRefs(p0, obj, liveRedPacke, "21");
          if (hashMap1 != patchProxyRe) {
          }else {
             hashMap1 = new HashMap();
             if (!TextUtils.x(p0)) {
                z oz = obj.a.get(p0);
                if (oz != null) {
                   LiveRedPacketActivityTokenResponse liveRedPacke1 = PatchProxy.applyOneRefs(oz, obj, liveRedPacke, "22");
                   if (liveRedPacke1 != patchProxyRe) {
                   }else if(!oz.b()){
                      b = oz.b;
                      if (b == null || (b.mIsLuckyUser == null && b != null)) {
                         liveRedPacke1 = b.mGrabToken;
                      }
                   }
                   b = "";
                   Object obj1 = PatchProxy.applyTwoRefs(liveRedPacke1, oz, obj, liveRedPacke, "19");
                   if (obj1 != patchProxyRe) {
                      hashMap1 = obj1;
                   }else {
                      HashMap hashMap2 = new HashMap();
                      hashMap2.put("liveStreamId", obj.e.getLiveStreamId());
                      hashMap2.put("treasureBoxId", oz.a());
                      hashMap2.put("bizType", Integer.valueOf(oz.a.bizType));
                      hashMap2.put("redPackType", Integer.valueOf(oz.a.boxType));
                      if (!q.h(oz.a.extraMessage)) {
                         hashMap2.putAll(oz.a.extraMessage);
                      }
                      if (!TextUtils.x(liveRedPacke1)) {
                         hashMap2.put("token", liveRedPacke1);
                      }
                      b = oz.b;
                      if (b != null) {
                         if (b.mIsLuckyUser != null) {
                            hashMap2.put("isLuckyDog", Integer.valueOf(1));
                         }
                         hashMap2.put("grabScatterMillis", Long.valueOf(oz.b.mGrabRequestMaxDelayMillis));
                      }
                      hashMap1 = hashMap2;
                   }
                   b.c0(LiveLogTag.LIVE_RED_PACKET_ACTIVITY, "getRedPacketActivityBizParams", "paramsMapJsonString", a.a.q(hashMap1));
                }else {
                   Map map = obj.c.get(p0);
                   if (!q.h(map)) {
                      hashMap1.putAll(map);
                      b.d0(LiveLogTag.LIVE_RED_PACKET_ACTIVITY, "getRedPacketActivityBizParams tokenContext not exist, load mPendantExtraMessage", "redPacketId", p0, "pendantExtraMessage", a.a.q(map));
                   }
                }
             }
          }
          hashMap = hashMap1;
       }
       return hashMap;
    }
}

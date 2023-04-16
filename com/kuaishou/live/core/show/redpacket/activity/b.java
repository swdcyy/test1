package com.kuaishou.live.core.show.redpacket.activity.b;
import lf3.g;
import com.kuaishou.live.core.show.redpacket.activity.LiveRedPacketActivityManager;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$SCLiveTreasureBoxTokenReady;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.j;
import com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$LiveTreasureBoxTokenReady;
import java.util.LinkedHashMap;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import og2.z;
import p91.m;
import z12.x;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.live.core.basic.utils.LiveUtilsLogTag;
import com.yxcorp.utility.TextUtils;
import java.util.List;
import java.lang.Math;
import og2.e0;
import com.kuaishou.live.core.show.redpacket.activity.g;
import java.lang.Runnable;
import ekd.k1;
import java.util.HashMap;
import java.util.Map;
import com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$LiveTreasureBoxGrabPage;
import og2.i;
import com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$LiveTreasureBoxEffectInfo;
import og2.h;
import lf3.f;

public final class b implements g	// class@000e53
{
    public final LiveRedPacketActivityManager b;

    public void b(LiveRedPacketActivityManager p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       LiveTreasureBoxMessage$SCLiveTreasureBoxTokenReady sCLiveTreasu;
       int i1;
       int i2;
       b uob1;
       b uob2;
       LiveRedPacketActivityManager liveRedPacke;
       String str1;
       LiveTreasureBoxMessage$LiveTreasureBoxTokenReady this;
       Object this1;
       long l4;
       long this1;
       b b = this.b;
       LiveTreasureBoxMessage$SCLiveTreasureBoxTokenReady obj = p0;
       Objects.requireNonNull(b);
       if (PatchProxy.applyVoidOneRefs(obj, b, LiveRedPacketActivityManager.class, "4")) {
       }else {
          b.g("handleRedPacketActivityTokenSignal", "receive token message", obj);
          if (obj == null || j.h(obj.token)) {
             b.Z(LiveLogTag.LIVE_RED_PACKET_ACTIVITY, "handleRedPacketActivityTokenSignal token list is empty");
          }else {
             obj = obj.token;
             int len = obj.length;
             int i = 0;
             b uob = b;
             while (i < len) {
                object oobject = obj[i];
                LiveTreasureBoxMessage$LiveTreasureBoxTokenReady treasureBoxI = oobject.treasureBoxId;
                String str = "redPacketId";
                if (uob.a.get(treasureBoxI) != null) {
                   b.c0(LiveLogTag.LIVE_RED_PACKET_ACTIVITY, "handleRedPacketActivityTokenSignal already has this redPacket, do nothing", str, treasureBoxI);
                }else {
                   LiveRedPacketActivityManager a = uob.a;
                   if (!PatchProxy.applyVoidTwoRefs(a, oobject, uob, LiveRedPacketActivityManager.class, "5")) {
                      z oz = new z(oobject);
                      if (PatchProxy.applyVoidOneRefs(oz, uob, LiveRedPacketActivityManager.class, "8")) {
                         uob2 = b;
                         sCLiveTreasu = obj;
                         i1 = len;
                         i2 = i;
                         liveRedPacke = a;
                         str1 = null;
                      }else {
                         long l3 = uob.e.s();
                         z a1 = oz.a;
                         LiveTreasureBoxMessage$LiveTreasureBoxTokenReady minRequestTo = a1.minRequestTokenTime;
                         i1 = len;
                         i2 = i;
                         LiveTreasureBoxMessage$LiveTreasureBoxTokenReady maxRequestTo = a1.maxRequestTokenTime;
                         String str3 = "schedulePreFetchTokenTask";
                         if (PatchProxy.isSupport(x.class)) {
                            this1 = PatchProxy.applyFourRefs(Long.valueOf(l3), Long.valueOf(minRequestTo), Long.valueOf(maxRequestTo), str3, null, x.class, "30");
                            sCLiveTreasu = obj;
                            if (this1 != PatchProxyResult.class) {
                               l4 = this1.longValue();
                            }else if(minRequestTo - maxRequestTo > 0){
                               b.P(LiveUtilsLogTag.LiveUtils.appendTag(TextUtils.k(str3)), " warning, startTime > deadline");
                            }
                            l4 = Math.min(minRequestTo, maxRequestTo);
                            long l5 = Math.max(minRequestTo, maxRequestTo);
                            if (l3 - l5 >= 0) {
                               b.P(LiveUtilsLogTag.LiveUtils.appendTag(TextUtils.k(str3)), " error, deadline time out");
                               l4 = -1;
                            }else if(l3 - l4 < 0){
                               long l6 = l4 - l3;
                               l5 = l5 - l4;
                               l4 = l6 + x.B(l5);
                            }else {
                               l5 = l5 - l3;
                               l4 = x.B(l5);
                            }
                         }else {
                            sCLiveTreasu = obj;
                            goto label_00bb ;
                         }
                         uob1 = b;
                         this1 = l4;
                         str1 = null;
                         if (this1 - str1 < 0) {
                            uob2 = uob1;
                            liveRedPacke = a;
                         }else {
                            liveRedPacke = a;
                            uob2 = uob1;
                            e0 uoe0 = new e0(new g(uob, a1));
                            oz.c = uoe0;
                            e0 uoe01 = e0.class;
                            if (!PatchProxy.isSupport(uoe01) || !PatchProxy.applyVoidOneRefs(Long.valueOf(this1), uoe0, uoe01, "1")) {
                               k1.r(uoe0.a, this1);
                            }
                            HashMap hashMap = new HashMap();
                            hashMap.put("delay time", Long.valueOf(this1));
                            hashMap.put("current time", Long.valueOf(l3));
                            hashMap.put("startTime", Long.valueOf(minRequestTo));
                            hashMap.put("deadline", Long.valueOf(maxRequestTo));
                            hashMap.put(str, oz.a());
                            b.h0(LiveLogTag.LIVE_RED_PACKET_ACTIVITY, "schedulePreFetchTokenTask success", hashMap);
                         }
                      }
                      this = oobject.grabPage;
                      uob1 = uob2;
                      if (!PatchProxy.applyVoidTwoRefs(oz, this, uob1, LiveRedPacketActivityManager.class, "10")) {
                         if (this == null) {
                            b.c0(LiveLogTag.LIVE_RED_PACKET_ACTIVITY, "schedulePopDialogTask error grabPage == null", str, oz.a());
                         }else {
                            long l2 = uob1.e.s();
                            if (l2 - this.popDeadline >= 0) {
                               b.e0(LiveLogTag.LIVE_RED_PACKET_ACTIVITY, "schedulePopDialogTask error,later than popDeadline", "redPacketId", oz.a(), "current time", Long.valueOf(l2), "popDeadline", Long.valueOf(this.popDeadline));
                            }else {
                               LiveTreasureBoxMessage$LiveTreasureBoxGrabPage popTime = this.popTime;
                               String str2 = (l2 - popTime > 0)? str1: popTime - l2;
                               i oi = new i(uob1, oz, this);
                               oz.d = oi;
                               k1.s(oi, uob1, str2);
                               b.f0(LiveLogTag.LIVE_RED_PACKET_ACTIVITY, "schedulePopDialogTask", "redPacketId", oz.a(), "current time", Long.valueOf(l2), "popDialogTime", Long.valueOf(popTime), "popDialogDelayTime", Long.valueOf(str2));
                            }
                         }
                      }
                      if (!PatchProxy.applyVoidOneRefs(oz, uob1, LiveRedPacketActivityManager.class, "6")) {
                         this = oz.a.effectInfo;
                         if (this != null) {
                            LiveTreasureBoxMessage$LiveTreasureBoxEffectInfo displayTime = this.displayTime;
                            long l = uob1.e.s();
                            if (l - displayTime > 0) {
                               b.d0(LiveLogTag.LIVE_RED_PACKET_ACTIVITY, "schedulePlayMagicEffectTask fail cause time expired", "displayTime", Long.valueOf(displayTime), "current time", Long.valueOf(l));
                            }else {
                               h oh = new h(uob1, oz, this);
                               oz.e = oh;
                               long l1 = displayTime - l;
                               k1.s(oh, uob1, l1);
                               b.e0(LiveLogTag.LIVE_RED_PACKET_ACTIVITY, "schedulePlayMagicEffectTask", "redPacketId", oz.a(), "displayTime", Long.valueOf(displayTime), "current time", Long.valueOf(l));
                            }
                         }
                      }
                      liveRedPacke.put(oobject.treasureBoxId, oz);
                      uob = uob1;
                   label_0242 :
                      i = i2 + 1;
                      len = i1;
                      b = uob1;
                      obj = sCLiveTreasu;
                   }
                }
                sCLiveTreasu = obj;
                i1 = len;
                i2 = i;
                uob1 = b;
                goto label_0242 ;
             }
             uob.g("handleRedPackActivityTokenSignal handle finish", "mRedPacketTokenContextMap", uob.a);
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}

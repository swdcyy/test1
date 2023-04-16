package com.kuaishou.live.core.show.redpacket.activity.g;
import java.lang.Runnable;
import com.kuaishou.live.core.show.redpacket.activity.LiveRedPacketActivityManager;
import com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$LiveTreasureBoxTokenReady;
import java.lang.Object;
import java.lang.String;
import p91.m;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.LinkedHashMap;
import og2.z;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import brd.t;
import y22.q;
import og2.e0;
import com.kwai.robust.PatchProxyResult;
import og2.b0;
import erd.g;
import og2.c0;
import og2.d0;
import og2.a0;
import erd.a;
import og2.l;
import og2.b;
import crd.b;
import crd.a;
import java.lang.Long;

public final class g implements Runnable	// class@000e5b
{
    public final LiveRedPacketActivityManager b;
    public final LiveTreasureBoxMessage$LiveTreasureBoxTokenReady c;

    public void g(LiveRedPacketActivityManager p0,LiveTreasureBoxMessage$LiveTreasureBoxTokenReady p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       g tb = this.b;
       g tc = this.c;
       String liveStreamId = tb.e.getLiveStreamId();
       if (PatchProxy.applyVoidTwoRefs(tc, liveStreamId, tb, LiveRedPacketActivityManager.class, "9")) {
       }else {
          LiveTreasureBoxMessage$LiveTreasureBoxTokenReady treasureBoxI = tc.treasureBoxId;
          Object obj = tb.a.get(treasureBoxI);
          if (obj == null) {
             b.c0(LiveLogTag.LIVE_RED_PACKET_ACTIVITY, "preFetchTokenContext error not containKey", "redPacketId", treasureBoxI);
          }else {
             z a = obj.a;
             t ot = q.g(tb.e(a.bizType, a.treasureBoxId), liveStreamId, treasureBoxI, tc.boxType, tc.maxRetryCount, tc.maxRetryIntervalMills, 0);
             a = obj.c;
             if (a != null) {
                Object obj1 = PatchProxy.applyOneRefs(ot, a, e0.class, "4");
                ot = (obj1 != PatchProxyResult.class)? obj1: ot.doOnSubscribe(new b0(a)).doOnNext(new c0(a)).doOnError(new d0(a)).doOnDispose(new a0(a));
             }
          label_007d :
             b uob = ot.subscribe(new l(tb, treasureBoxI), new b(treasureBoxI));
             tb.d.c(uob);
             a = obj.c;
             if (a != null) {
                a.e = uob;
             }
             b.d0(LiveLogTag.LIVE_RED_PACKET_ACTIVITY, "preFetchTokenContext", "redPacketId", treasureBoxI, "current time", Long.valueOf(tb.e.s()));
          }
       }
       return;
    }
}

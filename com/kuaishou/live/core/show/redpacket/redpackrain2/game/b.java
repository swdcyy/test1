package com.kuaishou.live.core.show.redpacket.redpackrain2.game.b;
import nh2.a$a;
import com.kuaishou.live.core.show.redpacket.redpackrain2.game.a;
import ph2.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import mh2.a;
import java.lang.Runnable;
import ekd.k1;
import com.kuaishou.live.core.show.redpacket.redpackrain2.game.LiveRedPackRainGameMessage;
import nh2.a;
import mh2.b;

public class b implements a$a	// class@000efa
{
    public final a a;
    public final a b;

    public void b(a p0,a p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_RED_PACK_RAIN, "onMagicEffectDisplayCompleted");
       b tb = this.b;
       if (tb.w != null) {
          k1.p(new a(this), tb);
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_RED_PACK_RAIN, "onMagicEffectDisplaySucceed");
       return;
    }
    public void onEffectReceiveEvent(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       LiveRedPackRainGameMessage liveRedPackR = LiveRedPackRainGameMessage.parse(p0);
       b.c0(LiveLogTag.LIVE_RED_PACK_RAIN, "onReceiveMagicEvent", "message", liveRedPackR);
       if (liveRedPackR == null) {
          return;
       }
       LiveRedPackRainGameMessage mReqType = liveRedPackR.mReqType;
       if (mReqType == 8) {
          this.b.P8().c(this.a);
       }else if(mReqType == 6){
          k1.p(new b(this, liveRedPackR), this.b);
       }
       return;
    }
}

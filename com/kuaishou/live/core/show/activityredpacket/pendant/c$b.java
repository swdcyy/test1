package com.kuaishou.live.core.show.activityredpacket.pendant.c$b;
import android.os.CountDownTimer;
import com.kuaishou.live.core.show.activityredpacket.pendant.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$LiveTreasureBoxShowPage;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Long;
import z12.x;
import lnc.a1;
import com.kuaishou.live.core.show.activityredpacket.pendant.LiveActivityRedPacketPendantView;

public class c$b extends CountDownTimer	// class@000970
{
    public final c a;

    public void c$b(c p0,long p1,long p2){
       this.a = p0;
       super(p1, p2);
    }
    public void onFinish(){
       if (PatchProxy.applyVoid(null, this, c$b.class, "2")) {
          return;
       }
       c$b ta = this.a;
       c g = ta.g;
       if (g != null) {
          ta.e(g);
       }else {
          b.Z(LiveLogTag.LIVE_ACTIVITY_RED_PACKET, "pendant countDownFinished but openingPage is null");
       }
       return;
    }
    public void onTick(long p0){
       if (PatchProxy.isSupport(c$b.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, c$b.class, "1")) {
          return;
       }
       this.a.a.h(x.g((p0 + 1000)), a1.d(R.dimen.arg_RES_7f070980));
       return;
    }
}

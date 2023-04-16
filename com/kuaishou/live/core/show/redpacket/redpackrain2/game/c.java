package com.kuaishou.live.core.show.redpacket.redpackrain2.game.c;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.redpacket.redpackrain2.game.a;
import ph2.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import com.kuaishou.android.live.log.c$b;
import com.kuaishou.android.live.log.c;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import ih2.n;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kuaishou.live.core.show.redpacket.redpackrain2.game.d$a;

public class c extends m	// class@000efb
{
    public final a c;
    public final a d;

    public void c(a p0,a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       b.a0(LiveLogTag.LIVE_RED_PACK_RAIN, "user click close", c.j("redPackRainId", this.c.a));
       a a = this.c.a;
       ClientContent$LiveStreamPackage liveStreamPa = this.d.p.a();
       if (!PatchProxy.applyVoidTwoRefs(a, liveStreamPa, null, n.class, "12")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "LIVE_RED_PACKET_RAIN_COUNT_DOWN_CARD";
          i3 oi3 = i3.f();
          oi3.d("id", a);
          uElementPack.params = oi3.e();
          u1.u(1, uElementPack, n.a(liveStreamPa));
       }
       a = this.d.t;
       if (a != null) {
          a.d();
          this.d.S8();
       }
       return;
    }
}

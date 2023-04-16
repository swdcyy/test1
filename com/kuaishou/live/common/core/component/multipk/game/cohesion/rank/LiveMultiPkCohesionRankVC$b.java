package com.kuaishou.live.common.core.component.multipk.game.cohesion.rank.LiveMultiPkCohesionRankVC$b;
import com.kuaishou.live.common.core.component.multipk.game.cohesion.rank.LiveMultiPkCohesionRankVC$a;
import com.kuaishou.live.common.core.component.multipk.game.cohesion.rank.LiveMultiPkCohesionRankVC;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import p63.a;
import p63.a$a;
import p63.a$b;
import zs1.b;
import com.kuaishou.live.jsbridge.LiveKrnPageKey;
import oa1.a;
import nsd.u;
import msd.l;
import o63.d;
import ps1.e;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import du1.d;
import k2b.e0;
import androidx.lifecycle.LiveData;
import dt1.b;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import ct1.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LivePkPackage;
import k2b.u1;

public final class LiveMultiPkCohesionRankVC$b implements LiveMultiPkCohesionRankVC$a	// class@0015d6
{
    public final LiveMultiPkCohesionRankVC a;

    public void LiveMultiPkCohesionRankVC$b(LiveMultiPkCohesionRankVC p0){
       this.a = p0;
       super();
    }
    public void a(){
       Object obj = this;
       if (PatchProxy.applyVoid(null, obj, LiveMultiPkCohesionRankVC$b.class, "1")) {
          return;
       }
       LiveMultiPkCohesionRankVC$b a = obj.a;
       a uoa = v15;
       a uoa1 = v15;
       uoa = new a(0, 0, 0, 0, 0, 0, null, false, 0, 511, 0);
       a.j = a.q.y5(LiveKrnPageKey.LiveMultiPKCohesionRankListPanel, a.b.a().a("pkId", obj.a.o.q()).b(), uoa1, null);
       ClientContent$LiveStreamPackage liveStreamPa = obj.a.q.a();
       e0 uoe0 = obj.a.q.i();
       String str = obj.a.o.q();
       Boolean value = obj.a.l.a().getValue();
       if (value == null) {
          value = Boolean.FALSE;
       }
       a.o(value, "rankModel.hasSendCohesionGift.value ?: false");
       boolean b = value.booleanValue();
       if (!PatchProxy.isSupport(c.class) || !PatchProxy.applyVoidFourRefs(liveStreamPa, uoe0, str, Boolean.valueOf(b), null, c.class, "2")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "LIVE_CONVERGENCE_PK_HELP_LIST_BUTTON";
          i3 oi3 = i3.f();
          oi3.c("status", Integer.valueOf(b));
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          ClientContent$LivePkPackage livePkPackag = new ClientContent$LivePkPackage();
          livePkPackag.pkId = str;
          uContentPack.livePkPackage = livePkPackag;
          u1.L("", uoe0, 1, uElementPack, uContentPack);
       }
       return;
    }
}

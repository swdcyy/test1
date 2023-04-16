package com.kuaishou.live.core.show.conditionredpacket.pendant.b;
import com.kuaishou.live.core.show.conditionredpacket.pendant.e$a;
import com.kuaishou.live.core.show.conditionredpacket.pendant.e;
import java.lang.Object;
import i62.z$a;
import java.util.Objects;
import j62.a;
import java.lang.String;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketInfo;
import i62.t$c;
import tw1.f;
import l62.a;
import u52.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import lnc.i3;
import java.lang.Number;
import k2b.u1;
import android.view.View;
import l62.j;
import android.view.View$OnClickListener;
import xw1.b;
import l62.f;
import xw1.a;
import h62.c;
import nt5.a;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketStage;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketAction;
import com.kuaishou.live.core.show.conditionredpacket.logger.RedPacketType;
import com.kuaishou.live.core.show.conditionredpacket.logger.FirstReportType;
import com.kuaishou.live.core.show.conditionredpacket.logger.ActionType;
import com.kuaishou.live.core.show.conditionredpacket.logger.ActionStatus;
import h62.a;
import h62.d;

public final class b implements e$a	// class@000abe
{
    public final e a;

    public void b(e p0){
       this.a = p0;
    }
    public final void accept(Object p0){
       int i;
       a uoa1;
       b a = this.a;
       Objects.requireNonNull(a);
       z$a a1 = p0.a;
       LiveConditionRedPacketInfo liveConditio = a.p.l(a1.a, a1.b);
       long l = f.a();
       a uoa = null;
       b uob = 3;
       if (liveConditio == null) {
          i = 1;
       }else if(l - liveConditio.d > 0){
          i = 2;
       }else {
          uoa = a.S8(a1);
          i = (uoa == null)? 3: 0;
       }
       a b = a1.b;
       a a2 = a1.a;
       if (PatchProxy.isSupport(u.class)) {
          uoa1 = a2;
          if (PatchProxy.applyVoidThreeRefs(b, Integer.valueOf(a2), Integer.valueOf(i), null, u.class, "23")) {
          label_007d :
             if (uoa != null) {
                uoa.a(liveConditio, l);
                if (uoa instanceof View) {
                   a uoa2 = uoa;
                   uoa2.setOnClickListener(new j(a, uoa, liveConditio, a1));
                   a.R8().V5(uoa2, liveConditio.d, 1, new f(a, uoa, liveConditio));
                   uoa.c();
                }else {
                   c uoc = new c(liveConditio.x.a(), LiveRedPacketStage.RED_PACKET_COUNTDOWN, LiveRedPacketAction.RED_PACK_PENDANT_SHOW_FAIL, liveConditio.c, RedPacketType.RED_PACKET_TYPE_CONDITION, -1, -1, FirstReportType.DEFAULT, ActionType.DEFAULT, ActionStatus.SUCCESS, "1.0");
                   c uoc1 = a.b(-1002);
                   uoc1.c("");
                   d.j(uoc1.e(a.a(liveConditio.b)));
                }
             }
             return;
          }
       }else {
          uoa1 = a2;
       }
       i3 oi3 = i3.f();
       oi3.d("redPackId", b);
       oi3.c("redPackType", Integer.valueOf(uoa1));
       oi3.c("status", Integer.valueOf(i));
       String str = oi3.e();
       u1.R("RED_PACK_CREATE_PENDANT", str, uob);
       goto label_007d ;
    }
}

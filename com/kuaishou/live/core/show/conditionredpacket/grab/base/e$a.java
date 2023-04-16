package com.kuaishou.live.core.show.conditionredpacket.grab.base.e$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.e;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketInfo;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u52.t;
import j62.a;
import z52.c;
import p91.m;
import gi2.d;
import nt5.a;
import com.kuaishou.live.core.show.conditionredpacket.logger.RedPacketType;
import h62.a;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketGrabButtonType;
import h62.d;

public class e$a extends m	// class@000a84
{
    public final LiveConditionRedPacketInfo c;
    public final e d;

    public void e$a(e p0,LiveConditionRedPacketInfo p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "1")) {
          return;
       }
       e$a td = this.d;
       td.p.b.d(td.q, td.n6());
       td = this.d;
       td.y2(this.c, td.u, td.p.i);
       td = this.c;
       d.g(this.c.x.a(), td.c, RedPacketType.RED_PACKET_TYPE_CONDITION, a.a(td.b), LiveRedPacketGrabButtonType.JOIN_BUTTON);
       return;
    }
}

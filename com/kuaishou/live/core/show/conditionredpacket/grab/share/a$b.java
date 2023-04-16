package com.kuaishou.live.core.show.conditionredpacket.grab.share.a$b;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.conditionredpacket.grab.share.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u52.t;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketInfo;
import j62.a;
import z52.c;
import p91.m;
import gi2.d;
import java.util.Objects;
import nt5.a;
import com.kuaishou.live.core.show.conditionredpacket.logger.RedPacketType;
import h62.a;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketGrabButtonType;
import h62.d;

public class a$b extends m	// class@000aa3
{
    public final a c;

    public void a$b(a p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
          return;
       }
       a$b tc = this.c;
       tc.q.b.d(tc.r, tc.n6());
       tc = this.c;
       a$b tc1 = this.c;
       tc.y2(tc.n6(), tc1.F, tc1.q.i);
       tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, a.class, "12")) {
          LiveConditionRedPacketInfo liveConditio = tc.n6();
          if (liveConditio != null) {
             d.g(liveConditio.x.a(), liveConditio.c, RedPacketType.RED_PACKET_TYPE_CONDITION, a.a(liveConditio.b), LiveRedPacketGrabButtonType.JOIN_BUTTON);
          }
       }
       return;
    }
}

package cn3.c;
import cn3.b;
import xw1.b;
import uw1.m;
import om3.a;
import eo3.s;
import nm3.c;
import eo3.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import eo3.w;
import eo3.f;
import com.kuaishou.live.redpacket.core.condition.data.RedPacketConditionRedPackInfoWrapper;

public class c extends b	// class@0005a2
{

    public void c(b p0,m p1,a p2,s p3,c p4){
       super(p0, p1, p2, p3, p4);
    }
    public void l(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       super.l(p0);
       RedPacketConditionRedPackInfoWrapper redPacketCon = p0.getContext().c();
       if (redPacketCon != null) {
          redPacketCon.r(this.a.L0());
       }
       return;
    }
}

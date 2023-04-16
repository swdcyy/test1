package cn3.e;
import ft5.e;
import eo3.g;
import java.lang.Object;
import java.lang.String;
import eo3.w;
import eo3.f;
import com.kuaishou.live.redpacket.core.condition.data.RedPacketConditionRedPackInfoWrapper;
import com.kuaishou.live.redpacket.core.condition.item.lottery.password.b;
import cn3.d;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import wkd.b;
import i62.a;
import eo3.b0;

public final class e implements e	// class@0005a4
{
    public final g a;

    public void e(g p0){
       this.a = p0;
    }
    public final void a(String p0){
       e ta = this.a;
       String str = k0.b(ta.getContext().c(), b.a, d.a).or("");
       if (!str.isEmpty() && p0.equals(str)) {
          RedPacketConditionRedPackInfoWrapper redPacketCon = ta.getContext().c();
          if (redPacketCon != null) {
             redPacketCon.s();
          }
          b.a(0x4c63d520).a(ta.getContext().h().a());
       }
       return;
    }
}

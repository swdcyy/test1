package b62.y;
import erd.g;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.j;
import java.lang.Object;
import com.kuaishou.live.core.show.conditionredpacket.model.LiveConditionRedPacketLotteryResultResponse$LiveConditionRedPacketLotteryResult;
import java.util.Collection;
import ekd.q;

public final class y implements g	// class@00035b
{
    public final j b;

    public void y(j p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       y tb = this.b;
       tb.S8();
       if (p0 != null && p0.mIsInValidData == null) {
          tb.O = p0;
          if (!q.f(p0.mLuckyUsers)) {
             tb.W8();
          }else {
             tb.V8();
          }
       }
       return;
    }
}

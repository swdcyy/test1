package b62.g;
import erd.g;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.e;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketInfo;
import java.lang.Object;
import android.os.Message;

public final class g implements g	// class@00033d
{
    public final e b;
    public final LiveConditionRedPacketInfo c;

    public void g(e p0,LiveConditionRedPacketInfo p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       g tb = this.b;
       g tc = this.c;
       tb.S8(tc, p0);
       tb.W8(tc, p0);
       tb.X8(tc);
       tb.Y8(tc, p0);
    }
}

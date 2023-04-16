package e62.f;
import erd.g;
import com.kuaishou.live.core.show.conditionredpacket.grab.normal.b;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketInfo;
import java.lang.Object;
import android.os.Message;
import p91.m;

public final class f implements g	// class@002638
{
    public final b b;
    public final LiveConditionRedPacketInfo c;

    public void f(b p0,LiveConditionRedPacketInfo p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       f tb = this.b;
       f tc = this.c;
       tb.W8(tc, p0);
       tb.S8((tc.d - tb.t.s()));
    }
}

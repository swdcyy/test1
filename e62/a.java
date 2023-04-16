package e62.a;
import androidx.lifecycle.Observer;
import com.kuaishou.live.core.show.conditionredpacket.grab.normal.b;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketInfo;
import java.lang.Object;

public final class a implements Observer	// class@002633
{
    public final b b;
    public final LiveConditionRedPacketInfo c;

    public void a(b p0,LiveConditionRedPacketInfo p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onChanged(Object p0){
       this.b.Y8(this.c);
    }
}

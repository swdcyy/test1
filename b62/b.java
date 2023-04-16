package b62.b;
import androidx.lifecycle.Observer;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.e;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketInfo;
import java.lang.Object;
import android.os.Message;

public final class b implements Observer	// class@000333
{
    public final e b;
    public final LiveConditionRedPacketInfo c;

    public void b(e p0,LiveConditionRedPacketInfo p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onChanged(Object p0){
       this.b.Y8(this.c, null);
    }
}

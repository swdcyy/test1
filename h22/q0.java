package h22.q0;
import erd.g;
import com.kuaishou.live.core.show.activityredpacket.a0;
import java.lang.Object;
import com.kuaishou.live.core.show.activityredpacket.model.LiveActivityRedPacketTopLuckyResponse;
import o22.b;
import androidx.lifecycle.MutableLiveData;

public final class q0 implements g	// class@002c09
{
    public final a0 b;

    public void q0(a0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       q0 tb = this.b;
       tb.S.e.setValue(p0);
       tb.S8(p0);
    }
}

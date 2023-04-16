package h22.e0;
import erd.g;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketPresenter;
import java.lang.String;
import java.lang.Object;
import java.lang.Long;
import java.util.Objects;
import java.lang.StringBuilder;
import java.util.List;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketService$RemoveRedPacketActionSource;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketService;
import java.util.Map;

public final class e0 implements g	// class@002bf2
{
    public final LiveActivityRedPacketPresenter b;
    public final String c;
    public final int d;

    public void e0(LiveActivityRedPacketPresenter p0,String p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       e0 tb = this.b;
       e0 tc = this.c;
       e0 td = this.d;
       Objects.requireNonNull(tb);
       b.P(LiveActivityRedPacketPresenter.I, "timeout, onRedPacketExpired, remove pendantView RedPacketId = "+tc+" bizType = "+td);
       tb.D.d(td, tc, LiveActivityRedPacketService$RemoveRedPacketActionSource.TIMER_OUT_DATE);
       tb.w.remove(tc);
    }
}

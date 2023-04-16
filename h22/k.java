package h22.k;
import erd.g;
import uj2.a;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import com.kuaishou.live.core.show.activityredpacket.k;
import java.lang.String;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class k implements g	// class@002bfe
{
    public final a b;

    public void k(a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b.Z(LiveLogTag.LIVE_ACTIVITY_RED_PACKET, k.O+": shareGrab request onError throw="+p0+" redPacketId:"+this.b.a);
    }
}

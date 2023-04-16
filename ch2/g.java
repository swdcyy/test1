package ch2.g;
import xw1.a;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.live.core.show.redpacket.krn.j;
import java.lang.StringBuilder;
import java.util.List;
import com.kuaishou.android.live.log.b;

public final class g implements a	// class@000538
{
    public final String a;

    public void g(String p0){
       this.a = p0;
    }
    public final void onShow(){
       b.P(j.A, "updateRedPacketPendant-show redPacketId = "+this.a);
    }
}

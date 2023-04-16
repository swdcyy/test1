package ch2.i;
import erd.g;
import com.kuaishou.live.core.show.redpacket.krn.l;
import java.lang.String;
import java.lang.Object;
import java.lang.Long;
import java.util.Objects;
import java.lang.StringBuilder;
import java.util.List;
import com.kuaishou.android.live.log.b;
import java.util.Map;

public final class i implements g	// class@00053a
{
    public final l b;
    public final String c;

    public void i(l p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       i tb = this.b;
       i tc = this.c;
       Objects.requireNonNull(tb);
       b.P(l.v, "onRedPacketExpired removePendant RedPacketId"+tc);
       tb.P8(tc);
       tb.q.remove(tc);
    }
}

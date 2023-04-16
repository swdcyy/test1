package ba1.b;
import java.lang.Runnable;
import ba1.d;
import com.google.protobuf.nano.MessageNano;
import java.util.List;
import java.lang.Object;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import java.util.Iterator;
import lf3.i;
import lf3.g;

public final class b implements Runnable	// class@000327
{
    public final d b;
    public final MessageNano c;
    public final List d;

    public void b(d p0,MessageNano p1,List p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       b tc = this.c;
       b td = this.d;
       if (this.b.b == null) {
       }else {
          b.c0(LiveLogTag.LIVE_SOCKET, "dispatch klink message", "messageNano", tc);
          Iterator iterator = td.iterator();
          while (iterator.hasNext()) {
             i oi = iterator.next();
             if (oi.d != null) {
                oi.c.H4(tc);
             }
          }
       }
       return;
    }
}

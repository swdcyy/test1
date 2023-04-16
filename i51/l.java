package i51.l;
import lf3.k;
import i51.o;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCEnterRoomAck;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.longconnection.connector.l$c;
import hf3.a;
import java.lang.System;
import i51.p;
import java.lang.Long;
import i51.g;
import k2b.u1;
import lf3.j;

public final class l implements k	// class@00282d
{
    public final o b;

    public void l(o p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       l tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, o.class, "3")) {
       }else {
          l$c uoc = tb.a.j();
          o b = tb.b;
          long l = 0;
          int i = (uoc == null)? l: uoc.a();
          int i1 = (uoc == null)? l: String.valueOf(uoc.b());
          long l1 = System.currentTimeMillis() - tb.e;
          if (!PatchProxy.isSupport(p.class) || !PatchProxy.applyVoidFourRefs(b, i, i1, Long.valueOf(l1), null, p.class, "7")) {
             u1.R("LS_LIVE_LONG_CONNECTION_ENTERROOM", p.a(b, null, i, i1, null, l1, 7, 17), 3);
          }
       }
       return;
    }
    public boolean V(){
       return j.a(this);
    }
}

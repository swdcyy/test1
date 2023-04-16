package bp6.g1;
import java.util.concurrent.Callable;
import com.kwai.imsdk.internal.v;
import com.kwai.imsdk.d;
import java.lang.Object;
import java.util.Objects;
import java.lang.String;
import com.kwai.imsdk.internal.client.i;
import rh0.c$d;
import qo6.a;
import rp6.w;
import rh0.c$n1;
import com.kwai.chat.sdk.signal.KwaiSignalDispatcher;
import com.kwai.chat.sdk.signal.f;
import com.google.protobuf.nano.MessageNano;
import com.kwai.chat.kwailink.data.PacketData;
import rh0.c$o1;
import java.lang.Throwable;
import l85.b;
import rh0.c$c;
import hp6.i;
import java.lang.StringBuilder;
import java.lang.Boolean;

public final class g1 implements Callable	// class@00051e
{
    public final v b;
    public final d c;
    public final boolean d;

    public void g1(v p0,d p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object call(){
       c$o1 oo11;
       g1 tb = this.b;
       g1 tc = this.c;
       g1 td = this.d;
       Objects.requireNonNull(tb);
       String tar = tc.getTarget();
       i oi = i.t(tb.a);
       Objects.requireNonNull(oi);
       c$d uod = new c$d();
       uod.a = tar;
       uod.b = tc.getTargetType();
       w ow = w.e(oi.a);
       Objects.requireNonNull(ow);
       c$n1 on1 = new c$n1();
       on1.a = uod;
       on1.b = td;
       PacketData packetData = f.d(ow.a).sendSync("Session.StickyOnTop", MessageNano.toByteArray(on1));
       c$o1 oo1 = null;
       if (packetData != null && !packetData.c()) {
          td = 0;
          try{
             oo11 = MessageNano.mergeFrom(new c$o1(), packetData.b());
          }catch(com.google.protobuf.nano.InvalidProtocolBufferNanoException e1){
             b.g(e1);
          }
          oo1 = true;
          if (oo11 != null) {
             c$o1 a = oo11.a;
             if (a != null) {
                ow.j(a, oo1);
             }
          }
       }else if(packetData != null && packetData.c() == 0x14c08){
          i oi1 = new i();
          if (td != null) {
             oi1.f(50);
          }else {
             oi1.f(oo1);
          }
          ow.l(oi1, uod);
       }else {
          b.c("SessionStickyOnTopResponse "+packetData.c()+packetData.e());
       }
       return Boolean.valueOf(oo1);
    }
}

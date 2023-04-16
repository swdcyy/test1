package bp6.k1;
import java.util.concurrent.Callable;
import com.kwai.imsdk.internal.v;
import java.lang.String;
import java.lang.Object;
import com.kwai.imsdk.internal.client.i;
import java.util.Objects;
import rh0.c$c1;
import rh0.c$d;
import qo6.a;
import com.kwai.chat.sdk.signal.KwaiSignalDispatcher;
import com.kwai.chat.sdk.signal.f;
import com.google.protobuf.nano.MessageNano;
import com.kwai.chat.kwailink.data.PacketData;
import cp6.a0;
import hp6.b;

public final class k1 implements Callable	// class@000531
{
    public final v b;
    public final String c;
    public final int d;
    public final boolean e;

    public void k1(v p0,String p1,int p2,boolean p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final Object call(){
       PacketData packetData;
       b uob;
       k1 tc = this.c;
       k1 td = this.d;
       k1 te = this.e;
       i oi = i.t(this.b.a);
       Objects.requireNonNull(oi);
       c$c1 uoc1 = new c$c1();
       c$d uod = (td != null && (td == 4 || td == 5))? 1: null;
       if (uod) {
          uod = new c$d();
          uoc1.a = uod;
          uod.b = td;
          uod.a = tc;
          packetData = f.d(oi.a).sendSync("Message.SessionClean", MessageNano.toByteArray(uoc1));
       }else {
          packetData = new PacketData();
          packetData.x(1004);
          packetData.z("targetType not support");
       }
       if (packetData != null && !packetData.c()) {
          a0.i(oi.a).c(tc, td, te, true);
          uob = new b(0, packetData);
       }else {
          uob = new b(1001, packetData);
       }
       return uob;
    }
}

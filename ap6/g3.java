package ap6.g3;
import java.util.concurrent.Callable;
import com.kwai.imsdk.group.g;
import java.lang.String;
import java.lang.Object;
import dp6.b;
import java.util.Objects;
import lh0.a$i1;
import lh0.a$b1;
import qo6.a;
import com.kwai.chat.sdk.signal.KwaiSignalDispatcher;
import com.kwai.chat.sdk.signal.f;
import com.google.protobuf.nano.MessageNano;
import com.kwai.chat.kwailink.data.PacketData;
import java.lang.Exception;
import lh0.a$j1;
import java.lang.Class;
import hp6.b;

public final class g3 implements Callable	// class@000334
{
    public final g b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public void g3(g p0,String p1,String p2,boolean p3,boolean p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final Object call(){
       PacketData packetData;
       g3 tc = this.c;
       g3 td = this.d;
       g3 te = this.e;
       g3 tf = this.f;
       b uob = b.i(this.b.c);
       try{
          Objects.requireNonNull(uob);
          a$i1 oi1 = new a$i1();
          oi1.c = tc;
          a$b1 uob1 = new a$b1();
          uob1.a = td;
          uob1.b = te;
          uob1.c = tf;
          oi1.a = 3;
          oi1.b = uob1;
          packetData = f.d(uob.a).sendSync("Group.Setting", MessageNano.toByteArray(oi1), 0x2710);
       }catch(java.lang.Exception e1){
          packetData = packetData.g(e1);
       }
       return a.h(packetData, a$j1.class);
    }
}

package ap6.d3;
import java.util.concurrent.Callable;
import com.kwai.imsdk.group.g;
import java.lang.String;
import java.lang.Object;
import dp6.b;
import java.util.Objects;
import lh0.a$i1;
import lh0.a$h1;
import qo6.a;
import com.kwai.chat.sdk.signal.KwaiSignalDispatcher;
import com.kwai.chat.sdk.signal.f;
import com.google.protobuf.nano.MessageNano;
import com.kwai.chat.kwailink.data.PacketData;
import java.lang.Exception;
import lh0.a$j1;
import java.lang.Class;
import hp6.b;

public final class d3 implements Callable	// class@000325
{
    public final g b;
    public final String c;
    public final String d;

    public void d3(g p0,String p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object call(){
       PacketData packetData;
       d3 tc = this.c;
       d3 td = this.d;
       b uob = b.i(this.b.c);
       try{
          Objects.requireNonNull(uob);
          a$i1 oi1 = new a$i1();
          oi1.c = tc;
          a$h1 oh1 = new a$h1();
          oh1.a = td;
          oi1.a = 2;
          oi1.b = oh1;
          packetData = f.d(uob.a).sendSync("Group.Setting", MessageNano.toByteArray(oi1), 0x2710);
       }catch(java.lang.Exception e1){
          packetData = packetData.g(e1);
       }
       return a.h(packetData, a$j1.class);
    }
}

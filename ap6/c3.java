package ap6.c3;
import java.util.concurrent.Callable;
import com.kwai.imsdk.group.g;
import java.lang.String;
import java.lang.Object;
import dp6.b;
import java.util.Objects;
import lh0.a$i1;
import lh0.a$d1;
import qo6.a;
import com.kwai.chat.sdk.signal.KwaiSignalDispatcher;
import com.kwai.chat.sdk.signal.f;
import com.google.protobuf.nano.MessageNano;
import com.kwai.chat.kwailink.data.PacketData;
import java.lang.Exception;
import lh0.a$j1;
import java.lang.Class;
import hp6.b;

public final class c3 implements Callable	// class@000320
{
    public final g b;
    public final String c;
    public final int d;

    public void c3(g p0,String p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object call(){
       PacketData packetData;
       c3 tc = this.c;
       c3 td = this.d;
       b uob = b.i(this.b.c);
       try{
          Objects.requireNonNull(uob);
          a$i1 oi1 = new a$i1();
          oi1.c = tc;
          a$d1 uod1 = new a$d1();
          uod1.a = td;
          oi1.a = 4;
          oi1.b = uod1;
          packetData = f.d(uob.a).sendSync("Group.Setting", MessageNano.toByteArray(oi1), 0x2710);
       }catch(java.lang.Exception e1){
          packetData = packetData.g(e1);
       }
       return a.h(packetData, a$j1.class);
    }
}

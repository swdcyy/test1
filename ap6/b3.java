package ap6.b3;
import java.util.concurrent.Callable;
import com.kwai.imsdk.group.g;
import java.lang.String;
import java.lang.Object;
import dp6.b;
import java.util.Objects;
import lh0.a$e;
import qo6.a;
import com.kwai.chat.sdk.signal.KwaiSignalDispatcher;
import com.kwai.chat.sdk.signal.f;
import com.google.protobuf.nano.MessageNano;
import com.kwai.chat.kwailink.data.PacketData;
import java.lang.Exception;
import lh0.a$f;
import java.lang.Class;
import hp6.b;

public final class b3 implements Callable	// class@00031b
{
    public final g b;
    public final String c;

    public void b3(g p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object call(){
       PacketData packetData;
       b3 tc = this.c;
       b uob = b.i(this.b.c);
       try{
          Objects.requireNonNull(uob);
          a$e uoe = new a$e();
          uoe.a = tc;
          packetData = f.d(uob.a).sendSync("Group.Delete", MessageNano.toByteArray(uoe), 0x2710);
       }catch(java.lang.Exception e1){
          packetData = packetData.g(e1);
       }
       return a.h(packetData, a$f.class);
    }
}

package ap6.w1;
import java.util.concurrent.Callable;
import com.kwai.imsdk.group.b;
import java.lang.String;
import java.lang.Object;
import dp6.b;
import java.util.Objects;
import lh0.a$w;
import qo6.a;
import com.kwai.chat.sdk.signal.KwaiSignalDispatcher;
import com.kwai.chat.sdk.signal.f;
import com.google.protobuf.nano.MessageNano;
import com.kwai.chat.kwailink.data.PacketData;
import java.lang.Exception;
import lh0.a$x;
import java.lang.Class;
import hp6.b;

public final class w1 implements Callable	// class@00037f
{
    public final b b;
    public final String c;
    public final long d;
    public final int e;

    public void w1(b p0,String p1,long p2,int p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final Object call(){
       PacketData packetData;
       w1 tc = this.c;
       w1 td = this.d;
       w1 te = this.e;
       b uob = b.i(this.b.b);
       try{
          Objects.requireNonNull(uob);
          a$w ow = new a$w();
          ow.b = tc;
          ow.c = te;
          ow.a = td;
          packetData = f.d(uob.a).sendSync("Group.JoinRequestAck", MessageNano.toByteArray(ow), 0x2710);
       }catch(java.lang.Exception e1){
          packetData = packetData.g(e1);
       }
       return a.h(packetData, a$x.class);
    }
}

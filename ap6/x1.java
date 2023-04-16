package ap6.x1;
import java.util.concurrent.Callable;
import com.kwai.imsdk.group.b;
import java.lang.String;
import java.lang.Object;
import dp6.b;
import java.util.Objects;
import lh0.a$w;
import ca7.u;
import qo6.a;
import com.kwai.chat.sdk.signal.KwaiSignalDispatcher;
import com.kwai.chat.sdk.signal.f;
import com.google.protobuf.nano.MessageNano;
import com.kwai.chat.kwailink.data.PacketData;
import java.lang.Exception;
import lh0.a$x;
import java.lang.Class;
import hp6.b;

public final class x1 implements Callable	// class@000383
{
    public final b b;
    public final String c;
    public final long d;
    public final int e;
    public final String f;
    public final boolean g;

    public void x1(b p0,String p1,long p2,int p3,String p4,boolean p5){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
    }
    public final Object call(){
       PacketData packetData;
       x1 tc = this.c;
       x1 td = this.d;
       x1 te = this.e;
       x1 tf = this.f;
       x1 tg = this.g;
       b uob = b.i(this.b.b);
       try{
          Objects.requireNonNull(uob);
          a$w ow = new a$w();
          ow.b = tc;
          ow.c = te;
          ow.a = td;
          ow.d = u.a(tf);
          ow.e = tg;
          packetData = f.d(uob.a).sendSync("Group.JoinRequestAck", MessageNano.toByteArray(ow), 0x2710);
       }catch(java.lang.Exception e1){
          packetData = packetData.g(e1);
       }
       return a.h(packetData, a$x.class);
    }
}

package ap6.v1;
import java.util.concurrent.Callable;
import com.kwai.imsdk.group.b;
import java.lang.String;
import java.lang.Object;
import dp6.b;
import java.util.Objects;
import java.lang.CharSequence;
import ca7.u;
import com.kwai.chat.kwailink.data.PacketData;
import lh0.a$a0;
import qo6.a;
import com.kwai.chat.sdk.signal.KwaiSignalDispatcher;
import com.kwai.chat.sdk.signal.f;
import com.google.protobuf.nano.MessageNano;
import java.lang.Exception;
import lh0.a$b0;
import java.lang.Class;
import hp6.b;

public final class v1 implements Callable	// class@00037b
{
    public final b b;
    public final String c;
    public final long d;

    public void v1(b p0,String p1,long p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object call(){
       PacketData packetData;
       v1 tc = this.c;
       v1 td = this.d;
       b uob = b.i(this.b.b);
       try{
          Objects.requireNonNull(uob);
          if (u.c(tc)) {
             packetData = new PacketData();
             packetData.x(1004);
             packetData.z("group id is empty");
          }else {
             a$a0 uoa0 = new a$a0();
             uoa0.b = tc;
             uoa0.a = td;
             packetData = f.d(uob.a).sendSync("Group.JoinRequestGet", MessageNano.toByteArray(uoa0), 0x2710);
          }
       }catch(java.lang.Exception e1){
          packetData = uob.g(e1);
       }
       return a.h(packetData, a$b0.class);
    }
}

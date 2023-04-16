package ap6.y1;
import java.util.concurrent.Callable;
import com.kwai.imsdk.group.b;
import java.lang.String;
import java.lang.Object;
import dp6.b;
import java.util.Objects;
import lh0.a$m0;
import lh0.a$x1;
import qo6.a;
import com.kwai.chat.sdk.signal.KwaiSignalDispatcher;
import com.kwai.chat.sdk.signal.f;
import com.google.protobuf.nano.MessageNano;
import com.kwai.chat.kwailink.data.PacketData;
import java.lang.Exception;
import lh0.a$n0;
import java.lang.Class;
import hp6.b;

public final class y1 implements Callable	// class@000387
{
    public final b b;
    public final String c;
    public final String d;

    public void y1(b p0,String p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object call(){
       PacketData packetData;
       y1 tc = this.c;
       y1 td = this.d;
       b uob = b.i(this.b.b);
       try{
          Objects.requireNonNull(uob);
          a$m0 om0 = new a$m0();
          om0.c = tc;
          a$x1 ox1 = new a$x1();
          ox1.a = td;
          om0.a = 2;
          om0.b = ox1;
          packetData = f.d(uob.a).sendSync("Group.MemberSetting", MessageNano.toByteArray(om0), 0x2710);
       }catch(java.lang.Exception e1){
          packetData = packetData.g(e1);
       }
       return a.h(packetData, a$n0.class);
    }
}

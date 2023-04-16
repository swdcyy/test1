package ap6.r1;
import java.util.concurrent.Callable;
import com.kwai.imsdk.group.b;
import java.lang.String;
import java.lang.Object;
import dp6.b;
import java.util.Objects;
import lh0.a$m0;
import lh0.a$w1;
import qo6.a;
import com.kwai.chat.sdk.signal.KwaiSignalDispatcher;
import com.kwai.chat.sdk.signal.f;
import com.google.protobuf.nano.MessageNano;
import com.kwai.chat.kwailink.data.PacketData;
import java.lang.Exception;
import lh0.a$n0;
import java.lang.Class;
import hp6.b;

public final class r1 implements Callable	// class@000369
{
    public final b b;
    public final String c;
    public final int d;

    public void r1(b p0,String p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object call(){
       boolean b;
       PacketData packetData;
       r1 tc = this.c;
       b uob = b.i(this.b.b);
       b = (this.d == 2)? true: false;
       try{
          Objects.requireNonNull(uob);
          a$m0 om0 = new a$m0();
          om0.c = tc;
          a$w1 ow1 = new a$w1();
          ow1.a = b;
          om0.a = 3;
          om0.b = ow1;
          packetData = f.d(uob.a).sendSync("Group.MemberSetting", MessageNano.toByteArray(om0), 0x2710);
       }catch(java.lang.Exception e1){
          packetData = packetData.g(e1);
       }
       return a.h(packetData, a$n0.class);
    }
}

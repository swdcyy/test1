package ap6.b2;
import java.util.concurrent.Callable;
import com.kwai.imsdk.group.b;
import java.lang.String;
import java.lang.Object;
import dp6.b;
import java.util.Objects;
import lh0.a$i0;
import rh0.a$c;
import java.lang.Long;
import com.kwai.chat.sdk.signal.f;
import com.kwai.chat.sdk.signal.IMClientAppInfo;
import com.kwai.chat.kwailink.data.ClientAppInfo;
import qo6.a;
import com.kwai.chat.sdk.signal.KwaiSignalDispatcher;
import com.google.protobuf.nano.MessageNano;
import com.kwai.chat.kwailink.data.PacketData;
import java.lang.Exception;
import lh0.a$j0;
import java.lang.Class;
import hp6.b;

public final class b2 implements Callable	// class@00031a
{
    public final b b;
    public final String c;
    public final String d;

    public void b2(b p0,String p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object call(){
       PacketData packetData;
       b2 tc = this.c;
       b2 td = this.d;
       b uob = b.i(this.b.b);
       try{
          Objects.requireNonNull(uob);
          a$i0 oi0 = new a$i0();
          oi0.a = tc;
          a$c uoc = new a$c();
          uoc.b = Long.valueOf(td).longValue();
          uoc.a = f.e().b().a();
          oi0.b = uoc;
          packetData = f.d(uob.a).sendSync("Group.MemberGet", MessageNano.toByteArray(oi0), 0x2710);
       }catch(java.lang.Exception e1){
          packetData = packetData.g(e1);
       }
       return a.h(packetData, a$j0.class);
    }
}

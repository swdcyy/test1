package ap6.p1;
import java.util.concurrent.Callable;
import com.kwai.imsdk.group.b;
import java.lang.String;
import java.lang.Object;
import dp6.b;
import java.util.Objects;
import lh0.a$x0;
import qo6.a;
import com.kwai.chat.sdk.signal.KwaiSignalDispatcher;
import com.kwai.chat.sdk.signal.f;
import com.google.protobuf.nano.MessageNano;
import com.kwai.chat.kwailink.data.PacketData;
import java.lang.Exception;
import lh0.a$y0;
import java.lang.Class;
import hp6.b;

public final class p1 implements Callable	// class@00035f
{
    public final b b;
    public final String c;

    public void p1(b p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object call(){
       PacketData packetData;
       p1 tc = this.c;
       b uob = b.i(this.b.b);
       try{
          Objects.requireNonNull(uob);
          a$x0 ox0 = new a$x0();
          ox0.a = tc;
          packetData = f.d(uob.a).sendSync("Group.Quit", MessageNano.toByteArray(ox0), 0x2710);
       }catch(java.lang.Exception e1){
          packetData = packetData.g(e1);
       }
       return a.h(packetData, a$y0.class);
    }
}

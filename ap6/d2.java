package ap6.d2;
import java.util.concurrent.Callable;
import com.kwai.imsdk.group.b;
import java.lang.String;
import java.lang.Object;
import dp6.b;
import java.util.Objects;
import java.lang.CharSequence;
import ca7.u;
import com.kwai.chat.kwailink.data.PacketData;
import lh0.a$t;
import qo6.a;
import com.kwai.chat.sdk.signal.KwaiSignalDispatcher;
import com.kwai.chat.sdk.signal.f;
import com.google.protobuf.nano.MessageNano;
import java.lang.Exception;
import lh0.a$u;
import java.lang.Class;
import hp6.b;

public final class d2 implements Callable	// class@000324
{
    public final b b;
    public final String c;
    public final String d;
    public final int e;

    public void d2(b p0,String p1,String p2,int p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final Object call(){
       PacketData packetData;
       d2 tc = this.c;
       d2 td = this.d;
       d2 te = this.e;
       b uob = b.i(this.b.b);
       try{
          Objects.requireNonNull(uob);
          if (u.c(tc)) {
             packetData = new PacketData();
             packetData.x(1004);
             packetData.z("group id is empty");
          }else {
             a$t ot = new a$t();
             ot.a = tc;
             if (!u.c(td)) {
                ot.b = td;
             }
             ot.c = te;
             packetData = f.d(uob.a).sendSync("Group.JoinRequestList", MessageNano.toByteArray(ot), 0x2710);
          }
       }catch(java.lang.Exception e1){
          packetData = uob.g(e1);
       }
       return a.h(packetData, a$u.class);
    }
}

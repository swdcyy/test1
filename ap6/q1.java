package ap6.q1;
import java.util.concurrent.Callable;
import com.kwai.imsdk.group.b;
import java.lang.String;
import java.lang.Object;
import dp6.b;
import java.util.Objects;
import hp6.b;
import lh0.a$o;
import qo6.a;
import com.kwai.chat.sdk.signal.KwaiSignalDispatcher;
import com.kwai.chat.sdk.signal.f;
import com.google.protobuf.nano.MessageNano;
import com.kwai.chat.kwailink.data.PacketData;
import java.lang.Exception;
import lh0.a$p;
import java.lang.Class;

public final class q1 implements Callable	// class@000364
{
    public final b b;
    public final String c;
    public final int d;

    public void q1(b p0,String p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object call(){
       PacketData packetData;
       q1 tc = this.c;
       q1 td = this.d;
       b uob = b.i(this.b.b);
       Objects.requireNonNull(uob);
       if (td <= null) {
          uob = new b(1004);
          uob.e("count is illegal");
       }else {
          try{
             a$o oo = new a$o();
             oo.a = tc;
             oo.b = td;
             packetData = f.d(uob.a).sendSync("Group.InviteReqList", MessageNano.toByteArray(oo));
          }catch(java.lang.Exception e1){
             packetData = packetData.g(e1);
          }
          uob = a.h(packetData, a$p.class);
       }
       return uob;
    }
}

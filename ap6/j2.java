package ap6.j2;
import java.util.concurrent.Callable;
import com.kwai.imsdk.group.b;
import java.lang.String;
import java.lang.Object;
import dp6.b;
import java.util.Objects;
import java.lang.CharSequence;
import ca7.u;
import hp6.b;
import lh0.a$i1;
import lh0.a$k1;
import qo6.a;
import com.kwai.chat.sdk.signal.KwaiSignalDispatcher;
import com.kwai.chat.sdk.signal.f;
import com.google.protobuf.nano.MessageNano;
import com.kwai.chat.kwailink.data.PacketData;
import java.lang.Exception;
import lh0.a$j1;
import java.lang.Class;

public final class j2 implements Callable	// class@000342
{
    public final b b;
    public final String c;
    public final boolean d;

    public void j2(b p0,String p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object call(){
       PacketData packetData;
       j2 tc = this.c;
       j2 td = this.d;
       b uob = b.i(this.b.b);
       Objects.requireNonNull(uob);
       if (u.c(tc)) {
          uob = new b(1004);
          uob.e("group id is empty");
       }else {
          try{
             a$i1 oi1 = new a$i1();
             oi1.c = tc;
             a$k1 ok1 = new a$k1();
             ok1.a = td;
             oi1.a = 8;
             oi1.b = ok1;
             packetData = f.d(uob.a).sendSync("Group.Setting", MessageNano.toByteArray(oi1));
          }catch(java.lang.Exception e1){
             packetData = packetData.g(e1);
          }
          uob = a.h(packetData, a$j1.class);
       }
       return uob;
    }
}

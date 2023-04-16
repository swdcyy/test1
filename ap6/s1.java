package ap6.s1;
import java.util.concurrent.Callable;
import com.kwai.imsdk.group.b;
import java.lang.String;
import java.lang.Object;
import dp6.b;
import java.util.Objects;
import hp6.b;
import lh0.a$i1;
import java.lang.CharSequence;
import ca7.u;
import lh0.a$c1;
import qo6.a;
import com.kwai.chat.sdk.signal.KwaiSignalDispatcher;
import com.kwai.chat.sdk.signal.f;
import com.google.protobuf.nano.MessageNano;
import com.kwai.chat.kwailink.data.PacketData;
import java.lang.Exception;
import lh0.a$r;
import java.lang.Class;

public final class s1 implements Callable	// class@00036e
{
    public final b b;
    public final String c;
    public final int d;

    public void s1(b p0,String p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object call(){
       PacketData packetData;
       s1 tc = this.c;
       s1 td = this.d;
       b uob = b.i(this.b.b);
       Objects.requireNonNull(uob);
       String str = "groupId is empty";
       if (tc == null) {
          uob = new b(1004);
          uob.e(str);
       }else {
          try{
             a$i1 oi1 = new a$i1();
             if (!u.c(tc)) {
                oi1.c = tc;
                a$c1 uoc1 = new a$c1();
                uoc1.a = td;
                oi1.a = 5;
                oi1.b = uoc1;
                packetData = f.d(uob.a).sendSync("Group.Setting", MessageNano.toByteArray(oi1));
             }else {
                throw new Exception(str);
             }
          }catch(java.lang.Exception e1){
             packetData = uob.g(e1);
          }
          uob = a.h(packetData, a$r.class);
       }
       return uob;
    }
}

package ap6.e3;
import java.util.concurrent.Callable;
import com.kwai.imsdk.group.g;
import java.lang.String;
import java.lang.Object;
import dp6.b;
import java.util.Objects;
import lh0.a$v;
import java.lang.CharSequence;
import ca7.u;
import rh0.a$c;
import java.lang.Long;
import com.kwai.chat.sdk.signal.f;
import com.kwai.chat.sdk.signal.IMClientAppInfo;
import com.kwai.chat.kwailink.data.ClientAppInfo;
import java.lang.StringBuilder;
import java.lang.Exception;
import l85.b;
import com.kwai.chat.kwailink.data.PacketData;
import qo6.a;
import com.kwai.chat.sdk.signal.KwaiSignalDispatcher;
import com.google.protobuf.nano.MessageNano;
import lh0.a$c0;
import java.lang.Class;
import hp6.b;

public final class e3 implements Callable	// class@00032a
{
    public final g b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;

    public void e3(g p0,String p1,String p2,int p3,String p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final Object call(){
       PacketData packetData;
       e3 tc = this.c;
       e3 td = this.d;
       e3 te = this.e;
       e3 tf = this.f;
       b uob = b.i(this.b.c);
       try{
          Objects.requireNonNull(uob);
          a$v ov = new a$v();
          ov.a = tc;
          ov.d = te;
          if (!u.c(tf)) {
             ov.c = tf;
          }
          try{
             if (!u.c(td)) {
                try{
                   a$c uoc = new a$c();
                   uoc.b = Long.valueOf(td).longValue();
                   uoc.a = f.e().b().a();
                   ov.b = uoc;
                label_0068 :
                   packetData = f.d(uob.a).sendSync("Group.Join", MessageNano.toByteArray(ov), 0x2710);
                }catch(java.lang.Exception e1){
                   b.c("joinGroup inviter error="+e1.getMessage());
                   packetData = uob.g(e1);
                }
             }else {
                goto label_0068 ;
             }
          }catch(java.lang.Exception e1){
             packetData = uob.g(e1);
          }
          return a.h(packetData, a$c0.class);
       }catch(java.lang.Exception e1){
       }
    }
}

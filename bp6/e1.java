package bp6.e1;
import java.util.concurrent.Callable;
import com.kwai.imsdk.internal.v;
import com.kwai.imsdk.d;
import java.lang.String;
import java.lang.Object;
import so6.s;
import java.util.Objects;
import rh0.c$f1;
import rh0.c$l;
import rh0.c$d;
import ca7.u;
import qo6.a;
import com.kwai.chat.sdk.signal.KwaiSignalDispatcher;
import com.kwai.chat.sdk.signal.f;
import com.google.protobuf.nano.MessageNano;
import com.kwai.chat.kwailink.data.PacketData;
import rh0.c$g1;
import java.lang.Class;
import hp6.b;

public final class e1 implements Callable	// class@00050f
{
    public final v b;
    public final d c;
    public final String d;
    public final String e;

    public void e1(v p0,d p1,String p2,String p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final Object call(){
       e1 tc = this.c;
       s os = s.k(this.b.a);
       String tar = tc.getTarget();
       Objects.requireNonNull(os);
       c$f1 uof1 = new c$f1();
       c$l ol = new c$l();
       c$d uod = new c$d();
       uod.b = tc.getTargetType();
       uod.a = tar;
       ol.a = uod;
       ol.c = u.a(this.d);
       ol.b = u.a(this.e);
       uof1.a = 2;
       uof1.b = ol;
       return a.h(f.d(os.a).sendSync("Session.Event.Report", MessageNano.toByteArray(uof1)), c$g1.class);
    }
}

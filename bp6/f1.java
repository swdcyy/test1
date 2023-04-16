package bp6.f1;
import java.util.concurrent.Callable;
import com.kwai.imsdk.internal.v;
import com.kwai.imsdk.d;
import java.lang.String;
import java.lang.Object;
import so6.s;
import java.util.Objects;
import rh0.c$f1;
import rh0.c$j;
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

public final class f1 implements Callable	// class@000519
{
    public final v b;
    public final d c;
    public final String d;
    public final String e;
    public final String f;

    public void f1(v p0,d p1,String p2,String p3,String p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final Object call(){
       f1 tc = this.c;
       s os = s.k(this.b.a);
       String tar = tc.getTarget();
       Objects.requireNonNull(os);
       c$f1 uof1 = new c$f1();
       c$j oj = new c$j();
       c$d uod = new c$d();
       uod.b = tc.getTargetType();
       uod.a = tar;
       oj.a = uod;
       oj.b = u.a(this.d);
       oj.d = u.a(this.e);
       oj.c = u.a(this.f);
       uof1.a = 1;
       uof1.b = oj;
       return a.h(f.d(os.a).sendSync("Session.Event.Report", MessageNano.toByteArray(uof1)), c$g1.class);
    }
}

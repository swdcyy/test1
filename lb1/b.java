package lb1.b;
import qvb.f;
import java.lang.String;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import cb1.c;
import cb1.b;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import lb1.a;
import erd.g;

public class b extends f	// class@002eb3
{
    public final String p;

    public void b(String p0){
       super();
       this.p = p0;
    }
    public t I1(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.b().m(this.p).map(new e()).observeOn(d.c).doOnNext(new a(this)).observeOn(d.a);
    }
}

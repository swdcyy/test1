package d89.q;
import erd.o;
import retrofit2.a;
import java.lang.Object;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import d89.o;

public class q implements o	// class@00148f
{
    public final a b;

    public void q(a p0){
       super();
       this.b = p0;
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, q.class, "3");
       if (ot != PatchProxyResult.class) {
       }else {
          ot = p0.flatMap(new o(this));
       }
       return ot;
    }
}

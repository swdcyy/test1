package d76.g;
import h97.i;
import com.kwai.framework.initmodule.AzerothInitModule;
import x97.n;
import java.lang.Object;
import h97.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import e76.b;
import h97.h;
import h97.g;
import e76.c;

public class g implements i	// class@001479
{
    public final n a;
    public final AzerothInitModule b;

    public void g(AzerothInitModule p0,n p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public e a(){
       Object obj = PatchProxy.apply(null, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b();
    }
    public n b(){
       return this.a;
    }
    public long c(){
       return h.c(this);
    }
    public g getCommonParams(){
       Object obj = PatchProxy.apply(null, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c();
    }
}

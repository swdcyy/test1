package cr.g;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import cr.b;

public abstract class g	// class@001424
{

    public void g(){
       super();
    }
    public static g a(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(g.class)) {
          Object obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), null, g.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new b(p0, p1, p2, p3);
    }
    public abstract int b();
    public abstract int c();
    public abstract int d();
    public abstract int e();
}

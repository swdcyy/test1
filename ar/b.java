package ar.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import ar.a;

public abstract class b	// class@000281
{

    public void b(){
       super();
    }
    public static b c(int p0,int p1,int p2,long p3){
       Object obj;
       if (PatchProxy.isSupport(b.class)) {
          obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Long.valueOf(p3), null, b.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a uoa = new a(p0, p1, p2, p3);
       return obj;
    }
    public abstract int a();
    public abstract long b();
    public abstract int d();
    public abstract int e();
}

package eg1.j$a;
import iy2.d;
import eg1.j;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import xf1.f;
import java.lang.Number;
import yb6.d;

public class j$a implements d	// class@002152
{
    public final j a;

    public void j$a(j p0){
       this.a = p0;
       super();
    }
    public String a(long p0,long p1){
       j$a uoa = j$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return f.a(p0, p1);
    }
    public long b(){
       Object obj = PatchProxy.apply(null, this, j$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return d.a();
    }
}

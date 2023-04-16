package d73.c;
import iy2.d;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import xf1.f;
import java.lang.Number;
import yb6.d;

public final class c implements d	// class@002484
{

    public void c(){
       super();
    }
    public String a(long p0,long p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, uoc, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return f.a(p0, p1);
    }
    public long b(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return d.a();
    }
}

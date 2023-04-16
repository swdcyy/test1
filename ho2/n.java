package ho2.n;
import ho2.d;
import ho2.e;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import csd.b;
import qrd.l1;

public final class n extends d	// class@002df0
{

    public void n(){
       super();
    }
    public Object a(e p0,c p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, n.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = p0.c(this, p1);
       if (p0 == b.h()) {
          return p0;
       }
       return l1.a;
    }
}

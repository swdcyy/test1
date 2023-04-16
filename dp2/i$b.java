package dp2.i$b;
import erd.c;
import java.lang.Object;
import kotlin.Pair;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class i$b implements c	// class@002574
{
    public static final i$b a;

    static {
       i$b.a = new i$b();
    }
    public void i$b(){
       super();
    }
    public Object a(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, i$b.class, "1");
       if (obj != PatchProxyResult.class) {
          p0 = obj;
       }else {
          a.p(p0, "pair");
          a.p(p1, "<anonymous parameter 1>");
       }
       return p0;
    }
}

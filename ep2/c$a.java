package ep2.c$a;
import erd.c;
import java.lang.Object;
import kotlin.Pair;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class c$a implements c	// class@0027ac
{
    public static final c$a a;

    static {
       c$a.a = new c$a();
    }
    public void c$a(){
       super();
    }
    public Object a(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, c$a.class, "1");
       if (obj != PatchProxyResult.class) {
          p0 = obj;
       }else {
          a.p(p0, "pair");
          a.p(p1, "<anonymous parameter 1>");
       }
       return p0;
    }
}

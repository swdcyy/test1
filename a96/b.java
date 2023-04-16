package a96.b;
import java.lang.Object;
import java.util.concurrent.Executor;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import am8.a;
import am8.d;

public class b	// class@000044
{
    public static Executor a;

    public void b(){
       super();
    }
    public static Executor a(){
       Object obj = PatchProxy.apply(null, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (b.a == null) {
          b.a = d.b("krn-net", 1);
       }
       return b.a;
    }
}

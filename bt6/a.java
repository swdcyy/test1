package bt6.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import o56.a;
import o56.c;
import kotlin.jvm.internal.a;

public final class a	// class@0005ff
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final boolean a(){
       boolean b;
       c obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (a.q == 0x1869f) {
          obj = a.a();
          a.o(obj, "AppEnv.get\(\)");
          if (obj.c()) {
             b = true;
          label_002d :
             return b;
          }
       }
       b = false;
       goto label_002d ;
    }
}

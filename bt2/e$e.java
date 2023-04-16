package bt2.e$e;
import erd.o;
import java.lang.Object;
import at2.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import at2.c$b;
import kotlin.jvm.internal.a;

public final class e$e implements o	// class@00044b
{
    public static final e$e b;

    static {
       e$e.b = new e$e();
    }
    public void e$e(){
       super();
    }
    public Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e$e.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          obj = p0;
       }
       return obj;
    }
}

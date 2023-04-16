package bt2.e$g;
import erd.o;
import java.lang.Object;
import at2.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import at2.c$c;
import kotlin.jvm.internal.a;

public final class e$g implements o	// class@00044d
{
    public static final e$g b;

    static {
       e$g.b = new e$g();
    }
    public void e$g(){
       super();
    }
    public Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e$g.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          obj = p0;
       }
       return obj;
    }
}

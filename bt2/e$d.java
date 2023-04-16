package bt2.e$d;
import erd.r;
import java.lang.Object;
import at2.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import at2.c$b;

public final class e$d implements r	// class@00044a
{
    public static final e$d b;

    static {
       e$d.b = new e$d();
    }
    public void e$d(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, e$d.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          b = p0 instanceof c$b;
       }
       return b;
    }
}

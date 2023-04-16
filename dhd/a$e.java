package dhd.a$e;
import erd.g;
import java.lang.Object;
import x56.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import v56.g;
import java.util.Map;

public final class a$e implements g	// class@000cc8
{
    public static final a$e b;

    static {
       a$e.b = new a$e();
    }
    public void a$e(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$e.class, "1")) {
       }else {
          a.o(p0, "cleanData");
          g.f(p0.f());
          g.e(p0.c());
          g.h(p0.e());
       }
       return;
    }
}

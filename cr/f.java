package cr.f;
import java.lang.Object;
import cr.f$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import cr.a$b;

public abstract class f	// class@001423
{

    public void f(){
       super();
    }
    public static f$a a(){
       Object obj = PatchProxy.apply(null, null, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a$b();
    }
    public abstract String b();
    public abstract int c();
    public abstract f$a d();
}

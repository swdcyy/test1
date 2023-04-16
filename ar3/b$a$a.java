package ar3.b$a$a;
import erd.o;
import java.lang.Object;
import retrofit2.p;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import br3.a;
import kotlin.jvm.internal.a;

public final class b$a$a implements o	// class@0002b0
{
    public static final b$a$a b;

    static {
       b$a$a.b = new b$a$a();
    }
    public void b$a$a(){
       super();
    }
    public Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b$a$a.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          obj = p0.a();
       }
       return obj;
    }
}

package ar3.c;
import erd.o;
import java.lang.Object;
import retrofit2.p;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import br3.b;
import kotlin.jvm.internal.a;

public final class c implements o	// class@0002b3
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          obj = p0.a();
       }
       return obj;
    }
}

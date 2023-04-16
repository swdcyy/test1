package ajc.o$e;
import erd.o;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.social.kwaitoken.model.TokenModel;
import kotlin.jvm.internal.a;

public final class o$e implements o	// class@000147
{
    public static final o$e b;

    static {
       o$e.b = new o$e();
    }
    public void o$e(){
       super();
    }
    public Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o$e.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          a.p(p0, "obj");
          obj = p0.a();
       }
       return obj;
    }
}

package ab6.d$c;
import rjd.j;
import java.lang.Object;
import okhttp3.RequestBody;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import ojd.g;

public final class d$c implements j	// class@000065
{

    public void d$c(){
       super();
    }
    public boolean a(RequestBody p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "body");
       return p0 instanceof g;
    }
}

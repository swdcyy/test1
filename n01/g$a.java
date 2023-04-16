package n01.g$a;
import java.lang.Object;
import nsd.u;
import java.lang.String;
import d61.n;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import n01.g$a$a;

public final class g$a	// class@003265
{

    public void g$a(){
       super();
    }
    public void g$a(u p0){
       super();
    }
    public final n a(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, g$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "key");
       a.p(p1, "liveStreamId");
       return new g$a$a(p1, p0, p0);
    }
}

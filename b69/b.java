package b69.b;
import ju7.a;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import z59.a;
import cjd.e;
import erd.o;

public final class b extends a	// class@000375
{
    public final String b;

    public void b(String p0){
       a.p(p0, "userId");
       super();
       this.b = p0;
    }
    public t e(){
       t obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.a(0x53352bb2).d("profile", 22, "", null, null, "PROFILE", "").map(new e());
       a.o(obj, "Singleton.get\(AggregateA¡­\).map\(ResponseFunction\(\)\)");
       return obj;
    }
}

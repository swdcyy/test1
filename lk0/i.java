package lk0.i;
import brd.f0;
import java.lang.Object;
import brd.a0;
import brd.e0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ev6.f;
import brd.z;
import lrd.b;

public final class i implements f0	// class@002f8b
{
    public static final i b;

    static {
       i.b = new i();
    }
    public void i(){
       super();
    }
    public final e0 b(a0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "upstream");
       if (f.b()) {
          p0 = p0.T(b.c());
       }
       return p0;
    }
}

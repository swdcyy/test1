package bfa.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import bfa.d;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.io.Serializable;
import bfa.e;

public final class b	// class@0003a1
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final d a(String p0,Class p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "key");
       a.p(p1, "clazz");
       return new d(p0, p1);
    }
    public final e b(String p0,Serializable p1,Class p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "key");
       a.p(p1, "data");
       a.p(p2, "clazz");
       return new e(p0, p1, p2);
    }
}

package mn9.f;
import mn9.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import mn9.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class f	// class@003064
{
    public final b a;

    public void f(b p0){
       a.p(p0, "mDataProvider");
       super();
       this.a = p0;
    }
    public static boolean b(f p0,a p1,Object p2,int p3,Object p4){
       return p0.a(p1, null);
    }
    public final boolean a(a p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "item");
       if (p1 != null) {
          return this.a.e(p0, p1);
       }
       return this.a.d(p0);
    }
}

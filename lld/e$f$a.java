package lld.e$f$a;
import t36.f$a;
import java.util.HashMap;
import java.lang.Object;
import vpc.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import vpc.a;

public final class e$f$a implements f$a	// class@001c4d
{
    public final HashMap a;

    public void e$f$a(HashMap p0){
       this.a = p0;
       super();
    }
    public final void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$f$a.class, "1")) {
          return;
       }
       a.f(p0, this.a, false, 2, null);
       return;
    }
    public void apply(Object p0){
       this.a(p0);
    }
}

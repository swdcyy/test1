package d4b.f;
import erd.g;
import d4b.b;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import d4b.a$a;

public final class f implements g	// class@00242e
{
    public final b b;

    public void f(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
       }else {
          a.o(p0, "resultList");
          this.b.b.Q6(p0);
          p0.e = false;
       }
       return;
    }
}

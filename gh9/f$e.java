package gh9.f$e;
import erd.g;
import gh9.f;
import java.lang.Object;
import gh9.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class f$e implements g	// class@002498
{
    public final f b;

    public void f$e(f p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$e.class, "1")) {
       }else {
          a.p(p0, "event");
          this.b.k2(p0.a, p0.b);
       }
       return;
    }
}

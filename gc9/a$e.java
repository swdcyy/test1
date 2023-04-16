package gc9.a$e;
import erd.g;
import gc9.a;
import java.lang.Object;
import zg9.x;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class a$e implements g	// class@00246d
{
    public final a b;

    public void a$e(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$e.class, "1")) {
       }else {
          a.o(p0, "event");
          this.b.onSideBarVisibilityChangeEvent(p0);
       }
       return;
    }
}

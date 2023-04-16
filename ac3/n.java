package ac3.n;
import erd.g;
import msd.l;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class n implements g	// class@000071
{
    public final l b;

    public void n(l p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.invoke(p0);
       }
       return;
    }
}

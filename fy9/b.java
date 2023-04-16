package fy9.b;
import erd.g;
import fy9.a;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import cr7.i;

public final class b implements g	// class@002385
{
    public final a b;

    public void b(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else {
          a.o(p0, "list");
          p0 = p0.iterator();
          while (p0.hasNext()) {
             this.b.e0(p0.next());
          }
       }
       return;
    }
}

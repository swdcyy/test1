package bca.e;
import erd.g;
import bca.a;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.lang.Iterable;
import bca.a$a;
import kotlin.jvm.internal.a;

public final class e implements g	// class@000468
{
    public final a b;

    public void e(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
       }else {
          Iterator iterator = this.b.i.iterator();
          while (iterator.hasNext()) {
             a.o(p0, "progress");
             iterator.next().onProgress(p0.intValue());
          }
       }
       return;
    }
}

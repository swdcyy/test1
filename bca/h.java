package bca.h;
import erd.g;
import bca.a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.lang.Iterable;
import bca.a$a;
import kotlin.jvm.internal.a;

public final class h implements g	// class@00046b
{
    public final a b;

    public void h(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
       }else {
          Iterator iterator = this.b.i.iterator();
          while (iterator.hasNext()) {
             a.o(p0, "error");
             iterator.next().onError(p0);
          }
       }
       return;
    }
}

package bca.f;
import erd.a;
import bca.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.lang.Iterable;
import bca.a$a;

public final class f implements a	// class@000469
{
    public final a b;

    public void f(a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       Iterator iterator = this.b.i.iterator();
       while (iterator.hasNext()) {
          iterator.next().onFinish();
       }
       return;
    }
}

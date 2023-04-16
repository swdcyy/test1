package as6.b;
import java.lang.Object;
import java.util.ArrayList;
import z1.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;

public final class b	// class@0003a7
{
    public final List a;
    public Object b;
    public boolean c;

    public void b(Object p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
       this.a = new ArrayList();
    }
    public final void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       a.p(p0, "observer");
       this.a.add(p0);
       if (this.c != null) {
          p0.accept(this.b);
       }
       return;
    }
    public final Object b(){
       return this.b;
    }
    public final void c(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       this.b = p0;
       p0 = this.a.iterator();
       while (p0.hasNext()) {
          p0.next().accept(this.b);
       }
       return;
    }
}

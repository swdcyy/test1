package n1a.j;
import s2b.a;
import n1a.i;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import l1a.b;

public class j implements a	// class@0030c2
{
    public final i a;

    public void j(i p0){
       this.a = p0;
       super();
    }
    public void a(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       if (q.f(p0)) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          iterator.next().a = true;
       }
       return;
    }
    public boolean b(Object p0){
       return (p0.a ^ 0x01);
    }
}

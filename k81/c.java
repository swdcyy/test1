package k81.c;
import k81.b;
import k81.a;
import java.lang.Object;
import k81.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k81.d;
import k81.k;
import java.util.List;
import java.lang.Integer;
import java.util.Objects;
import java.util.Iterator;
import java.util.Map;
import k81.e;
import java.util.Collection;
import ekd.q;
import java.util.Collections;

public class c implements b	// class@002cd4
{
    public final a b;

    public void c(a p0){
       super();
       this.b = p0;
    }
    public void G(j p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "4")) {
          return;
       }
       this.b.l = p0;
       return;
    }
    public void N(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "3")) {
          return;
       }
       this.b.k = p0;
       return;
    }
    public void r(int p0,k p1,List p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, c.class, "2")) {
          return;
       }
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, tb, a.class, "1")) {
          Iterator iterator = p2.iterator();
          while (iterator.hasNext()) {
             tb.h.put(iterator.next(), Integer.valueOf(p0));
          }
          tb.i.put(Integer.valueOf(p0), p1);
       }
       return;
    }
    public void release(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "5")) {
          return;
       }
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, a.class, "2")) {
          tb.h.clear();
          tb.i.clear();
          tb.k = objArray;
          tb.l = objArray;
          a g = tb.g;
          Objects.requireNonNull(g);
          if (!PatchProxy.applyVoid(objArray, g, e.class, "2") && !q.f(g.a)) {
             g.a();
          }
       }
       return;
    }
    public void w(int p0,k p1,Class p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, c.class, "1")) {
          return;
       }
       this.r(p0, p1, Collections.singletonList(p2));
       return;
    }
}

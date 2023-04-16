package hh1.j;
import yg1.b;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArrayList;
import crd.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import lnc.b9;
import qrd.l1;
import java.util.Collection;

public abstract class j implements b	// class@0026c4
{
    public CopyOnWriteArrayList a;

    public void j(){
       super();
       this.a = new CopyOnWriteArrayList();
    }
    public final void b(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "2")) {
          return;
       }
       a.p(p0, "disposable");
       this.a.add(p0);
       return;
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       j ta = this.a;
       ArrayList uArrayList = new ArrayList(u.Y(ta, 10));
       Iterator iterator = ta.iterator();
       while (iterator.hasNext()) {
          b9.a(iterator.next());
          uArrayList.add(l1.a);
       }
       this.a.clear();
       return;
    }
}

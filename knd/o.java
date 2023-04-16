package knd.o;
import erd.g;
import knd.m;
import brd.v;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import jod.d;
import wnd.g;
import knd.k$a;
import knd.k;
import jod.c;
import brd.g;

public final class o implements g	// class@0017f6
{
    public final m b;
    public final v c;
    public final List d;

    public void o(m p0,v p1,List p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void accept(Object p0){
       Object obj = this;
       if (PatchProxy.applyVoidOneRefs(p0, obj, o.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("TTSRepoV2", "waitAllTaskComplete: start save draft", objArray);
       o c = obj.c;
       o b = obj.b;
       o d = obj.d;
       Objects.requireNonNull(b);
       ArrayList uArrayList = PatchProxy.applyOneRefs(d, b, m.class, "8");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          uArrayList = new ArrayList();
          Iterator iterator = d.iterator();
          while (iterator.hasNext()) {
             d uod = iterator.next();
             k$a uoa = b.e.n(g.a.b(uod.d(), uod.c(), uod.g()));
             if (uoa != null) {
                c uoc = v15;
                c uoc1 = v15;
                uoc = new c(uod.d(), uod.c(), uod.g(), uod.f(), uod.a(), uod.h(), uod.b(), uoa.b(), uod.e());
                uArrayList.add(uoc1);
             }
          }
       }
       c.onNext(uArrayList);
       obj.c.onComplete();
       return;
    }
}

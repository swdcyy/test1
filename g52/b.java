package g52.b;
import erd.g;
import g52.e;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.QLivePushEndInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import brd.v;
import brd.g;

public final class b implements g	// class@002a6c
{
    public final e b;

    public void b(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       e q = tb.q;
       if (PatchProxy.applyVoidTwoRefs(p0, q, tb, e.class, "5")) {
       }else if(!q.f(q)){
          Iterator iterator = q.iterator();
          while (iterator.hasNext()) {
             v ov = iterator.next();
             if (!ov.isDisposed()) {
                ov.onNext(p0);
                ov.onComplete();
             }
          }
          q.clear();
       }
       return;
    }
}

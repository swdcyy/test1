package d82.h;
import d82.f$a;
import d82.n;
import java.lang.Object;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import jg1.a;

public final class h implements f$a	// class@002491
{
    public final n a;

    public void h(n p0){
       this.a = p0;
    }
    public final void onResult(boolean p0){
       h ta = this.a;
       ta.t = p0;
       if (!q.f(ta.v)) {
          Iterator iterator = ta.v.iterator();
          while (iterator.hasNext()) {
             iterator.next().a();
          }
       }
       return;
    }
}

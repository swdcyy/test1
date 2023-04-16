package qh.d;
import erd.g;
import com.gifshow.kuaishou.thanos.milano.a;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Iterator;
import java.util.List;
import df5.c;

public final class d implements g	// class@0029da
{
    public final a b;

    public void d(a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       Iterator iterator = this.b.q.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0);
       }
       return;
    }
}

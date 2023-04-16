package dub.w;
import erd.o;
import java.util.List;
import java.lang.Object;
import java.util.Collection;
import ekd.q;
import dub.t;
import ekd.q$a;
import dub.u;
import java.util.Collections;

public final class w implements o	// class@002581
{
    public final List b;
    public final List c;

    public void w(List p0,List p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       p0 = this.b;
       w tc = this.c;
       if (!q.f(p0)) {
          p0 = q.g(p0, t.a);
       }else if(!q.f(tc)){
          p0 = q.g(tc, u.a);
       }else {
          p0 = Collections.emptyList();
       }
       return p0;
    }
}

package dub.h;
import erd.r;
import java.util.List;
import java.lang.String;
import java.lang.Object;
import java.util.Collection;
import ekd.q;
import dub.b;
import java.lang.Iterable;
import ok.o;
import com.google.common.base.Optional;
import qk.y;
import java.lang.Boolean;
import k2b.f2;

public final class h implements r	// class@002572
{
    public final List b;
    public final String c;

    public void h(List p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final boolean test(Object p0){
       h tb = this.b;
       h tc = this.c;
       boolean b = false;
       if (q.f(tb)) {
       }else {
          boolean b1 = y.y(tb, new b(p0)).isPresent();
          Object[] objArray = new Object[]{tc,p0,Boolean.valueOf(b1)};
          f2.b("LocalNotifyDispatcher", "observeInternal: [%1$s] updated red dots[%2$s] is monitored= %3$s", objArray);
          b = b1;
       }
       return b;
    }
}

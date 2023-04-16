package dub.n;
import erd.r;
import java.util.List;
import java.util.Map;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;
import z1.d;

public final class n implements r	// class@002578
{
    public final List b;
    public final Map c;

    public void n(List p0,Map p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final boolean test(Object p0){
       n tb = this.b;
       n tc = this.c;
       int i = tb.size() - 1;
       boolean b = false;
       while (i >= 0) {
          String str = tb.get(i);
          Integer integer = p0.get(i);
          if (!d.a(tc.get(str), integer)) {
             tc.put(str, integer);
             b = true;
          }
          i = i - 1;
       }
       return b;
    }
}

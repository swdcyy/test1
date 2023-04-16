package awd.f;
import java.util.ArrayList;
import java.lang.Object;
import awd.k;
import java.util.List;

public final class f	// class@000241
{
    public Object a;
    public k b;
    public f c;
    public static final List d;

    static {
       f.d = new ArrayList();
    }
    public void f(Object p0,k p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public static f a(k p0,Object p1){
       List d = f.d;
       _monitor_enter(d);
       int i = d.size();
       if (i > 0) {
          f uof = d.remove((i - 1));
          uof.a = p1;
          uof.b = p0;
          uof.c = null;
          _monitor_exit(d);
          return uof;
       }else {
          _monitor_exit(d);
          return new f(p1, p0);
       }
    }
}

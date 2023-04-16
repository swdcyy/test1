package ftd.f3;
import java.lang.ThreadLocal;
import java.lang.Object;
import ftd.g1;
import ftd.j1;

public final class f3	// class@001640
{
    public static final ThreadLocal a;
    public static final f3 b;

    static {
       f3.b = new f3();
       f3.a = new ThreadLocal();
    }
    public void f3(){
       super();
    }
    public final g1 a(){
       return f3.a.get();
    }
    public final g1 b(){
       ThreadLocal a = f3.a;
       g1 og1 = a.get();
       if (og1 != null) {
       }else {
          og1 = j1.a();
          a.set(og1);
       }
       return og1;
    }
    public final void c(){
       f3.a.set(null);
    }
    public final void d(g1 p0){
       f3.a.set(p0);
    }
}

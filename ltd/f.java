package ltd.f;
import ltd.e0;
import java.lang.String;
import ltd.g;
import java.lang.Object;
import ltd.b0;
import msd.p;
import ltd.c0;
import java.lang.Long;

public final class f	// class@001cc9
{
    public static final e0 a;

    static {
       f.a = new e0("CLOSED");
    }
    public static void a(){
    }
    public static final g b(g p0){
       while (true) {
          Object obj = p0.d();
          if (obj == f.a) {
             return p0;
          }
          if (obj == null) {
             if (p0.i()) {
                break ;
             }
          }else {
             p0 = obj;
          }
       }
       return p0;
    }
    public static final Object c(b0 p0,long p1,p p2){
       e0 a;
       while (true) {
          if (p0.n() - p1 >= 0 && !p0.f()) {
             return c0.b(p0);
          }
          b0 uob0 = p0.d();
          a = f.a;
          if (uob0 == a) {
             break ;
          }else if(uob0 != null){
             long l = p0.n() + 1;
             uob0 = p2.invoke(Long.valueOf(l), p0);
             if (p0.l(uob0)) {
                if (p0.f()) {
                   p0.k();
                }
             }
          }
          p0 = uob0;
       }
       return c0.b(a);
    }
}

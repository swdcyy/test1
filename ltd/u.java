package ltd.u;
import java.lang.Throwable;
import java.lang.String;
import ltd.v;
import java.lang.Void;
import java.lang.Object;
import ftd.j2;
import java.lang.IllegalStateException;
import kotlinx.coroutines.internal.MainDispatcherFactory;
import java.util.List;

public final class u	// class@001e1b
{
    public static final boolean a = true;

    public static void a(){
    }
    public static final v b(Throwable p0,String p1){
       if (u.a) {
          return new v(p0, p1);
       }
       if (p0 != null) {
          throw p0;
       }
       u.e();
       throw null;
    }
    public static v c(Throwable p0,String p1,int p2,Object p3){
       if (p2 & 0x01) {
          p0 = null;
       }
       if (p2 & 0x02) {
          p1 = null;
       }
       return u.b(p0, p1);
    }
    public static final boolean d(j2 p0){
       return p0 instanceof v;
    }
    public static final Void e(){
       throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. \'kotlinx-coroutines-android\' and ensure it has the same version as \'kotlinx-coroutines-core\'");
    }
    public static final j2 f(MainDispatcherFactory p0,List p1){
       j2 oj2 = p0.a(p1);
       return oj2;
    }
}

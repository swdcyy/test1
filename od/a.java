package od.a;
import java.lang.AssertionError;
import java.lang.String;
import java.lang.Object;

public class a	// class@00277e
{

    public static void a(boolean p0){
       if (p0) {
          return;
       }
       throw new AssertionError();
    }
    public static void b(boolean p0,String p1){
       if (p0) {
          return;
       }
       throw new AssertionError(p1);
    }
    public static Object c(Object p0){
       if (p0 != null) {
          return p0;
       }
       throw new AssertionError();
    }
    public static Object d(Object p0,String p1){
       if (p0 != null) {
          return p0;
       }
       throw new AssertionError(p1);
    }
}

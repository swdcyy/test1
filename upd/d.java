package upd.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.String;
import java.util.Objects;

public final class d	// class@002603
{

    public static void a(Object p0,Class p1){
       if (p0 != null) {
          return;
       }
       throw new IllegalStateException(p1.getCanonicalName()+" must be set");
    }
    public static Object b(Object p0){
       Objects.requireNonNull(p0);
       return p0;
    }
    public static Object c(Object p0,String p1){
       Objects.requireNonNull(p0, p1);
       return p0;
    }
}

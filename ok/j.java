package ok.j;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import ok.j$b;
import java.lang.Class;
import ok.j$a;

public final class j	// class@0027f0
{

    public static Object a(Object p0,Object p1){
       if (p0 != null) {
          return p0;
       }
       Objects.requireNonNull(p1, "Both parameters are null");
       return p1;
    }
    public static j$b b(Object p0){
       return new j$b(p0.getClass().getSimpleName(), null);
    }
}

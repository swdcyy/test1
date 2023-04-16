package bl.a;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.util.Objects;

public final class a	// class@0002ed
{

    public static void a(boolean p0){
       if (p0) {
          return;
       }
       throw new IllegalArgumentException();
    }
    public static Object b(Object p0){
       Objects.requireNonNull(p0);
       return p0;
    }
}

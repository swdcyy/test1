package ab.d;
import java.lang.Object;
import java.util.Arrays;
import ab.d$b;
import java.lang.Class;
import java.lang.String;
import ab.d$a;

public final class d	// class@000111
{

    public static boolean a(Object p0,Object p1){
       boolean b = (p0 == p1 || (p0 != null && p0.equals(p1)))? true: false;
       return b;
    }
    public static int b(Object[] p0){
       return Arrays.hashCode(p0);
    }
    public static d$b c(Object p0){
       return new d$b(p0.getClass().getSimpleName(), null);
    }
}

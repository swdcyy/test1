package ok.k;
import ok.g;
import java.lang.Object;
import java.util.Arrays;

public final class k extends g	// class@00204a
{

    public static boolean a(Object p0,Object p1){
       boolean b = (p0 == p1 || (p0 != null && p0.equals(p1)))? true: false;
       return b;
    }
    public static int b(Object[] p0){
       return Arrays.hashCode(p0);
    }
}

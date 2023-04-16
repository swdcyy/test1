package ekd.s0;
import java.lang.Object;

public class s0	// class@000d76
{

    public static boolean a(Object p0,Object p1){
       boolean b;
       if (p0 == null) {
          b = (p1 == null)? true: false;
       }else {
          b = p0.equals(p1);
       }
       return b;
    }
}

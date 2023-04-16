package ftd.k$a;
import ftd.k;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.UnsupportedOperationException;
import java.lang.String;

public final class k$a	// class@000e9e
{

    public static boolean a(k p0,Throwable p1,int p2,Object p3){
       if (p3 != null) {
          throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
       }
       if (p2 & 0x01) {
          p1 = null;
       }
       return p0.a(p1);
    }
    public static Object b(k p0,Object p1,Object p2,int p3,Object p4){
       if (p4 != null) {
          throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryResume");
       }
       if (p3 & 0x02) {
          p2 = null;
       }
       return p0.G(p1, p2);
    }
}

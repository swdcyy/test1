package htd.c0$a;
import htd.c0;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.UnsupportedOperationException;
import java.lang.String;

public final class c0$a	// class@000fbe
{

    public static boolean a(c0 p0,Throwable p1,int p2,Object p3){
       if (p3 != null) {
          throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
       }
       if (p2 & 0x01) {
          p1 = null;
       }
       return p0.T(p1);
    }
    public static void b(){
    }
    public static void c(){
    }
}

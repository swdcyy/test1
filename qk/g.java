package qk.g;
import java.lang.Object;
import java.lang.NullPointerException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.IllegalArgumentException;
import ok.n;

public final class g	// class@00228b
{

    public static void a(Object p0,Object p1){
       if (p0 == null) {
          throw new NullPointerException("null key in entry: null="+p1);
       }
       if (p1 != null) {
          return;
       }
       throw new NullPointerException("null value in entry: "+p0+"=null");
    }
    public static int b(int p0,String p1){
       if (p0 >= 0) {
          return p0;
       }
       throw new IllegalArgumentException(p1+" cannot be negative but was: "+p0);
    }
    public static void c(boolean p0){
       n.o(p0, "no calls to next\(\) since the last call to remove\(\)");
    }
}

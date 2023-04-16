package fn8.d$a;
import java.util.Comparator;
import java.lang.Object;
import fn8.b;
import java.lang.Integer;

public final class d$a implements Comparator	// class@002322
{

    public void d$a(){
       super();
    }
    public int compare(Object p0,Object p1){
       int i;
       b v = p0.v;
       if (v == null || p1.v == null) {
          b w = p0.w;
          if (w != null && p1.w != null) {
          label_0014 :
             i = Integer.signum((p1.u - p0.u));
          }else {
             i = -1;
             if (v == null) {
                if (p1.v == null) {
                   if (w == null) {
                      if (p1.w == null) {
                         i = 0;
                      }
                   }
                }
                i = 1;
             }
          }
       }else {
          goto label_0014 ;
       }
       return i;
    }
}

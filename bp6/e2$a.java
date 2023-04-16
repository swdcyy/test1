package bp6.e2$a;
import java.util.Comparator;
import java.lang.Object;
import hp6.h;

public class e2$a implements Comparator	// class@000510
{

    public void e2$a(){
       super();
    }
    public int compare(Object p0,Object p1){
       int i = -1;
       if (p0 != null || p1 == null) {
          if (p0 == null || p1 != null) {
             if (p0 != null || (p1 != null && !p0.equals(p1))) {
                if (p0.a() - p1.a() <= 0) {
                   if (p0.a() - p1.a() >= 0) {
                      if (p0.b() - p1.b() <= 0) {
                         if (p0.b() - p1.b() >= 0) {
                         }
                      }
                   }
                }
             }
          }
       label_000f :
          i = 1;
       }
    label_0053 :
       return i;
    }
}

package b35.d;
import java.lang.Object;
import z1.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Iterable;
import java.util.Iterator;
import java.util.Collection;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class d	// class@00033d
{

    public void d(){
       super();
    }
    public static void a(Object p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, d.class, "3")) {
          return;
       }
       if (p0 != null) {
          p1.accept(p0);
       }
       return;
    }
    public static void b(Iterable p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, d.class, "5")) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (obj == null) {
             continue ;
          }else {
             p1.accept(obj);
          }
       }
       return;
    }
    public static boolean c(Collection p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 == null || p0.isEmpty())? true: false;
       return b;
    }
}

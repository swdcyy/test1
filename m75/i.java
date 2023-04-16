package m75.i;
import java.lang.Object;
import java.lang.Runnable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import m75.i$a;
import am8.e;

public class i	// class@001e4f
{

    public void i(){
       super();
    }
    public static void a(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, i.class, "1")) {
          return;
       }
       i.b(p0, 0);
       return;
    }
    public static void b(Runnable p0,long p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), null, oi, "2")) {
          return;
       }
       i$a.a.a(p0, p1);
       return;
    }
}

package aw6.b;
import java.lang.Object;
import tl8.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class b	// class@000387
{

    public void b(){
       super();
    }
    public static void a(Object p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "2")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       p1.apply(p0);
       return;
    }
}

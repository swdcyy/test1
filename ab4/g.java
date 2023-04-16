package ab4.g;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import us3.e;

public class g	// class@000060
{
    public static e a;

    public void g(){
       super();
    }
    public static void a(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, g.class, "2")) {
          return;
       }
       e a = g.a;
       if (a != null) {
          a.e(p0, p1, p2);
       }
       return;
    }
    public static void b(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, g.class, "1")) {
          return;
       }
       e a = g.a;
       if (a != null) {
          a.i(p0, p1);
       }
       return;
    }
}

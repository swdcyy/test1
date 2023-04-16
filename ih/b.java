package ih.b;
import ih.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import bh.p;
import java.lang.Throwable;

public class b	// class@0021e9
{
    public static p a;

    static {
       b.a = new a();
    }
    public void b(){
       super();
    }
    public static void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, b.class, "2")) {
          return;
       }
       b.a.debug(p0);
       return;
    }
    public static void b(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "6")) {
          return;
       }
       b.a.error(p0, p1);
       return;
    }
    public static void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, b.class, "4")) {
          return;
       }
       b.a.b(p0);
       return;
    }
    public static void d(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "5")) {
          return;
       }
       b.a.a(p0, p1);
       return;
    }
}

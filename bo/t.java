package bo.t;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.aegon.AegonLoggingDispatcher;

public class t	// class@000325
{

    public void t(){
       super();
    }
    public static void a(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, t.class, "1")) {
          return;
       }
       AegonLoggingDispatcher.a(0, p0, p1);
       return;
    }
    public static void b(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, t.class, "4")) {
          return;
       }
       AegonLoggingDispatcher.a(3, p0, p1);
       return;
    }
    public static void c(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, t.class, "2")) {
          return;
       }
       AegonLoggingDispatcher.a(1, p0, p1);
       return;
    }
    public static void d(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, t.class, "3")) {
          return;
       }
       AegonLoggingDispatcher.a(2, p0, p1);
       return;
    }
}

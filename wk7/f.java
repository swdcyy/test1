package wk7.f;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.logger.KwaiLog;
import java.lang.Throwable;

public class f	// class@002768
{

    public void f(){
       super();
    }
    public static void a(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, f.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       KwaiLog.c("PRIVACY_KIT", p0, p1, objArray);
       return;
    }
    public static void b(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, f.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       KwaiLog.g("PRIVACY_KIT", p0, p1, objArray);
       return;
    }
    public static void c(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, f.class, "3")) {
          return;
       }
       KwaiLog.f("PRIVACY_KIT", p0, p1, p2);
       return;
    }
}

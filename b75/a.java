package b75.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import org.greenrobot.eventbus.a;
import java.lang.RuntimeException;
import h75.i;

public class a	// class@000360
{

    public void a(){
       super();
    }
    public static void a(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "3")) {
          return;
       }
       if (!a.d().i(p0)) {
          try{
             a.d().p(p0);
          }catch(org.greenrobot.eventbus.EventBusException e3){
             i.c(e3.getMessage());
          }
       }
    }
    public static void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "4")) {
          return;
       }
       if (a.d().i(p0)) {
          a.d().t(p0);
       }
       return;
    }
}

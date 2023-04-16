package ay.c;
import p35.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import k2b.u1;
import java.lang.Float;
import f3b.s;

public class c implements b	// class@000221
{

    public void c(){
       super();
    }
    public void a(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "2")) {
          return;
       }
       u1.V(p0, p1, 6);
       return;
    }
    public void b(float p0,String p1,String p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), p1, p2, this, c.class, "3")) {
          return;
       }
       if (s.c(p0)) {
          u1.R(p1, p2, 6);
       }
       return;
    }
    public void logCustomEvent(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "1")) {
          return;
       }
       u1.R(p0, p1, 6);
       return;
    }
}

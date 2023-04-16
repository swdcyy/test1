package dea.a;
import ida.a;
import java.lang.Object;
import yqb.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fea.a;
import kotlin.jvm.internal.a;
import yqb.k;

public class a implements a	// class@002494
{

    public void a(){
       super();
    }
    public void G00(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, null, a.class, "2")) {
          a.p(p0, "entranceParam");
          if (p0.i()) {
             a.a.a(p0, new k(3, 23));
          }
       }
       return;
    }
    public boolean isAvailable(){
       return true;
    }
    public void su(b p0,k p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "2")) {
          return;
       }
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "1")) {
          a.p(p0, "entranceParam");
          a.p(p1, "slidePlayOpenLiveConfig");
          if (p0.i()) {
             a.a.a(p0, p1);
          }
       }
       return;
    }
}

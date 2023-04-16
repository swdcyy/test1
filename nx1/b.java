package nx1.b;
import nx1.a;
import sx4.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import tx4.h;

public final class b implements a	// class@00340b
{
    public final e b;

    public void b(e p0){
       a.p(p0, "tkViewContainer");
       super();
       this.b = p0;
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       a.p(p0, "data");
       this.b.b("setData", p0, null);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.b.b("onWidgetShow", null, null);
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       this.b.b("onWidgetDestroy", null, null);
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.b.b("onWidgetHide", null, null);
       return;
    }
}

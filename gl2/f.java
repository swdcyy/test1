package gl2.f;
import java.lang.Object;
import crd.a;
import crd.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public abstract class f	// class@002b42
{
    public final a a;

    public void f(){
       super();
       this.a = new a();
    }
    public final void b(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       a.p(p0, "disposable");
       this.a.c(p0);
       return;
    }
    public void c(){
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.a.dispose();
       return;
    }
}

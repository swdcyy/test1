package ky9.a;
import java.lang.Object;
import crd.a;
import crd.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public abstract class a	// class@002d21
{
    public a a;

    public void a(){
       super();
       this.a = new a();
    }
    public final void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "disposable");
       this.a.c(p0);
       return;
    }
    public void b(){
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.a.dispose();
       this.a = new a();
       return;
    }
}

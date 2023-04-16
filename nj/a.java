package nj.a;
import nj.c;
import java.lang.Object;
import nj.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.a;
import crd.b;

public abstract class a implements c	// class@00270d
{
    public g a;
    public a b;

    public void a(){
       super();
    }
    public void A(){
    }
    public void I(){
    }
    public void a(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.a = p0;
       this.b = new a();
       return;
    }
    public void b(){
    }
    public void c(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       this.b.c(p0);
       return;
    }
    public void m0(){
    }
    public void onRelease(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.a = null;
       a tb = this.b;
       if (tb != null && !tb.isDisposed()) {
          this.b.dispose();
          this.b = null;
       }
       return;
    }
}

package iz8.b$a;
import d6a.a;
import iz8.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cm9.a;

public final class b$a extends a	// class@00273c
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "1")) {
          return;
       }
       b t = this.b.t;
       if (t != null) {
          t.stop();
       }
       return;
    }
    public void k1(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "2")) {
          return;
       }
       b t = this.b.t;
       if (t != null) {
          t.start();
       }
       return;
    }
}

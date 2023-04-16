package f51.c;
import f51.a;
import f51.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import c51.d;

public class c implements a	// class@0022ba
{
    public final d a;

    public void c(d p0){
       this.a = p0;
       super();
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       if (!this.a.d.isLoading() && this.a.d.j0()) {
          this.a.d.b0();
       }
       return;
    }
    public void c(){
    }
}

package h92.s$b;
import h92.s$d;
import h92.s;
import java.lang.Object;
import h92.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import h92.i0$d;

public class s$b implements s$d	// class@002d24
{
    public final s a;

    public void s$b(s p0){
       this.a = p0;
       super();
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s$b.class, "1")) {
          return;
       }
       this.a.N.a(p0);
       return;
    }
    public String c(){
       return this.a.Q;
    }
}

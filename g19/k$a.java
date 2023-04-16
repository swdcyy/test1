package g19.k$a;
import jta.a;
import g19.k;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;

public class k$a extends a	// class@0023c3
{
    public final k a;

    public void k$a(k p0){
       this.a = p0;
       super();
    }
    public void c(float p0){
       k$a uoa = k$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoa, "1")) {
          return;
       }
       this.a.P8(p0);
       return;
    }
}

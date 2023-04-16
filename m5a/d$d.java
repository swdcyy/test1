package m5a.d$d;
import jta.f;
import m5a.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;

public class d$d extends f	// class@002f3e
{
    public final d a;

    public void d$d(d p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
       if (PatchProxy.isSupport(d$d.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, d$d.class, "1")) {
          return;
       }
       this.a.P8();
       return;
    }
}

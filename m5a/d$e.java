package m5a.d$e;
import jta.a;
import m5a.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;

public class d$e extends a	// class@002f3f
{
    public final d a;

    public void d$e(d p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
       if (PatchProxy.isSupport(d$e.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, d$e.class, "1")) {
          return;
       }
       this.a.P8();
       return;
    }
}

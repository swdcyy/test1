package h19.e$a;
import jta.f;
import h19.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;

public class e$a extends f	// class@00253b
{
    public final e a;

    public void e$a(e p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
       if (PatchProxy.isSupport(e$a.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, e$a.class, "1")) {
          return;
       }
       this.a.P8();
       return;
    }
}

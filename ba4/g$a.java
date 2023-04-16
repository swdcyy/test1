package ba4.g$a;
import y94.b;
import ba4.g;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import ca4.a;
import java.util.List;
import t94.c;

public class g$a implements b	// class@000353
{
    public final g a;

    public void g$a(g p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       g$a uoa = g$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       uoa = this.a;
       uoa.v.Y0(uoa.w.b, p0);
       this.a.S8();
       return;
    }
    public void b(int p0){
       g$a uoa = g$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       uoa = this.a;
       uoa.v.X0(uoa.w.b, p0);
       this.a.S8();
       return;
    }
}

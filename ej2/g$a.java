package ej2.g$a;
import ej2.k;
import ej2.g;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.BitSet;
import ej2.v;

public class g$a implements k	// class@00272b
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
       this.a.x.set(p0);
       this.a.R8();
       return;
    }
    public void b(int p0){
       g$a uoa = g$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       this.a.x.clear(p0);
       this.a.R8();
       return;
    }
}

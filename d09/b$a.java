package d09.b$a;
import erd.g;
import d09.b;
import java.lang.Integer;
import java.lang.Object;
import vq4.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import vq4.d;

public final class b$a implements g	// class@00201f
{
    public final b b;
    public final Integer c;
    public final Integer d;

    public void b$a(b p0,Integer p1,Integer p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, b$a.class, "1")) {
       }else {
          c f = p0.F;
          b$a tc = this.c;
          int i = 0;
          int i1 = (tc != null)? tc.intValue(): 0;
          f.b = i1;
          p0 = p0.F;
          b$a td = this.d;
          if (td != null) {
             i = td.intValue();
          }
          p0.w1 = i;
          PatchProxy.onMethodExit(b$a.class, "1");
       }
       return;
    }
}

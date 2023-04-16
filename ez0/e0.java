package ez0.e0;
import erd.g;
import ez0.g0;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import jk1.f;

public final class e0 implements g	// class@00223f
{
    public final g0 b;
    public final boolean c;

    public void e0(g0 p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e0.class, "1")) {
       }else {
          this.b.f.x1.Hh(this.c, 3);
       }
       return;
    }
}

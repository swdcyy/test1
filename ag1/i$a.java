package ag1.i$a;
import pz2.j;
import ag1.i;
import pz2.c;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.effect.renderer.c;
import gz2.h;

public class i$a extends j	// class@00008a
{
    public final c d;
    public final i e;

    public void i$a(i p0,int p1,c p2){
       this.e = p0;
       this.d = p2;
       super(p1);
    }
    public void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "1")) {
          return;
       }
       c q = this.e.a.q;
       if (q != null) {
          q.C0(this.d, p0);
       }
       return;
    }
}

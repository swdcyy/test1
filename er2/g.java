package er2.g;
import com.kuaishou.live.core.voiceparty.a;
import co2.f2;
import ee1.a;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Iterator;

public class g	// class@0027bf
{
    public final a a;
    public final f2 b;
    public final a c;
    public final List d;
    public boolean e;

    public void g(a p0,f2 p1,a p2){
       super();
       this.d = new ArrayList();
       this.e = false;
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void a(List p0,boolean p1){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, g.class, "3")) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          if (PatchProxy.isSupport(g.class) && (!PatchProxy.applyVoidTwoRefs(str, Boolean.valueOf(p1), this, g.class, "4") && this.c.j() == 2)) {
             this.c.k5(str, p1);
          }
       }
       return;
    }
}

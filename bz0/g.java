package bz0.g;
import java.lang.Object;
import java.util.ArrayList;
import cz0.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import bz0.e;
import java.util.Iterator;

public class g	// class@000437
{
    public List a;

    public void g(){
       super();
       this.a = new ArrayList();
    }
    public void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       this.a.add(p0);
       return;
    }
    public void b(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       Iterator iterator = this.a.iterator();
       do {
       } while (!iterator.hasNext() || iterator.next().a(p0));
       return;
    }
}

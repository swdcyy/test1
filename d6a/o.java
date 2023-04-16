package d6a.o;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;

public class o	// class@001ea9
{
    public final List a;
    public boolean b;

    public void o(){
       super();
       this.a = new ArrayList();
    }
    public void a(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "1")) {
          return;
       }
       if (!q.f(p0)) {
          this.a.clear();
          this.a.addAll(p0);
       }
       return;
    }
}

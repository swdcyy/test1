package n02.a$a;
import kq5.b;
import n02.a;
import java.lang.Object;
import androidx.fragment.app.c$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import java.util.Iterator;

public class a$a implements b	// class@003268
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(c$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "3")) {
          return;
       }
       this.a.p.remove(p0);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       if (this.a.q.getFragmentManager() == null) {
          return;
       }
       Iterator iterator = this.a.p.iterator();
       while (iterator.hasNext()) {
          c$b uob = iterator.next();
          if (uob != null) {
             uob.i(this.a.q.getFragmentManager(), this.a.q);
          }
       }
       return;
    }
    public void c(c$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "2")) {
          return;
       }
       this.a.p.add(p0);
       return;
    }
}

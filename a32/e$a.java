package a32.e$a;
import a32.j;
import a32.e;
import java.lang.Object;
import a32.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;

public class e$a implements j	// class@000020
{
    public final e a;

    public void e$a(e p0){
       this.a = p0;
       super();
    }
    public void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "1")) {
          return;
       }
       this.a.q.add(p0);
       return;
    }
    public void b(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "2")) {
          return;
       }
       this.a.q.remove(p0);
       return;
    }
}

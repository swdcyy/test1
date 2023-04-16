package e1a.m;
import e1a.l;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.util.HashMap;
import wq6.k;
import as6.a;
import wq6.d;
import e1a.l$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import fr6.e;
import fr6.a;
import e1a.m$a;

public class m implements l	// class@002050
{
    public final Map a;
    public final d b;

    public void m(Fragment p0){
       super();
       this.a = new HashMap();
       this.b = a.g(p0).s8();
    }
    public void a(l$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "2")) {
          return;
       }
       e uoe = this.a.remove(p0);
       if (uoe == null) {
          return;
       }
       this.b.b0().d(uoe);
       return;
    }
    public void b(l$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "1")) {
          return;
       }
       m$a uoa = new m$a(p0);
       this.a.put(p0, uoa);
       this.b.b0().a(uoa);
       return;
    }
}

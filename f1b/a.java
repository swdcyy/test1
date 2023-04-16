package f1b.a;
import s2b.a;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import java.util.List;

public class a	// class@002869
{
    public final a a;
    public final List b;

    public void a(a p0){
       super();
       this.a = p0;
       this.b = new ArrayList();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       a tb = this.b;
       _monitor_enter(tb);
       if (!q.f(this.b)) {
          a ta = this.a;
          if (ta != null) {
             ta.a(new ArrayList(this.b));
          }
          this.b.clear();
       }
       _monitor_exit(tb);
       return;
    }
}

package i61.j$b;
import com.kuaishou.live.bottombar.component.widget.a$a;
import i61.j;
import java.lang.Object;
import o61.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import i61.j$d;
import java.lang.Integer;

public class j$b implements a$a	// class@00283e
{
    public final j a;

    public void j$b(j p0){
       this.a = p0;
       super();
    }
    public void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$b.class, "3")) {
          return;
       }
       j j = this.a.j;
       if (j != null) {
          j.a(p0);
       }
       j = this.a.l;
       if (j != -1) {
          p0.q(j);
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, j$b.class, "2")) {
          return;
       }
       this.a.f(true, "reloadBottomBar ");
       return;
    }
    public void c(int p0){
       j$b uob = j$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       this.a.d(p0);
       return;
    }
}

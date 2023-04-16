package gz8.b$b;
import com.kwai.framework.player.multisource.e;
import gz8.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.framework.player.multisource.PlaySourceSwitcher$a;
import kotlin.jvm.internal.a;
import oc6.b;
import oc6.a;

public final class b$b implements e	// class@002523
{
    public final b a;

    public void b$b(b p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       b$b uob = b$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       this.a.c(true);
       return;
    }
    public void b(PlaySourceSwitcher$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "2")) {
          return;
       }
       a.p(p0, "playSource");
       return;
    }
    public void c(int p0){
       b$b uob = b$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "3")) {
          return;
       }
       this.a.c(false);
       return;
    }
    public void d(b p0){
       a.c(this, p0);
    }
}

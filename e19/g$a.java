package e19.g$a;
import com.kwai.framework.player.multisource.e;
import e19.g;
import java.lang.Object;
import oc6.a;
import com.kwai.framework.player.multisource.PlaySourceSwitcher$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import oc6.b;

public class g$a implements e	// class@002125
{
    public final g a;

    public void g$a(g p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       a.a(this, p0);
    }
    public void b(PlaySourceSwitcher$a p0){
    }
    public void c(int p0){
       if (PatchProxy.isSupport(g$a.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, g$a.class, "1")) {
          return;
       }
       this.a.V8();
       return;
    }
    public void d(b p0){
       a.c(this, p0);
    }
}

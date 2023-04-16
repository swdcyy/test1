package cy1.k;
import com.kuaishou.live.common.core.component.watchingcount.updater.a$b;
import com.kuaishou.live.common.core.component.topbar.topuser.i;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;

public class k implements a$b	// class@001eb4
{
    public final i a;

    public void k(i p0){
       this.a = p0;
       super();
    }
    public void a(long p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, ok, "1")) {
          return;
       }
       this.a.l9(p0);
       return;
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "2")) {
          return;
       }
       this.a.k9(p0);
       return;
    }
}

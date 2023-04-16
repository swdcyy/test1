package iz9.a$d;
import com.kwai.framework.player.multisource.e;
import iz9.a;
import java.lang.Object;
import oc6.a;
import com.kwai.framework.player.multisource.PlaySourceSwitcher$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import oc6.b;
import com.yxcorp.gifshow.entity.QPhoto;

public final class a$d implements e	// class@0028cf
{
    public final a a;

    public void a$d(a p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       a.a(this, p0);
    }
    public void b(PlaySourceSwitcher$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$d.class, "1")) {
          return;
       }
       a.p(p0, "playSource");
       return;
    }
    public void c(int p0){
       a.b(this, p0);
    }
    public void d(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$d.class, "2")) {
          return;
       }
       a.p(p0, "info");
       a u = this.a.u;
       if (u != null && u.isVideoType() == true) {
          u = this.a.u;
          if (u != null) {
             u.setPlayFailed(true);
          }
       }
       return;
    }
}

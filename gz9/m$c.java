package gz9.m$c;
import erd.g;
import gz9.m;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import kotlin.jvm.internal.a;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import gz9.a;

public final class m$c implements g	// class@002524
{
    public final m b;

    public void m$c(m p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$c.class, "1")) {
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, m.class, "13")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "BUY_FULL_BUTTON";
             p0 = p0.v;
             if (p0 == null) {
                a.S("mFragment");
             }
             u1.L("", p0, 1, uElementPack, null);
          }
          p0 = this.b.x;
          if (p0 == null) {
             a.S("mPayCourseEventCombination");
          }
          p0.a();
       }
       return;
    }
}

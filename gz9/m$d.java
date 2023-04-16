package gz9.m$d;
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
import de5.a;

public final class m$d implements g	// class@002525
{
    public final m b;

    public void m$d(m p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$d.class, "1")) {
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, m.class, "12")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "TRY_AGAIN_BUTTON";
             p0 = p0.v;
             if (p0 == null) {
                a.S("mFragment");
             }
             u1.L("", p0, 1, uElementPack, null);
          }
          this.b.p0();
          p0 = this.b.w;
          if (p0 == null) {
             a.S("mPlayModule");
          }
          p0.l(0);
       }
       return;
    }
}

package b90.d$d;
import android.view.View$OnClickListener;
import b90.d;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import z80.b;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class d$d implements View$OnClickListener	// class@000af3
{
    public final d b;

    public void d$d(d p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$d.class, "1")) {
          return;
       }
       b a = b.a;
       d p = this.b.p;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidOneRefs(p, a, b.class, "3")) {
          a.p(p, "logPage");
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "RETRY";
          u1.L(null, p, 1, uElementPack, null);
       }
       this.b.F();
       return;
    }
}

package h01.l;
import u07.u;
import h01.o;
import java.lang.Object;
import u07.t;
import android.view.View;
import mk1.h;
import java.lang.String;
import wk1.b;
import t02.a0;
import r53.b;
import vk1.a;
import m53.n;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class l implements u	// class@0025ee
{
    public final o b;

    public void l(o p0){
       this.b = p0;
    }
    public final void a(t p0,View p1){
       l tb = this.b;
       tb.y.A.d("[NormalGiftSenderPresenter][onInsufficientKShell]");
       o p = tb.p;
       if (p != null) {
          a0 z = p.Z;
          if (z != null) {
             z.r();
          }
       }
       tb.y.z.dismiss();
       if (!PatchProxy.applyVoid(null, null, n.class, "10")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action = 0x7623;
          uElementPack.name = "CLICK_CHEST_GOTOGET";
          u1.u(1, uElementPack, n.b());
       }
       return;
    }
}

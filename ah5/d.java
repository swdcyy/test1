package ah5.d;
import erd.g;
import ah5.e;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagShowPackage;
import java.util.List;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import com.kwai.component.tabs.panel.h;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class d implements g	// class@0000a3
{
    public final e b;

    public void d(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.booleanValue() && !PatchProxy.applyVoid(null, tb, e.class, "3")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "COMMENT_TAB";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          p0 = new ClientContent$TagShowPackage();
          uContentPack.tagShowPackage = p0;
          ClientContent$TagPackage[] tagPackageAr = new ClientContent$TagPackage[tb.p.size()];
          p0.tagPackage = tagPackageAr;
          for (int i = 0; i < tb.p.size(); i = i + 1) {
             p0.tagPackage[i] = new ClientContent$TagPackage();
             p0.tagPackage[i].name = tb.p.get(i).g();
          }
          u1.D0("4140512", tb.q, 3, uElementPack, uContentPack, null);
       }
       return;
    }
}

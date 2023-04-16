package ck9.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.String;
import k2b.e0;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import bk9.a;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class a extends PresenterV2	// class@000602
{
    public final String p;
    public final int q;
    public final e0 r;
    public boolean s;

    public void a(String p0,int p1,e0 p2){
       super();
       this.s = true;
       this.p = p0;
       this.q = p1;
       this.r = p2;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       if (this.s != null) {
          a tp = this.p;
          a tq = this.q;
          a tr = this.r;
          if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(tp, Integer.valueOf(tq), tr, null, a.class, "2")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.params = a.a(tp, tq);
             uElementPack.action2 = "TOOLS_LIST_ENTRANCE";
             u1.D0("2632091", tr, 3, uElementPack, null, null);
          }
          this.s = false;
       }
       return;
    }
}

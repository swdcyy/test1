package kgd.u0$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kgd.u0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class u0$a extends PresenterV2	// class@0017bb
{
    public final u0 p;

    public void u0$a(u0 p0){
       this.p = p0;
       super();
    }
    public void F8(){
       u0$a uoa = u0$a.class;
       if (PatchProxy.applyVoid(null, this, uoa, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, uoa, "2")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "SHOW_ORIGINALPROTECTION_SETTING";
          u1.u0(3, uElementPack, null);
       }
       return;
    }
}

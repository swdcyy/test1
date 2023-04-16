package c24.l;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import c24.l$a;
import cb4.e;
import com.kuaishou.merchant.router.b;
import vq5.d;

public final class l extends PresenterV2	// class@000489
{
    public d p;

    public void l(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, l.class, "2")) {
          return;
       }
       b.h("^kwailive://.*", new l$a(this));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, l.class, "3")) {
          return;
       }
       b.u("^kwailive://.*");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_ROUTER_SERVICE");
       return;
    }
}

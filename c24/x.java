package c24.x;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import c24.x$a;
import vq5.b;
import vq5.d;
import ks3.f0;
import fq5.b;

public class x extends PresenterV2	// class@0004a0
{
    public d p;
    public f0 q;
    public b r;

    public void x(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, x.class, "2")) {
          return;
       }
       this.p.t5("openmerchanthalfrn", new x$a(this));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, x.class, "3")) {
          return;
       }
       this.p.Z4("openmerchanthalfrn");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, x.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_ROUTER_SERVICE");
       this.q = this.r8("LIVE_MERCHANT_LIVE_INTERNAL_ROUTER_SERVICE");
       this.r = this.r8("LIVE_BASIC_CONTEXT");
       return;
    }
}

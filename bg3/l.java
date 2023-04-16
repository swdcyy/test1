package bg3.l;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import bg3.l$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import ks3.i0$a;
import ks3.i0;
import hb2.g$b;

public class l extends PresenterV2	// class@0003ac
{
    public g$b p;
    public a0 q;
    public i0$a r;
    public static String sLivePresenterClassName = "LiveMerchantChainLayoutPresenter";

    public void l(){
       super();
       this.r = new l$a(this);
    }
    public void E8(){
       l ol = l.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ol, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, ol, "5")) {
          a0 o2 = this.q.O2;
          if (o2 != null) {
             o2.b(this.r);
          }
       }
       return;
    }
    public void J8(){
       l ol = l.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ol, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, ol, "4")) {
          a0 o2 = this.q.O2;
          if (o2 != null) {
             o2.c(this.r);
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       this.q = this.q8(a0.class);
       this.p = this.s8(g$b.class);
       return;
    }
}

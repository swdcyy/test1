package j01.i0;
import k51.c;
import k01.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import mk1.h;
import mk1.f;
import mk1.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import h01.y;

public class i0 extends c	// class@0029fc
{
    public b p;
    public h q;
    public y r;
    public a s;
    public static String sLivePresenterClassName = "LiveGiftBoxSendGiftPresenter";

    public void i0(a p0){
       super();
       this.s = p0;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, i0.class, "7")) {
          return;
       }
       this.s = null;
       return;
    }
    public String P8(int p0){
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oi0, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.q.c.s(p0);
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i0.class, "1")) {
          return;
       }
       this.p = this.q8(b.class);
       this.q = this.q8(h.class);
       this.r = this.q8(y.class);
       return;
    }
}

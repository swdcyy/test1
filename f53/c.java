package f53.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import f53.c$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import eg1.e;
import lp3.c;
import lp3.i;
import eg1.o;
import y43.a;

public class c extends PresenterV2	// class@0028a3
{
    public a p;
    public i q;
    public Set r;
    public o s;
    public static String sLivePresenterClassName = "LiveGzoneEffectTaskFilterPresenter";

    public void c(){
       super();
       this.s = new c$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       c tq = this.q;
       if (tq != null) {
          tq.a(e.class).g7(this.s);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       c tq = this.q;
       if (tq != null) {
          tq.a(e.class).Mj(this.s);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.p = this.q8(a.class);
       this.q = this.t8("LIVE_SERVICE_MANAGER");
       return;
    }
}

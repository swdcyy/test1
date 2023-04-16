package k0a.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.model.response.HotChannelColumn;
import k0a.c$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qvb.q;
import sy6.a;
import hf5.e;
import hf5.g;

public class c extends PresenterV2	// class@002b93
{
    public e p;
    public g q;
    public a r;
    public final HotChannelColumn s;
    public final q t;

    public void c(HotChannelColumn p0){
       super();
       this.t = new c$a(this);
       this.s = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       this.r.e(this.t);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       this.r.b(this.t);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.r = this.q8(a.class);
       this.p = this.q8(e.class);
       this.q = this.q8(g.class);
       return;
    }
}

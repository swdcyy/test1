package dta.k0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import wq6.f;
import dta.k0$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fr6.i;

public class k0 extends PresenterV2	// class@00253a
{
    public final f p;
    public final i q;
    public boolean r;

    public void k0(f p0){
       super();
       this.q = new k0$a(this);
       this.r = true;
       this.p = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, k0.class, "1")) {
          return;
       }
       this.p.W(this.q);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, k0.class, "2")) {
          return;
       }
       this.p.b(this.q);
       return;
    }
}

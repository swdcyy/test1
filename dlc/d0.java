package dlc.d0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import dlc.d0$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qvb.q;
import qvb.a;
import tkc.f;
import sy6.a;

public class d0 extends PresenterV2	// class@00223e
{
    public a p;
    public f q;
    public final q r;

    public void d0(){
       super();
       this.r = new d0$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d0.class, "2")) {
          return;
       }
       this.q.h(this.r);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d0.class, "3")) {
          return;
       }
       this.q.f(this.r);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d0.class, "1")) {
          return;
       }
       this.q = this.r8("TRENDING_FEED_PAGE_LIST");
       this.p = this.q8(a.class);
       return;
    }
}

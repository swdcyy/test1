package g7a.x0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import g7a.x0$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.comment.e$b;
import com.yxcorp.gifshow.comment.e;
import uw9.l0;

public class x0 extends PresenterV2	// class@002405
{
    public l0 p;
    public e q;
    public final e$b r;

    public void x0(){
       super();
       this.r = new x0$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, x0.class, "2")) {
          return;
       }
       this.q.b(this.r);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, x0.class, "3")) {
          return;
       }
       this.q.j(this.r);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, x0.class, "1")) {
          return;
       }
       this.p = this.q8(l0.class);
       this.q = this.r8("COMMENT_HELPER");
       return;
    }
}

package kx9.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kx9.c$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.comment.e$b;
import com.yxcorp.gifshow.comment.e;
import com.yxcorp.gifshow.entity.QPhoto;
import ek9.t0;

public class c extends PresenterV2	// class@002d18
{
    public e p;
    public QPhoto q;
    public t0 r;
    public final e$b s;

    public void c(){
       super();
       this.s = new c$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       this.p.b(this.s);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       this.p.j(this.s);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       this.q = this.q8(QPhoto.class);
       this.r = this.r8("COMMENT_GLOBAL_ACTION");
       this.p = this.r8("COMMENT_HELPER");
       return;
    }
}

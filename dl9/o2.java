package dl9.o2;
import e9c.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dl9.n2;
import erd.g;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import qvb.q;
import com.kwai.robust.PatchProxyResult;
import dl9.o2$a;

public class o2 extends k	// class@001f8e
{
    public t t;

    public void o2(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, o2.class, "2")) {
          return;
       }
       super.E8();
       this.X7(this.t.subscribe(new n2(this)));
       return;
    }
    public q P8(){
       Object obj = PatchProxy.apply(null, this, o2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new o2$a(this);
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, o2.class, "1")) {
          return;
       }
       super.j8();
       this.t = this.r8("COMMENT_DIFFER_NOTIFY_FINISH_OBSERVABLE");
       return;
    }
}

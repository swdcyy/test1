package dlc.f1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dlc.e1;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import lnc.ja;
import sy6.a;

public class f1 extends PresenterV2	// class@002247
{
    public a p;
    public t q;

    public void f1(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, f1.class, "2")) {
          return;
       }
       this.X7(this.q.subscribe(new e1(this), Functions.e));
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, f1.class, "4")) {
          return;
       }
       ja.a();
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f1.class, "1")) {
          return;
       }
       this.q = this.r8("PLAY_HOT_TRENDING_INFO_CHANGE_OBSERVABLE");
       this.p = this.q8(a.class);
       return;
    }
}

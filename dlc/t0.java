package dlc.t0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import ub6.b;
import brd.t;
import t45.d;
import brd.z;
import dlc.s0;
import erd.g;
import crd.b;
import tkc.i;

public class t0 extends PresenterV2	// class@002271
{
    public i p;

    public void t0(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, t0.class, "2")) {
          return;
       }
       this.X7(RxBus.f.f(b.class).observeOn(d.a).subscribe(new s0(this)));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, t0.class, "1")) {
          return;
       }
       this.p = this.r8("TRENDING_LIST_PAGE_LIST");
       return;
    }
}

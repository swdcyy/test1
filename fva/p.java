package fva.p;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.hot.spot.adapter.interest.InterestCardWrapperAdapter;
import xua.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import dva.c;
import brd.t;
import t45.d;
import brd.z;
import fva.p$a;
import erd.g;
import crd.b;

public final class p extends PresenterV2	// class@002a18
{
    public final InterestCardWrapperAdapter p;
    public final a q;

    public void p(InterestCardWrapperAdapter p0,a p1){
       a.p(p0, "wrapperAdapter");
       a.p(p1, "cardAdapter");
       super();
       this.p = p0;
       this.q = p1;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, p.class, "1")) {
          return;
       }
       this.X7(RxBus.f.f(c.class).observeOn(d.a).subscribe(new p$a(this)));
       return;
    }
}

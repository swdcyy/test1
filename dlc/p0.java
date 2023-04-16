package dlc.p0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import dlc.p0$a;
import nsd.u;
import dlc.p0$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import dlc.p0$c;
import erd.g;
import crd.b;
import brd.t;
import qvb.q;
import qvb.a;
import tkc.i;
import io.reactivex.subjects.PublishSubject;

public final class p0 extends PresenterV2	// class@002264
{
    public i p;
    public t q;
    public PublishSubject r;
    public i s;
    public final p0$b t;
    public static final p0$a u;

    static {
       p0.u = new p0$a(null);
    }
    public void p0(){
       super();
       this.t = new p0$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, p0.class, "2")) {
          return;
       }
       p0 tq = this.q;
       if (tq == null) {
          a.S("mTrendingAllEmptyObservable");
       }
       this.X7(tq.subscribe(new p0$c(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, p0.class, "3")) {
          return;
       }
       p0 ts = this.s;
       if (ts != null) {
          ts.f(this.t);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, p0.class, "1")) {
          return;
       }
       Object obj = this.r8("TRENDING_LIST_PAGE_LIST");
       a.o(obj, "inject\(TrendingAccessIds.TRENDING_LIST_PAGE_LIST\)");
       this.p = obj;
       obj = this.r8("TRENDING_FEED_LIST_IS_EMPTY_OBSERVABLE");
       a.o(obj, "inject\(TrendingAccessIds¡­LIST_IS_EMPTY_OBSERVABLE\)");
       this.q = obj;
       obj = this.r8("TRENDING_INFO_ITEM_CLICK_OBSERVER");
       a.o(obj, "inject\(TrendingAccessIds¡­INFO_ITEM_CLICK_OBSERVER\)");
       this.r = obj;
       return;
    }
}

package cb5.r;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Set;
import java.util.HashSet;
import java.lang.Integer;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.yxcorp.gifshow.events.realaction.RealAction;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import cb5.r$a;
import erd.g;
import crd.b;
import io.reactivex.subjects.PublishSubject;
import com.kwai.component.homepage_interface.homeitemfragment.HomeItemFragment;

public final class r extends PresenterV2	// class@000456
{
    public PublishSubject p;
    public HomeItemFragment q;
    public final Set r;

    public void r(){
       super();
       HashSet hashSet = PatchProxy.apply(null, this, r.class, "4");
       if (hashSet != PatchProxyResult.class) {
       }else {
          hashSet = new HashSet();
          hashSet.add(Integer.valueOf(6));
          hashSet.add(Integer.valueOf(3));
          hashSet.add(Integer.valueOf(12));
          hashSet.add(Integer.valueOf(9));
          hashSet.add(Integer.valueOf(8));
          hashSet.add(Integer.valueOf(10));
          hashSet.add(Integer.valueOf(20));
          hashSet.add(Integer.valueOf(4));
          hashSet.add(Integer.valueOf(19));
          hashSet.add(Integer.valueOf(7));
       }
       this.r = hashSet;
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, r.class, "2")) {
          return;
       }
       this.X7(RxBus.f.g(RealAction.class, RxBus$ThreadMode.MAIN).subscribe(new r$a(this)));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, r.class, "1")) {
          return;
       }
       this.p = this.t8("HOT_ITEM_REAL_ACTION_OBSERVER");
       this.q = this.t8("FRAGMENT");
       return;
    }
}

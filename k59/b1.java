package k59.b1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.yxcorp.gifshow.util.rx.RxBus;
import wl9.b;
import brd.t;
import k59.b1$a;
import erd.g;
import crd.b;

public final class b1 extends PresenterV2	// class@002ac8
{
    public BaseFeed p;

    public void b1(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b1.class, "2")) {
          return;
       }
       if (k.A(this.p) != null) {
          this.X7(RxBus.f.f(b.class).subscribe(new b1$a(this)));
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b1.class, "1")) {
          return;
       }
       this.p = this.q8(BaseFeed.class);
       return;
    }
}

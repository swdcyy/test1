package g12.w;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import e06.b;
import brd.t;
import t45.d;
import brd.z;
import g12.v;
import erd.g;
import crd.b;
import com.kuaishou.live.core.basic.liveslide.LiveSlideDetailContainerFragment;

public class w extends PresenterV2	// class@002a3e
{
    public LiveSlideDetailContainerFragment p;
    public static String sLivePresenterClassName = "LiveSlideScreenShotPresenter";

    public void w(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, w.class, "2")) {
          return;
       }
       this.X7(RxBus.f.f(b.class).observeOn(d.a).subscribe(new v(this)));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, w.class, "1")) {
          return;
       }
       this.p = this.q8(LiveSlideDetailContainerFragment.class);
       return;
    }
}

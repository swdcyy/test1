package g12.p;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import g12.p$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import g12.o;
import erd.g;
import crd.b;
import brd.t;
import c51.d;
import b51.d;
import c51.i;
import c51.b;
import io.reactivex.subjects.PublishSubject;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;

public class p extends PresenterV2	// class@002a36
{
    public d p;
    public PublishSubject q;
    public LiveBizParam r;
    public final b s;
    public static String sLivePresenterClassName = "LiveSlideRealActionPresenter";

    public void p(){
       super();
       this.s = new p$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, p.class, "2")) {
          return;
       }
       this.P8();
       this.X7(this.q.subscribe(new o(this)));
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, p.class, "3")) {
          return;
       }
       this.p.p().y(this.s);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, p.class, "1")) {
          return;
       }
       this.p = this.q8(d.class);
       this.q = this.r8("LIVE_SQUARE_REPLACE_PAGE_LIST_PUBLISHER");
       this.r = this.q8(LiveBizParam.class);
       return;
    }
}

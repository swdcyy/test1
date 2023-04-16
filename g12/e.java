package g12.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.kuaishou.live.core.basic.liveslide.a;
import t45.d;
import brd.z;
import brd.t;
import g12.d;
import erd.g;
import crd.b;
import g12.c;
import e12.b;
import b51.d;
import io.reactivex.subjects.PublishSubject;

public class e extends PresenterV2	// class@002a27
{
    public h p;
    public b q;
    public d r;
    public PublishSubject s;
    public LiveBizParam t;
    public boolean u;
    public boolean v;
    public static String sLivePresenterClassName = "LiveSlideDataSourceReplacePresenter";

    public void e(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       this.u = this.t.mIsSoloLiveStream;
       z a = d.a;
       this.X7(a.n(this.getActivity()).e.observeOn(a).subscribe(new d(this)));
       t ot = a.n(this.getActivity()).f.observeOn(a);
       this.X7(ot.subscribe(new c(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       this.P8();
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       e tq = this.q;
       if (tq != null) {
          tq.release();
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.r = this.q8(d.class);
       this.s = this.r8("LIVE_SQUARE_REPLACE_PAGE_LIST_PUBLISHER");
       this.t = this.q8(LiveBizParam.class);
       return;
    }
}

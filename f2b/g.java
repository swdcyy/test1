package f2b.g;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.local.sub.entrance.sizer.presenter.HomeLocalSizerViewPresenter;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.social.nearby.model.roampanel.RoamPanelAction;
import mrd.a;
import k2b.e0;
import e2b.a;

public class g extends m	// class@002875
{
    public final HomeLocalSizerViewPresenter c;

    public void g(HomeLocalSizerViewPresenter p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       this.c.q.onNext(RoamPanelAction.SMOOTH_EXPAND);
       a.a(this.c.p);
       return;
    }
}

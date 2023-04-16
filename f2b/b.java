package f2b.b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.local.sub.entrance.sizer.presenter.HomeLocalSizerViewPresenter;
import java.lang.Object;
import android.view.View;
import com.kwai.feature.api.social.nearby.model.roampanel.RoamPanelAction;
import mrd.a;
import k2b.e0;
import e2b.a;

public final class b implements View$OnClickListener	// class@002870
{
    public final HomeLocalSizerViewPresenter b;

    public void b(HomeLocalSizerViewPresenter p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       b tb = this.b;
       tb.q.onNext(RoamPanelAction.SMOOTH_EXPAND);
       a.a(tb.p);
    }
}

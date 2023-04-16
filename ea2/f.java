package ea2.f;
import vq5.b;
import com.kuaishou.live.core.show.hourlytrank.ranklist.LiveHourlyRankListDialogPresenter;
import java.lang.Object;
import vq5.a;
import android.net.Uri;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import z12.x;
import androidx.fragment.app.KwaiDialogFragment;

public class f implements b	// class@0026cd
{
    public final LiveHourlyRankListDialogPresenter a;

    public void f(LiveHourlyRankListDialogPresenter p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       return a.a(this);
    }
    public void b(Uri p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       if (("true").equals(p0.getQueryParameter("show"))) {
          f ta = this.a;
          ta.H = x.G(ta.getActivity());
       }else {
          x.E(this.a.H);
       }
       return;
    }
}

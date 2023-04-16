package mh.a$b;
import jta.f;
import mh.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.FragmentActivity;
import com.kwai.feature.api.pendant.viewmodel.PendantPlayerStateVM;
import com.kwai.feature.api.pendant.viewmodel.PendantPlayerStateVM$a;

public final class a$b extends f	// class@002688
{
    public final a a;

    public void a$b(a p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
       a$b uob = a$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "1")) {
          return;
       }
       Activity activity = this.a.getActivity();
       if (!activity instanceof FragmentActivity) {
          activity = null;
       }
       if (activity != null) {
          PendantPlayerStateVM.Companion.a(activity).notifyAutoPlayerState(this.a.R8());
       }
       return;
    }
}

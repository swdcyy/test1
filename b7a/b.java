package b7a.b;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.atlas.vertical.a;
import java.lang.Object;
import com.yxcorp.gifshow.events.SyncDetailAnimParamEvent;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.Window;
import android.transition.Transition;
import m9a.d0;

public final class b implements g	// class@000383
{
    public final a b;

    public void b(a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       Activity activity = this.b.getActivity();
       if (activity != null && activity.getWindow() != null) {
          Transition exitTransiti = activity.getWindow().getExitTransition();
          if (exitTransiti instanceof d0) {
             exitTransiti.b(p0);
          }
       }
       return;
    }
}

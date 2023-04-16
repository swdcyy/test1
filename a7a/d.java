package a7a.d;
import erd.g;
import a7a.g;
import java.lang.Object;
import com.yxcorp.gifshow.events.SyncDetailAnimParamEvent;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.Window;
import android.transition.Transition;
import m9a.d0;

public final class d implements g	// class@000051
{
    public final g b;

    public void d(g p0){
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

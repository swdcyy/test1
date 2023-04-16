package i6a.r$d;
import erd.g;
import i6a.r;
import java.lang.Object;
import rd5.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e17.i;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;

public final class r$d implements g	// class@0027af
{
    public final r b;

    public void r$d(r p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, r$d.class, "1")) {
       }else {
          r x = this.b.x;
          if (x != null && x.s() == true) {
             Activity activity = this.b.getActivity();
             if (activity != null) {
                View view = activity.findViewById(R.id.interest_snackbar);
                if (view != null) {
                   int i = (p0.b != null)? 0: 8;
                   view.setVisibility(i);
                }
             }
          }
          PatchProxy.onMethodExit(r$d.class, "1");
       }
       return;
    }
}

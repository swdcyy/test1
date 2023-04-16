package gqb.i;
import android.view.View$OnClickListener;
import gqb.j;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class i implements View$OnClickListener	// class@002b7a
{
    public final j b;

    public void i(j p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       Activity activity = this.b.getActivity();
       if (activity != null) {
          activity.onBackPressed();
       }
       return;
    }
}

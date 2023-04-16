package nf0.c$f;
import android.view.View$OnClickListener;
import nf0.c;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class c$f implements View$OnClickListener	// class@003303
{
    public final c b;

    public void c$f(c p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$f.class, "1")) {
          return;
       }
       Activity activity = this.b.getActivity();
       if (activity != null) {
          activity.finish();
       }
       return;
    }
}

package c2c.g$b;
import com.yxcorp.gifshow.widget.m;
import c2c.g;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class g$b extends m	// class@000500
{
    public final g c;

    public void g$b(g p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$b.class, "1")) {
          return;
       }
       a.p(p0, "v");
       Activity activity = this.c.getActivity();
       if (activity != null) {
          activity.finish();
       }
       return;
    }
}
